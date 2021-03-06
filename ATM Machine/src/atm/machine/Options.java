/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.machine;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author mattbecute
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import atm.machine.ATM;
import javax.swing.ImageIcon;

public class Options extends javax.swing.JFrame {
    int mouseX, mouseY, DMx, DMy, MTotx, MToty;
    /**
     * Creates new form Options
     */
    public Options() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBcheckBalance = new javax.swing.JButton();
        jBwithdraw = new javax.swing.JButton();
        jBdeposit = new javax.swing.JButton();
        jBexit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBwithSav = new javax.swing.JButton();
        jBdepSav = new javax.swing.JButton();
        jBcheckSav = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 66, 61));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 102, 102)));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choose Transaction");

        jBcheckBalance.setBackground(new java.awt.Color(34, 167, 240));
        jBcheckBalance.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBcheckBalance.setForeground(new java.awt.Color(255, 255, 255));
        jBcheckBalance.setText("Check Balance");
        jBcheckBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcheckBalanceActionPerformed(evt);
            }
        });

        jBwithdraw.setBackground(new java.awt.Color(34, 167, 240));
        jBwithdraw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBwithdraw.setForeground(new java.awt.Color(255, 255, 255));
        jBwithdraw.setText("Withdraw Funds");
        jBwithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBwithdrawActionPerformed(evt);
            }
        });

        jBdeposit.setBackground(new java.awt.Color(34, 167, 240));
        jBdeposit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBdeposit.setForeground(new java.awt.Color(255, 255, 255));
        jBdeposit.setText("Deposit Funds");
        jBdeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdepositActionPerformed(evt);
            }
        });

        jBexit.setBackground(new java.awt.Color(242, 38, 19));
        jBexit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBexit.setForeground(new java.awt.Color(255, 255, 255));
        jBexit.setText("Exit Account");
        jBexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jBwithSav.setBackground(new java.awt.Color(34, 167, 240));
        jBwithSav.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBwithSav.setForeground(new java.awt.Color(255, 255, 255));
        jBwithSav.setText("Withdraw Savings");
        jBwithSav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBwithSavActionPerformed(evt);
            }
        });

        jBdepSav.setBackground(new java.awt.Color(34, 167, 240));
        jBdepSav.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBdepSav.setForeground(new java.awt.Color(255, 255, 255));
        jBdepSav.setText("Deposit Savings");
        jBdepSav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdepSavActionPerformed(evt);
            }
        });

        jBcheckSav.setBackground(new java.awt.Color(34, 167, 240));
        jBcheckSav.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBcheckSav.setForeground(new java.awt.Color(255, 255, 255));
        jBcheckSav.setText("Check Savings");
        jBcheckSav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcheckSavActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 76, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBdeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBcheckBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBdepSav, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBwithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBwithSav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBcheckSav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBexit, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcheckBalance)
                    .addComponent(jBwithdraw))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBdeposit)
                    .addComponent(jBwithSav))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBdepSav)
                    .addComponent(jBcheckSav))
                .addGap(41, 41, 41)
                .addComponent(jBexit)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        DMx = evt.getXOnScreen();
        DMy = evt.getYOnScreen();
        MTotx = DMx - mouseX;
        MToty = DMy - mouseY;
        this.setLocation(MTotx, MToty);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jBexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexitActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to leave?", "Alert!", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
            ATM atm = new ATM();
            atm.setVisible(true);
            atm.pack();
            this.dispose();
        }
    }//GEN-LAST:event_jBexitActionPerformed

    private void jBcheckBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcheckBalanceActionPerformed
        ImageIcon mon = new ImageIcon("/Users/mattbecute/Downloads/money.png");
        PreparedStatement ps;
        ResultSet rs;
        String accNum = ATM.jtFcustoID.getText();
        String Query = "SELECT * FROM `accounts` WHERE `CardNumber` =?";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(Query);
            
            ps.setString(1, accNum);
            rs = ps.executeQuery();
            
            if(rs.next()) {
                //String table1 = rs.getString(1);
                //String table2 = rs.getString(2);
                //String table3 = rs.getString(3);
                  String table4 = rs.getString(4);
                //String table5 = rs.getString(5);
                //String table6 = rs.getString(6);
                //String table7 = rs.getString(7);
                //String table8 = rs.getString(8);
                  String table9 = rs.getString(9);
                
                JOptionPane.showMessageDialog(null, "Name: " + table4 + "\n" + "Balance: " + table9 + "\n", "Information", JOptionPane.INFORMATION_MESSAGE, mon);
                
            } else {
                JOptionPane.showMessageDialog(null, "An Error has occured", "Error!",JOptionPane.ERROR_MESSAGE);
            }
            
        } catch(SQLException e) {
            Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jBcheckBalanceActionPerformed

    private void jBwithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBwithdrawActionPerformed
        String amountWithdrawed = JOptionPane.showInputDialog(null, "Input desired amount to Withdraw");
        PreparedStatement ps;
        String accNum = ATM.jtFcustoID.getText();
        String Query = "UPDATE `accounts` SET `Balance` = `Balance` - ? WHERE `CardNumber` =?";
        
        /*if(checkBalanceAgain(accNum)) {
            JOptionPane.showMessageDialog(null, "Insufficient Balance", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {*/
            try {
            ps = MyConnection.getConnection().prepareStatement(Query);
            
            ps.setString(1, amountWithdrawed);
            ps.setString(2, accNum);
            if(ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Amount successfully Withdrawed!", "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "An Error Occured", "Error!", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch(SQLException e) {
            Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, e);
        }
        //}
        
    }//GEN-LAST:event_jBwithdrawActionPerformed

    private void jBdepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdepositActionPerformed
        String amountDeposited = JOptionPane.showInputDialog(null, "Input desired amount to Deposit");
        PreparedStatement ps;
        String accNum = ATM.jtFcustoID.getText();
        String Query = "UPDATE `accounts` SET `Balance` = `Balance` + ? WHERE `CardNumber` =?";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(Query);
            
            ps.setString(1, amountDeposited);
            ps.setString(2, accNum);
            if(ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Amount successfully Deposited!", "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "An Error Occured", "Error!", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch(SQLException e) {
            Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, e);
        }
        
       
    }//GEN-LAST:event_jBdepositActionPerformed

    private void jBwithSavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBwithSavActionPerformed
        String amountWithdrawed = JOptionPane.showInputDialog(null, "Input desired amount to Withdraw");
        PreparedStatement ps;
        String accNum = ATM.jtFcustoID.getText();
        String Query = "UPDATE `accounts` SET `Savings` = `Savings` - ? WHERE `CardNumber` =?";
        
        /*if(checkBalanceAgain(accNum)) {
            JOptionPane.showMessageDialog(null, "Insufficient Balance", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {*/
            try {
            ps = MyConnection.getConnection().prepareStatement(Query);
            
            ps.setString(1, amountWithdrawed);
            ps.setString(2, accNum);
            if(ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Amount successfully Withdrawed!", "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "An Error Occured", "Error!", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch(SQLException e) {
            Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jBwithSavActionPerformed

    private void jBdepSavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdepSavActionPerformed
        /*if(JOptionPane.showConfirmDialog(null, "Deposit from Balance?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION)==JOptionPane.YES_NO_CANCEL_OPTION) {
            
            // From Balance to Savings
            String amountDeposited = JOptionPane.showInputDialog(null, "Input desired amount to Deposit");
            PreparedStatement ps;
            String accNum = ATM.jtFcustoID.getText();
            String Query = "UPDATE `accounts` SET `Balance` = `Balance` + ? WHERE `CardNumber` =?";
        
            try {
                ps = MyConnection.getConnection().prepareStatement(Query);
            
                ps.setString(1, amountDeposited);
                ps.setString(2, accNum);
                if(ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Amount successfully Deposited!", "Information", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "An Error Occured", "Error!", JOptionPane.ERROR_MESSAGE);
                }
            
            } catch(SQLException e) {
                Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, e);
            }
        } */
        
        // From cash to Savings
        String amountDeposited = JOptionPane.showInputDialog(null, "Input desired amount to Deposit");
        PreparedStatement ps;
        String accNum = ATM.jtFcustoID.getText();
        String Query = "UPDATE `accounts` SET `Savings` = `Savings` + ? WHERE `CardNumber` =?";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(Query);
            
            ps.setString(1, amountDeposited);
            ps.setString(2, accNum);
            if(ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Amount successfully Deposited!", "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "An Error Occured", "Error!", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch(SQLException e) {
            Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jBdepSavActionPerformed

    private void jBcheckSavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcheckSavActionPerformed
        PreparedStatement ps;
        ResultSet rs;
        String accNum = ATM.jtFcustoID.getText();
        String Query = "SELECT * FROM `accounts` WHERE `CardNumber` =?";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(Query);
            
            ps.setString(1, accNum);
            rs = ps.executeQuery();
            
            if(rs.next()) {
                //String table1 = rs.getString(1);
                //String table2 = rs.getString(2);
                //String table3 = rs.getString(3);
                  String table4 = rs.getString(4);
                //String table5 = rs.getString(5);
                //String table6 = rs.getString(6);
                //String table7 = rs.getString(7);
                //String table8 = rs.getString(8);
                //String table9 = rs.getString(9);
                  String table10 = rs.getString(10);
                
                JOptionPane.showMessageDialog(null, "Name: " + table4 + "\n" + "Balance: " + table10 + "\n", "Information", JOptionPane.INFORMATION_MESSAGE);
                
            } else {
                JOptionPane.showMessageDialog(null, "An Error has occured", "Error!",JOptionPane.ERROR_MESSAGE);
            }
            
        } catch(SQLException e) {
            Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jBcheckSavActionPerformed

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
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Options().setVisible(true);
            }
        });
    }
    
    public boolean checkBalance(String cardNum) {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkAmount = false;
        String Query = "SELECT * FROM `accounts` WHERE `CardNumber` =?";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(Query);
            ps.setString(1, cardNum);
            
            rs = ps.executeQuery();
            if(rs.next()) {
                String getBalance = rs.getString(9);
                int finBal = Integer.parseInt(getBalance);
                    if(finBal < 0) {
                        checkAmount = true;
                    }
            }
        } catch(SQLException e) {
            Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, e);
        }
        return checkAmount;
    }
    public boolean checkBalanceAgain(String cardNum) {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkAmount = false;
        String Query = "SELECT IF(`Balance` < 0, 'YES', 'NO') FROM `accounts` WHERE `CardNumber` =?";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(Query);
            ps.setString(1, cardNum);
            
            rs = ps.executeQuery();
            if(rs.next()) {
                checkAmount = true;
            }
        } catch(SQLException e) {
            Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, e);
        }
        return checkAmount;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcheckBalance;
    private javax.swing.JButton jBcheckSav;
    private javax.swing.JButton jBdepSav;
    private javax.swing.JButton jBdeposit;
    private javax.swing.JButton jBexit;
    private javax.swing.JButton jBwithSav;
    private javax.swing.JButton jBwithdraw;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
