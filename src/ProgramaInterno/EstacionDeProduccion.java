/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramaInterno;

/**
 *
 * @author StevenMena
 */
public class EstacionDeProduccion {
    
    
    
    public  Botella limpiar(Cola cola1){
    Botella  bottle5= new Botella();
    
        bottle5=cola1.borrar();
        bottle5.setLimpiado(true);
        return bottle5;
        
    
    }
    
    public Botella llenar(Cola cola2){
    Botella bottle1= new Botella();
    
        bottle1=cola2.borrar();
        bottle1.setLlenado(330);
        return bottle1;
        
    
    }
      public Botella taponeado(Cola cola3){
      Botella bottle1= new Botella();
    
        bottle1=cola3.borrar();
        bottle1.setTapado(true);
        return bottle1;
        
    
    }
      public Botella stiker(Cola cola4){
      Botella bottle1= new Botella();
    
        bottle1=cola4.borrar();
        bottle1.setStiker(true);
        return bottle1;
        
    
    }
      
}
