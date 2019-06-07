/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramaInterno;

import java.util.LinkedList;


/**
 *
 * @author StevenMena
 */
public class Cola   {
    
  private  LinkedList<Botella> cola = new LinkedList<Botella>();
   // DelayQueue<cola>  = new DelayQueue<cola>();
   //Botella botellas[] = new Botella[Main.cantidad];
   private    Botella botella2[] = new Botella[Principal.cantidad];
   public  void inicializar(int cantidad){
         for (int i = 1;i<cantidad+1;i++) {
             Botella bottle = new Botella();
             bottle.setId(i);
            cola.offer(bottle);

        
        }
   }
         
         public  Botella borrar(){
         
         return cola.poll();
         }
         public  void añadir(Botella bottle){
         cola.offer(bottle);
        }
          public  boolean isVacia(){
      return cola.isEmpty();
    }
}

   
    
    
    


