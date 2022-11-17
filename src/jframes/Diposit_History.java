/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframes;

import codes.DB_Connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author asel
 */
public class Diposit_History extends javax.swing.JFrame {

        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        
        
    public Diposit_History() {
        initComponents();
        conn = DB_Connect.connect();
        tableload();
    }

    public void tableload(){        // to see deposit history
           try {
            
            String sql = "select *from Deposit ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel dtm = new DefaultTableModel();
            dtm = (DefaultTableModel) DepositView.getModel();
            
            if(rs.isBeforeFirst()){
                while (rs.next()){
                    dtm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
                        rs.getString(5),rs.getString(7),rs.getString(8)});
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
     }
    
    public void search(){           // to search secifc holders deposit history
        String srch = SearchBox.getText();
        
        try {
            
             String sql = "select Bank_No as AccountNo ,A_Hnumber as HolderNo, A_Name as Name, "
                    + "A_Deposit_Aamount as Deposit, A_Balance as Balance, A_date as Date, A_time as Time from deposit  where Bank_No like '%"+srch+"%' " ;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            DepositView.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
     }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CloseBtn1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        a = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DepositView = new javax.swing.JTable();
        SearchBox = new javax.swing.JTextField();
        searcgBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(234, 240, 251));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64)));

        CloseBtn1.setBackground(new java.awt.Color(234, 240, 251));
        CloseBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseBtn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseBtn1cls_mnmze_RstDwn_Entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseBtn1cls_mnmze_RstDwn_Exit(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_multiply_20px.png"))); // NOI18N

        javax.swing.GroupLayout CloseBtn1Layout = new javax.swing.GroupLayout(CloseBtn1);
        CloseBtn1.setLayout(CloseBtn1Layout);
        CloseBtn1Layout.setHorizontalGroup(
            CloseBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CloseBtn1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
        );
        CloseBtn1Layout.setVerticalGroup(
            CloseBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        a.setBackground(new java.awt.Color(234, 240, 251));
        a.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64), 2));

        DepositView.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        DepositView.setForeground(new java.awt.Color(1, 23, 64));
        DepositView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AccountNo", "HolderNo", "Name", "Deposit", "Balance", "Date", "Time"
            }
        ));
        DepositView.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DepositView.setGridColor(new java.awt.Color(234, 240, 251));
        jScrollPane1.setViewportView(DepositView);

        SearchBox.setBackground(new java.awt.Color(234, 240, 251));
        SearchBox.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        SearchBox.setForeground(new java.awt.Color(1, 23, 64));
        SearchBox.setToolTipText("Enter account number");
        SearchBox.setBorder(null);
        SearchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchBoxKeyReleased(evt);
            }
        });

        searcgBtn.setBackground(new java.awt.Color(234, 240, 251));
        searcgBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searcgBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searcgBtnMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_25px_1.png"))); // NOI18N

        javax.swing.GroupLayout searcgBtnLayout = new javax.swing.GroupLayout(searcgBtn);
        searcgBtn.setLayout(searcgBtnLayout);
        searcgBtnLayout.setHorizontalGroup(
            searcgBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searcgBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searcgBtnLayout.setVerticalGroup(
            searcgBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searcgBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jSeparator1.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator1.setForeground(new java.awt.Color(1, 23, 64));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_museum_35px.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(165, 165, 165));
        jLabel5.setText("City Bank.");

        jSeparator2.setBackground(new java.awt.Color(165, 165, 165));
        jSeparator2.setForeground(new java.awt.Color(165, 165, 165));

        javax.swing.GroupLayout aLayout = new javax.swing.GroupLayout(a);
        a.setLayout(aLayout);
        aLayout.setHorizontalGroup(
            aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aLayout.createSequentialGroup()
                        .addGroup(aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(aLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1)
                            .addComponent(SearchBox, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searcgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        aLayout.setVerticalGroup(
            aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aLayout.createSequentialGroup()
                .addGroup(aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searcgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(aLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 748, Short.MAX_VALUE)
                .addComponent(CloseBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(CloseBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtn1MouseClicked
        dispose();            //close the application
    }//GEN-LAST:event_CloseBtn1MouseClicked

    private void CloseBtn1cls_mnmze_RstDwn_Entered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtn1cls_mnmze_RstDwn_Entered
        if(evt.getSource()==CloseBtn1){                                     //colour changes for close, minimize and restore down btns when mouse entered
            CloseBtn1.setBackground(new java.awt.Color(156, 190, 254));
        }

    }//GEN-LAST:event_CloseBtn1cls_mnmze_RstDwn_Entered

    private void CloseBtn1cls_mnmze_RstDwn_Exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtn1cls_mnmze_RstDwn_Exit
        if(evt.getSource()==CloseBtn1){                                     //colour changes for close, minimize and restore down btns when mouse exit
            CloseBtn1.setBackground(new java.awt.Color(234, 240, 251));
        }

    }//GEN-LAST:event_CloseBtn1cls_mnmze_RstDwn_Exit

    private void searcgBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searcgBtnMouseEntered
        if(evt.getSource()==searcgBtn){                                     //colour changes for close, minimize and restore down btns when mouse entered
            searcgBtn.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_searcgBtnMouseEntered

    private void searcgBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searcgBtnMouseExited
        if(evt.getSource()==searcgBtn){                                     //colour changes for close, minimize and restore down btns when mouse entered
            searcgBtn.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_searcgBtnMouseExited

    private void SearchBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchBoxKeyReleased
        search();
    }//GEN-LAST:event_SearchBoxKeyReleased

     
     
     
    
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
            java.util.logging.Logger.getLogger(Diposit_History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diposit_History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diposit_History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diposit_History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diposit_History().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CloseBtn1;
    private javax.swing.JTable DepositView;
    private javax.swing.JTextField SearchBox;
    private javax.swing.JPanel a;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel searcgBtn;
    // End of variables declaration//GEN-END:variables
}
