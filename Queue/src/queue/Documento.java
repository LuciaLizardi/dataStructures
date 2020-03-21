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
public class Documento extends Archivo{
    private String tipoPrcesador;

    public Documento(String tipoPrcesador, double tamaño, String nombre, String dueño, String fecha) {
        super(tamaño, nombre, dueño, fecha);
        this.tipoPrcesador = tipoPrcesador;
    }

    @Override
    public String toString() {
        return "Documento{" + "tipoPrcesador=" + tipoPrcesador + '}';
    }
    
    
  
}
