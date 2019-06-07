/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import Interfacez.PanelImagen;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Aldemaro
 */
public class Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Administrador
     */
    public Administrador() {
        super("DATOS DEL ADMINISTRADOR");
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(Administrador.EXIT_ON_CLOSE);
       // transparenciaBotones();
        centrarVentana();
        PanelImagen pantallaInicio = new PanelImagen();
        pantallaInicio.setImagen("/imagenes/empresa.jpg");
        pantallaInicio.setSize(680,585);
        this.add(pantallaInicio);
        txtContraseña.addKeyListener(new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
               login();
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    });
        //this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/xd-04.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        txtNOMBRE_Admin = new javax.swing.JTextField();
        btnIngresar_Admin = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Contraseña :");

        btnIngresar_Admin.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 14)); // NOI18N
        btnIngresar_Admin.setForeground(new java.awt.Color(0, 0, 255));
        btnIngresar_Admin.setText("Iniciar Sesion");
        btnIngresar_Admin.setSelected(true);
        btnIngresar_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresar_AdminActionPerformed(evt);
            }
        });
        btnIngresar_Admin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIngresar_AdminKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnIngresar_AdminKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnIngresar_AdminKeyTyped(evt);
            }
        });

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Usuario :");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("PROCESO DE EMBOTELLAMIENTO DE BEBIDAS CARBONATADAS");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText(" EN INDUSTRIAS LA CONSTANCIA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNOMBRE_Admin, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(txtContraseña))))
                .addGap(101, 101, 101))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIngresar_Admin)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtNOMBRE_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnIngresar_Admin)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void login(){
      String nomAdmin = txtNOMBRE_Admin.getText();
        String contra = txtContraseña.getText();

        if(!nomAdmin.isEmpty()){
            if(!contra.isEmpty()){
                if(nomAdmin.equals("admin")){
                    if(contra.equals("admin")){
                        Visitante nuevo = new Visitante();
                        nuevo.setVisible(true);
                        this.dispose();
                        this.setDefaultCloseOperation(Administrador.EXIT_ON_CLOSE);
                    }else{
                        JOptionPane.showMessageDialog(this, "Error la contraseña es incorrecta");
                    }
                    
                }else{
                   JOptionPane.showMessageDialog(this, "Error el usuario es incorrecto");
                }
                
            }else{
                JOptionPane.showMessageDialog(this, "Error debe ingresar la contraseña");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Error debe ingresar el usuario");
        }
 }
    private void btnIngresar_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresar_AdminActionPerformed
        // TODO add your handling code here:
       login();
    }//GEN-LAST:event_btnIngresar_AdminActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void btnIngresar_AdminKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresar_AdminKeyPressed
        if (evt.getExtendedKeyCode()==KeyEvent.VK_ENTER){
            login(); 
        }
    }//GEN-LAST:event_btnIngresar_AdminKeyPressed

    private void btnIngresar_AdminKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresar_AdminKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresar_AdminKeyReleased

    private void btnIngresar_AdminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresar_AdminKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresar_AdminKeyTyped
 public void centrarVentana(){
                    setLocationRelativeTo(null);
            }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar_Admin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNOMBRE_Admin;
    // End of variables declaration//GEN-END:variables
}
