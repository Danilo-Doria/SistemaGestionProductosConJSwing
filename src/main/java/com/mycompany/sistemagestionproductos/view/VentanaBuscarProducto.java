package com.mycompany.sistemagestionproductos.view;

import com.mycompany.sistemagestionproductos.controller.ProductoController;
import com.mycompany.sistemagestionproductos.model.Producto;
import com.mycompany.sistemagestionproductos.repository.ProductoRepository;
import com.mycompany.sistemagestionproductos.service.ProductoService;
import javax.swing.JOptionPane;

public class VentanaBuscarProducto extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaBuscarProducto.class.getName());
    private final ProductoController controller;

    public VentanaBuscarProducto() {
        initComponents();

        ProductoRepository repository = ProductoRepository.getInstancia();
        ProductoService service = new ProductoService(repository);
        this.controller = new ProductoController(service);

        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codigoInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        codigoInputBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        productoDescripcion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codigoInput.addActionListener(this::codigoInputActionPerformed);

        jLabel1.setText("Digite el codigo del producto");

        codigoInputBtn.setText("Buscar");
        codigoInputBtn.addActionListener(this::codigoInputBtnActionPerformed);

        productoDescripcion.setEditable(false);
        productoDescripcion.setColumns(20);
        productoDescripcion.setRows(5);
        jScrollPane2.setViewportView(productoDescripcion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(codigoInput)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(codigoInputBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(codigoInputBtn)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoInputBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoInputBtnActionPerformed
        String codigo = codigoInput.getText().trim();

        try {
            // 1. Llamamos al método a través de la instancia del controlador
            Producto producto = controller.buscarProducto(codigo);

            // 2. Si se encuentra con éxito, actualizamos la interfaz
            productoDescripcion.setText(producto.mostrarInformacion());

        } catch (IllegalArgumentException e) {
            // 3. Si el controlador lanza una excepción (código vacío o no encontrado), 
            // la vista la atrapa y se encarga de mostrarla visualmente
            javax.swing.JOptionPane.showMessageDialog(this,
                    e.getMessage(),
                    "Error de Búsqueda",
                    javax.swing.JOptionPane.ERROR_MESSAGE);

            // Opcional: limpiar el campo de texto de la descripción si falla
            productoDescripcion.setText("");
        }
    }//GEN-LAST:event_codigoInputBtnActionPerformed

    private void codigoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoInputActionPerformed

    /**
     * @param args the command line arguments
     */
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

        java.awt.EventQueue.invokeLater(() -> new VentanaBuscarProducto().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigoInput;
    private javax.swing.JButton codigoInputBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea productoDescripcion;
    // End of variables declaration//GEN-END:variables
}
