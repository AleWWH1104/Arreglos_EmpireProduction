package com.example;
import java.util.HashMap;
import java.util.Map;

public class Venue {
    private int id;
    private int capacity;
    private Map<String, String> schedule; // Horario en formato fecha/hora

    public Venue(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
        this.schedule = new HashMap<>();
    }

    // Métodos para agregar y obtener horarios
    public void addSchedule(String date, String time) {
        schedule.put(date, time);
    }

    public Map<String, String> getSchedule() {
        return schedule;
    }

 
}
