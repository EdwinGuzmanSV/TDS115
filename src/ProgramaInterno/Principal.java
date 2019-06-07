/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramaInterno;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Aldemaro
 */
public class Principal {
    public static int cantidad;
    public static int i;
    public static int m;
    public static double s;

    //public static void main(String[] args) 
    public Principal(){
        Random rnd = new Random();

        cantidad = visual.Simulador.variable;
        int auxCant=cantidad;
        EstacionDeProduccion estacion1 = new EstacionDeProduccion();
        Cola cola2 = new Cola();
        Cola cola3 = new Cola();
        Cola cola4 = new Cola();
        Cola cola5 = new Cola();

        Cola colaAuxiliar = new Cola();
        Cola colaAuxiliar2 = new Cola();
        Cola colaAuxiliar3 = new Cola();
        Cola colaAuxiliar4 = new Cola();

        cola2.inicializar(cantidad);
        Botella bottle = new Botella();
        Botella bottle1 = new Botella();
        Botella bottle2 = new Botella();
        Botella bottle3 = new Botella();
        Botella bottle4 = new Botella();
        int maquina = 0;
        int cont = 0;

        //****************************************************************************** MAQUINA 2
        while(cantidad>0){
            int aleat = rnd.nextInt(10) + 1;
            //System.out.println("Cantidad 2: ************************************************" +cantidad);
            //System.out.println("Aleat: *****************************************************" + aleat);
            if (aleat == 10) {
              //  System.out.println("********************Se arruno la maquina2");
                if (cola2.isVacia() != true) {
                    bottle1 = estacion1.limpiar(cola2);
                    colaAuxiliar.añadir(bottle1);
                    maquina = 2;
                    cont = cont + 1;
                }
                
            } else {
                if (maquina == 0) {
                    if (cola2.isVacia() != true) {
                        bottle1 = estacion1.limpiar(cola2);
                        cola3.añadir(bottle1);
                        maquina=0;
                //        System.out.println("ID:" + bottle1.getId());
                  //      System.out.println("\t LIMPIADA:" + bottle1.isLimpiado());
                        cantidad = cantidad  - 1;
                    }
                } else {
                    if (maquina == 2) {
                        if (cont == 0) {
                            if (cola2.isVacia() != true) {
                                maquina = 0;
                            }
                        } else {
                            bottle1 = estacion1.limpiar(colaAuxiliar);
                            cola2.añadir(bottle1);
                            maquina = 2;
                            cont = cont - 1;
                        }
                    }
                }
            }
        }
        
        //****************************************************************************** MAQUINA 3
        cantidad=auxCant;
        while(cantidad>0){
           int aleat2 = rnd.nextInt(10) + 1;
           // System.out.println("cantidad 3: ***********************************"+cantidad);
           // System.out.println("aleat 3: **************************************"+aleat2);
            if (aleat2 == 10) {
             //   System.out.println("*********************Se arruno la maquina3");
                if (cola3.isVacia() != true) {
                    bottle2 = estacion1.llenar(cola3);
                    colaAuxiliar2.añadir(bottle2);
                    maquina = 3;
                    cont=cont+1;
                }
                
            } else {
                if (maquina == 0) {
                    if (cola3.isVacia() != true) {
                        maquina = 0;
                        bottle2 = estacion1.llenar(cola3);
                        cola4.añadir(bottle2);
               //         System.out.println("ID:" + bottle2.getId());
                 //       System.out.println("\t LIMPIADA:" + bottle2.isLimpiado());
                   //     System.out.println("\t Llenada:" + bottle2.getLlenado());
                        cantidad=cantidad-1;
                    }
                } else {
                    if (maquina == 3) {
                        if (cont == 0) {
                            if (cola3.isVacia() != true) {
                                maquina = 0;
                                
                            }
                        } else {
                            bottle2 = estacion1.llenar(colaAuxiliar2);
                            cola3.añadir(bottle2);
                            cont = cont - 1;
                            maquina = 3;
                            
                        }
                    }
                }
            }
        }
        
        //***************************************************************************** MAQUINA 4
        cantidad=auxCant;
          while(cantidad>0){
              int aleat3 = rnd.nextInt(10) + 1;
           //   System.out.println("cantidad 4 : **********************"+cantidad);
           //   System.out.println("aleat 4: **************************"+aleat3);
            if (aleat3 == 10) {
           //     System.out.println("******************Se arruno la maquin4");
                if (cola4.isVacia() != true) {
                    bottle3 = estacion1.taponeado(cola4);
                    colaAuxiliar3.añadir(bottle3);
                    maquina = 4;
                    cont = cont + 1;
                }
                
            } else {
                if (maquina == 0) {
                    if (cola4.isVacia() != true) {
                        bottle3 = estacion1.llenar(cola4);
                        cola5.añadir(bottle3);
             //           System.out.println("ID:" + bottle3.getId());
             //           System.out.println("\t LIMPIADA:" + bottle3.isLimpiado()+"\t Llenada:"+ bottle3.getLlenado());
             //           System.out.println("\t Taponeada:" + bottle3.isTapado());
                        cantidad = cantidad  - 1;
                        maquina = 0;
                        
                    }
                } else {
                    if (maquina == 4) {
                        if (cont == 0) {
                            if (cola4.isVacia() != true) {
                                
                                maquina = 0;
                                
                            }
                        } else {
                            bottle3 = estacion1.taponeado(colaAuxiliar3);
                            cola4.añadir(bottle3);
                            cont = cont - 1;
                            maquina = 4;
                           
                        }
                    }
                }
                
            }
          }
          int prueba=0;
          //***************************************************************************** MAQUINA 5
         
          cantidad=auxCant;
          while(cantidad>0){
              int aleat4 = rnd.nextInt(10) + 1;
           //   System.out.println("cantidad 5 : ********"+cantidad);   
           //   System.out.println("aleat 5: ********"+aleat4);
            if (aleat4 == 10) {
            //    System.out.println("******************************Se arruno la maquina5");
                
                if (cola5.isVacia() != true) {
                    bottle4 = estacion1.taponeado(cola5);
                    colaAuxiliar4.añadir(bottle4);
                    maquina = 5;
                    cont = cont + 1;
                    
                }
                
            } else {
                if (maquina == 0) {
                    if (cola5.isVacia() != true) {
                        maquina = 0;
                        bottle4 = estacion1.stiker(cola5);
                        System.out.println("ID:" + bottle4.getId());
                        System.out.println("\t LIMPIADA:" + bottle4.isLimpiado() + "\t Llenada:" + bottle3.getLlenado());
                        System.out.println("\t Taponeada:" + bottle4.isTapado() + "\t Etiqueta:" + bottle4.isStiker());
                        cantidad = cantidad  - 1;
                        prueba=prueba+1;
                        
                    }
                } else {
                    if (maquina == 5) {
                        if (cont == 0) {
                            if (cola5.isVacia() != true) {
                                maquina = 0;
                            }
                        } else {
                            bottle4 = estacion1.stiker(colaAuxiliar4);
                            cola5.añadir(bottle4);
                            cont = cont - 1;
                            maquina = 5;
                            
                        }
                    }
                }
            }
        }

       if(prueba==auxCant){
           System.out.println(" ************* EXITO **************");
           System.out.println(" ************ Auxcantidad1: "+auxCant);
           System.out.println(" ************ cantidad: "+cantidad);
       }
    }
}
