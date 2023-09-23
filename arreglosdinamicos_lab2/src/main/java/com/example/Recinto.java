package com.example;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recinto {
    private int recintoId;
    private int capacidad;
    private Map<String, List<String>> disponibilidad;

    public Recinto(int recintoId, int capacidad) {
        this.recintoId = recintoId;
        this.capacidad = capacidad;
        this.disponibilidad = new HashMap<>();
    }

 
}
