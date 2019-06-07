/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfacez;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.ImageIcon;


/**
 *
 *  @author ArregaB
 */
public final class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
             
        transparenciaBotones();
        centrarVentana();
        PanelImagen pantallaInicio = new PanelImagen();
        pantallaInicio.setImagen("/imagenes/Inicio.png");
        pantallaInicio.setSize(526,485);
        this.add(pantallaInicio);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/xd-04.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        sim.setBackground(new java.awt.Color(0, 153, 153));
        sim.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        sim.setText("INICIAR SIMULACIÓN");
        sim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sim)
                .addContainerGap(335, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(sim, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(393, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simActionPerformed
        Simulado s = new Simulado();
        s.setVisible(true);
        s.isBackgroundSet();
        s.setResizable(false);
        this.setVisible(false);
    }//GEN-LAST:event_simActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

         new Principal().setVisible(true);
    }

    public void transparenciaBotones(){
        
        
      /*  analitico.setOpaque(false);
              analitico.setBorder(null);
            analitico.setContentAreaFilled(false);
            
          sim.setOpaque(false);
          sim.setBorder(null);
            sim.setContentAreaFilled(false);*/
            
            
    }
    
    
            public void centrarVentana(){
                    setLocationRelativeTo(null);
            }
  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton sim;
    // End of variables declaration//GEN-END:variables
}