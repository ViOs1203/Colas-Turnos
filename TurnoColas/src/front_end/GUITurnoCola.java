// Victor Osvaldo Piña Becerra, Santiago Moreno Sotelo, Oscar Uriel Pedraza Alvarez
package front_end;

import javax.swing.JOptionPane;
import back_end.Cola;
import back_end.Nodo;
import back_end.Turno;

public class GUITurnoCola extends javax.swing.JFrame {
    
    private Cola cola;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUITurnoCola.class.getName());

    
    public GUITurnoCola() {
        this.cola = new Cola();
        initComponents();
        actualizarGUI();
    }
    
    private void actualizarGUI() {
        if (cola.estaVacia()) {
            txtAreaCola.setText("La cola esta vacia.");
        } else {
            StringBuilder sb = new StringBuilder();
            Nodo actual = cola.getPrimero();
            int pos = 1;

            while (actual != null) {
                String etiqueta = "";
                if (pos == 1) {
                    etiqueta = " (Primero)";
                } else if (actual.getSiguiente() == null) {
                    etiqueta = " (Ultimo)";
                }

                sb.append("Posicion ").append(pos).append(etiqueta).append(": ")
                  .append(actual.getDato().toString()).append("\n");

                actual = actual.getSiguiente();
                pos++;
            }
            txtAreaCola.setText(sb.toString());
        }

        lblEstado.setText("Elementos en cola: " + cola.obtenerTamaño());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNumeroTurno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbTramite = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaCola = new javax.swing.JTextArea();
        lblEstado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnEncolar = new javax.swing.JButton();
        btnDesencolar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();
        btnTamaño = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Numero de Turno");

        jLabel2.setText("Nombre del Cliente");

        jLabel3.setText("Tipo de Tramite");

        cbTramite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deposito", "Atencion a Clientes", "Aclaraciones", "Creditos" }));
        cbTramite.addActionListener(this::cbTramiteActionPerformed);

        jLabel4.setText("Lista de Espera");

        txtAreaCola.setColumns(20);
        txtAreaCola.setRows(5);
        jScrollPane1.setViewportView(txtAreaCola);

        lblEstado.setText("Elemntos en cola: 0");

        btnEncolar.setText("Encolar");
        btnEncolar.addActionListener(this::btnEncolarActionPerformed);

        btnDesencolar.setText("Desencolar");
        btnDesencolar.addActionListener(this::btnDesencolarActionPerformed);

        jButton1.setText("Ver el Primero");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        btnVaciar.setText("Vaciar Cola");
        btnVaciar.addActionListener(this::btnVaciarActionPerformed);

        btnTamaño.setText("Obtener tamaño");
        btnTamaño.addActionListener(this::btnTamañoActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTamaño)
                    .addComponent(btnVaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesencolar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEncolar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnEncolar)
                .addGap(18, 18, 18)
                .addComponent(btnDesencolar)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btnVaciar)
                .addGap(18, 18, 18)
                .addComponent(btnTamaño)
                .addContainerGap(324, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumeroTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(cbTramite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cbTramite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEstado)
                        .addGap(76, 76, 76))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTramiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTramiteActionPerformed
   
    }//GEN-LAST:event_cbTramiteActionPerformed

    private void btnEncolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncolarActionPerformed
    String strNum = txtNumeroTurno.getText().trim();
    String nombre = txtNombreCliente.getText().trim();
    String tramite = (String) cbTramite.getSelectedItem();
    
    if(strNum.isEmpty() || nombre.isEmpty()){
        JOptionPane.showMessageDialog(this,"Hay datos vacios", "Error", JOptionPane.ERROR_MESSAGE );
        return;
    }
    
    int numeroTurno;
    try{
        numeroTurno = Integer.parseInt(strNum);
        if(numeroTurno <= 0 ){
            JOptionPane.showMessageDialog(this, "El numero de turno debe ser mayor a 0.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "El numero de turno debe ser un numero valido.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    cola.encolar(new Turno(numeroTurno, nombre, tramite));

    txtNumeroTurno.setText("");
    txtNombreCliente.setText("");
    txtNumeroTurno.requestFocus();

    actualizarGUI();
    }//GEN-LAST:event_btnEncolarActionPerformed

    private void btnDesencolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesencolarActionPerformed
    if (cola.estaVacia()){
        JOptionPane.showMessageDialog(this, "La cola esta vacia no se puede desencolar", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        
    }
    
    Turno atendido = cola.desencolar();
    JOptionPane.showMessageDialog(this, 
    "Turno atendido: " + atendido.toString(),"Atendido", JOptionPane.INFORMATION_MESSAGE);

    actualizarGUI();
    }//GEN-LAST:event_btnDesencolarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if (cola.estaVacia()){
        JOptionPane.showMessageDialog(this, "La cola esta vacia, no hay primero aun.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        return;
    } else {
        JOptionPane.showMessageDialog(this, "Primero: " + cola.consultarPrimero().toString(), "Primero", JOptionPane.INFORMATION_MESSAGE);
    }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnTamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTamañoActionPerformed
    JOptionPane.showMessageDialog(this, "Elementos en la cola: " + cola.obtenerTamaño(), "Tamaño", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnTamañoActionPerformed

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
    if (cola.estaVacia()) {
        JOptionPane.showMessageDialog(this, "La cola ya esta vacia. ", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        int confirmar = JOptionPane.showConfirmDialog(this, "¿Seguro de vaciar la cola?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if(confirmar == JOptionPane.YES_NO_OPTION){
            cola.vaciar();
            actualizarGUI();
            JOptionPane.showMessageDialog(this, "la cola se ha vaciado.", "Vaciado", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnVaciarActionPerformed

   
    public static void main(String args[]) {
        
        
       
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> new GUITurnoCola().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesencolar;
    private javax.swing.JButton btnEncolar;
    private javax.swing.JButton btnTamaño;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JComboBox<String> cbTramite;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JTextArea txtAreaCola;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNumeroTurno;
    // End of variables declaration//GEN-END:variables
}
