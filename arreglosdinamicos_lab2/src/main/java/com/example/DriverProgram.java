package com.example;
import java.io.IOException;
import java.util.List;
import com.opencsv.exceptions.CsvException;

public class DriverProgram {
    // Nombre del archivo CSV
    String archivoCSVRecinto = "Recinto.csv";
    String archivoCSVEvento = "";

    /*** Constructor DriverProgram que inicializa y maneja el flujo del programa.*/
    public DriverProgram(){
        leerCSV(archivoCSVRecinto);
        
    }

    public void leerCSV(String archivoCSV) {
    FileManager fileManager = new FileManager();
    try {
        // Leer datos desde el archivo CSV
        List<String[]> data = fileManager.readCSV(archivoCSV);

        // Imprimir los datos
        for (String[] row : data) {
            for (String column : row) {
                System.out.print(column + " | ");
            }
            System.out.println();
        }
    } catch (IOException | CsvException e) {
        e.printStackTrace();
    }
}

    public static void main(String[] args) {
        DriverProgram programa = new DriverProgram();
    }
}

