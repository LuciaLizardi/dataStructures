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
public class EjerciciosColas {

    
    
    public static <X> String imprimeCola(ArrayQueue<X> cola){
        StringBuilder cad= new StringBuilder();
        ArrayQueue aux= new ArrayQueue();
        X auxDato;
        while(!cola.isEmpty()){
            auxDato=cola.dequeue();
            cad.append("\n"+auxDato+" ");
            aux.enqueue(auxDato);
        }
        while(!aux.isEmpty()){
            cola.enqueue((X) aux.dequeue());
        }
        return cad.toString();
    }
 
    //28
    public static <T> void quitaRep(ArrayQueue<T> c){
        T datoAux,datoAux2;
        ArrayQueue<T> aux= new ArrayQueue();
        while(!c.isEmpty()){
            datoAux=c.dequeue();
                if(c.first()==datoAux)
                    c.dequeue();
                 else
                    aux.enqueue(datoAux);
        }
        while(!aux.isEmpty()){
            c.enqueue(aux.dequeue());
        }        
    }
    
   //29
    public static <T> void quitaOcurrencias(ArrayQueue<T> cola, T objeto){
        ArrayQueue<T> aux= new ArrayQueue();
        T auxDato;
        while(!cola.isEmpty()){
            auxDato=cola.first();
            if(auxDato.equals(objeto))
                cola.dequeue();
            else
                aux.enqueue(cola.dequeue());
        }
        
        while(!aux.isEmpty())
            cola.enqueue(aux.dequeue());
    }
    
    
    //30
    public static void main(String[] args) {
       ArrayQueue<String> cola= new ArrayQueue();
       cola.enqueue("A");
       cola.enqueue("B");
       cola.enqueue("C");
       cola.enqueue("D");
       cola.enqueue("E");
       cola.enqueue("F");

       
        System.out.println(imprimeCola(cola));
        quitaRep(cola);
        System.out.println(imprimeCola(cola));
        quitaOcurrencias(cola,"B");
        System.out.println(imprimeCola(cola));
    }
  
}
