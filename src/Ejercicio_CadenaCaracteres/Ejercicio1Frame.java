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
public class Ejercicio1Frame extends javax.swing.JFrame {
    
    
    
    public Ejercicio1Frame() {
        initComponents();
    }
    
    public boolean estaComprendido(String texto){
        if(texto.length() == 0){
            return false;
        }else if(texto.charAt(0) >= 73 && texto.charAt(0) <= 77){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean esLetraValida(String texto){
        if(texto == null || texto.length() == 0 ){
            JOptionPane.showMessageDialog(null,"Debe ingresar una letra","Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }else if( texto.length() > 1){
            JOptionPane.showMessageDialog(null,"Solamente debe ser una letra","Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_Verificar = new javax.swing.JButton();
        txt_letra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Salida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingresar Letra :");

        btn_Verificar.setText("Verificar");
        btn_Verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerificarActionPerformed(evt);
            }
        });

        txt_Salida.setColumns(20);
        txt_Salida.setRows(5);
        jScrollPane1.setViewportView(txt_Salida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Verificar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_letra, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 154, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_letra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_Verificar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerificarActionPerformed
        String texto = txt_letra.getText().trim();
        txt_letra.setText(texto);/**En el caso solo ponga  vacios , esto va reflejar que se realizo la funcion trim**/
        if(!esLetraValida(texto)){
           return;
        }
        if(estaComprendido(txt_letra.getText())){
            txt_Salida.setText("Si esta comprendido entre las letras I y M");
        }else{
            txt_Salida.setText("No esta comprendido entre las letras I y M");
        }
    }//GEN-LAST:event_btn_VerificarActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio1Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio1Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Verificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt_Salida;
    private javax.swing.JTextField txt_letra;
    // End of variables declaration//GEN-END:variables
}
