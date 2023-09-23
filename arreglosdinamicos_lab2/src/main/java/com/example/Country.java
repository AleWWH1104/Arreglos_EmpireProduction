package com.example;
import java.util.ArrayList;
import java.util.List;

public class Country {
    private int idPais;
    private String nombre;
    private List<Location> locations;

    public Country(int idPais, String nombre) {
        this.idPais = idPais;
        this.nombre = nombre;
        this.locations = new ArrayList<>();
    }

    public int getIdPais() {
        return idPais;
    }

    public String getNombre() {
        return nombre;
    }

    // // Métodos para agregar y obtener ubicaciones
    // public void addLocation(Location location) {
    //     locations.add(location);
    // }

    // public List<Location> getLocations() {
    //     return locations;
    // }

    // // Métodos para buscar ubicaciones y recintos por ID
    // public Location findLocationById(int locationId) {
    //     for (Location location : locations) {
    //         if (location.getId() == locationId) {
    //             return location;
    //         }
    //     }
    //     return null; // Retorna null si no se encuentra la ubicación
    // }

    // // Métodos para buscar recintos por ID
    // public Venue findVenueById(int locationId, int venueId) {
    //     Location location = findLocationById(locationId);
    //     if (location != null) {
    //         return location.findVenueById(venueId);
    //     }
    //     return null; // Retorna null si no se encuentra la ubicación o el recinto
    // }
}
