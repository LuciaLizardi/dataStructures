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
public class Impresora {
    private String marca;
    private ArrayQueue<Archivo> cola;
    
    public void nuevaFoto(double tamaño, String nombre, String dueño, String fecha, double resolución){
        Foto f= new Foto(tamaño,nombre,dueño,fecha);
        cola.enqueue(f);
    }
    
     public void nuevoDocumento(double tamaño, String nombre, String dueño, String fecha, String tipoProcesador){
        Documento d= new Documento(tipoProcesador,tamaño,nombre,dueño,fecha);
        cola.enqueue(d);
    }
     
     public void imprimeSiguiente(){
         Archivo a;
         a=cola.first();
         System.out.println(a.toString());
         cola.dequeue();
     }
     
     public void eliminaFotos(){
         ArrayQueue aux= new ArrayQueue();
         Archivo auxArch = null;
         while(!cola.isEmpty()){
             auxArch=cola.first();
             if(auxArch instanceof Foto){
                 cola.dequeue();
             }
             else
                 aux.enqueue(auxArch);
         }
        while(!aux.isEmpty()){
            cola.enqueue(auxArch);
        }
     }
     
     public void eliminaMayor500Kb(){
      ArrayQueue<Archivo> aux= new ArrayQueue();
      Archivo aux1;
         
           while(!cola.isEmpty()){
               aux1=cola.first();
               if(aux1.getTamaño()>500)
                   cola.dequeue();
               else
                   aux.enqueue(aux1);
        }
           
           while(!aux.isEmpty()){
               cola.enqueue(aux.dequeue());
           }
     }
     
     public static void main(String[] args) {
        
    }
}
