/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ProductosFrm.java
 *
 * Created on 12/06/2012, 06:10:18 PM
 */

package com.lightproducts.proyecto.frm;

import com.lightproducts.proyecto.dao.imp.ProductoDAOImpl;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.lightproducts.proyecto.modelo.Producto;

/**
 *
 * @author alumno
 */
public class ProductosFrm extends javax.swing.JInternalFrame {

    int res;
    ProductoDAOImpl pd = new ProductoDAOImpl();
    private List<Producto> lista;
    DefaultTableModel model;
    /** Creates new form Productos */
    public ProductosFrm() {
        initComponents();
        listarProductos();
    }
    
    public void listarProductos(){
    lista = (ArrayList<Producto>) pd.listar();
    model = (DefaultTableModel) jtbProductos.getModel();
        Object[] producto = new Object[8];
        for(int i=0;i<lista.size();i++){
            producto[0]=lista.get(i).getId();
            producto[1]=lista.get(i).getNombre();
            producto[2]=lista.get(i).getPrecio();
            producto[3]=lista.get(i).getStock();
            
            model.addRow(producto);
        }        
        jtbProductos.setModel(model);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbProductos = new javax.swing.JTable();
        btnRegPro = new javax.swing.JButton();
        btnModPro = new javax.swing.JButton();
        btnElimPro = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Productos");

        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });

        jLabel1.setText("Producto:");

        jLabel6.setText("Stock:");

        jLabel5.setText("Precio:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel6)
                        .addGap(13, 13, 13)
                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtId)))
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jtbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Producto", "Precio", "Stock"
            }
        ));
        jtbProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbProductos);

        btnRegPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevoproducto.png"))); // NOI18N
        btnRegPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegProActionPerformed(evt);
            }
        });

        btnModPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editarproducto.png"))); // NOI18N
        btnModPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModProActionPerformed(evt);
            }
        });

        btnElimPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminarproducto.png"))); // NOI18N
        btnElimPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimProActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btnRegPro)
                    .addComponent(btnModPro)
                    .addComponent(btnElimPro)))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegPro)
                        .addGap(6, 6, 6)
                        .addComponent(btnModPro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnElimPro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtProductoActionPerformed

    private void btnRegProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegProActionPerformed
        Producto producto = new Producto(txtProducto.getText(),Float.parseFloat(txtPrecio.getText()),Integer.parseInt(txtStock.getText()));
        res = pd.insertar(producto);
        limpiar();
        if(res!=0){            
            JOptionPane.showMessageDialog(null,"Producto registrado!");   
            actualizar();
        }else{
            JOptionPane.showMessageDialog(null,"Producto no registrado!");
        }
    }//GEN-LAST:event_btnRegProActionPerformed

    private void jtbProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbProductosMouseClicked
        if(evt.getButton()==1){
            int fila = jtbProductos.getSelectedRow();
            int celda = (int) jtbProductos.getValueAt(fila, 0);
            Producto producto;
            producto = pd.obtenerPorId(celda);
            for(int i=0;i<lista.size();i++){
                txtId.setText(""+producto.getId());
                txtProducto.setText(""+producto.getNombre());
                txtPrecio.setText(""+producto.getPrecio());
                txtStock.setText(""+producto.getStock());                
            }
        }
    }//GEN-LAST:event_jtbProductosMouseClicked

    private void btnModProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModProActionPerformed
        int fil = jtbProductos.getSelectedRow();
        if(fil<0){
            JOptionPane.showMessageDialog(null, "Seleccionar el producto a MODIFICAR!");
        }else{
            int confirmar=JOptionPane.showConfirmDialog(null, "Esta seguro que desea MODIFICAR los datos"); 
            if(JOptionPane.OK_OPTION==confirmar) {
                Producto producto = new Producto();
                producto.setId(Integer.parseInt(txtId.getText()));
                producto.setNombre(txtProducto.getText());
                producto.setPrecio(Float.parseFloat(txtPrecio.getText()));
                producto.setStock(Integer.parseInt(txtStock.getText()));
                    int x = pd.modificar(producto);
                    if(x==1){
                        JOptionPane.showMessageDialog(null, "MODIFICADO!");
                        actualizar();
                        limpiar();
                    }else{
                        JOptionPane.showMessageDialog(null, "NO MODIFICADO!");      
                    }                   
            }        
        }
    }//GEN-LAST:event_btnModProActionPerformed

    private void btnElimProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimProActionPerformed
        int fila = jtbProductos.getSelectedRow();
        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccionar producto a eliminar");            
        }else{
            int confirmar=JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar este producto"); 
            if(JOptionPane.OK_OPTION==confirmar) {
                    //int celda = (int) jtbProductos.getValueAt(fila, 0);
                    int x = pd.eliminar(Integer.parseInt(txtId.getText()));
                    if(x==1){
                        JOptionPane.showMessageDialog(null, "ELIMINADO!");
                        actualizar();
                        limpiar();
                    }else{
                        JOptionPane.showMessageDialog(null, "NO ELIMINADO!");      
                    }                   
            } 
            
        }
    }//GEN-LAST:event_btnElimProActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.hide();
    }//GEN-LAST:event_btnCancelarActionPerformed


    void limpiar(){
        txtProducto.setText(null);
        txtStock.setText(null);
        txtPrecio.setText(null);
        txtProducto.requestFocus();
        txtId.setText(null);
    }
    void actualizar(){
        LimpiarTabla(model);
        listarProductos();
            
    }
    
    void LimpiarTabla(DefaultTableModel modelo){
        int a = modelo.getRowCount()-1;
        for(int i=a;i>=0;i--){  
            modelo.removeRow(i);
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnElimPro;
    private javax.swing.JButton btnModPro;
    private javax.swing.JButton btnRegPro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbProductos;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables

}
