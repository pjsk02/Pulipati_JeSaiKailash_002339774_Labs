/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import model.Account;
import model.AccountDirectory;
import ui.AccountManager.AccountMngWorkAreaJPanel;

/**
 *
 * @author KAILASH
 */
public class MainJFrame extends javax.swing.JFrame {

    private AccountDirectory accountDirectory;
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        
        this.accountDirectory = new AccountDirectory();
        generateDemoData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        topJPanel = new javax.swing.JPanel();
        btnAccountManaging = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        btnAccountManaging.setText("Open Account Manager Work Area");
        btnAccountManaging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountManagingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topJPanelLayout = new javax.swing.GroupLayout(topJPanel);
        topJPanel.setLayout(topJPanelLayout);
        topJPanelLayout.setHorizontalGroup(
            topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topJPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnAccountManaging)
                .addContainerGap(550, Short.MAX_VALUE))
        );
        topJPanelLayout.setVerticalGroup(
            topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topJPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnAccountManaging)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        splitPane.setTopComponent(topJPanel);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccountManagingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountManagingActionPerformed
        // TODO add your handling code here:
        AccountMngWorkAreaJPanel panel = new AccountMngWorkAreaJPanel(userProcessContainer, accountDirectory);
        userProcessContainer.add("AccountMngWorkAreaJPanel",panel);
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAccountManagingActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccountManaging;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel topJPanel;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables

    
    private void generateDemoData(){
        Account acc1 = accountDirectory.addAccount();
        acc1.setAccountNumber("123456789");
        acc1.setBalance(9999);
        acc1.setBankName("Bank of America");
        acc1.setRoutingNumber("12341234");
        
        Account acc2 = accountDirectory.addAccount();
        acc2.setAccountNumber("987654321");
        acc2.setBalance(1000);
        acc2.setBankName("Chase");
        acc2.setRoutingNumber("111222333");
    }
}
