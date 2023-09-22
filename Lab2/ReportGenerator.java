import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportGenerator {
    private EventAssignment eventAssignment;

    public ReportGenerator(EventAssignment eventAssignment) {
        this.eventAssignment = eventAssignment;
    }

    public void generateReport() {
        // Lógica para generar el informe, incluyendo eventos asignados y no asignados
        // Puedes imprimirlos en la consola o generar un archivo de texto, PDF, etc.
    }

    public void exportEventVenueRelationship(String filePath) {
        try {
            FileWriter writer = new FileWriter(filePath);
            
            // Lógica para exportar la relación recinto-evento al archivo especificado

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            // Manejar excepciones según tu necesidad
        }
    }


}
