package com.example;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

/**
 * Clase CSV que proporciona funcionalidades para el manejo de archivos CSV.
 */
public class FileManager {

    //Funcion para leer
    public List<String[]> readCSV(String archivo) throws IOException, CsvException {
        FileReader fileReader = new FileReader(archivo);
        CSVParserBuilder parserBuilder = new CSVParserBuilder();
        parserBuilder.withSeparator('|'); // Configura el separador como '|'
        CSVReader csvReader = new CSVReaderBuilder(fileReader)
                .withCSVParser(parserBuilder.build())
                .build();

        List<String[]> data = csvReader.readAll();
        csvReader.close();
        fileReader.close();

        return data;
    }

    public List<Country> PaisesDesdeCSV(String archivo) throws IOException, CsvException {
        List<Country> paises = new ArrayList<>();
    
        try (CSVReader csvReader = new CSVReaderBuilder(new FileReader(archivo))
                .withCSVParser(new CSVParserBuilder().withSeparator('|').build())
                .build()) {
            String[] fila;
            boolean primeraFila = true;  // Bandera para identificar la primera fila (encabezados)
            while ((fila = csvReader.readNext()) != null) {
                if (primeraFila) {
                    primeraFila = false;
                    continue;  // Saltar la primera fila (encabezados)
                }
                
                if (fila.length >= 2) {
                    int idPais = Integer.parseInt(fila[0]);
                    String ubicacion = fila[1];
                    Country pais = new Country(idPais, ubicacion);
                    paises.add(pais);
                } else {
                    // Manejar error de fila incompleta en el archivo
                    System.err.println("Fila incompleta en el archivo: " + String.join("|", fila));
                }
            }
        }
    
        return paises;
    }

   
    
}
