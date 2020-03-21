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
public class Foto extends Archivo{
    private double resolución;

    public Foto(double tamaño, String nombre, String dueño, String fecha) {
        super(tamaño, nombre, dueño, fecha);
    }

    @Override
    public String toString() {
        return "Foto{" + "resoluci\u00f3n=" + resolución + '}';
    }


    
}
