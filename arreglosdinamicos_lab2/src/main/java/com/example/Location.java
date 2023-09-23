package com.example;
import java.util.ArrayList;
import java.util.List;

public class Location {
    private int id;
    private String name;
    private List<Recinto> venues;

    public Location(int id, String name) {
        this.id = id;
        this.name = name;
        this.venues = new ArrayList<>();
    }

    // Métodos para agregar y obtener recintos
    public void addVenue(Recinto venue) {
        venues.add(venue);
    }

    public List<Recinto> getVenues() {
        return venues;
    }

   
}
