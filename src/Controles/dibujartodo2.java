
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JPanel;
import Modelos.animado2;
/**
 *
 * @author Aldemaro
 */
public class dibujartodo2 extends JComponent{
       private animado2 anima;
       
       public dibujartodo2(JComponent contenedor,JPanel j){
                super();
                this.setBounds(0, 0,contenedor.getWidth() , contenedor.getHeight());
                contenedor.add(this);
                anima= new animado2(j);
       }
       
       public void cuadraelpanel(JPanel t){
                anima.setPanel(t);
       }
       
        public boolean llevarfalse(){
                return anima.isChocapuerta();
       }
       public void animacion(){
                anima.animacion();
       }
       public boolean isalivehilo(){
            return anima.getHilo2().isAlive();
       }
       
         @Override
    public void paint(Graphics g){
        super.paint(g);
        anima.paint(g);
    }
         
    public void animarchochapuerta(){
                anima.setChocapuerta(true);
    }
    public void noanimarchochapuerta(){
         anima.setChocapuerta(false);
     }
}