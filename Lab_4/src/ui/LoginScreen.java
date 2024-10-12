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
        lblSelectSupplier = new javax.swing.JLabel();
        lblChooseRole = new javax.swing.JLabel();
        cmbRoles = new javax.swing.JComboBox<>();
        cmbSuppliers = new javax.swing.JComboBox<>();
        btnLogin = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setText("Lab 4 Demo");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        lblSelectSupplier.setText("Select Supplier");
        add(lblSelectSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        lblChooseRole.setText("Choose Role");
        add(lblChooseRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        add(cmbRoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        cmbSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSuppliersActionPerformed(evt);
            }
        });
        add(cmbSuppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

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
        JPanel selectedPanel = (JPanel) cbmRoles.getSelectedItem();
        
        if(selectedPanel.getClass() == SupplierWorkAreaJPanel.class){
            
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void cmbSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSuppliersActionPerformed
        // TODO add your handling code here:
        if(cmbSuppliers.getSelectedItem()==null) return;
        selectedSupplier = (Supplier) cmbSuppliers.getSelectedItem();
    }//GEN-LAST:event_cmbSuppliersActionPerformed


    // for cbm supplier action perfomed
//    /**
    
    
//    **/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cmbRoles;
    private javax.swing.JComboBox<String> cmbSuppliers;
    private javax.swing.JLabel lblChooseRole;
    private javax.swing.JLabel lblSelectSupplier;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
