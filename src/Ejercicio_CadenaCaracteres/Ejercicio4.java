/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio_CadenaCaracteres;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Alonso Ballena Garcia
 */
public class Ejercicio4 extends javax.swing.JFrame {

    public Ejercicio4() {
        initComponents();
    }
    
     public boolean esTextoValido(String texto){
        if(texto == null || texto.length() == 0){
            JOptionPane.showMessageDialog(this,"Debe ingresar una Cadena");
            return false;
        }
        return true;
    }
     
    public boolean esLetraValida(String texto){
        if(texto == null || texto.length() == 0 ){
            JOptionPane.showMessageDialog(null,"Debe ingresar un Caracter","Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }else if( texto.length() > 1){
            JOptionPane.showMessageDialog(null,"Solamente debe ser un Caracter","Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public String reemplazar(String texto , char replace){
        String auxiliar ="";
        for(int i=0; i<texto.length(); i++){
            if(texto.charAt(i) == replace){
                auxiliar+="4";
            }else{
                auxiliar+=texto.charAt(i);
            }
        }
        return auxiliar;
    }
    
   
    
    public String ordenarDesc(String texto){
        char cadena[] = texto.toCharArray();
        for(int i=0; i<cadena.length; i++){
            for(int j=i+1; j<cadena.length; j++){
                char c = cadena[i];
                if(c < cadena[j]){
                    cadena = swap(cadena, i, j);
                }
            }
        }
        return new String(cadena);
    }
    
    private char[] swap(char[] c, int i , int j){
        char temp = c[i];
        c[i] = c[j];
        c[j]=temp;
        return c;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_cadena = new javax.swing.JTextField();
        txt_caracter = new javax.swing.JTextField();
        btnMostrar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnReemplazar = new javax.swing.JButton();
        txt_original = new javax.swing.JTextField();
        txt_reemplazado = new javax.swing.JTextField();
        txt_ordenado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingresar Cadena :");

        jLabel2.setText("Ingresar Caracter:");

        btnMostrar.setText("MOSTRAR");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnOrdenar.setText("ORDENAR DESC");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        btnReemplazar.setText("REEMPLAZAR");
        btnReemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReemplazarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_caracter))
                            .addComponent(txt_cadena, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMostrar)
                            .addComponent(txt_original, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReemplazar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_reemplazado, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ordenado, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cadena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_caracter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrar)
                    .addComponent(btnOrdenar)
                    .addComponent(btnReemplazar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_original, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_reemplazado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ordenado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        String cadena = txt_cadena.getText();
        if(!esTextoValido(cadena)){
            return;
        }
        txt_original.setText(cadena);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnReemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReemplazarActionPerformed
        String cadena = txt_cadena.getText();
        String caracter = txt_caracter.getText();
        if(!esTextoValido(cadena) || !esLetraValida(caracter)){
            return;
        }
        txt_reemplazado.setText(reemplazar(cadena, caracter.charAt(0)));
    }//GEN-LAST:event_btnReemplazarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        String cadena = txt_cadena.getText();
        if(!esTextoValido(cadena)){
            return;
        }
        txt_ordenado.setText(ordenarDesc(cadena));
    }//GEN-LAST:event_btnOrdenarActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnReemplazar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_cadena;
    private javax.swing.JTextField txt_caracter;
    private javax.swing.JTextField txt_ordenado;
    private javax.swing.JTextField txt_original;
    private javax.swing.JTextField txt_reemplazado;
    // End of variables declaration//GEN-END:variables
}
