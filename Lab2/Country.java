import java.util.ArrayList;
import java.util.List;

public class Country {
    private int id;
    private String name;
    private List<Location> locations;

    public Country(int id, String name) {
        this.id = id;
        this.name = name;
        this.locations = new ArrayList<>();
    }

    // Métodos para agregar y obtener ubicaciones
    public void addLocation(Location location) {
        locations.add(location);
    }

    public List<Location> getLocations() {
        return locations;
    }

    // Métodos para buscar ubicaciones y recintos por ID
    public Location findLocationById(int locationId) {
        for (Location location : locations) {
            if (location.getId() == locationId) {
                return location;
            }
        }
        return null; // Retorna null si no se encuentra la ubicación
    }

    // Métodos para buscar recintos por ID
    public Venue findVenueById(int locationId, int venueId) {
        Location location = findLocationById(locationId);
        if (location != null) {
            return location.findVenueById(venueId);
        }
        return null; // Retorna null si no se encuentra la ubicación o el recinto
    }
}
