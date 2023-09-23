package com.example;
import java.io.IOException;
import java.util.List;
import com.opencsv.exceptions.CsvException;

public class DriverProgram {
    //Ruta del archivo CSV
    String archivoCSVRecinto = "/Users/alejandraayala/Desktop/recinto.csv";
    String archivoCSVEvento = "/Users/alejandraayala/Desktop/evento.csv";
    FileManager fileManager = new FileManager();

    private List<Country> paises;
    private List<Recinto> recintos;
    private List<Event> eventos;
    /*** Constructor DriverProgram que inicializa y maneja el flujo del programa.*/
    public DriverProgram(){
        leerCSV(archivoCSVRecinto);
        //leerCSV(archivoCSVEvento);
        
    }

    public void leerCSV(String archivoCSV) {
    try {
        // Leer datos desde el archivo CSV
        List<String[]> data = fileManager.readCSV(archivoCSV);
        System.out.println("datos de csv leidos correctamente");
        // // Imprimir los datos
        // for (String[] row : data) {
        //     for (String column : row) {
        //         System.out.print(column + " | ");
        //     }
        //     System.out.println();
        // }

        // Cargar paises y recintos desde el archivo de recintos
        paises = fileManager.PaisesDesdeCSV(archivoCSVRecinto);
        // Imprimir los datos de los países
        for (Country pais : paises) {
            System.out.println("ID Pais: " + pais.getIdPais());
            System.out.println("Ubicación: " + pais.getNombre());
            System.out.println();
        }
    } catch (IOException e) {
        // Si el archivo no se encuentra, mostrar un mensaje en lugar de lanzar una excepción
        System.err.println("No se encuentra el archivo en la ruta: " + archivoCSV);
    } catch (CsvException e) {
        e.printStackTrace();
    }
}

    public static void main(String[] args) {
        DriverProgram programa = new DriverProgram();
    }
}

