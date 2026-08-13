package com.mycompany.sistemagestionproductos.view;

import com.mycompany.sistemagestionproductos.controller.ProductoController;
import com.mycompany.sistemagestionproductos.repository.ProductoRepository;
import com.mycompany.sistemagestionproductos.service.ProductoService;

public class VentanaRegistrarProducto extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaRegistrarProducto.class.getName());
    private final ProductoController controller;

    public VentanaRegistrarProducto() {
        initComponents();

        ProductoRepository repository = ProductoRepository.getInstancia();
        ProductoService service = new ProductoService(repository);
        this.controller = new ProductoController(service);

        pesoProductoInput.setEnabled(false);
        costoEnvioProductoInput.setEnabled(false);
        tamanioArchivoProductoInput.setEnabled(false);
        formatoProductoInput.setEnabled(false);

        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        codigoInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreProductoInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        precioBaseProductoInput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cantidadDisponibleProductoInput = new javax.swing.JTextField();
        tipoProductoInput = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pesoProductoInput = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        costoEnvioProductoInput = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tamanioArchivoProductoInput = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        formatoProductoInput = new javax.swing.JTextField();
        registrarBtn = new javax.swing.JButton();
        limpiarBtn = new javax.swing.JButton();
        volverBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo");

        codigoInput.addActionListener(this::codigoInputActionPerformed);

        jLabel2.setText("Datos del producto");

        jLabel3.setText("Nombre");

        nombreProductoInput.addActionListener(this::nombreProductoInputActionPerformed);

        jLabel4.setText("Precio Base");

        precioBaseProductoInput.addActionListener(this::precioBaseProductoInputActionPerformed);

        jLabel5.setText("Cantidad Disponible");

        cantidadDisponibleProductoInput.addActionListener(this::cantidadDisponibleProductoInputActionPerformed);

        tipoProductoInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fisico", "Digital" }));
        tipoProductoInput.addActionListener(this::tipoProductoInputActionPerformed);

        jLabel6.setText("Tipo de producto");

        jLabel7.setText("Peso (Kg)");

        pesoProductoInput.setActionCommand("<Not Set>");
        pesoProductoInput.addActionListener(this::pesoProductoInputActionPerformed);

        jLabel8.setText("Costo de Envio");

        costoEnvioProductoInput.addActionListener(this::costoEnvioProductoInputActionPerformed);

        jLabel9.setText("Tamaño del archivo");

        tamanioArchivoProductoInput.addActionListener(this::tamanioArchivoProductoInputActionPerformed);

        jLabel10.setText("Formato");

        formatoProductoInput.addActionListener(this::formatoProductoInputActionPerformed);

        registrarBtn.setText("Registrar");
        registrarBtn.addActionListener(this::registrarBtnActionPerformed);

        limpiarBtn.setText("Limpiar");
        limpiarBtn.addActionListener(this::limpiarBtnActionPerformed);

        volverBtn.setText("Volver");
        volverBtn.addActionListener(this::volverBtnActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoProductoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1)
                                    .addComponent(codigoInput)
                                    .addComponent(nombreProductoInput)
                                    .addComponent(precioBaseProductoInput)
                                    .addComponent(cantidadDisponibleProductoInput))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pesoProductoInput)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(costoEnvioProductoInput)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tamanioArchivoProductoInput)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(formatoProductoInput)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(registrarBtn)
                                .addGap(18, 18, 18)
                                .addComponent(limpiarBtn)
                                .addGap(18, 18, 18)
                                .addComponent(volverBtn)))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(costoEnvioProductoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(pesoProductoInput)
                                    .addComponent(codigoInput))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreProductoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(precioBaseProductoInput)
                    .addComponent(tamanioArchivoProductoInput))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadDisponibleProductoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formatoProductoInput)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoProductoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarBtn)
                    .addComponent(limpiarBtn)
                    .addComponent(volverBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoInputActionPerformed

    }//GEN-LAST:event_codigoInputActionPerformed

    private void nombreProductoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProductoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreProductoInputActionPerformed

    private void precioBaseProductoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioBaseProductoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioBaseProductoInputActionPerformed

    private void cantidadDisponibleProductoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadDisponibleProductoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadDisponibleProductoInputActionPerformed

    private void tipoProductoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoProductoInputActionPerformed
        // 1. Obtener la opción seleccionada en el ComboBox
        String tipoSeleccionado = tipoProductoInput.getSelectedItem().toString();

        // 2. Apagar (deshabilitar) todos los campos de la derecha primero para limpiar el estado
        pesoProductoInput.setEnabled(false);
        costoEnvioProductoInput.setEnabled(false);
        tamanioArchivoProductoInput.setEnabled(false);
        formatoProductoInput.setEnabled(false);

        // 3. Encender (habilitar) solo los campos necesarios según la opción
        if (tipoSeleccionado.equals("Fisico")) {
            pesoProductoInput.setEnabled(true);
            costoEnvioProductoInput.setEnabled(true);
            tamanioArchivoProductoInput.setText("");
            formatoProductoInput.setText("");

        } else if (tipoSeleccionado.equals("Digital")) {
            tamanioArchivoProductoInput.setEnabled(true);
            formatoProductoInput.setEnabled(true);
            costoEnvioProductoInput.setText("");
            pesoProductoInput.setText("");
        }
    }//GEN-LAST:event_tipoProductoInputActionPerformed

    private void pesoProductoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoProductoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoProductoInputActionPerformed

    private void costoEnvioProductoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoEnvioProductoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoEnvioProductoInputActionPerformed

    private void tamanioArchivoProductoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanioArchivoProductoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamanioArchivoProductoInputActionPerformed

    private void formatoProductoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formatoProductoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formatoProductoInputActionPerformed

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_volverBtnActionPerformed

    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed
        String tipo = tipoProductoInput.getSelectedItem().toString();
        String codigo = codigoInput.getText();
        String nombre = nombreProductoInput.getText();
        String precioBase = precioBaseProductoInput.getText();
        String cantidadDisponible = cantidadDisponibleProductoInput.getText();
        String peso = pesoProductoInput.getText();
        String costoEnvio = costoEnvioProductoInput.getText();
        String tamanioArchivo = tamanioArchivoProductoInput.getText();
        String formato = formatoProductoInput.getText();

        try {
            // 3. Llamamos al método usando la instancia (con minúscula: controller)
            controller.registrarProducto(tipo, codigo, nombre, precioBase, cantidadDisponible,
                    peso, costoEnvio, tamanioArchivo, formato);

            // 4. Si todo sale bien, mostramos éxito y limpiamos
            javax.swing.JOptionPane.showMessageDialog(this, "Producto registrado con éxito. Código: " + codigo);
            limpiarCampos();

        } catch (IllegalArgumentException e) {
            // 5. Si el controlador o modelo detectan un error, la vista lo atrapa y lo muestra
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(), "Error de Validación", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_registrarBtnActionPerformed

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_limpiarBtnActionPerformed

    public void limpiarCampos() {
        cantidadDisponibleProductoInput.setText("");
        codigoInput.setText("");
        costoEnvioProductoInput.setText("");
        formatoProductoInput.setText("");
        nombreProductoInput.setText("");
        pesoProductoInput.setText("");
        precioBaseProductoInput.setText("");
        tamanioArchivoProductoInput.setText("");
    }

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VentanaRegistrarProducto().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidadDisponibleProductoInput;
    private javax.swing.JTextField codigoInput;
    private javax.swing.JTextField costoEnvioProductoInput;
    private javax.swing.JTextField formatoProductoInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JTextField nombreProductoInput;
    private javax.swing.JTextField pesoProductoInput;
    private javax.swing.JTextField precioBaseProductoInput;
    private javax.swing.JButton registrarBtn;
    private javax.swing.JTextField tamanioArchivoProductoInput;
    private javax.swing.JComboBox<String> tipoProductoInput;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
