/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_josuerivera;

/**
 *
 * @author josue
 */
public class Cursos_En_Linea {
   String titulo;
    String instructor;
    int duracion;
    String plataforma;

    public Cursos_En_Linea(String titulo, String instructor, int duracion, String plataforma) {
        this.titulo = titulo;
        this.instructor = instructor;
        this.duracion = duracion;
        this.plataforma = plataforma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Cursos_En_Linea{" + "titulo=" + titulo + ", instructor=" + instructor + ", duracion=" + duracion + ", plataforma=" + plataforma + '}';
    }
    
}
