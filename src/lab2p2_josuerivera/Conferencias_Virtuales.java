/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_josuerivera;

import java.util.Date;

/**
 *
 * @author josue
 */
public class Conferencias_Virtuales {
    String titulo;
    String conferencista;
    Date fecha;
    int duracion;
    String enlace;

    public Conferencias_Virtuales(String titulo, String conferencista, Date fecha, int duracion, String enlace) {
        this.titulo = titulo;
        this.conferencista = conferencista;
        this.fecha = fecha;
        this.duracion = duracion;
        this.enlace = enlace;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConferencista() {
        return conferencista;
    }

    public void setConferencista(String conferencista) {
        this.conferencista = conferencista;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return "Conferencia_Virtuale{" + "titulo=" + titulo + ", conferencista=" + conferencista + ", fecha=" + fecha + ", duracion=" + duracion + ", enlace=" + enlace + '}';
    }
    
}
