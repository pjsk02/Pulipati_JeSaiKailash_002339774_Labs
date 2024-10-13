/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author KAILASH
 */
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Supplier;
import model.SupplierDirectory;
import ui.admin.AdminWorkAreaJPanel;
import ui.supplier.SupplierWorkAreaJPanel;

public class LoginScreen extends javax.swing.JPanel {

    /**
     * Creates new form LoginScreen
     */
    JPanel mainWorkArea;
    SupplierDirectory supplierDirectory;
    Supplier selectedSupplier = null;
    
    public LoginScreen(JPanel mainWorkArea, SupplierDirectory supplierDirectory){
        
        initComponents();
        
        this.mainWorkArea = mainWorkArea;
        this.supplierDirectory = supplierDirectory;
        
        populateRoleCombo();
        populateSupplierCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblSupplier = new javax.swing.JLabel();
        lblChooseRole = new javax.swing.JLabel();
        cmbRoles = new javax.swing.JComboBox<>();
        cmbSuppliers = new javax.swing.JComboBox<>();
        btnLogin = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setText("Lab 4 Demo");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        lblSupplier.setText("Select Supplier");
        add(lblSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        lblChooseRole.setText("Choose Role");
        add(lblChooseRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        cmbRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Supplier" }));
        cmbRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRolesActionPerformed(evt);
            }
        });
        add(cmbRoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        cmbSuppliers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Best Buy" }));
        cmbSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSuppliersActionPerformed(evt);
            }
        });
        add(cmbSuppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 110, -1));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        JPanel selectedPanel = (JPanel) cmbRoles.getSelectedItem();//getSelectedItem();
        
        if(selectedPanel.getClass() == SupplierWorkAreaJPanel.class){
            if(selectedSupplier == null)
            {
                JOptionPane.showMessageDialog(this, "Please select a supplier to login under supplier role", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                selectedPanel = new SupplierWorkAreaJPanel(mainWorkArea, selectedSupplier);            
            }
        }
        mainWorkArea.add("WorkAreaJPanel",selectedPanel);
        CardLayout Layout = (CardLayout) mainWorkArea.getLayout();
        Layout.next(mainWorkArea);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void cmbSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSuppliersActionPerformed
        // TODO add your handling code here:
        if(cmbSuppliers.getSelectedItem()==null) return;
        selectedSupplier = (Supplier) cmbSuppliers.getSelectedItem();
    }//GEN-LAST:event_cmbSuppliersActionPerformed

    private void cmbRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRolesActionPerformed
        // TODO add your handling code here:
        updateSupplierVisibility();
    }//GEN-LAST:event_cmbRolesActionPerformed


    // for cbm supplier action perfomed
//    /**
    
    
//    **/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<Object> cmbRoles;
    private javax.swing.JComboBox<Object> cmbSuppliers;
    private javax.swing.JLabel lblChooseRole;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables

    private void populateRoleCombo(){
        
        cmbRoles.removeAllItems();
        AdminWorkAreaJPanel adminPanel = new AdminWorkAreaJPanel(mainWorkArea, supplierDirectory);
        SupplierWorkAreaJPanel supplierPanel = new SupplierWorkAreaJPanel(mainWorkArea,selectedSupplier);
        
        cmbRoles.addItem(adminPanel);
        cmbRoles.addItem(supplierPanel); // shpuldnt it be suppliers
        
    }
    
    public void populateSupplierCombo(){
        cmbSuppliers.removeAllItems();

        for(Supplier supplier : supplierDirectory.getSupplierList()){
            cmbSuppliers.addItem(supplier);
        }
    }
    
    private void updateSupplierVisibility(){
        if((cmbRoles.getSelectedItem()==null) || (cmbRoles.getSelectedItem().getClass() == AdminWorkAreaJPanel.class)){
            selectedSupplier = null;
            lblSupplier.setVisible(false);
            cmbSuppliers.setVisible(false);
            return;
        }
        if(cmbRoles.getSelectedItem().getClass() == SupplierWorkAreaJPanel.class){
            lblSupplier.setVisible(true);
            cmbSuppliers.setVisible(true);
        }
    }
}
