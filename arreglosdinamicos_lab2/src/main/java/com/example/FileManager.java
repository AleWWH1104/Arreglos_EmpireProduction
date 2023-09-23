package com.example;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
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

   
    
}
