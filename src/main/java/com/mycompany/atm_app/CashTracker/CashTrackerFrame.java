/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.atm_app.CashTracker;

import static ATM.LogIn.accNumber;
import com.mycompany.atm_app.Main;
import com.toedter.calendar.JTextFieldDateEditor;

/**
 *
 * @author Mohamed Ahmed
 */
public class CashTrackerFrame extends javax.swing.JFrame {

    /**
     * Creates new form CashTrackerFrame
     */
    public CashTrackerFrame() {
        initComponents();
        cashTrackerFun.setAccNum(accNumber);
        cashTrackerFun.loadVariables();
        cashTrackerFun.dateSetter(jDateChooser2, "1950-01-01");
        cashTrackerFun.currentDateSetter(jDateChooser1);
        jTable1.setModel(cashTrackerFun.transcationsModel(jDateChooser2, jDateChooser1));
        cashTrackerFun.centerTableCells(jTable1);
        cashTrackerFun.updateBalance();
        balanceTextbox.setText(String.valueOf(cashTrackerFun.getBalance()));
    }
    static cashTrackerFunctions cashTrackerFun = new cashTrackerFunctions();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        withdrawButton1 = new javax.swing.JButton();
        withdrawButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        balanceTextbox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setBackground(new java.awt.Color(255, 0, 0));
        BackButton.setFont(BackButton.getFont().deriveFont(BackButton.getFont().getStyle() | java.awt.Font.BOLD, BackButton.getFont().getSize()+2));
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setText("Back");
        BackButton.setToolTipText("");
        BackButton.setFocusPainted(false);
        BackButton.setFocusable(false);
        BackButton.setPreferredSize(new java.awt.Dimension(150, 35));
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 160, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("End Date:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 90, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Start Date:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 100, 30));

        JTextFieldDateEditor editor1 = (JTextFieldDateEditor) jDateChooser1.getDateEditor();
        editor1.setEnabled(false);
        jDateChooser1.setForeground(new java.awt.Color(0, 0, 0));
        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFocusable(false);
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 130, 30));

        JTextFieldDateEditor editor2 = (JTextFieldDateEditor) jDateChooser2.getDateEditor();
        editor2.setEnabled(false);
        jDateChooser2.setForeground(new java.awt.Color(0, 0, 0));
        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        jDateChooser2.setFocusable(false);
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 130, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 560, 10));

        withdrawButton1.setBackground(new java.awt.Color(0, 102, 204));
        withdrawButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        withdrawButton1.setForeground(new java.awt.Color(51, 51, 51));
        withdrawButton1.setText("Reset");
        withdrawButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(withdrawButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 650, 220, 50));

        withdrawButton.setBackground(new java.awt.Color(102, 204, 0));
        withdrawButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        withdrawButton.setForeground(new java.awt.Color(51, 51, 51));
        withdrawButton.setText("Filter");
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });
        getContentPane().add(withdrawButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 650, 220, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setAutoCreateRowSorter(true);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 580, 240));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Your total Balance = ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 190, 30));

        balanceTextbox.setBackground(new java.awt.Color(102, 102, 102));
        balanceTextbox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        balanceTextbox.setForeground(new java.awt.Color(0, 204, 0));
        balanceTextbox.setFocusable(false);
        balanceTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceTextboxActionPerformed(evt);
            }
        });
        getContentPane().add(balanceTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 110, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("EGP");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("ICONS/ATM.JPG"));
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new Main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        jTable1.setModel(cashTrackerFun.transcationsModel(jDateChooser2, jDateChooser1));
        cashTrackerFun.centerTableCells(jTable1);
    }//GEN-LAST:event_withdrawButtonActionPerformed

    private void withdrawButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButton1ActionPerformed
        cashTrackerFun.currentDateSetter(jDateChooser1);
        cashTrackerFun.dateSetter(jDateChooser2, "1950-01-01");
        jTable1.setModel(cashTrackerFun.transcationsModel(jDateChooser2, jDateChooser1));
        cashTrackerFun.centerTableCells(jTable1);
    }//GEN-LAST:event_withdrawButton1ActionPerformed

    private void balanceTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceTextboxActionPerformed
        
    }//GEN-LAST:event_balanceTextboxActionPerformed

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
            java.util.logging.Logger.getLogger(CashTrackerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashTrackerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashTrackerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashTrackerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashTrackerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField balanceTextbox;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton withdrawButton;
    private javax.swing.JButton withdrawButton1;
    // End of variables declaration//GEN-END:variables
}
