package com.example;

public class Event {
    private int id;
    private int idPais;
    private String artista;
    private int horario;
    private String fecha;
    private int duracion;
    private int cantidadAsistentes;

    public Event(int id, int idPais, String artista, int horario, String fecha, int duracion, int cantidadAsistentes) {
        this.id = id;
        this.idPais = idPais;
        this.artista = artista;
        this.horario = horario;
        this.fecha = fecha;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

 
}
