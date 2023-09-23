import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.undo.CannotRedoException;

public class FileManager {
   

    public List<Event> loadEvents(String filePath) {
        List<Event> events = new ArrayList<>();

        try {
            CSVReader reader = new CSVReader(new FileReader(filePath));
            List<String[]> lines = reader.readAll();
            reader.close();

            for (String[] line : lines) {
                if (line.length >= 8) {
                    int id = Integer.parseInt(line[0]);
                    String artist = line[2];
                    int countryId = Integer.parseInt(line[1]);
                    int locationId = Integer.parseInt(line[3]);
                    int venueId = Integer.parseInt(line[4]);
                    int hour = Integer.parseInt(line[5]);

                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = dateFormat.parse(line[6]);

                    int duration = Integer.parseInt(line[7]);
                    int attendees = Integer.parseInt(line[8]);

                    Event event = new Event(id, artist, countryId, locationId, venueId, hour, date, duration, attendees);
                    events.add(event);
                }
            }
        } catch (IOException | CannotRedoException | ParseException e) {
            ((Throwable) e).printStackTrace();
            // Manejar excepciones según tu necesidad
        }

        return events;
    }
}
