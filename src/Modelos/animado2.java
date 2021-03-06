/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import visual.Simulador;

/**
 *
 * @author Aldemaro
 */
public class animado2 {

    private JPanel panel = null;
    Graphics g2 = null;
    public Thread hilo1 = null;
    public int x = 0, y = 0, posx = 1410, posy = 0, img2 = 2, imgP = 1, c = 0, val;
    private boolean chocapuerta = false;

    public animado2(JPanel j) {
        panel = j;
        val = Simulador.variable;
    }

    public void paint(Graphics g) {
        g2 = g;
        
        ImageIcon image = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/Usuarios/Usuarios.png")).getImage());
        g.drawImage(image.getImage(), x + 600, y + 570, 200, 200, null);

        ImageIcon image3 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/Pantalla/" + imgP + ".png")).getImage());
        g.drawImage(image3.getImage(), x + 710, y + 130, 690, 350, null);
        if (imgP == 8) {
            imgP = 1;
        }
        if (chocapuerta) {
            g.setColor(Color.blue);
            g.drawRect(posx, posy, 1000, 0);
            ImageIcon image2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/botellas/" + img2 + ".png")).getImage());
            g.drawImage(image2.getImage(), posx, posy, 30, 500, null);
        }
    }

    public void animacion() {
        if (!hilo2.isAlive()) {
            hilo2.start();
        } else {
            hilo2.resume();
            chocapuerta = true;
            posy = 0;
        }
    }

    /**
     * @return the chocapuerta
     */
    public boolean isChocapuerta() {
        return chocapuerta;
    }

    /**
     * @param chocapuerta the chocapuerta to set
     */
    public void setChocapuerta(boolean chocapuerta) {
        this.chocapuerta = chocapuerta;
    }
    private Thread hilo2 = new Thread() {
        @Override
        public void run() {
            try {
                while (true) {
                    val--;
                    if (val == 0) {
                        hilo2.stop();
                        // g.dispose();
                        panel.disable();
                    }
                    if (posy == 60) {
                        animacion();
                        c++;
                    }
                    if (c == 3) {
                        c = 0;
                        imgP++;
                    }

                    panel.repaint();
                    posy += 10;

                    hilo2.sleep(200);
                }
            } catch (java.lang.InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    };

    /**
     * @return the panel
     */
    public JPanel getPanel() {
        return panel;
    }

    /**
     * @param panel the panel to set
     */
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    /**
     * @return the hilo2
     */
    public Thread getHilo2() {
        return hilo2;
    }

    /**
     * @param hilo2 the hilo2 to set
     */
    public void setHilo2(Thread hilo2) {
        this.hilo2 = hilo2;
    }
}