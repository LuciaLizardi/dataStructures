/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author lucializardi
 */
public class Cifrado {

    
 
  public static String cifrar(String s, ArrayQueue llave ){
        char [] ch={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        String res="";
        int indiceFin;
        Character c;
        int y;
        int x;
            //Revisa cada caracter del arreglo
            for(int i=0; i<s.length(); i++){
                 int j=0; 
                 int k=0;
                    c=s.charAt(i);
                         //Si el caracter es letra
                         if(Character.isAlphabetic(c)){
                             //Se utiliza un ciclo para comparar la letra de la palabra con el arreglo del alfabeto
                                 while(j<ch.length && c!=ch[j]){
                                         j++;
                                         }
                                         if(c==ch[j])//Cuando se encuentra la letra en el arreglo se guarda el índice del caracter en el arreglo
                                         k=j+1;
                                         y=(int)llave.first(); //Se guarda el 1er elemento de la llave en una variable
                                         //En caso de que se los valores de las llaves sean negativos ...
                                         if(y<0){
                                             y=26+y;
                                         }
                                         //Se suma el elemento de la llave al índice del arreglo para encontrar el nuevo índice al que se decifrara
                                         indiceFin=k+y;  
                                            if(indiceFin>26){
                                            k=(26-(indiceFin))*-1;
                                            indiceFin=k;  
                                         }
                                         res=res+ch[indiceFin-1];
                                         x=(int)llave.dequeue();
                                         llave.enqueue(x);
                                         
                                    }
                         
                    else
                    if(Character.isWhitespace(c))
                        res=res+c;
            }
            
            return res;   
        }
      
  public static String decifrar(String s, ArrayQueue llave ){
    
      char [] ch={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        String res="";
        int indiceFin;
        Character c;
        int indiceArr;
        int aux;
        //Revisa cada caracter del arreglo
            for(int i=0; i<s.length(); i++){
                 int j=0; 
                 int indxArr=0;
                    c=s.charAt(i);
                         //Si el caracter es letra
                         if(Character.isAlphabetic(c)){
                             //Se utiliza un ciclo para comparar la letra de la palabra con el arreglo del alfabeto
                                 while(j<ch.length && c!=ch[j]){
                                         j++;
                                         }
                                         if(c==ch[j])//Cuando se encuentra la letra en el arreglo se guarda el índice del caracter en el arreglo
                                         indxArr=j+1;
                                         indiceArr=(int)llave.first(); //Se guarda el 1er elemento de la llave en una variable
                                         //En caso de que se los valores de las llaves sean negativos ...
                                         if(indiceArr<0){
                                             indiceArr=26+indiceArr;
                                         }
                                         indiceFin=indxArr-indiceArr;  
                                            if(indiceFin>26){
                                            indxArr=(26-(indiceFin));
                                            indiceFin=indxArr;  
                                            }
                                            if(indiceFin<=0){
                                            indiceFin=indiceFin+26;
                                            }
                                         res=res+ch[indiceFin-1];
                                         aux=(int)llave.dequeue();
                                         llave.enqueue(aux);
                                         
                                    }   
                    else
                    if(Character.isWhitespace(c))
                        res=res+c;
            }
            return res;   
        }
     
  public static<T> ArrayQueue<T> regresa(ArrayQueue a){
      ArrayQueue aux= new ArrayQueue();
      ArrayQueue aux2= new ArrayQueue();
      Object c;
      while(!a.isEmpty()){
          c=aux.dequeue();
          aux.enqueue(c);  
      }
      return aux;
  }
 
  
    public static void main(String[] args) {
        ArrayQueue llave= new ArrayQueue();
        ArrayQueue llave2= new ArrayQueue();
        
        llave2.enqueue(17);
        llave2.enqueue(6);
        llave2.enqueue(25);
        llave2.enqueue(-13);
        llave2.enqueue(-8);
        llave2.enqueue(4);

        
        
        
        llave.enqueue(17);
        llave.enqueue(6);
        llave.enqueue(25);
        llave.enqueue(-13);
        llave.enqueue(-8);
        llave.enqueue(4);
        
        
        
        //Metodo para regresar una cola al orden inicial
        
        System.out.println(cifrar("ITAM",llave));        
        
        System.out.println(decifrar("DK FHKXRT KNK IJZQHUXLXZF VI UGSBK",llave2));
  
    }
}


