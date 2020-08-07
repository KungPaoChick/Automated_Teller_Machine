/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.machine;

/**
 *
 * @author mattbecute
 */
import java.sql.*;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.logging.*;
import atm.machine.Options;


public class ATM extends javax.swing.JFrame {
    int mouseX, mouseY, DMx, DMy, MTotx, MToty;
    /**
     * Creates new form ATM
     */
    public ATM() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtFcustoID = new javax.swing.JTextField();
        jBenter = new javax.swing.JButton();
        jBexit = new javax.swing.JButton();
        jtFpin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

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
        jLabel1.setText("Brusco Capital");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Card Number:");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PIN:");

        jtFcustoID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jBenter.setBackground(new java.awt.Color(34, 167, 240));
        jBenter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBenter.setForeground(new java.awt.Color(255, 255, 255));
        jBenter.setText("Enter");
        jBenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBenterActionPerformed(evt);
            }
        });

        jBexit.setBackground(new java.awt.Color(242, 38, 19));
        jBexit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBexit.setForeground(new java.awt.Color(255, 255, 255));
        jBexit.setText("Exit");
        jBexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexitActionPerformed(evt);
            }
        });

        jtFpin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jBenter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBexit)
                .addGap(88, 88, 88))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtFcustoID, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtFpin, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtFcustoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtFpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBenter)
                    .addComponent(jBexit))
                .addContainerGap(47, Short.MAX_VALUE))
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
        JOptionPane.showMessageDialog(null, "Thank you for using Brusco Capital!", "Information", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_jBexitActionPerformed

    private void jBenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBenterActionPerformed
        PreparedStatement ps;
        ResultSet rs;
        String customerId = jtFcustoID.getText();
        String pin = String.valueOf(jtFpin.getPassword());
        
        String query = "SELECT * FROM `accounts` WHERE `CardNumber` =? AND `PIN` =?";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, customerId);
            ps.setString(2, pin);
            
            rs = ps.executeQuery();
            
            if(rs.next()) {
                try {
                    FileWriter myWriter = new FileWriter("/Users/mattbecute/Desktop/Bank Account/log.txt", true);
                    BufferedWriter out = new BufferedWriter(myWriter);
                    out.write("Card Number: " + jtFcustoID.getText() + " PIN: " + jtFpin.getText() + "\n\n");
                    out.close();
                } catch(IOException e) {
                    System.err.println("Error has occured writing log file\n" + e);
                }
                String Query = "SELECT * FROM `accounts` WHERE `CardNumber` =?";
                ps = MyConnection.getConnection().prepareStatement(Query);
                ps.setString(1, jtFcustoID.getText());
                rs = ps.executeQuery();
                    if(rs.next()) {
                        String table1 = rs.getString(4);
                        
                        Options ops = new Options();
                        ops.setVisible(true);
                        Options.jLabel2.setText("Welcome " + table1);
                        ops.pack();
                                
                        this.dispose();
                        
                        /*String getCVV = JOptionPane.showInputDialog(null, "Enter CVV Number:");
                        try {
                            String QueryCVV = "SELECT * FROM `accounts` WHERE `CVV` =?";
                            ps = MyConnection.getConnection().prepareStatement(QueryCVV);
                            ps.setString(1, getCVV);
                            
                            rs = ps.executeQuery();
                            if(rs.next()) {
                                Options ops = new Options();
                                ops.setVisible(true);
                                Options.jLabel2.setText("Welcome " + table1);
                                ops.pack();
                                
                                this.dispose();
                            } else {
                                jtFcustoID.setText(null);
                                jtFpin.setText(null);
                                JOptionPane.showMessageDialog(null, "Incorrect CVV Number", "Alert!", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch(SQLException e) {
                            Logger.getLogger(ATM.class.getName()).log(Level.SEVERE, null, e);
                        } */
                    }
                    
            } else {
                jtFcustoID.setText(null);
                jtFpin.setText(null);
                JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN Number", "Alert!", JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException e) {
            Logger.getLogger(ATM.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jBenterActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATM().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBenter;
    private javax.swing.JButton jBexit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jtFcustoID;
    private javax.swing.JPasswordField jtFpin;
    // End of variables declaration//GEN-END:variables
}