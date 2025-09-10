/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.HashSet;

/**
 *
 * @author Fabrizio
 */
public class Alumno {

    private int nroLegajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias;

    public Alumno(int nroLegajo, String apellido, String nombre, HashSet<Materia> materias) {
        this.nroLegajo = nroLegajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = materias;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(HashSet<Materia> materias) {
        this.materias = materias;
    }

    public boolean agregarMateria(Materia materia) {
        return materias.add(materia);
    }
    
    public int cantidadMaterias() {
        return materias.size();
    }
    
    @Override
    public String toString(){
        return nombre + " " + apellido;
    }
    
    
}
