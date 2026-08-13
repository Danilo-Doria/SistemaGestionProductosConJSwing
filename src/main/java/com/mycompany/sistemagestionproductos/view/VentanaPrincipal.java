package com.mycompany.sistemagestionproductos.view;

import com.mycompany.sistemagestionproductos.controller.ProductoController;
import com.mycompany.sistemagestionproductos.model.Producto;
import com.mycompany.sistemagestionproductos.repository.ProductoRepository;
import com.mycompany.sistemagestionproductos.service.ProductoService;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName());
    private final ProductoController controller;

    public VentanaPrincipal() {
        initComponents();

        ProductoRepository repository = ProductoRepository.getInstancia();
        ProductoService service = new ProductoService(repository);
        this.controller = new ProductoController(service);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        registarProductoBtn = new javax.swing.JButton();
        buscarProductoBtn = new javax.swing.JButton();
        listarProductoBtn = new javax.swing.JButton();
        eliminarProductoBtn = new javax.swing.JButton();
        resumenInventarioBtn = new javax.swing.JButton();
        actualizarProductoBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Gestin de Productos");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        registarProductoBtn.setText("Registrar producto");
        registarProductoBtn.addActionListener(this::registarProductoBtnActionPerformed);

        buscarProductoBtn.setText("Buscar producto");
        buscarProductoBtn.addActionListener(this::buscarProductoBtnActionPerformed);

        listarProductoBtn.setText("Listar productos");
        listarProductoBtn.addActionListener(this::listarProductoBtnActionPerformed);

        eliminarProductoBtn.setText("Eliminar producto");
        eliminarProductoBtn.addActionListener(this::eliminarProductoBtnActionPerformed);

        resumenInventarioBtn.setText("Resumen inventario");
        resumenInventarioBtn.addActionListener(this::resumenInventarioBtnActionPerformed);

        actualizarProductoBtn.setText("Actualizar producto");
        actualizarProductoBtn.addActionListener(this::actualizarProductoBtnActionPerformed);

        salirBtn.setText("Salir");
        salirBtn.addActionListener(this::salirBtnActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(registarProductoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buscarProductoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listarProductoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resumenInventarioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eliminarProductoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(actualizarProductoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(191, 191, 191))
            .addGroup(layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(salirBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registarProductoBtn)
                    .addComponent(actualizarProductoBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminarProductoBtn)
                    .addComponent(listarProductoBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resumenInventarioBtn)
                    .addComponent(buscarProductoBtn))
                .addGap(18, 18, 18)
                .addComponent(salirBtn)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registarProductoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registarProductoBtnActionPerformed
        VentanaRegistrarProducto ventanaRegistro = new VentanaRegistrarProducto();

        ventanaRegistro.setLocationRelativeTo(null);

        ventanaRegistro.setVisible(true);
    }//GEN-LAST:event_registarProductoBtnActionPerformed

    private void buscarProductoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProductoBtnActionPerformed

        VentanaBuscarProducto ventanaBuscar = new VentanaBuscarProducto();

        ventanaBuscar.setLocationRelativeTo(null);

        ventanaBuscar.setVisible(true);
    }//GEN-LAST:event_buscarProductoBtnActionPerformed

    private void listarProductoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarProductoBtnActionPerformed
        VentanaListarProductos ventanaListar = new VentanaListarProductos();

        ventanaListar.setLocationRelativeTo(null);

        ventanaListar.setVisible(true);
    }//GEN-LAST:event_listarProductoBtnActionPerformed

    private void eliminarProductoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductoBtnActionPerformed
        String codigoInputText = JOptionPane.showInputDialog(this, "Ingrese el código del producto a eliminar:");
        if (codigoInputText == null) {
            return; // El usuario canceló
        }

        String codigo = codigoInputText.trim();
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El código no puede estar vacío.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(this,
                "¿Está seguro de eliminar el producto con código " + codigo + "?",
                "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                // Intentamos eliminar a través del controlador
                controller.eliminarProducto(codigo);

                // Si no lanza excepción, mostramos el éxito
                JOptionPane.showMessageDialog(this, "Producto eliminado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

            } catch (IllegalArgumentException e) {
                // Si el código no existe o hay un error, la vista lo atrapa y lo muestra
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_eliminarProductoBtnActionPerformed

    private void resumenInventarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumenInventarioBtnActionPerformed
        // Obtenemos el texto del resumen que genera el controlador
        String mensajeResumen = controller.obtenerResumenInventario();

        // La vista se encarga de pintarlo en pantalla mediante el JOptionPane
        JOptionPane.showMessageDialog(this, mensajeResumen, "Resumen de Inventario", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_resumenInventarioBtnActionPerformed

    private void actualizarProductoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarProductoBtnActionPerformed
        String codigoInputText = JOptionPane.showInputDialog(this, "Ingrese el código del producto a actualizar:");
        if (codigoInputText == null) {
            return; // El usuario presionó "Cancelar"
        }

        // Limpiamos espacios en blanco por si el usuario tipeó mal
        String codigo = codigoInputText.trim();

        try {
            // 1. Intentamos buscar el producto. 
            // Si no existe o está vacío, el controlador lanzará la excepción automáticamente.
            Producto producto = controller.buscarProducto(codigo);

            // 2. Si lo encuentra, pedimos los nuevos datos por ventanitas
            String nuevoNombre = JOptionPane.showInputDialog(this, "Nuevo nombre:", producto.getNombre());
            if (nuevoNombre == null) {
                return;
            }

            String nuevoPrecio = JOptionPane.showInputDialog(this, "Nuevo precio base:", producto.getPrecioBase());
            if (nuevoPrecio == null) {
                return;
            }

            String nuevaCantidad = JOptionPane.showInputDialog(this, "Nueva cantidad disponible:", producto.getCantidadDisponible());
            if (nuevaCantidad == null) {
                return;
            }

            // 3. Enviamos a actualizar a través del controlador
            controller.actualizarProducto(codigo, nuevoNombre, nuevoPrecio, nuevaCantidad);

            // 4. Mensaje de éxito si todo salió bien
            JOptionPane.showMessageDialog(this, "¡Producto actualizado con éxito!", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (IllegalArgumentException e) {
            // 5. Atrapamos cualquier error (código no encontrado, campos vacíos o letras en los precios) 
            // y se lo mostramos amigablemente al usuario en un JOptionPane
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error de Actualización", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_actualizarProductoBtnActionPerformed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirBtnActionPerformed

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

        java.awt.EventQueue.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarProductoBtn;
    private javax.swing.JButton buscarProductoBtn;
    private javax.swing.JButton eliminarProductoBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton listarProductoBtn;
    private javax.swing.JButton registarProductoBtn;
    private javax.swing.JButton resumenInventarioBtn;
    private javax.swing.JButton salirBtn;
    // End of variables declaration//GEN-END:variables
}
