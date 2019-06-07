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
public class animado4 {

    private JPanel panel = null;
    Graphics g2 = null;
    public Thread hilo1 = null;
    public int x = 0, y = 0, posx = 40, posy = -10, img4 = 4, val;
    private boolean chocapuerta = false;

    public animado4(JPanel j) {
        panel = j;
        val = Simulador.variable;
    }

    public void paint(Graphics g) {
        g2 = g;
        
        if (chocapuerta) {
            g.setColor(Color.blue);
            g.drawRect(posx, posy, 0, 0);
            //
            ImageIcon image2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/botellas/" + img4 + ".png")).getImage());
            g.drawImage(image2.getImage(), posx, posy, 30, 400, null);
        }
    }

    public void animacion() {
        if (!hilo2.isAlive()) {
            hilo2.start();
        } else {
            hilo2.resume();
            chocapuerta = true;
            posy = -10;
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
                        //  g.dispose();
                        panel.disable();
                    }
                    if (posy == -80) {
                        animacion();
                    }
                    panel.repaint();
                    posy -= 10;

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