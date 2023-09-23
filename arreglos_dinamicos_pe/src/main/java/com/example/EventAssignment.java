package com.example;
import java.util.ArrayList;
import java.util.List;

public class EventAssignment {
    private List<Event> assignedEvents;
    private List<Event> unassignedEvents;

    public EventAssignment() {
        this.assignedEvents = new ArrayList<>();
        this.unassignedEvents = new ArrayList<>();
    }

    // Métodos para asignar eventos a recintos
    public void assignEvent(Event event, Venue venue) {
        
        
    }

    // Métodos para obtener listas de eventos asignados y no asignados
    public List<Event> getAssignedEvents() {
        return assignedEvents;
    }

    public List<Event> getUnassignedEvents() {
        return unassignedEvents;
    }

  
}
