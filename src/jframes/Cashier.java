/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframes;

import codes.DB_Connect;
import com.mysql.cj.xdevapi.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;

public class Cashier extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Cashier() {
        initComponents();
        setVisible(true);   //for the menu buttons
        setLocationRelativeTo(null);
        
        conn = DB_Connect.connect();   //connect from DB_Connect 
        tableload();
        BalanceCheck_tableload2();
        transactionsTableLoad();
    }

    
    public void tableload(){ // to load the holder details table
         try {
            
            String sql = "select *from account_holders ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel dtm = new DefaultTableModel();
            dtm = (DefaultTableModel) viewTable.getModel();
            
            if(rs.isBeforeFirst()){
                while (rs.next()){
                    dtm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
                        rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),
                        rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(14),rs.getString(15)});
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
     }
    
    public void BalanceCheck_tableload2(){ // to load the check balance table
         try {
            
            String sql = "select Bank_No as AccountNo, A_Hnumber as HolderNo, A_Name as Name,"
                    + " A_AccountType as AccountType, A_amount as Balance from account_holders ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            viewTabl3.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
     }
    
    public void transactionsTableLoad(){        // load the transaction table to view 
        try {
            
            String sql = "select Bank_No as AccountNo, A_Hnumber as HolderNo, A_Name as Name, "
                    + "A_Withdraw_Aamount as Withdraw, A_Diposit_Amount as Deposit,A_Balance as Balance,A_User as User,"
                    + " A_date as Date, A_time as Time from transactions ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            transactionsTable.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void search(){       //view holder details when insert account no. or name 
         String srch = searchBox.getText();
        
        try {
            String sql = "select Bank_No as Account_No , A_Hnumber as Holder_No, A_Name as Name, A_Address as Address,"
                    + " A_NIC as NIC, A_DOB as BirthDay, A_Email as Email, A_Age as Age, A_Gender as Gender, "
                    + "A_Nationality as Nationality, A_PhoneNumber as PhoneNumber, A_AccountType as AccountType,"
                    + " A_date as Date, A_time as Time from account_holders where Bank_No like '%"+srch+"%' or A_Hnumber like '%"+srch+"%' or A_Name like '%"+srch+"%'" ;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            viewTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        moveArea = new javax.swing.JPanel();
        minimizeBtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        restoreDownBtn = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        CloseBtn1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        AccountHolders_Btn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CheckBalance_Btn = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Deposit_Btn = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Withdraw_Btn = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Transfer_Btn = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        TransactionsHistory_Btn = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        logoutBtn1 = new javax.swing.JPanel();
        Logout1 = new javax.swing.JLabel();
        lnfoBtn1 = new javax.swing.JPanel();
        Logout3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Account_Holders = new javax.swing.JPanel();
        searchBar = new javax.swing.JSeparator();
        searchBox = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        formBtn = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        check_Balance = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        srch12 = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewTabl3 = new javax.swing.JTable();
        Deposit = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        Ano = new javax.swing.JTextField();
        Hno = new javax.swing.JTextField();
        Hname = new javax.swing.JTextField();
        Abalance = new javax.swing.JTextField();
        Damount = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        search2 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        calculate = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        deposit = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        DepositHstry = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        withdraw = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        user22 = new javax.swing.JTextField();
        Ttime = new javax.swing.JTextField();
        Ddate = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        accNo = new javax.swing.JTextField();
        holderNo = new javax.swing.JTextField();
        HolderName = new javax.swing.JTextField();
        ABalance = new javax.swing.JTextField();
        wtdrwAmount = new javax.swing.JTextField();
        WTotal = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        calculate2 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        srch2 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        withdraw2 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        DepositHstry1 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        transfer = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        jSeparator35 = new javax.swing.JSeparator();
        jLabel121 = new javax.swing.JLabel();
        jSeparator36 = new javax.swing.JSeparator();
        jLabel122 = new javax.swing.JLabel();
        accNo1 = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        save = new javax.swing.JPanel();
        jLabel124 = new javax.swing.JLabel();
        jSeparator37 = new javax.swing.JSeparator();
        jLabel125 = new javax.swing.JLabel();
        hName1 = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        hNo1 = new javax.swing.JTextField();
        srch1 = new javax.swing.JPanel();
        jLabel129 = new javax.swing.JLabel();
        balance1 = new javax.swing.JTextField();
        jSeparator38 = new javax.swing.JSeparator();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        tAmount1 = new javax.swing.JTextField();
        Attl1 = new javax.swing.JTextField();
        jSeparator39 = new javax.swing.JSeparator();
        jSeparator40 = new javax.swing.JSeparator();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        user11 = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        date3 = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        time3 = new javax.swing.JTextField();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        calculate1 = new javax.swing.JPanel();
        jLabel140 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        cAccount = new javax.swing.JTextField();
        jLabel141 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        cBalance = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        cTotoal = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        search22 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        clcult = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        transferHistory = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        transactions = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        srch13 = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        jPanel13 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        transactionsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        moveArea.setBackground(new java.awt.Color(234, 240, 251));
        moveArea.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moveAreaMouseDragged(evt);
            }
        });
        moveArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moveAreaMousePressed(evt);
            }
        });

        minimizeBtn.setBackground(new java.awt.Color(234, 240, 251));
        minimizeBtn.setToolTipText("Minimize");
        minimizeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeBtncls_mnmze_RstDwn_Entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeBtncls_mnmze_RstDwn_Exit(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_minimize_window_20px.png"))); // NOI18N

        javax.swing.GroupLayout minimizeBtnLayout = new javax.swing.GroupLayout(minimizeBtn);
        minimizeBtn.setLayout(minimizeBtnLayout);
        minimizeBtnLayout.setHorizontalGroup(
            minimizeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minimizeBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        minimizeBtnLayout.setVerticalGroup(
            minimizeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        restoreDownBtn.setBackground(new java.awt.Color(234, 240, 251));
        restoreDownBtn.setToolTipText("Restore Down");
        restoreDownBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restoreDownBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                restoreDownBtncls_mnmze_RstDwn_Entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                restoreDownBtncls_mnmze_RstDwn_Exit(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_restore_window_20px.png"))); // NOI18N

        javax.swing.GroupLayout restoreDownBtnLayout = new javax.swing.GroupLayout(restoreDownBtn);
        restoreDownBtn.setLayout(restoreDownBtnLayout);
        restoreDownBtnLayout.setHorizontalGroup(
            restoreDownBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, restoreDownBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        restoreDownBtnLayout.setVerticalGroup(
            restoreDownBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        CloseBtn1.setBackground(new java.awt.Color(234, 240, 251));
        CloseBtn1.setToolTipText("Close");
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

        jPanel10.setBackground(new java.awt.Color(1, 23, 64));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout moveAreaLayout = new javax.swing.GroupLayout(moveArea);
        moveArea.setLayout(moveAreaLayout);
        moveAreaLayout.setHorizontalGroup(
            moveAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moveAreaLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 702, Short.MAX_VALUE)
                .addComponent(minimizeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restoreDownBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CloseBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        moveAreaLayout.setVerticalGroup(
            moveAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(restoreDownBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(minimizeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(CloseBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(moveArea, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(1, 23, 64));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_museum_35px.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(165, 165, 165));
        jLabel5.setText("City Bank.");

        jSeparator1.setBackground(new java.awt.Color(165, 165, 165));
        jSeparator1.setForeground(new java.awt.Color(165, 165, 165));

        AccountHolders_Btn.setBackground(new java.awt.Color(1, 13, 54));
        AccountHolders_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Cashier.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_customer_25px.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(165, 165, 165));
        jLabel7.setText("Account Holders");

        javax.swing.GroupLayout AccountHolders_BtnLayout = new javax.swing.GroupLayout(AccountHolders_Btn);
        AccountHolders_Btn.setLayout(AccountHolders_BtnLayout);
        AccountHolders_BtnLayout.setHorizontalGroup(
            AccountHolders_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountHolders_BtnLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AccountHolders_BtnLayout.setVerticalGroup(
            AccountHolders_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountHolders_BtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AccountHolders_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CheckBalance_Btn.setBackground(new java.awt.Color(1, 13, 54));
        CheckBalance_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Cashier.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(165, 165, 165));
        jLabel9.setText("Check Balance");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_paper_money_25px_1.png"))); // NOI18N

        javax.swing.GroupLayout CheckBalance_BtnLayout = new javax.swing.GroupLayout(CheckBalance_Btn);
        CheckBalance_Btn.setLayout(CheckBalance_BtnLayout);
        CheckBalance_BtnLayout.setHorizontalGroup(
            CheckBalance_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckBalance_BtnLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CheckBalance_BtnLayout.setVerticalGroup(
            CheckBalance_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckBalance_BtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CheckBalance_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Deposit_Btn.setBackground(new java.awt.Color(1, 13, 54));
        Deposit_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Cashier.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(165, 165, 165));
        jLabel11.setText("Deposit");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_donation_25px_2.png"))); // NOI18N

        javax.swing.GroupLayout Deposit_BtnLayout = new javax.swing.GroupLayout(Deposit_Btn);
        Deposit_Btn.setLayout(Deposit_BtnLayout);
        Deposit_BtnLayout.setHorizontalGroup(
            Deposit_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Deposit_BtnLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Deposit_BtnLayout.setVerticalGroup(
            Deposit_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Deposit_BtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Deposit_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Withdraw_Btn.setBackground(new java.awt.Color(1, 13, 54));
        Withdraw_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Cashier.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(165, 165, 165));
        jLabel13.setText("Withdraw");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_cash_withdrawal_25px_1.png"))); // NOI18N

        javax.swing.GroupLayout Withdraw_BtnLayout = new javax.swing.GroupLayout(Withdraw_Btn);
        Withdraw_Btn.setLayout(Withdraw_BtnLayout);
        Withdraw_BtnLayout.setHorizontalGroup(
            Withdraw_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Withdraw_BtnLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Withdraw_BtnLayout.setVerticalGroup(
            Withdraw_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Withdraw_BtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Withdraw_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Transfer_Btn.setBackground(new java.awt.Color(1, 13, 54));
        Transfer_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Cashier.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
        });

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(165, 165, 165));
        jLabel68.setText("Transfer");

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_data_transfer_25px.png"))); // NOI18N

        javax.swing.GroupLayout Transfer_BtnLayout = new javax.swing.GroupLayout(Transfer_Btn);
        Transfer_Btn.setLayout(Transfer_BtnLayout);
        Transfer_BtnLayout.setHorizontalGroup(
            Transfer_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Transfer_BtnLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel69)
                .addGap(18, 18, 18)
                .addComponent(jLabel68)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Transfer_BtnLayout.setVerticalGroup(
            Transfer_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Transfer_BtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Transfer_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TransactionsHistory_Btn.setBackground(new java.awt.Color(1, 13, 54));
        TransactionsHistory_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Cashier.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(165, 165, 165));
        jLabel77.setText("Transactions History");

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_transaction_list_25px.png"))); // NOI18N

        javax.swing.GroupLayout TransactionsHistory_BtnLayout = new javax.swing.GroupLayout(TransactionsHistory_Btn);
        TransactionsHistory_Btn.setLayout(TransactionsHistory_BtnLayout);
        TransactionsHistory_BtnLayout.setHorizontalGroup(
            TransactionsHistory_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransactionsHistory_BtnLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel78)
                .addGap(18, 18, 18)
                .addComponent(jLabel77)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        TransactionsHistory_BtnLayout.setVerticalGroup(
            TransactionsHistory_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransactionsHistory_BtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TransactionsHistory_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logoutBtn1.setBackground(new java.awt.Color(1, 23, 64));
        logoutBtn1.setToolTipText("Logout");
        logoutBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutBtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutBtn1MouseExited(evt);
            }
        });

        Logout1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_exit_25px.png"))); // NOI18N

        javax.swing.GroupLayout logoutBtn1Layout = new javax.swing.GroupLayout(logoutBtn1);
        logoutBtn1.setLayout(logoutBtn1Layout);
        logoutBtn1Layout.setHorizontalGroup(
            logoutBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutBtn1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logout1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoutBtn1Layout.setVerticalGroup(
            logoutBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutBtn1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Logout1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lnfoBtn1.setBackground(new java.awt.Color(1, 23, 64));
        lnfoBtn1.setToolTipText("Help");
        lnfoBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lnfoBtn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lnfoBtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lnfoBtn1MouseExited(evt);
            }
        });

        Logout3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logout3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_info_25px.png"))); // NOI18N

        javax.swing.GroupLayout lnfoBtn1Layout = new javax.swing.GroupLayout(lnfoBtn1);
        lnfoBtn1.setLayout(lnfoBtn1Layout);
        lnfoBtn1Layout.setHorizontalGroup(
            lnfoBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lnfoBtn1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logout3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lnfoBtn1Layout.setVerticalGroup(
            lnfoBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lnfoBtn1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Logout3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AccountHolders_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CheckBalance_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Deposit_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Withdraw_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Transfer_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TransactionsHistory_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(21, 21, 21))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lnfoBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lnfoBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(AccountHolders_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CheckBalance_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Deposit_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Withdraw_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Transfer_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TransactionsHistory_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                        .addComponent(logoutBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel7.setLayout(new java.awt.CardLayout());

        Account_Holders.setBackground(new java.awt.Color(234, 240, 251));

        searchBar.setBackground(new java.awt.Color(1, 23, 64));
        searchBar.setForeground(new java.awt.Color(1, 23, 64));

        searchBox.setBackground(new java.awt.Color(234, 240, 251));
        searchBox.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        searchBox.setToolTipText("Enter account number or Holder number or name");
        searchBox.setBorder(null);
        searchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBoxKeyReleased(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64), 2));

        viewTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        viewTable.setForeground(new java.awt.Color(1, 23, 64));
        viewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account_No", "Holder_No", "Name", "Address", "NIC", "BirthDay", "Email", "Age", "Gender", "Nationality", "PhoneNumber", "Accounttype", "Date", "Time"
            }
        ));
        jScrollPane1.setViewportView(viewTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_25px_1.png"))); // NOI18N

        formBtn.setBackground(new java.awt.Color(234, 240, 251));
        formBtn.setToolTipText("Look as a Form");
        formBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formBtnMouseExited(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_google_forms_25px.png"))); // NOI18N

        javax.swing.GroupLayout formBtnLayout = new javax.swing.GroupLayout(formBtn);
        formBtn.setLayout(formBtnLayout);
        formBtnLayout.setHorizontalGroup(
            formBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formBtnLayout.setVerticalGroup(
            formBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15))
        );

        javax.swing.GroupLayout Account_HoldersLayout = new javax.swing.GroupLayout(Account_Holders);
        Account_Holders.setLayout(Account_HoldersLayout);
        Account_HoldersLayout.setHorizontalGroup(
            Account_HoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Account_HoldersLayout.createSequentialGroup()
                .addGroup(Account_HoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Account_HoldersLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(Account_HoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Account_HoldersLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Account_HoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Account_HoldersLayout.createSequentialGroup()
                                .addComponent(formBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))))
                    .addGroup(Account_HoldersLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Account_HoldersLayout.setVerticalGroup(
            Account_HoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Account_HoldersLayout.createSequentialGroup()
                .addGroup(Account_HoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Account_HoldersLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel10))
                    .addGroup(Account_HoldersLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(Account_HoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(Account_HoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(formBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.add(Account_Holders, "card2");

        check_Balance.setBackground(new java.awt.Color(234, 240, 251));

        jPanel6.setBackground(new java.awt.Color(234, 240, 251));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64), 2));

        srch12.setBackground(new java.awt.Color(234, 240, 251));
        srch12.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        srch12.setToolTipText("Enter Account number");
        srch12.setBorder(null);
        srch12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                srch12KeyReleased(evt);
            }
        });

        jSeparator14.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator14.setForeground(new java.awt.Color(1, 23, 64));

        jPanel8.setBackground(new java.awt.Color(234, 240, 251));
        jPanel8.setToolTipText("Search Account No.");

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_25px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel65)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel65))
        );

        jPanel9.setBackground(new java.awt.Color(234, 240, 251));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64)));

        viewTabl3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        viewTabl3.setForeground(new java.awt.Color(1, 23, 64));
        viewTabl3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account_No", "HolderNo", "Name", "AccountType", "Balance"
            }
        ));
        jScrollPane2.setViewportView(viewTabl3);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(461, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(srch12, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(jSeparator14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(srch12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout check_BalanceLayout = new javax.swing.GroupLayout(check_Balance);
        check_Balance.setLayout(check_BalanceLayout);
        check_BalanceLayout.setHorizontalGroup(
            check_BalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(check_BalanceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        check_BalanceLayout.setVerticalGroup(
            check_BalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(check_BalanceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.add(check_Balance, "card3");

        Deposit.setBackground(new java.awt.Color(234, 240, 251));

        jPanel4.setBackground(new java.awt.Color(234, 240, 251));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64), 2));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(1, 23, 64));
        jLabel19.setText("Time");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(1, 23, 64));
        jLabel21.setText("-:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(1, 23, 64));
        jLabel16.setText("User");

        date.setBackground(new java.awt.Color(234, 240, 251));
        date.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        date.setForeground(new java.awt.Color(1, 23, 64));
        date.setBorder(null);

        time.setBackground(new java.awt.Color(234, 240, 251));
        time.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        time.setForeground(new java.awt.Color(1, 23, 64));
        time.setBorder(null);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(1, 23, 64));
        jLabel17.setText("Date");

        username.setEditable(false);
        username.setBackground(new java.awt.Color(234, 240, 251));
        username.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        username.setForeground(new java.awt.Color(1, 23, 64));
        username.setBorder(null);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(1, 23, 64));
        jLabel20.setText("-:");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(1, 23, 64));
        jLabel22.setText("-:");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(1, 23, 64));
        jLabel23.setText("1. Account No.");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(1, 23, 64));
        jLabel24.setText("2. Holder No.");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(1, 23, 64));
        jLabel25.setText("3. Name");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(1, 23, 64));
        jLabel26.setText("4. Available Balance");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(1, 23, 64));
        jLabel27.setText("5. Deposit Amount");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(1, 23, 64));
        jLabel28.setText("6. Total");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(1, 23, 64));
        jLabel29.setText("-:");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(1, 23, 64));
        jLabel30.setText("-:");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(1, 23, 64));
        jLabel31.setText("-:");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(1, 23, 64));
        jLabel32.setText("-:");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(1, 23, 64));
        jLabel33.setText("-:");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(1, 23, 64));
        jLabel34.setText("-:");

        Ano.setBackground(new java.awt.Color(234, 240, 251));
        Ano.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Ano.setForeground(new java.awt.Color(1, 23, 64));
        Ano.setToolTipText("Enter account number");
        Ano.setBorder(null);

        Hno.setEditable(false);
        Hno.setBackground(new java.awt.Color(234, 240, 251));
        Hno.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Hno.setForeground(new java.awt.Color(1, 23, 64));
        Hno.setBorder(null);

        Hname.setEditable(false);
        Hname.setBackground(new java.awt.Color(234, 240, 251));
        Hname.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Hname.setForeground(new java.awt.Color(1, 23, 64));
        Hname.setBorder(null);

        Abalance.setEditable(false);
        Abalance.setBackground(new java.awt.Color(234, 240, 251));
        Abalance.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Abalance.setForeground(new java.awt.Color(1, 23, 64));
        Abalance.setBorder(null);

        Damount.setBackground(new java.awt.Color(234, 240, 251));
        Damount.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        Damount.setForeground(new java.awt.Color(1, 23, 64));
        Damount.setBorder(null);

        total.setEditable(false);
        total.setBackground(new java.awt.Color(234, 240, 251));
        total.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        total.setForeground(new java.awt.Color(1, 23, 64));
        total.setBorder(null);

        search2.setBackground(new java.awt.Color(234, 240, 251));
        search2.setToolTipText("");
        search2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                search2MouseExited(evt);
            }
        });

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_25px_1.png"))); // NOI18N

        javax.swing.GroupLayout search2Layout = new javax.swing.GroupLayout(search2);
        search2.setLayout(search2Layout);
        search2Layout.setHorizontalGroup(
            search2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, search2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addContainerGap())
        );
        search2Layout.setVerticalGroup(
            search2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel36)
        );

        calculate.setBackground(new java.awt.Color(234, 240, 251));
        calculate.setToolTipText("Total Calculate");
        calculate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calculateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calculateMouseExited(evt);
            }
        });

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_add_new_25px.png"))); // NOI18N

        javax.swing.GroupLayout calculateLayout = new javax.swing.GroupLayout(calculate);
        calculate.setLayout(calculateLayout);
        calculateLayout.setHorizontalGroup(
            calculateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calculateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addContainerGap())
        );
        calculateLayout.setVerticalGroup(
            calculateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calculateLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel35))
        );

        deposit.setBackground(new java.awt.Color(234, 240, 251));
        deposit.setToolTipText("Deposit");
        deposit.setPreferredSize(new java.awt.Dimension(45, 25));
        deposit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                depositMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                depositMouseExited(evt);
            }
        });

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_paycheque_30px_1.png"))); // NOI18N

        javax.swing.GroupLayout depositLayout = new javax.swing.GroupLayout(deposit);
        deposit.setLayout(depositLayout);
        depositLayout.setHorizontalGroup(
            depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, depositLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addContainerGap())
        );
        depositLayout.setVerticalGroup(
            depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37)
        );

        jSeparator2.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator2.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator3.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator3.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator4.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator4.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator5.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator5.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator6.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator6.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator7.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator7.setForeground(new java.awt.Color(1, 23, 64));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(1, 23, 64));
        jLabel38.setText("Rs.");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(1, 23, 64));
        jLabel39.setText("Rs.");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(1, 23, 64));
        jLabel40.setText("Rs.");

        DepositHstry.setBackground(new java.awt.Color(234, 240, 251));
        DepositHstry.setToolTipText("Depsoit History");
        DepositHstry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositHstryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DepositHstryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DepositHstryMouseExited(evt);
            }
        });

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_payment_history_25px.png"))); // NOI18N

        javax.swing.GroupLayout DepositHstryLayout = new javax.swing.GroupLayout(DepositHstry);
        DepositHstry.setLayout(DepositHstryLayout);
        DepositHstryLayout.setHorizontalGroup(
            DepositHstryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepositHstryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel66)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DepositHstryLayout.setVerticalGroup(
            DepositHstryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel66)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator7)
                        .addComponent(jSeparator6)
                        .addComponent(jSeparator5)
                        .addComponent(jSeparator4)
                        .addComponent(jSeparator3)
                        .addComponent(jSeparator2)
                        .addComponent(Hno)
                        .addComponent(Hname)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel40)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Ano))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Abalance, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Damount, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(235, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DepositHstry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel22)
                            .addGap(18, 18, 18)
                            .addComponent(time))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel21)
                            .addGap(18, 18, 18)
                            .addComponent(date))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel20)
                            .addGap(18, 18, 18)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel20)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel21)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel22)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(search2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23)
                                .addComponent(jLabel29)
                                .addComponent(Ano, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel30)
                            .addComponent(Hno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel31)
                                    .addComponent(Hname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel32)
                                            .addComponent(Abalance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel33)
                                    .addComponent(Damount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39)))
                            .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(jLabel40)))
                    .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(DepositHstry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout DepositLayout = new javax.swing.GroupLayout(Deposit);
        Deposit.setLayout(DepositLayout);
        DepositLayout.setHorizontalGroup(
            DepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepositLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        DepositLayout.setVerticalGroup(
            DepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepositLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.add(Deposit, "card4");

        withdraw.setBackground(new java.awt.Color(234, 240, 251));

        jPanel5.setBackground(new java.awt.Color(234, 240, 251));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64), 2));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(1, 23, 64));
        jLabel41.setText("User");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(1, 23, 64));
        jLabel42.setText("Date");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(1, 23, 64));
        jLabel43.setText("Time");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(1, 23, 64));
        jLabel44.setText("-:");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(1, 23, 64));
        jLabel45.setText("-:");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(1, 23, 64));
        jLabel46.setText("-:");

        user22.setEditable(false);
        user22.setBackground(new java.awt.Color(234, 240, 251));
        user22.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        user22.setForeground(new java.awt.Color(1, 23, 64));
        user22.setBorder(null);

        Ttime.setEditable(false);
        Ttime.setBackground(new java.awt.Color(234, 240, 251));
        Ttime.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Ttime.setForeground(new java.awt.Color(1, 23, 64));
        Ttime.setBorder(null);

        Ddate.setEditable(false);
        Ddate.setBackground(new java.awt.Color(234, 240, 251));
        Ddate.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Ddate.setForeground(new java.awt.Color(1, 23, 64));
        Ddate.setBorder(null);

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(1, 23, 64));
        jLabel47.setText("1. Account No.");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(1, 23, 64));
        jLabel48.setText("2. Holder No.");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(1, 23, 64));
        jLabel49.setText("3. Name");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(1, 23, 64));
        jLabel50.setText("4. Available Balance");

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(1, 23, 64));
        jLabel51.setText("5. Withdraw Amount");

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(1, 23, 64));
        jLabel52.setText("6. Total");

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(1, 23, 64));
        jLabel53.setText("-:");

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(1, 23, 64));
        jLabel54.setText("-:");

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(1, 23, 64));
        jLabel55.setText("-:");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(1, 23, 64));
        jLabel56.setText("-:");

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(1, 23, 64));
        jLabel57.setText("-:");

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(1, 23, 64));
        jLabel58.setText("-:");

        accNo.setBackground(new java.awt.Color(234, 240, 251));
        accNo.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        accNo.setForeground(new java.awt.Color(1, 23, 64));
        accNo.setToolTipText("Enter account number");
        accNo.setBorder(null);

        holderNo.setEditable(false);
        holderNo.setBackground(new java.awt.Color(234, 240, 251));
        holderNo.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        holderNo.setForeground(new java.awt.Color(1, 23, 64));
        holderNo.setBorder(null);

        HolderName.setEditable(false);
        HolderName.setBackground(new java.awt.Color(234, 240, 251));
        HolderName.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        HolderName.setForeground(new java.awt.Color(1, 23, 64));
        HolderName.setBorder(null);

        ABalance.setEditable(false);
        ABalance.setBackground(new java.awt.Color(234, 240, 251));
        ABalance.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        ABalance.setForeground(new java.awt.Color(1, 23, 64));
        ABalance.setBorder(null);

        wtdrwAmount.setBackground(new java.awt.Color(234, 240, 251));
        wtdrwAmount.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        wtdrwAmount.setForeground(new java.awt.Color(1, 23, 64));
        wtdrwAmount.setBorder(null);

        WTotal.setEditable(false);
        WTotal.setBackground(new java.awt.Color(234, 240, 251));
        WTotal.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        WTotal.setForeground(new java.awt.Color(1, 23, 64));
        WTotal.setBorder(null);

        jSeparator8.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator8.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator9.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator9.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator10.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator10.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator11.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator11.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator12.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator12.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator13.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator13.setForeground(new java.awt.Color(1, 23, 64));

        calculate2.setBackground(new java.awt.Color(234, 240, 251));
        calculate2.setToolTipText("Total Calculate");
        calculate2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculate2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calculate2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calculate2MouseExited(evt);
            }
        });

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_reduce_25px.png"))); // NOI18N

        javax.swing.GroupLayout calculate2Layout = new javax.swing.GroupLayout(calculate2);
        calculate2.setLayout(calculate2Layout);
        calculate2Layout.setHorizontalGroup(
            calculate2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculate2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel61)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        calculate2Layout.setVerticalGroup(
            calculate2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculate2Layout.createSequentialGroup()
                .addComponent(jLabel61)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        srch2.setBackground(new java.awt.Color(234, 240, 251));
        srch2.setToolTipText("");
        srch2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                srch2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                srch2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                srch2MouseExited(evt);
            }
        });

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_25px_1.png"))); // NOI18N

        javax.swing.GroupLayout srch2Layout = new javax.swing.GroupLayout(srch2);
        srch2.setLayout(srch2Layout);
        srch2Layout.setHorizontalGroup(
            srch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, srch2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel60)
                .addContainerGap())
        );
        srch2Layout.setVerticalGroup(
            srch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, srch2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel60))
        );

        withdraw2.setBackground(new java.awt.Color(234, 240, 251));
        withdraw2.setToolTipText("Withdraw");
        withdraw2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withdraw2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                withdraw2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                withdraw2MouseExited(evt);
            }
        });

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_paycheque_30px_1.png"))); // NOI18N

        javax.swing.GroupLayout withdraw2Layout = new javax.swing.GroupLayout(withdraw2);
        withdraw2.setLayout(withdraw2Layout);
        withdraw2Layout.setHorizontalGroup(
            withdraw2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, withdraw2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel62)
                .addContainerGap())
        );
        withdraw2Layout.setVerticalGroup(
            withdraw2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, withdraw2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel62))
        );

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(1, 23, 64));
        jLabel59.setText("Rs.");

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(1, 23, 64));
        jLabel63.setText("Rs.");

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(1, 23, 64));
        jLabel64.setText("Rs.");

        DepositHstry1.setBackground(new java.awt.Color(234, 240, 251));
        DepositHstry1.setToolTipText("Withdraw History");
        DepositHstry1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositHstry1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DepositHstry1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DepositHstry1MouseExited(evt);
            }
        });

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_payment_history_25px.png"))); // NOI18N

        javax.swing.GroupLayout DepositHstry1Layout = new javax.swing.GroupLayout(DepositHstry1);
        DepositHstry1.setLayout(DepositHstry1Layout);
        DepositHstry1Layout.setHorizontalGroup(
            DepositHstry1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepositHstry1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel67)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DepositHstry1Layout.setVerticalGroup(
            DepositHstry1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel67)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel53))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel50)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel54)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator10)
                            .addComponent(HolderName, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(jSeparator9)
                            .addComponent(jSeparator8)
                            .addComponent(accNo)
                            .addComponent(holderNo))
                        .addGap(18, 18, 18)
                        .addComponent(srch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(jLabel57))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator12)
                            .addComponent(jSeparator13)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wtdrwAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WTotal))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel59)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ABalance, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(withdraw2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calculate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(239, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DepositHstry1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(621, 621, 621)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel41)
                            .addComponent(jLabel43))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addGap(18, 18, 18)
                                .addComponent(Ttime, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addGap(18, 18, 18)
                                .addComponent(Ddate))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addGap(18, 18, 18)
                                .addComponent(user22)))))
                .addGap(34, 34, 34))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel44)
                    .addComponent(user22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jLabel45)
                    .addComponent(Ddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel46)
                    .addComponent(Ttime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(srch2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel47)
                        .addComponent(jLabel53)
                        .addComponent(accNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(holderNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addGap(0, 0, 0)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel55)
                    .addComponent(HolderName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jLabel56)
                    .addComponent(ABalance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addGap(0, 0, 0)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel51)
                        .addComponent(jLabel57)
                        .addComponent(wtdrwAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel63))
                    .addComponent(calculate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel52)
                        .addComponent(jLabel58)
                        .addComponent(WTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel64))
                    .addComponent(withdraw2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(DepositHstry1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout withdrawLayout = new javax.swing.GroupLayout(withdraw);
        withdraw.setLayout(withdrawLayout);
        withdrawLayout.setHorizontalGroup(
            withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        withdrawLayout.setVerticalGroup(
            withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.add(withdraw, "card5");

        transfer.setBackground(new java.awt.Color(234, 240, 251));

        jPanel11.setBackground(new java.awt.Color(234, 240, 251));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64), 2));

        jLabel120.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(1, 23, 64));
        jLabel120.setText("4. Available Balance");

        jSeparator35.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator35.setForeground(new java.awt.Color(1, 23, 64));

        jLabel121.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(1, 23, 64));
        jLabel121.setText("2. Holder No.");

        jSeparator36.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator36.setForeground(new java.awt.Color(1, 23, 64));

        jLabel122.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(1, 23, 64));
        jLabel122.setText("1. Account No.");

        accNo1.setBackground(new java.awt.Color(234, 240, 251));
        accNo1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        accNo1.setForeground(new java.awt.Color(1, 23, 64));
        accNo1.setToolTipText("Enter account number ");
        accNo1.setBorder(null);

        jLabel123.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(1, 23, 64));
        jLabel123.setText("3. Name");

        save.setBackground(new java.awt.Color(234, 240, 251));
        save.setToolTipText("Transfer");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveMouseExited(evt);
            }
        });

        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_paycheque_30px_1.png"))); // NOI18N

        javax.swing.GroupLayout saveLayout = new javax.swing.GroupLayout(save);
        save.setLayout(saveLayout);
        saveLayout.setHorizontalGroup(
            saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saveLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel124)
                .addContainerGap())
        );
        saveLayout.setVerticalGroup(
            saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel124)
        );

        jSeparator37.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator37.setForeground(new java.awt.Color(1, 23, 64));

        jLabel125.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(1, 23, 64));
        jLabel125.setText("-:");

        hName1.setEditable(false);
        hName1.setBackground(new java.awt.Color(234, 240, 251));
        hName1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        hName1.setForeground(new java.awt.Color(1, 23, 64));
        hName1.setBorder(null);

        jLabel126.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(1, 23, 64));
        jLabel126.setText("-:");

        jLabel127.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(1, 23, 64));
        jLabel127.setText("-:");

        jLabel128.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(1, 23, 64));
        jLabel128.setText("-:");

        hNo1.setEditable(false);
        hNo1.setBackground(new java.awt.Color(234, 240, 251));
        hNo1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        hNo1.setForeground(new java.awt.Color(1, 23, 64));
        hNo1.setBorder(null);

        srch1.setBackground(new java.awt.Color(234, 240, 251));
        srch1.setToolTipText("");
        srch1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                srch1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                srch1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                srch1MouseExited(evt);
            }
        });

        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_25px.png"))); // NOI18N

        javax.swing.GroupLayout srch1Layout = new javax.swing.GroupLayout(srch1);
        srch1.setLayout(srch1Layout);
        srch1Layout.setHorizontalGroup(
            srch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(srch1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel129)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        srch1Layout.setVerticalGroup(
            srch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, srch1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel129))
        );

        balance1.setEditable(false);
        balance1.setBackground(new java.awt.Color(234, 240, 251));
        balance1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        balance1.setForeground(new java.awt.Color(1, 23, 64));
        balance1.setBorder(null);

        jSeparator38.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator38.setForeground(new java.awt.Color(1, 23, 64));

        jLabel130.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(1, 23, 64));
        jLabel130.setText("5.Transfer Amount");

        jLabel131.setText("-:");

        tAmount1.setBackground(new java.awt.Color(234, 240, 251));
        tAmount1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        tAmount1.setForeground(new java.awt.Color(1, 23, 64));
        tAmount1.setBorder(null);

        Attl1.setEditable(false);
        Attl1.setBackground(new java.awt.Color(234, 240, 251));
        Attl1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Attl1.setForeground(new java.awt.Color(1, 23, 64));
        Attl1.setBorder(null);

        jSeparator39.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator39.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator40.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator40.setForeground(new java.awt.Color(1, 23, 64));

        jLabel132.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(1, 23, 64));
        jLabel132.setText("User");

        jLabel133.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(1, 23, 64));
        jLabel133.setText("-:");

        user11.setEditable(false);
        user11.setBackground(new java.awt.Color(234, 240, 251));
        user11.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        user11.setForeground(new java.awt.Color(1, 23, 64));
        user11.setBorder(null);

        jLabel134.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(1, 23, 64));
        jLabel134.setText("Date");

        jLabel135.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(1, 23, 64));
        jLabel135.setText("-:");

        date3.setEditable(false);
        date3.setBackground(new java.awt.Color(234, 240, 251));
        date3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        date3.setForeground(new java.awt.Color(1, 23, 64));
        date3.setBorder(null);

        jLabel136.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(1, 23, 64));
        jLabel136.setText("Time");

        jLabel137.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(1, 23, 64));
        jLabel137.setText("-:");

        time3.setEditable(false);
        time3.setBackground(new java.awt.Color(234, 240, 251));
        time3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        time3.setForeground(new java.awt.Color(1, 23, 64));
        time3.setBorder(null);

        jLabel138.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(1, 23, 64));
        jLabel138.setText("6. Total");

        jLabel139.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(1, 23, 64));
        jLabel139.setText("-:");

        calculate1.setBackground(new java.awt.Color(234, 240, 251));
        calculate1.setToolTipText("Total Calculate");
        calculate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculate1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calculate1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calculate1MouseExited(evt);
            }
        });

        jLabel140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_reduce_25px.png"))); // NOI18N

        javax.swing.GroupLayout calculate1Layout = new javax.swing.GroupLayout(calculate1);
        calculate1.setLayout(calculate1Layout);
        calculate1Layout.setHorizontalGroup(
            calculate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calculate1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel140)
                .addContainerGap())
        );
        calculate1Layout.setVerticalGroup(
            calculate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calculate1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel140))
        );

        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(1, 23, 64));
        jLabel70.setText("7. Credit Account");

        cAccount.setBackground(new java.awt.Color(234, 240, 251));
        cAccount.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cAccount.setForeground(new java.awt.Color(1, 23, 64));
        cAccount.setToolTipText("Enter credit holder's account number");
        cAccount.setBorder(null);

        jLabel141.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(1, 23, 64));
        jLabel141.setText("-:");

        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(1, 23, 64));
        jLabel71.setText("8. Balance");

        jLabel72.setText("-:");

        jSeparator15.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator15.setForeground(new java.awt.Color(1, 23, 64));

        cBalance.setEditable(false);
        cBalance.setBackground(new java.awt.Color(234, 240, 251));
        cBalance.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cBalance.setForeground(new java.awt.Color(1, 23, 64));
        cBalance.setBorder(null);

        jLabel73.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(1, 23, 64));
        jLabel73.setText("9. Total");

        cTotoal.setEditable(false);
        cTotoal.setBackground(new java.awt.Color(234, 240, 251));
        cTotoal.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cTotoal.setForeground(new java.awt.Color(1, 23, 64));
        cTotoal.setBorder(null);

        jLabel74.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(1, 23, 64));
        jLabel74.setText("-:");

        jSeparator16.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator16.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator17.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator17.setForeground(new java.awt.Color(1, 23, 64));

        search22.setBackground(new java.awt.Color(234, 240, 251));
        search22.setToolTipText("");
        search22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                search22MouseExited(evt);
            }
        });

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_25px.png"))); // NOI18N

        javax.swing.GroupLayout search22Layout = new javax.swing.GroupLayout(search22);
        search22.setLayout(search22Layout);
        search22Layout.setHorizontalGroup(
            search22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, search22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel75)
                .addGap(22, 22, 22))
        );
        search22Layout.setVerticalGroup(
            search22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, search22Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel75))
        );

        clcult.setBackground(new java.awt.Color(234, 240, 251));
        clcult.setToolTipText("Total Calculate");
        clcult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clcultMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clcultMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clcultMouseExited(evt);
            }
        });

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_add_new_25px.png"))); // NOI18N

        javax.swing.GroupLayout clcultLayout = new javax.swing.GroupLayout(clcult);
        clcult.setLayout(clcultLayout);
        clcultLayout.setHorizontalGroup(
            clcultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clcultLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel76)
                .addContainerGap())
        );
        clcultLayout.setVerticalGroup(
            clcultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clcultLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel76))
        );

        transferHistory.setBackground(new java.awt.Color(234, 240, 251));
        transferHistory.setToolTipText("Transfer History");
        transferHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferHistoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                transferHistoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                transferHistoryMouseExited(evt);
            }
        });

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_payment_history_25px.png"))); // NOI18N

        javax.swing.GroupLayout transferHistoryLayout = new javax.swing.GroupLayout(transferHistory);
        transferHistory.setLayout(transferHistoryLayout);
        transferHistoryLayout.setHorizontalGroup(
            transferHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel81)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        transferHistoryLayout.setVerticalGroup(
            transferHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferHistoryLayout.createSequentialGroup()
                .addComponent(jLabel81)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jLabel82.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(1, 23, 64));
        jLabel82.setText("Rs.");

        jLabel83.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(1, 23, 64));
        jLabel83.setText("Rs.");

        jLabel84.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(1, 23, 64));
        jLabel84.setText("Rs.");

        jLabel85.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(1, 23, 64));
        jLabel85.setText("Rs.");

        jLabel86.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(1, 23, 64));
        jLabel86.setText("Rs.");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(hName1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(srch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(search22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel122)
                                                .addComponent(jLabel121)
                                                .addComponent(jLabel123))
                                            .addGap(43, 43, 43))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel70)
                                                .addComponent(jLabel138)
                                                .addComponent(jLabel71)
                                                .addComponent(jLabel73))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel126)
                                        .addComponent(jLabel128)
                                        .addComponent(jLabel125)
                                        .addComponent(jLabel141))
                                    .addGap(48, 48, 48))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel131)
                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel120)
                                                .addComponent(jLabel130))
                                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel139)
                                                .addComponent(jLabel72)
                                                .addComponent(jLabel74)
                                                .addGroup(jPanel11Layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel127)))))))
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator38)
                                .addComponent(jSeparator35)
                                .addComponent(jSeparator36)
                                .addComponent(jSeparator37)
                                .addComponent(accNo1)
                                .addComponent(hNo1)
                                .addComponent(jSeparator39)
                                .addComponent(jSeparator40)
                                .addComponent(jSeparator15)
                                .addComponent(cAccount)
                                .addComponent(jSeparator16)
                                .addComponent(jSeparator17)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                    .addComponent(jLabel82)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cTotoal, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                    .addComponent(jLabel83)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                    .addComponent(jLabel84)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Attl1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                    .addComponent(jLabel85)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addComponent(jLabel86)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(balance1)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(calculate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(clcult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(5, 5, 5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel132)
                            .addComponent(jLabel134)
                            .addComponent(jLabel136))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel137)
                                .addGap(18, 18, 18)
                                .addComponent(time3))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel135)
                                .addGap(18, 18, 18)
                                .addComponent(date3))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel133)
                                .addGap(18, 18, 18)
                                .addComponent(user11, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(transferHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel132)
                    .addComponent(jLabel133)
                    .addComponent(user11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel134)
                    .addComponent(jLabel135)
                    .addComponent(date3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel136)
                    .addComponent(jLabel137)
                    .addComponent(time3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(srch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel122)
                        .addComponent(jLabel126)
                        .addComponent(accNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator37, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel121)
                    .addComponent(jLabel128)
                    .addComponent(hNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator36, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel125)
                    .addComponent(jLabel123))
                .addGap(0, 0, 0)
                .addComponent(jSeparator35, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balance1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel127)
                    .addComponent(jLabel120)
                    .addComponent(jLabel86))
                .addGap(0, 0, 0)
                .addComponent(jSeparator38, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel130)
                    .addComponent(jLabel131)
                    .addComponent(jLabel85))
                .addGap(0, 0, 0)
                .addComponent(jSeparator39, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calculate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Attl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel141)
                        .addComponent(jLabel138)
                        .addComponent(jLabel84)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator40, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel139)
                        .addComponent(jLabel70))
                    .addComponent(search22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72)
                    .addComponent(jLabel71)
                    .addComponent(jLabel83))
                .addGap(0, 0, 0)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cTotoal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel74)
                        .addComponent(jLabel73)
                        .addComponent(jLabel82))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(clcult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(transferHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout transferLayout = new javax.swing.GroupLayout(transfer);
        transfer.setLayout(transferLayout);
        transferLayout.setHorizontalGroup(
            transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 814, Short.MAX_VALUE)
                .addContainerGap())
        );
        transferLayout.setVerticalGroup(
            transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.add(transfer, "card6");

        transactions.setBackground(new java.awt.Color(234, 240, 251));

        jPanel12.setBackground(new java.awt.Color(234, 240, 251));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64), 2));

        srch13.setBackground(new java.awt.Color(234, 240, 251));
        srch13.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        srch13.setForeground(new java.awt.Color(1, 23, 64));
        srch13.setToolTipText("Enter Account Number");
        srch13.setBorder(null);
        srch13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                srch13KeyReleased(evt);
            }
        });

        jSeparator18.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator18.setForeground(new java.awt.Color(1, 23, 64));

        jPanel13.setBackground(new java.awt.Color(234, 240, 251));
        jPanel13.setToolTipText("Search Account No.");

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_25px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel79)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel79))
        );

        jPanel14.setBackground(new java.awt.Color(234, 240, 251));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64)));

        transactionsTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        transactionsTable.setForeground(new java.awt.Color(1, 23, 64));
        transactionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AccountNo", "HolderNo", "Name", "AccountType", "Balance", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jScrollPane3.setViewportView(transactionsTable);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(srch13)
                    .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(srch13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout transactionsLayout = new javax.swing.GroupLayout(transactions);
        transactions.setLayout(transactionsLayout);
        transactionsLayout.setHorizontalGroup(
            transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transactionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        transactionsLayout.setVerticalGroup(
            transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transactionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.add(transactions, "card7");

        getContentPane().add(jPanel7, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void minimizeBtncls_mnmze_RstDwn_Entered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtncls_mnmze_RstDwn_Entered
        if(evt.getSource()==CloseBtn1){                                     //colour changes for close, minimize and restore down btns when mouse entered
            CloseBtn1.setBackground(new java.awt.Color(156, 190, 254));
        }
        if(evt.getSource()==restoreDownBtn){
            restoreDownBtn.setBackground(new java.awt.Color(156, 190, 254));
        }
        if(evt.getSource()==minimizeBtn){
            minimizeBtn.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_minimizeBtncls_mnmze_RstDwn_Entered

    private void minimizeBtncls_mnmze_RstDwn_Exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtncls_mnmze_RstDwn_Exit
        if(evt.getSource()==CloseBtn1){                                     //colour changes for close, minimize and restore down btns when mouse exit
            CloseBtn1.setBackground(new java.awt.Color(234, 240, 251));
        }
        if(evt.getSource()==restoreDownBtn){
            restoreDownBtn.setBackground(new java.awt.Color(234, 240, 251));
        }
        if(evt.getSource()==minimizeBtn){
            minimizeBtn.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_minimizeBtncls_mnmze_RstDwn_Exit

    private void restoreDownBtncls_mnmze_RstDwn_Entered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restoreDownBtncls_mnmze_RstDwn_Entered
        if(evt.getSource()==CloseBtn1){                                     //colour changes for close, minimize and restore down btns when mouse entered
            CloseBtn1.setBackground(new java.awt.Color(156, 190, 254));
        }
        if(evt.getSource()==restoreDownBtn){
            restoreDownBtn.setBackground(new java.awt.Color(156, 190, 254));
        }
        if(evt.getSource()==minimizeBtn){
            minimizeBtn.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_restoreDownBtncls_mnmze_RstDwn_Entered

    private void restoreDownBtncls_mnmze_RstDwn_Exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restoreDownBtncls_mnmze_RstDwn_Exit
        if(evt.getSource()==CloseBtn1){                                     //colour changes for close, minimize and restore down btns when mouse exit
            CloseBtn1.setBackground(new java.awt.Color(234, 240, 251));
        }
        if(evt.getSource()==restoreDownBtn){
            restoreDownBtn.setBackground(new java.awt.Color(234, 240, 251));
        }
        if(evt.getSource()==minimizeBtn){
            minimizeBtn.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_restoreDownBtncls_mnmze_RstDwn_Exit

    private void CloseBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtn1MouseClicked
        System.exit(0);             //close the application
    }//GEN-LAST:event_CloseBtn1MouseClicked

    private void CloseBtn1cls_mnmze_RstDwn_Entered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtn1cls_mnmze_RstDwn_Entered
        if(evt.getSource()==CloseBtn1){                                     //colour changes for close, minimize and restore down btns when mouse entered
            CloseBtn1.setBackground(new java.awt.Color(156, 190, 254));
        }
        if(evt.getSource()==restoreDownBtn){
            restoreDownBtn.setBackground(new java.awt.Color(156, 190, 254));
        }
        if(evt.getSource()==minimizeBtn){
            minimizeBtn.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_CloseBtn1cls_mnmze_RstDwn_Entered

    private void CloseBtn1cls_mnmze_RstDwn_Exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtn1cls_mnmze_RstDwn_Exit
        if(evt.getSource()==CloseBtn1){                                     //colour changes for close, minimize and restore down btns when mouse exit
            CloseBtn1.setBackground(new java.awt.Color(234, 240, 251));
        }
        if(evt.getSource()==restoreDownBtn){
            restoreDownBtn.setBackground(new java.awt.Color(234, 240, 251));
        }
        if(evt.getSource()==minimizeBtn){
            minimizeBtn.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_CloseBtn1cls_mnmze_RstDwn_Exit

    private void mouseclicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseclicked
        if (evt.getSource()==AccountHolders_Btn){                            //When click open relevant panels from menu buttons
            Account_Holders.setVisible(true);
            check_Balance.setVisible(false);
            Deposit.setVisible(false);
            withdraw.setVisible(false);
            transfer.setVisible(false);
            transactions.setVisible(false);
        }
        if (evt.getSource()==CheckBalance_Btn){
            Account_Holders.setVisible(false);
            check_Balance.setVisible(true);
            Deposit.setVisible(false);
            withdraw.setVisible(false);
            transfer.setVisible(false);
            transactions.setVisible(false);
        }
        if (evt.getSource()==Deposit_Btn){
            Account_Holders.setVisible(false);
            check_Balance.setVisible(false);
            Deposit.setVisible(true);
            autoDate();
            autoTime();
            withdraw.setVisible(false);
            transfer.setVisible(false);
            transactions.setVisible(false);
        }
        if (evt.getSource()==Withdraw_Btn){
            Account_Holders.setVisible(false);
            check_Balance.setVisible(false);
            Deposit.setVisible(false);
            withdraw.setVisible(true);
            autoDate();
            autoTime();
            transfer.setVisible(false);
            transactions.setVisible(false);
        }
        if (evt.getSource()==Transfer_Btn){
            Account_Holders.setVisible(false);
            check_Balance.setVisible(false);
            Deposit.setVisible(false);
            withdraw.setVisible(false);
            transfer.setVisible(true);
            autoDate();
            autoTime();
            transactions.setVisible(false);
        }
        if (evt.getSource()==TransactionsHistory_Btn){
            Account_Holders.setVisible(false);
            check_Balance.setVisible(false);
            Deposit.setVisible(false);
            withdraw.setVisible(false);
            transfer.setVisible(false);
            transactions.setVisible(true);
        }
    }//GEN-LAST:event_mouseclicked

     public void autoDate(){        // to generate date
        Date d1 = new Date();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       date.setText(sdf.format(d1));
       Ddate.setText(sdf.format(d1));
       date3.setText(sdf.format(d1));
    }
    
            
    public void autoTime(){     // to generate time
        
        
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d1 = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
                    time.setText(sdf.format(d1));
                    Ttime.setText(sdf.format(d1));
                    time3.setText(sdf.format(d1));
            }
        }).start();
        
        
    }
    
    private void mouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEntered
        if(evt.getSource()==AccountHolders_Btn){                                //colour changes for  btn
            AccountHolders_Btn.setBackground(new java.awt.Color(52, 68, 95)); 
        }
        if(evt.getSource()==CheckBalance_Btn){
            CheckBalance_Btn.setBackground(new java.awt.Color(52, 68, 95)); 
        }
        if(evt.getSource()==Deposit_Btn){
            Deposit_Btn.setBackground(new java.awt.Color(52, 68, 95)); 
        }
        if(evt.getSource()==Withdraw_Btn){
            Withdraw_Btn.setBackground(new java.awt.Color(52, 68, 95)); 
        }
        if(evt.getSource()==Transfer_Btn){
            Transfer_Btn.setBackground(new java.awt.Color(52, 68, 95)); 
        }
        if(evt.getSource()==TransactionsHistory_Btn){
            TransactionsHistory_Btn.setBackground(new java.awt.Color(52, 68, 95)); 
        }
    }//GEN-LAST:event_mouseEntered

    private void mouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExit
        if(evt.getSource()==AccountHolders_Btn){                            //colour changes for  btn
            AccountHolders_Btn.setBackground(new java.awt.Color(1,13,54)); 
        }
        if(evt.getSource()==CheckBalance_Btn){
            CheckBalance_Btn.setBackground(new java.awt.Color(1,13,54)); 
        }
        if(evt.getSource()==Deposit_Btn){
            Deposit_Btn.setBackground(new java.awt.Color(1,13,54)); 
        }
        if(evt.getSource()==Withdraw_Btn){
            Withdraw_Btn.setBackground(new java.awt.Color(1,13,54)); 
        }
        if(evt.getSource()==Transfer_Btn){
            Transfer_Btn.setBackground(new java.awt.Color(1,13,54)); 
        }
        if(evt.getSource()==TransactionsHistory_Btn){
            TransactionsHistory_Btn.setBackground(new java.awt.Color(1,13,54)); 
        }
    }//GEN-LAST:event_mouseExit

    private void searchBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBoxKeyReleased
        search();
    }//GEN-LAST:event_searchBoxKeyReleased

    private void formBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formBtnMouseEntered
        if(evt.getSource()==formBtn){
            formBtn.setBackground(new java.awt.Color(156, 190, 254)); 
        }
    }//GEN-LAST:event_formBtnMouseEntered

    private void formBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formBtnMouseExited
        if(evt.getSource()==formBtn){
            formBtn.setBackground(new java.awt.Color(234, 240, 251)); 
        }
    }//GEN-LAST:event_formBtnMouseExited

    private void formBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formBtnMouseClicked
        Cashier_AccountHolders c1 = new Cashier_AccountHolders();
        c1.setVisible(true);
    }//GEN-LAST:event_formBtnMouseClicked

    private void restoreDownBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restoreDownBtnMouseClicked
        if(this.getExtendedState()!= Cashier.MAXIMIZED_BOTH){       // to restoredown the system
            this.setExtendedState(Cashier.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(Cashier.NORMAL);
        }
    }//GEN-LAST:event_restoreDownBtnMouseClicked

    private void minimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseClicked
        this.setExtendedState(Cashier_AccountHolders.ICONIFIED);        // minimize system
    }//GEN-LAST:event_minimizeBtnMouseClicked

    private void search2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search2MouseEntered
        if(evt.getSource()==search2){
            search2.setBackground(new java.awt.Color(156, 190, 254)); 
        }
    }//GEN-LAST:event_search2MouseEntered

    private void search2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search2MouseExited
        if(evt.getSource()==search2){
            search2.setBackground(new java.awt.Color(234, 240, 251)); 
        }
    }//GEN-LAST:event_search2MouseExited

    private void calculateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateMouseEntered
        if(evt.getSource()==calculate){
            calculate.setBackground(new java.awt.Color(156, 190, 254)); 
        }
    }//GEN-LAST:event_calculateMouseEntered

    private void calculateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateMouseExited
        if(evt.getSource()==calculate){
            calculate.setBackground(new java.awt.Color(234, 240, 251)); 
        }
    }//GEN-LAST:event_calculateMouseExited

    private void depositMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositMouseEntered
        if(evt.getSource()==deposit){
            deposit.setBackground(new java.awt.Color(156, 190, 254)); 
        }
    }//GEN-LAST:event_depositMouseEntered

    private void depositMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositMouseExited
        if(evt.getSource()==deposit){
            deposit.setBackground(new java.awt.Color(234, 240, 251)); 
        }
    }//GEN-LAST:event_depositMouseExited

    private void search2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search2MouseClicked
        depositSearch();
    }//GEN-LAST:event_search2MouseClicked

    private void depositMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositMouseClicked
        depositSave();
        
    }//GEN-LAST:event_depositMouseClicked

    private void calculateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateMouseClicked
        totalBalence_Check();
    }//GEN-LAST:event_calculateMouseClicked
    
    public void totalBalence_Check(){ // calculate account balance and deposit amount to get the total
        try {

        float aa1 = Float.parseFloat(Abalance.getText());
    float aa2 = Float.parseFloat(Damount.getText());
    //float ttl = Float.parseFloat(total.getText());
    float sum = aa1+aa2;
    String sum1 = String.valueOf(sum);
            if(aa2 >=99){
                total.setText(sum1);
                
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Minimum Deposit is Rs.100");
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    /*
    
    */
    private void srch2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srch2MouseEntered
        if(evt.getSource()==srch2){
            srch2.setBackground(new java.awt.Color(156, 190, 254)); 
        }
    }//GEN-LAST:event_srch2MouseEntered

    private void srch2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srch2MouseExited
        if(evt.getSource()==srch2){
            srch2.setBackground(new java.awt.Color(234, 240, 251)); 
        }
    }//GEN-LAST:event_srch2MouseExited

    private void calculate2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculate2MouseEntered
        if(evt.getSource()==calculate2){
            calculate2.setBackground(new java.awt.Color(156, 190, 254)); 
        }
    }//GEN-LAST:event_calculate2MouseEntered

    private void calculate2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculate2MouseExited
        if(evt.getSource()==calculate2){
            calculate2.setBackground(new java.awt.Color(234, 240, 251)); 
        }
    }//GEN-LAST:event_calculate2MouseExited

    private void withdraw2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdraw2MouseEntered
        if(evt.getSource()==withdraw2){
            withdraw2.setBackground(new java.awt.Color(156, 190, 254)); 
        }
    }//GEN-LAST:event_withdraw2MouseEntered

    private void withdraw2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdraw2MouseExited
        if(evt.getSource()==withdraw2){
            withdraw2.setBackground(new java.awt.Color(234, 240, 251)); 
        }
    }//GEN-LAST:event_withdraw2MouseExited

    private void srch2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srch2MouseClicked
        withdrawSearch2();
    }//GEN-LAST:event_srch2MouseClicked

    private void withdraw2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdraw2MouseClicked
        withdrawSave();
    }//GEN-LAST:event_withdraw2MouseClicked

    private void calculate2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculate2MouseClicked
        totalBalence_Check2();
    }//GEN-LAST:event_calculate2MouseClicked

    private void DepositHstryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositHstryMouseClicked
        Diposit_History d1 = new Diposit_History();
        d1.setVisible(true);
    }//GEN-LAST:event_DepositHstryMouseClicked

    private void DepositHstryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositHstryMouseEntered
        if(evt.getSource()==DepositHstry){
            DepositHstry.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_DepositHstryMouseEntered

    private void DepositHstryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositHstryMouseExited
        if(evt.getSource()==DepositHstry){
            DepositHstry.setBackground(new java.awt.Color( 234, 240, 251)); 
        }
    }//GEN-LAST:event_DepositHstryMouseExited

    private void srch12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_srch12KeyReleased
        Balancesearch2();
    }//GEN-LAST:event_srch12KeyReleased

    private void DepositHstry1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositHstry1MouseClicked
        Withdraw_History w1 = new Withdraw_History();
        w1.setVisible(true);
    }//GEN-LAST:event_DepositHstry1MouseClicked

    private void DepositHstry1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositHstry1MouseEntered
        if(evt.getSource()==DepositHstry1){
            DepositHstry1.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_DepositHstry1MouseEntered

    private void DepositHstry1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositHstry1MouseExited
        if(evt.getSource()==DepositHstry1){
            DepositHstry1.setBackground(new java.awt.Color( 234, 240, 251)); 
        }
    }//GEN-LAST:event_DepositHstry1MouseExited

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        transferHistory();
        dtransfer_Update();
        credittransfer_Update();
        
    }//GEN-LAST:event_saveMouseClicked

    public void dtransfer_Update(){          //  update account holder's balance after transfer
        float blnc = Float.parseFloat(Attl1.getText());
        String id = accNo1.getText();
        
        
        try {
            String sql = "update account_holders set A_amount = '"+blnc+"' where Bank_No= '"+id+"'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            
            
            BalanceCheck_tableload2();
            //JOptionPane.showMessageDialog(null, "Trasfered!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void credittransfer_Update(){          //  update  Credit holders' balance after transfer
        
        float blnc2 = Float.parseFloat(cTotoal.getText());
        String id2 = cAccount.getText();
        
        try {
            String sql2 = "update account_holders set A_amount = '"+blnc2+"' where Bank_No= '"+id2+"'";
            pst = conn.prepareStatement(sql2);
           
            pst.execute();
            BalanceCheck_tableload2();
            transferclear();
            JOptionPane.showMessageDialog(null, "Successfully Trasferred!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void transferHistory(){      //to view the transfer history
         try {
             String sql = "insert into transfer values (?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            
           pst.setInt(1, Integer.parseInt(accNo1.getText()));
            
           
            pst.setString(2,tAmount1.getText());
            pst.setString(3,Attl1.getText()); 
            pst.setString(4,cAccount.getText());
            pst.setString(5,user11.getText());
            pst.setString(6,date3.getText());
            pst.setString(7,time3.getText());
           //totalBalence_Check2();
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void transferclear(){        //clear previous details after a transfer
        accNo1.setText("");
        hNo1.setText("");
        hName1.setText("");
        balance1.setText("");
        tAmount1.setText("");
        Attl1.setText("");
        cAccount.setText("");
        cBalance.setText("");
        cTotoal.setText("");
        
    }
    
    private void saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseEntered
        if(evt.getSource()==save){
            save.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_saveMouseEntered

    private void saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseExited
        if(evt.getSource()==save){
            save.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_saveMouseExited

    private void srch1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srch1MouseClicked
        transferSearch2();
    }//GEN-LAST:event_srch1MouseClicked

     public void transferSearch2(){               //search holder details to transfer
        try {
            String srch = accNo1.getText();
            String sql = "select *from account_holders where Bank_No like '%"+srch+"%'" ;
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             
             if(rs.next()){
                 hNo1.setText(rs.getString("A_Hnumber"));
                 hName1.setText(rs.getString("A_Name"));
                 balance1.setText(rs.getString("A_amount"));
                         
             }
             else{
                 JOptionPane.showMessageDialog(null, "Record not Found!");
             }
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Record not Found!");
        }
    }
    
    private void srch1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srch1MouseEntered
        if(evt.getSource()==srch1){
            srch1.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_srch1MouseEntered

    private void srch1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srch1MouseExited
        if(evt.getSource()==srch1){
            srch1.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_srch1MouseExited

    private void calculate1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculate1MouseClicked
        totalBalence_Check33();
    }//GEN-LAST:event_calculate1MouseClicked

    public void totalBalence_Check33(){       //calculate to get the total for a transfer
        try {
           
            float a1 = Float.parseFloat(balance1.getText());
            float a2 = Float.parseFloat(tAmount1.getText());
            float sum = a1-a2;
            String sum1 = String.valueOf(sum);
            
            if(a1<=a2){
               JOptionPane.showMessageDialog(null, "Holder Deos not have enough Balance!");
            }
            else if(a2<99){
                JOptionPane.showMessageDialog(null, "Minimum withdraw is Rs.100");
            }
            else{
                Attl1.setText(sum1);
                 
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void calculate1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculate1MouseEntered
        if(evt.getSource()==calculate1){
            calculate1.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_calculate1MouseEntered

    private void calculate1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculate1MouseExited
        if(evt.getSource()==calculate1){
            calculate1.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_calculate1MouseExited

    private void search22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search22MouseEntered
        if(evt.getSource()==search22){
            search22.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_search22MouseEntered

    private void search22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search22MouseExited
        if(evt.getSource()==search22){
            search22.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_search22MouseExited

    private void clcultMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clcultMouseEntered
        if(evt.getSource()==clcult){
            clcult.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_clcultMouseEntered

    private void clcultMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clcultMouseExited
        if(evt.getSource()==clcult){
            clcult.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_clcultMouseExited

    private void search22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search22MouseClicked
        creditAccount_Search();
    }//GEN-LAST:event_search22MouseClicked

    private void clcultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clcultMouseClicked
        CreditAccountBalance_Check();
    }//GEN-LAST:event_clcultMouseClicked

    private void srch13KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_srch13KeyReleased
        ViewTransactionsSearch();
    }//GEN-LAST:event_srch13KeyReleased

    private void logoutBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtn1MouseClicked
        LogoutVerifing();
    }//GEN-LAST:event_logoutBtn1MouseClicked

    public void LogoutVerifing (){      //logout from the system
        int check = JOptionPane.showConfirmDialog(null,"Are you sure you want Logout?");
        
        if (check == 0){
           
            Login l1 = new Login();             // when click, back to the Login panel
        l1.setVisible(true);
        this.setVisible(false);
        }
           // tableload2();
    }
    
    private void logoutBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtn1MouseEntered
        if(evt.getSource()==logoutBtn1){
            logoutBtn1.setBackground(new java.awt.Color(52, 68, 95));
        }
    }//GEN-LAST:event_logoutBtn1MouseEntered

    private void logoutBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtn1MouseExited
        if(evt.getSource()==logoutBtn1){
            logoutBtn1.setBackground(new java.awt.Color(1,23,64));
        }
    }//GEN-LAST:event_logoutBtn1MouseExited

    private void moveAreaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveAreaMouseDragged
        int x=evt.getXOnScreen();
        int y= evt.getYOnScreen();
        setLocation(x-xMouse, y=yMouse);
    }//GEN-LAST:event_moveAreaMouseDragged

    private void moveAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveAreaMousePressed
        
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_moveAreaMousePressed

    private void transferHistoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferHistoryMouseEntered
        if(evt.getSource()==transferHistory){
            transferHistory.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_transferHistoryMouseEntered

    private void transferHistoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferHistoryMouseExited
        if(evt.getSource()==transferHistory){
            transferHistory.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_transferHistoryMouseExited

    private void transferHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferHistoryMouseClicked
        Transfer_History t1 = new Transfer_History();
        t1.setVisible(true);
    }//GEN-LAST:event_transferHistoryMouseClicked

    private void lnfoBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lnfoBtn1MouseClicked
        Info i1 = new Info();
        i1.setVisible(true);
    }//GEN-LAST:event_lnfoBtn1MouseClicked

    private void lnfoBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lnfoBtn1MouseEntered
        if(evt.getSource()==lnfoBtn1){
            lnfoBtn1.setBackground(new java.awt.Color(52, 68, 95));
        }
    }//GEN-LAST:event_lnfoBtn1MouseEntered

    private void lnfoBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lnfoBtn1MouseExited
        if(evt.getSource()==lnfoBtn1){
            lnfoBtn1.setBackground(new java.awt.Color(1,23,64));
        }
    }//GEN-LAST:event_lnfoBtn1MouseExited
private int xMouse, yMouse;
    
    public void ViewTransactionsSearch(){           //to view account holders' transsactions
         String srch = srch13.getText();
        
        try {
            String sql = "select Bank_No as AccountNo , A_Hnumber as HolderNo, A_Name as Name, "
                    + "A_Withdraw_Aamount as Withdraw, A_Diposit_Amount as Deposit, A_Balance as Balance,"
                    + "A_User as User, A_date as Date, A_time as Time from transactions where Bank_No like '%"+srch+"%'" ;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            transactionsTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void CreditAccountBalance_Check(){       //calculate to get the total for a deposit
        try {
            String a1 = tAmount1.getText();
            String a2 = cBalance.getText();
            float sum = Float.parseFloat(a1)+Float.parseFloat(a2);
            String sum1 = String.valueOf(sum);
            cTotoal.setText(sum1);
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void creditAccount_Search(){  
        try {
             int a1 = Integer.parseInt(accNo1.getText());
        int a2 = Integer.parseInt(cAccount.getText());      //search account number from holder details to transfer funds to credit holder
        
        if(a1==a2){
            JOptionPane.showMessageDialog(null,"Account number and Credit number can not be same");
        }
        else{
        try {
            int srch = Integer.parseInt(cAccount.getText());
            String sql = "select *from account_holders where Bank_No = '"+srch+"'" ;
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             
             if(rs.next()){
                 
                 
                 cBalance.setText(rs.getString("A_amount"));
                         
             }
             else{
                 JOptionPane.showMessageDialog(null, "Record not Found!");
             }
             
        } catch (Exception e) {
            
        }
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
    public void Balancesearch2(){       //to view the balance
        String srch = srch12.getText();
        
        try {
            
            String sql = "select Bank_No as AccountNo ,A_Hnumber as HolderNo, A_Name as Name, "
                    + "A_AccountType as AccountType, A_amount as Balance from account_holders  where Bank_No like '%"+srch+"%' " ;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            viewTabl3.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
      
     }
       
    
    
    public void totalBalence_Check2(){ //calculate total for a withdrawal
        try {
           
            float a1 = Float.parseFloat(ABalance.getText());
            float a2 = Float.parseFloat(wtdrwAmount.getText());
            float sum = a1-a2;
            String sum1 = String.valueOf(sum);
            
            if(a1<=a2){
               JOptionPane.showMessageDialog(null, "Holder Deos not have enough Balance!");
            }
            else if(a2<99){
                JOptionPane.showMessageDialog(null, "Minimum withdraw is Rs.100");
            }
            else{
                WTotal.setText(sum1);
                 
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        /*
        float aa1 = Float.parseFloat(Abalance.getText());
    float aa2 = Float.parseFloat(wtdrwAmount.getText());
    
    float sum = aa1+aa2;
    String sum1 = String.valueOf(sum);
            if(aa2 >=100){
                total.setText(sum1);
                
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Minimum Deposit is Rs.100");
            }
        */
    }
    
    public void depositSearch(){            //search holder details to diposit
        try {
            String srch = Ano.getText();
            String sql = "select *from account_holders where Bank_No = '"+srch+"'" ;
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             
             if(rs.next()){
                 Hno.setText(rs.getString("A_Hnumber"));
                 Hname.setText(rs.getString("A_Name"));
                 Abalance.setText(rs.getString("A_amount"));
                         
             }
             else{
                 JOptionPane.showMessageDialog(null, "Record not Found!");
             }
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Record not Found!");
        }
    }
    
    public void withdrawSearch2(){               //search holder details to withdraw
        try {
            String srch = accNo.getText();
            String sql = "select *from account_holders where Bank_No = '"+srch+"'" ;
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             
             if(rs.next()){
                 holderNo.setText(rs.getString("A_Hnumber"));
                 HolderName.setText(rs.getString("A_Name"));
                 ABalance.setText(rs.getString("A_amount"));
                         
             }
             else{
                 JOptionPane.showMessageDialog(null, "Record not Found!");
             }
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Record not Found!");
        }
    }
    
    public void depositSave(){          //diposit value save in database

       try {
             String sql = "insert into deposit values (?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            
           pst.setInt(1, Integer.parseInt(Ano.getText()));
            pst.setString(2,Hno.getText());
            pst.setString(3,Hname.getText());
            pst.setString(4,Damount.getText());
            pst.setString(5,total.getText());
            pst.setString(6,username.getText());
            pst.setString(7,date.getText());
            pst.setString(8,time.getText());
           
            pst.executeUpdate();
            
            depositBalance_Update();
            transactions();
            BalanceCheck_tableload2();
            transactionsTableLoad();
            JOptionPane.showMessageDialog(null,"Successfully Deposited!");
            erase();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
    public void transactions(){     //to view transactions
        String aNo = Ano.getText();
        String holderNo = Hno.getText();
        String name = Hname.getText();
        String amount = Damount.getText();
        String ttl = total.getText();
        String user = username.getText();
        String Ddate = date.getText();
        String tTime = time.getText();
        
       try {
             String sql = "insert into transactions (Bank_No, A_Hnumber, A_Name, "
                     + " A_Withdraw_Aamount, A_Diposit_Amount,"
                     + " A_Balance, A_User, A_date, A_time) values ('"+aNo+"','"+holderNo+"','"+name+"',0,"
                     + "'"+amount+"','"+ttl+"','"+user+"','"+Ddate+"','"+tTime+"')";
            pst = conn.prepareStatement(sql);

            pst.executeUpdate();
            
            depositBalance_Update();
            BalanceCheck_tableload2();
            
            erase();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void depositBalance_Update(){          //  update total balance in accountHolders after deposit
        float blnc = Float.parseFloat(total.getText());
        String id = Ano.getText();
        
        try {
            String sql = "update account_holders set A_amount = '"+blnc+"' where Bank_No= '"+id+"'";
            pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void withdrawBalance_Update(){          //  update total balance in accountHolder after withdrawal 
        float blnc = Float.parseFloat(WTotal.getText());
        String id = accNo.getText();
        
        try {
            String sql = "update account_holders set A_amount = '"+blnc+"' where Bank_No= '"+id+"'";
            pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
       public void withdrawSave(){              //withdraw save in database
       
          try {
             String sql = "insert into withdraw values (?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            
           pst.setInt(1, Integer.parseInt(accNo.getText()));
            
           
            pst.setString(2,holderNo.getText());
            pst.setString(3,HolderName.getText());

            float amnt = Float.parseFloat(wtdrwAmount.getText());
                pst.setFloat(4, amnt);
            
            
            
            pst.setString(5,WTotal.getText());
            pst.setString(6,user22.getText());
            pst.setString(7,Ddate.getText());
            pst.setString(8,Ttime.getText());
            pst.executeUpdate();
            withdrawBalance_Update();
            BalanceCheck_tableload2();
            withdrawToTransaction();
            transactionsTableLoad();
            JOptionPane.showMessageDialog(null,"Successfully withdrew!");
            erase2();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
       
       public void withdrawToTransaction(){     //save withdraw details in transaction table in database
        String aNo = accNo.getText();
        String hNo = holderNo.getText();
        String name = HolderName.getText();
        String amount = wtdrwAmount.getText();
        String ttl = WTotal.getText();
        String user = user22.getText();
        String date = Ddate.getText();
        String Time = Ttime.getText();
        
       try {
             String sql = "insert into transactions (Bank_No, A_Hnumber, A_Name, "
                     + "A_Withdraw_Aamount, A_Diposit_Amount,"
                     + " A_Balance, A_User, A_date, A_time) values ('"+aNo+"','"+hNo+"','"+name+"',"
                     + "'"+amount+"',0,'"+ttl+"','"+user+"','"+date+"','"+Time+"')";
            pst = conn.prepareStatement(sql);

            pst.executeUpdate();
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       }
    
    public void erase(){        //previous depoait details clear
        Ano.setText("");
        Hno.setText("");
        Hname.setText("");
        Abalance.setText("");
        Damount.setText("");
        total.setText("");
        
    }
    
    public void erase2(){        //previous withdraw details clear
        accNo.setText("");
        holderNo.setText("");
        HolderName.setText("");
        wtdrwAmount.setText("");
        WTotal.setText("");
       ABalance.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ABalance;
    private javax.swing.JTextField Abalance;
    private javax.swing.JPanel AccountHolders_Btn;
    private javax.swing.JPanel Account_Holders;
    private javax.swing.JTextField Ano;
    private javax.swing.JTextField Attl1;
    private javax.swing.JPanel CheckBalance_Btn;
    private javax.swing.JPanel CloseBtn1;
    private javax.swing.JTextField Damount;
    private javax.swing.JTextField Ddate;
    private javax.swing.JPanel Deposit;
    private javax.swing.JPanel DepositHstry;
    private javax.swing.JPanel DepositHstry1;
    private javax.swing.JPanel Deposit_Btn;
    private javax.swing.JTextField Hname;
    private javax.swing.JTextField Hno;
    private javax.swing.JTextField HolderName;
    private javax.swing.JLabel Logout1;
    private javax.swing.JLabel Logout3;
    private javax.swing.JPanel TransactionsHistory_Btn;
    private javax.swing.JPanel Transfer_Btn;
    private javax.swing.JTextField Ttime;
    private javax.swing.JTextField WTotal;
    private javax.swing.JPanel Withdraw_Btn;
    private javax.swing.JTextField accNo;
    private javax.swing.JTextField accNo1;
    private javax.swing.JTextField balance1;
    private javax.swing.JTextField cAccount;
    private javax.swing.JTextField cBalance;
    private javax.swing.JTextField cTotoal;
    private javax.swing.JPanel calculate;
    private javax.swing.JPanel calculate1;
    private javax.swing.JPanel calculate2;
    private javax.swing.JPanel check_Balance;
    private javax.swing.JPanel clcult;
    private javax.swing.JTextField date;
    private javax.swing.JTextField date3;
    private javax.swing.JPanel deposit;
    private javax.swing.JPanel formBtn;
    private javax.swing.JTextField hName1;
    private javax.swing.JTextField hNo1;
    private javax.swing.JTextField holderNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel lnfoBtn1;
    private javax.swing.JPanel logoutBtn1;
    private javax.swing.JPanel minimizeBtn;
    private javax.swing.JPanel moveArea;
    private javax.swing.JPanel restoreDownBtn;
    private javax.swing.JPanel save;
    private javax.swing.JPanel search2;
    private javax.swing.JPanel search22;
    private javax.swing.JSeparator searchBar;
    private javax.swing.JTextField searchBox;
    private javax.swing.JPanel srch1;
    private javax.swing.JTextField srch12;
    private javax.swing.JTextField srch13;
    private javax.swing.JPanel srch2;
    private javax.swing.JTextField tAmount1;
    private javax.swing.JTextField time;
    private javax.swing.JTextField time3;
    private javax.swing.JTextField total;
    private javax.swing.JPanel transactions;
    private javax.swing.JTable transactionsTable;
    private javax.swing.JPanel transfer;
    private javax.swing.JPanel transferHistory;
    public static javax.swing.JTextField user11;
    public static javax.swing.JTextField user22;
    public static javax.swing.JTextField username;
    private javax.swing.JTable viewTabl3;
    private javax.swing.JTable viewTable;
    private javax.swing.JPanel withdraw;
    private javax.swing.JPanel withdraw2;
    private javax.swing.JTextField wtdrwAmount;
    // End of variables declaration//GEN-END:variables
}
