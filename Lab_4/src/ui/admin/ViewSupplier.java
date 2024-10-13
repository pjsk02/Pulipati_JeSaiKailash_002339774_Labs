/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.admin;

import model.Product;
import model.Supplier;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KAILASH
 */
public class ViewSupplier extends javax.swing.JPanel {

    JPanel workArea;
    Supplier supplier;
    /**
     * Creates new form ViewSupplier
     */
    public ViewSupplier(JPanel workArea, Supplier supplier) {
        initComponents();
        this.workArea = workArea;
        this.supplier = supplier;
        
        lblSupplierName.setText(supplier.getSupplyName());
        
        refreshTable();
    }
    
    private void refreshTable() {
        
        DefaultTableModel model = (DefaultTableModel)productCatalog.getModel();
        model.setRowCount(0);
        
        for(Product p : supplier.getProductCatalog().getProductCatalog()) {
            Object row[] = new Object[3];
            row[0] = p;
            row[1] = p.getId();
            row[2] = p.getPrice();
            model.addRow(row);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSupplierName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productCatalog = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnSupplierList = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSupplierName.setText("<Supplier Name>");
        add(lblSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 23, -1, -1));

        productCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Name", "Model", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productCatalog);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 61, 728, 283));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnSupplierList.setText("Add Supplier");
        btnSupplierList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierListActionPerformed(evt);
            }
        });
        add(btnSupplierList, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        btnView.setText("View Supplier");
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        btnRemove.setText("Remove");
        add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSupplierListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSupplierListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSupplierList;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JTable productCatalog;
    // End of variables declaration//GEN-END:variables
}