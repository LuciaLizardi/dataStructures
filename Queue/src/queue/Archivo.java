/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author lucializarsi
 */
public class Archivo {
    private double tamaño;
    private String nombre;
    private String dueño;
    private String fecha;

    public Archivo(double tamaño, String nombre, String dueño, String fecha) {
        this.tamaño = tamaño;
        this.nombre = nombre;
        this.dueño = dueño;
        this.fecha = fecha;
    }

    public double getTamaño() {
        return tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Archivo{" + "tama\u00f1o=" + tamaño + ", nombre=" + nombre + ", due\u00f1o=" + dueño + ", fecha=" + fecha + '}';
    }
    
    
    
}

