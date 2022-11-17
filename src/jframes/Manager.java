/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframes;

import codes.DB_Connect;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.util.Random;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import static jframes.Cashier.username;




public class Manager extends javax.swing.JFrame {

        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
    public Manager() {
        initComponents();
        setVisible(true);   //for the menu buttons
        setLocationRelativeTo(null);
        
       
        
        
        conn = DB_Connect.connect();
        tableload();
        tableload2();
        BalanceCheck_tableload();
        transactionsTableLoad();
        
        
    }

    public void transactionsTableLoad(){  // view transaction table
        try {
            
            String sql = "select Bank_No as AccountNo, A_Hnumber as HolderNo, A_Name as Name, "
                    + "A_Withdraw_Aamount as Withdraw, A_Diposit_Amount as Deposit,A_Balance as Balance, A_User as User,"
                    + " A_date as Date, A_time as Time from transactions ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            transactionsTable.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderGroup = new javax.swing.ButtonGroup();
        GenderGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        minimizeBtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        restoreDownBtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CloseBtn1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        j1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        MAHbtn1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        MAHbtn2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        MAHbtn3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        MAHbtn4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        MAHbtn5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        MAHbtn6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        MAHbtn7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JPanel();
        Logout = new javax.swing.JLabel();
        MAHbtn8 = new javax.swing.JPanel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        MAHbtn9 = new javax.swing.JPanel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        lnfoBtn = new javax.swing.JPanel();
        Logout1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Account_Holders = new javax.swing.JPanel();
        searchBox = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        searchBar = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();
        formBtn = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        Check_Balance = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        srch12 = new javax.swing.JTextField();
        jSeparator34 = new javax.swing.JSeparator();
        jPanel12 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        viewTabl3 = new javax.swing.JTable();
        Deposit = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jSeparator27 = new javax.swing.JSeparator();
        jLabel87 = new javax.swing.JLabel();
        jSeparator26 = new javax.swing.JSeparator();
        jLabel86 = new javax.swing.JLabel();
        accNo = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        deposit = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jSeparator25 = new javax.swing.JSeparator();
        jLabel91 = new javax.swing.JLabel();
        hName = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        hNo = new javax.swing.JTextField();
        srch = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        balance = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        dAmount = new javax.swing.JTextField();
        ttl = new javax.swing.JTextField();
        jSeparator32 = new javax.swing.JSeparator();
        jSeparator33 = new javax.swing.JSeparator();
        jLabel68 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        date2 = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        time2 = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        calculate = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        DHstry = new javax.swing.JPanel();
        jLabel119 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        Withdrawal = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        jSeparator35 = new javax.swing.JSeparator();
        jLabel121 = new javax.swing.JLabel();
        jSeparator36 = new javax.swing.JSeparator();
        jLabel122 = new javax.swing.JLabel();
        accNo1 = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        deposit1 = new javax.swing.JPanel();
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
        dAmount1 = new javax.swing.JTextField();
        ttl1 = new javax.swing.JTextField();
        jSeparator39 = new javax.swing.JSeparator();
        jSeparator40 = new javax.swing.JSeparator();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        user1 = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        date33 = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        time3 = new javax.swing.JTextField();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        calculate1 = new javax.swing.JPanel();
        jLabel140 = new javax.swing.JLabel();
        WHstry = new javax.swing.JPanel();
        jLabel141 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        transfer = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel144 = new javax.swing.JLabel();
        jSeparator41 = new javax.swing.JSeparator();
        jLabel145 = new javax.swing.JLabel();
        jSeparator42 = new javax.swing.JSeparator();
        jLabel146 = new javax.swing.JLabel();
        accNo2 = new javax.swing.JTextField();
        jLabel147 = new javax.swing.JLabel();
        save = new javax.swing.JPanel();
        jLabel148 = new javax.swing.JLabel();
        jSeparator43 = new javax.swing.JSeparator();
        jLabel149 = new javax.swing.JLabel();
        hName2 = new javax.swing.JTextField();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        hNo2 = new javax.swing.JTextField();
        srch2 = new javax.swing.JPanel();
        jLabel153 = new javax.swing.JLabel();
        balance2 = new javax.swing.JTextField();
        jSeparator44 = new javax.swing.JSeparator();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        tAmount1 = new javax.swing.JTextField();
        Attl1 = new javax.swing.JTextField();
        jSeparator45 = new javax.swing.JSeparator();
        jSeparator46 = new javax.swing.JSeparator();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        date4 = new javax.swing.JTextField();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        time4 = new javax.swing.JTextField();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        calculate2 = new javax.swing.JPanel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        cAccount = new javax.swing.JTextField();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jSeparator47 = new javax.swing.JSeparator();
        cBalance = new javax.swing.JTextField();
        jLabel169 = new javax.swing.JLabel();
        cTotoal = new javax.swing.JTextField();
        jLabel170 = new javax.swing.JLabel();
        jSeparator48 = new javax.swing.JSeparator();
        jSeparator49 = new javax.swing.JSeparator();
        search22 = new javax.swing.JPanel();
        jLabel171 = new javax.swing.JLabel();
        clcult = new javax.swing.JPanel();
        jLabel172 = new javax.swing.JLabel();
        USER = new javax.swing.JTextField();
        THstry2 = new javax.swing.JPanel();
        jLabel176 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        transactions = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        srch13 = new javax.swing.JTextField();
        jSeparator50 = new javax.swing.JSeparator();
        jPanel14 = new javax.swing.JPanel();
        jLabel175 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        transactionsTable = new javax.swing.JTable();
        Manage_Holders = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        AddressText2 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        srchBox2 = new javax.swing.JTextField();
        jSeparator24 = new javax.swing.JSeparator();
        srchBtn = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        idBox2 = new javax.swing.JTextField();
        AtypeBox = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        deleteBtn2 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        updateBtn2 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        nameText2 = new javax.swing.JTextField();
        clearBtn3 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        nicTxt2 = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        bDay2 = new com.toedter.calendar.JDateChooser();
        emailText2 = new javax.swing.JTextField();
        ageTxt2 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        MaleRadio1 = new javax.swing.JRadioButton();
        FemaleRadio1 = new javax.swing.JRadioButton();
        phoneText2 = new javax.swing.JTextField();
        nationalityText2 = new javax.swing.JTextField();
        jSeparator29 = new javax.swing.JSeparator();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        holderNo2 = new javax.swing.JTextField();
        jSeparator31 = new javax.swing.JSeparator();
        Create_Holders = new javax.swing.JPanel();
        p6 = new javax.swing.JPanel();
        AcntNoTxt = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        nicTxt = new javax.swing.JTextField();
        AddressText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        ageTxt = new javax.swing.JTextField();
        nationalityText = new javax.swing.JTextField();
        phoneText = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        acntType = new javax.swing.JComboBox<>();
        MaleRadio = new javax.swing.JRadioButton();
        FemaleRadio = new javax.swing.JRadioButton();
        saveBtn = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        eraseBtn = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bDay = new com.toedter.calendar.JDateChooser();
        jLabel69 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        holderNo = new javax.swing.JTextField();
        jSeparator30 = new javax.swing.JSeparator();
        jLabel73 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        Createddate = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        autoTime = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        Aamount = new javax.swing.JTextField();
        jSeparator28 = new javax.swing.JSeparator();
        jLabel117 = new javax.swing.JLabel();
        Create_Users = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewTabl2 = new javax.swing.JTable();
        searchBox2 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        editBtn = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        saveBtn2 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        usertype = new javax.swing.JComboBox<>();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        idBox = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        eraseBtn2 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(234, 240, 251));

        jPanel3.setBackground(new java.awt.Color(1, 23, 64));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_restore_window_20px.png"))); // NOI18N

        javax.swing.GroupLayout restoreDownBtnLayout = new javax.swing.GroupLayout(restoreDownBtn);
        restoreDownBtn.setLayout(restoreDownBtnLayout);
        restoreDownBtnLayout.setHorizontalGroup(
            restoreDownBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, restoreDownBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        restoreDownBtnLayout.setVerticalGroup(
            restoreDownBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 773, Short.MAX_VALUE)
                .addComponent(minimizeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restoreDownBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CloseBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(restoreDownBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(minimizeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(CloseBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        j1.setBackground(new java.awt.Color(1, 23, 64));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_museum_35px.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(165, 165, 165));
        jLabel5.setText("City Bank.");

        jSeparator1.setBackground(new java.awt.Color(165, 165, 165));
        jSeparator1.setForeground(new java.awt.Color(165, 165, 165));

        MAHbtn1.setBackground(new java.awt.Color(1, 13, 54));
        MAHbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked1(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEntered1(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit1(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_customer_25px.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(165, 165, 165));
        jLabel7.setText("Account Holders");

        javax.swing.GroupLayout MAHbtn1Layout = new javax.swing.GroupLayout(MAHbtn1);
        MAHbtn1.setLayout(MAHbtn1Layout);
        MAHbtn1Layout.setHorizontalGroup(
            MAHbtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAHbtn1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MAHbtn1Layout.setVerticalGroup(
            MAHbtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAHbtn1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MAHbtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MAHbtn2.setBackground(new java.awt.Color(1, 13, 54));
        MAHbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked1(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEntered1(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit1(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_paper_money_25px_1.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(165, 165, 165));
        jLabel9.setText("Check Balance");

        javax.swing.GroupLayout MAHbtn2Layout = new javax.swing.GroupLayout(MAHbtn2);
        MAHbtn2.setLayout(MAHbtn2Layout);
        MAHbtn2Layout.setHorizontalGroup(
            MAHbtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAHbtn2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MAHbtn2Layout.setVerticalGroup(
            MAHbtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAHbtn2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MAHbtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MAHbtn3.setBackground(new java.awt.Color(1, 13, 54));
        MAHbtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked1(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEntered1(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit1(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_donation_25px_2.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(165, 165, 165));
        jLabel11.setText("Deposit");

        javax.swing.GroupLayout MAHbtn3Layout = new javax.swing.GroupLayout(MAHbtn3);
        MAHbtn3.setLayout(MAHbtn3Layout);
        MAHbtn3Layout.setHorizontalGroup(
            MAHbtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAHbtn3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MAHbtn3Layout.setVerticalGroup(
            MAHbtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAHbtn3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MAHbtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MAHbtn4.setBackground(new java.awt.Color(1, 13, 54));
        MAHbtn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked1(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEntered1(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit1(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_cash_withdrawal_25px_1.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(165, 165, 165));
        jLabel13.setText("Withdraw");

        javax.swing.GroupLayout MAHbtn4Layout = new javax.swing.GroupLayout(MAHbtn4);
        MAHbtn4.setLayout(MAHbtn4Layout);
        MAHbtn4Layout.setHorizontalGroup(
            MAHbtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAHbtn4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MAHbtn4Layout.setVerticalGroup(
            MAHbtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAHbtn4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MAHbtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MAHbtn5.setBackground(new java.awt.Color(1, 13, 54));
        MAHbtn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked1(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEntered1(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit1(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_registration_25px_1.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(165, 165, 165));
        jLabel16.setText("Manage Holders");

        javax.swing.GroupLayout MAHbtn5Layout = new javax.swing.GroupLayout(MAHbtn5);
        MAHbtn5.setLayout(MAHbtn5Layout);
        MAHbtn5Layout.setHorizontalGroup(
            MAHbtn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAHbtn5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MAHbtn5Layout.setVerticalGroup(
            MAHbtn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAHbtn5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MAHbtn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MAHbtn6.setBackground(new java.awt.Color(1, 13, 54));
        MAHbtn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked1(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEntered1(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit1(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_add_user_group_man_man_25px.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(165, 165, 165));
        jLabel18.setText("Create Holders");

        javax.swing.GroupLayout MAHbtn6Layout = new javax.swing.GroupLayout(MAHbtn6);
        MAHbtn6.setLayout(MAHbtn6Layout);
        MAHbtn6Layout.setHorizontalGroup(
            MAHbtn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAHbtn6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MAHbtn6Layout.setVerticalGroup(
            MAHbtn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAHbtn6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MAHbtn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MAHbtn7.setBackground(new java.awt.Color(1, 13, 54));
        MAHbtn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked1(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEntered1(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit1(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_plus_math_25px.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(165, 165, 165));
        jLabel20.setText("Create Users");

        javax.swing.GroupLayout MAHbtn7Layout = new javax.swing.GroupLayout(MAHbtn7);
        MAHbtn7.setLayout(MAHbtn7Layout);
        MAHbtn7Layout.setHorizontalGroup(
            MAHbtn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAHbtn7Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MAHbtn7Layout.setVerticalGroup(
            MAHbtn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAHbtn7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MAHbtn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logoutBtn.setBackground(new java.awt.Color(1, 23, 64));
        logoutBtn.setToolTipText("Logout");
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutBtnMouseExited(evt);
            }
        });

        Logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_exit_25px.png"))); // NOI18N

        javax.swing.GroupLayout logoutBtnLayout = new javax.swing.GroupLayout(logoutBtn);
        logoutBtn.setLayout(logoutBtnLayout);
        logoutBtnLayout.setHorizontalGroup(
            logoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoutBtnLayout.setVerticalGroup(
            logoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutBtnLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MAHbtn8.setBackground(new java.awt.Color(1, 13, 54));
        MAHbtn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked1(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEntered1(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit1(evt);
            }
        });

        jLabel142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_data_transfer_25px.png"))); // NOI18N

        jLabel143.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(165, 165, 165));
        jLabel143.setText("Transfer");

        javax.swing.GroupLayout MAHbtn8Layout = new javax.swing.GroupLayout(MAHbtn8);
        MAHbtn8.setLayout(MAHbtn8Layout);
        MAHbtn8Layout.setHorizontalGroup(
            MAHbtn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAHbtn8Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel142)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel143)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MAHbtn8Layout.setVerticalGroup(
            MAHbtn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAHbtn8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MAHbtn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel142, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel143, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MAHbtn9.setBackground(new java.awt.Color(1, 13, 54));
        MAHbtn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked1(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEntered1(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit1(evt);
            }
        });

        jLabel173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_transaction_list_25px.png"))); // NOI18N

        jLabel174.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel174.setForeground(new java.awt.Color(165, 165, 165));
        jLabel174.setText("Transactions History");

        javax.swing.GroupLayout MAHbtn9Layout = new javax.swing.GroupLayout(MAHbtn9);
        MAHbtn9.setLayout(MAHbtn9Layout);
        MAHbtn9Layout.setHorizontalGroup(
            MAHbtn9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAHbtn9Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel173)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel174)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MAHbtn9Layout.setVerticalGroup(
            MAHbtn9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAHbtn9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MAHbtn9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel173, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel174, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lnfoBtn.setBackground(new java.awt.Color(1, 23, 64));
        lnfoBtn.setToolTipText("Help");
        lnfoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lnfoBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lnfoBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lnfoBtnMouseExited(evt);
            }
        });

        Logout1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_info_25px.png"))); // NOI18N

        javax.swing.GroupLayout lnfoBtnLayout = new javax.swing.GroupLayout(lnfoBtn);
        lnfoBtn.setLayout(lnfoBtnLayout);
        lnfoBtnLayout.setHorizontalGroup(
            lnfoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lnfoBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logout1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lnfoBtnLayout.setVerticalGroup(
            lnfoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lnfoBtnLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Logout1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout j1Layout = new javax.swing.GroupLayout(j1);
        j1.setLayout(j1Layout);
        j1Layout.setHorizontalGroup(
            j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAHbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MAHbtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MAHbtn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MAHbtn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MAHbtn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MAHbtn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MAHbtn7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MAHbtn8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MAHbtn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(j1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, j1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(21, 21, 21))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(j1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lnfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        j1Layout.setVerticalGroup(
            j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, j1Layout.createSequentialGroup()
                .addGroup(j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(j1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(j1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(MAHbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MAHbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MAHbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MAHbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MAHbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MAHbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MAHbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MAHbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MAHbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(lnfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(j1, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(new java.awt.Color(234, 240, 251));
        jPanel4.setLayout(new java.awt.CardLayout());

        Account_Holders.setBackground(new java.awt.Color(234, 240, 251));
        Account_Holders.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        searchBox.setBackground(new java.awt.Color(234, 240, 251));
        searchBox.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        searchBox.setToolTipText("Enter Account Number or Holder number or Name");
        searchBox.setBorder(null);
        searchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBoxKeyReleased(evt);
            }
        });

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_25px.png"))); // NOI18N

        searchBar.setBackground(new java.awt.Color(1, 23, 64));
        searchBar.setForeground(new java.awt.Color(1, 23, 64));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64), 2));

        viewTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        viewTable.setForeground(new java.awt.Color(1, 23, 64));
        viewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AccountNo", "HolderNo", "Name", "Address", "NIC", "BirthDay", "Email", "Age", "Gender", "Nationality", "PhoneNumber", "AccountType", "Date", "Time"
            }
        ));
        viewTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        viewTable.setFocusable(false);
        viewTable.setGridColor(new java.awt.Color(255, 255, 255));
        viewTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        viewTable.setRowHeight(25);
        viewTable.setSelectionBackground(new java.awt.Color(156, 190, 254));
        viewTable.setShowVerticalLines(false);
        viewTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(viewTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE))
        );

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

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_google_forms_25px.png"))); // NOI18N

        javax.swing.GroupLayout formBtnLayout = new javax.swing.GroupLayout(formBtn);
        formBtn.setLayout(formBtnLayout);
        formBtnLayout.setHorizontalGroup(
            formBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel83)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formBtnLayout.setVerticalGroup(
            formBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel83))
        );

        javax.swing.GroupLayout Account_HoldersLayout = new javax.swing.GroupLayout(Account_Holders);
        Account_Holders.setLayout(Account_HoldersLayout);
        Account_HoldersLayout.setHorizontalGroup(
            Account_HoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Account_HoldersLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(Account_HoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Account_HoldersLayout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(Account_HoldersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Account_HoldersLayout.setVerticalGroup(
            Account_HoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Account_HoldersLayout.createSequentialGroup()
                .addGroup(Account_HoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Account_HoldersLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(Account_HoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Account_HoldersLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(formBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(Account_Holders, "card8");

        Check_Balance.setBackground(new java.awt.Color(234, 240, 251));

        jPanel10.setBackground(new java.awt.Color(234, 240, 251));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64), 2));

        srch12.setBackground(new java.awt.Color(234, 240, 251));
        srch12.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        srch12.setToolTipText("enter Account Number");
        srch12.setBorder(null);
        srch12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                srch12KeyReleased(evt);
            }
        });

        jSeparator34.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator34.setForeground(new java.awt.Color(1, 23, 64));

        jPanel12.setBackground(new java.awt.Color(234, 240, 251));
        jPanel12.setToolTipText("Search Account No.");

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_25px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel118)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel118))
        );

        jPanel13.setBackground(new java.awt.Color(234, 240, 251));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64)));

        viewTabl3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        viewTabl3.setForeground(new java.awt.Color(1, 23, 64));
        viewTabl3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account_No", "Holder_No", "Name", "AccountType", "Balance"
            }
        ));
        jScrollPane3.setViewportView(viewTabl3);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(srch12)
                    .addComponent(jSeparator34, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(srch12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator34, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Check_BalanceLayout = new javax.swing.GroupLayout(Check_Balance);
        Check_Balance.setLayout(Check_BalanceLayout);
        Check_BalanceLayout.setHorizontalGroup(
            Check_BalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Check_BalanceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Check_BalanceLayout.setVerticalGroup(
            Check_BalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Check_BalanceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(Check_Balance, "card3");

        Deposit.setBackground(new java.awt.Color(234, 240, 251));

        jPanel8.setBackground(new java.awt.Color(234, 240, 251));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64), 2));

        jLabel101.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(1, 23, 64));
        jLabel101.setText("4. Available Balance");

        jSeparator27.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator27.setForeground(new java.awt.Color(1, 23, 64));

        jLabel87.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(1, 23, 64));
        jLabel87.setText("2. Holder No.");

        jSeparator26.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator26.setForeground(new java.awt.Color(1, 23, 64));

        jLabel86.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(1, 23, 64));
        jLabel86.setText("1. Account No.");

        accNo.setBackground(new java.awt.Color(234, 240, 251));
        accNo.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        accNo.setForeground(new java.awt.Color(1, 23, 64));
        accNo.setToolTipText("Enter account number");
        accNo.setBorder(null);

        jLabel88.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(1, 23, 64));
        jLabel88.setText("3. Name");

        deposit.setBackground(new java.awt.Color(234, 240, 251));
        deposit.setToolTipText("Deposit");
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

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_paycheque_30px_1.png"))); // NOI18N

        javax.swing.GroupLayout depositLayout = new javax.swing.GroupLayout(deposit);
        deposit.setLayout(depositLayout);
        depositLayout.setHorizontalGroup(
            depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, depositLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel103)
                .addContainerGap())
        );
        depositLayout.setVerticalGroup(
            depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, depositLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel103))
        );

        jSeparator25.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator25.setForeground(new java.awt.Color(1, 23, 64));

        jLabel91.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(1, 23, 64));
        jLabel91.setText("-:");

        hName.setEditable(false);
        hName.setBackground(new java.awt.Color(234, 240, 251));
        hName.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        hName.setForeground(new java.awt.Color(1, 23, 64));
        hName.setBorder(null);

        jLabel89.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(1, 23, 64));
        jLabel89.setText("-:");

        jLabel102.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(1, 23, 64));
        jLabel102.setText("-:");

        jLabel90.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(1, 23, 64));
        jLabel90.setText("-:");

        hNo.setEditable(false);
        hNo.setBackground(new java.awt.Color(234, 240, 251));
        hNo.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        hNo.setForeground(new java.awt.Color(1, 23, 64));
        hNo.setBorder(null);

        srch.setBackground(new java.awt.Color(234, 240, 251));
        srch.setToolTipText("");
        srch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                srchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                srchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                srchMouseExited(evt);
            }
        });

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_25px.png"))); // NOI18N

        javax.swing.GroupLayout srchLayout = new javax.swing.GroupLayout(srch);
        srch.setLayout(srchLayout);
        srchLayout.setHorizontalGroup(
            srchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(srchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel93)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        srchLayout.setVerticalGroup(
            srchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, srchLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel93))
        );

        balance.setEditable(false);
        balance.setBackground(new java.awt.Color(234, 240, 251));
        balance.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        balance.setForeground(new java.awt.Color(1, 23, 64));
        balance.setBorder(null);

        jSeparator19.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator19.setForeground(new java.awt.Color(1, 23, 64));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(1, 23, 64));
        jLabel66.setText("5. Deposit Amount");

        jLabel67.setText("-:");

        dAmount.setBackground(new java.awt.Color(234, 240, 251));
        dAmount.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        dAmount.setForeground(new java.awt.Color(1, 23, 64));
        dAmount.setBorder(null);

        ttl.setEditable(false);
        ttl.setBackground(new java.awt.Color(234, 240, 251));
        ttl.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        ttl.setForeground(new java.awt.Color(1, 23, 64));
        ttl.setBorder(null);

        jSeparator32.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator32.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator33.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator33.setForeground(new java.awt.Color(1, 23, 64));

        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(1, 23, 64));
        jLabel68.setText("User");

        jLabel81.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(1, 23, 64));
        jLabel81.setText("-:");

        user.setEditable(false);
        user.setBackground(new java.awt.Color(234, 240, 251));
        user.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        user.setForeground(new java.awt.Color(1, 23, 64));
        user.setBorder(null);

        jLabel109.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(1, 23, 64));
        jLabel109.setText("Date");

        jLabel110.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(1, 23, 64));
        jLabel110.setText("-:");

        date2.setEditable(false);
        date2.setBackground(new java.awt.Color(234, 240, 251));
        date2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        date2.setForeground(new java.awt.Color(1, 23, 64));
        date2.setBorder(null);

        jLabel111.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(1, 23, 64));
        jLabel111.setText("Time");

        jLabel112.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(1, 23, 64));
        jLabel112.setText("-:");

        time2.setEditable(false);
        time2.setBackground(new java.awt.Color(234, 240, 251));
        time2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        time2.setForeground(new java.awt.Color(1, 23, 64));
        time2.setBorder(null);

        jLabel92.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(1, 23, 64));
        jLabel92.setText("6. Total");

        jLabel113.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(1, 23, 64));
        jLabel113.setText("-:");

        calculate.setBackground(new java.awt.Color(234, 240, 251));
        calculate.setToolTipText("Total calculate");
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

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_add_new_25px.png"))); // NOI18N

        javax.swing.GroupLayout calculateLayout = new javax.swing.GroupLayout(calculate);
        calculate.setLayout(calculateLayout);
        calculateLayout.setHorizontalGroup(
            calculateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calculateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel114)
                .addContainerGap())
        );
        calculateLayout.setVerticalGroup(
            calculateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calculateLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel114))
        );

        DHstry.setBackground(new java.awt.Color(234, 240, 251));
        DHstry.setToolTipText("Depsoit History");
        DHstry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DHstryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DHstryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DHstryMouseExited(evt);
            }
        });

        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_payment_history_25px.png"))); // NOI18N

        javax.swing.GroupLayout DHstryLayout = new javax.swing.GroupLayout(DHstry);
        DHstry.setLayout(DHstryLayout);
        DHstryLayout.setHorizontalGroup(
            DHstryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DHstryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel119)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DHstryLayout.setVerticalGroup(
            DHstryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel119)
        );

        jLabel177.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel177.setForeground(new java.awt.Color(1, 23, 64));
        jLabel177.setText("Rs.");

        jLabel178.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel178.setForeground(new java.awt.Color(1, 23, 64));
        jLabel178.setText("Rs.");

        jLabel179.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel179.setForeground(new java.awt.Color(1, 23, 64));
        jLabel179.setText("Rs.");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel68)
                            .addComponent(jLabel109)
                            .addComponent(jLabel111)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel86)
                                    .addComponent(jLabel87)
                                    .addComponent(jLabel88))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel89)
                                    .addComponent(jLabel90)
                                    .addComponent(jLabel91))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator32)
                                    .addComponent(jSeparator19)
                                    .addComponent(jSeparator27)
                                    .addComponent(jSeparator26)
                                    .addComponent(jSeparator25)
                                    .addComponent(accNo)
                                    .addComponent(hNo)
                                    .addComponent(hName)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel178)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addComponent(jLabel113))
                                    .addComponent(jLabel92))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jSeparator33))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel177)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ttl, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel66)
                                    .addComponent(jLabel101))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel102)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel179))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel67)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(srch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 99, Short.MAX_VALUE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel112)
                        .addGap(18, 18, 18)
                        .addComponent(time2))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel110)
                        .addGap(18, 18, 18)
                        .addComponent(date2))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addGap(18, 18, 18)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(DHstry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(jLabel81)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel109)
                    .addComponent(jLabel110)
                    .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111)
                    .addComponent(jLabel112)
                    .addComponent(time2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(srch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel86)
                        .addComponent(jLabel89)
                        .addComponent(accNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(jLabel90)
                    .addComponent(hNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(jLabel91)
                    .addComponent(hName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel101)
                    .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel102)
                    .addComponent(jLabel179))
                .addGap(0, 0, 0)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel66)
                        .addComponent(jLabel67)
                        .addComponent(dAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel178))
                    .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator32, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel92)
                        .addComponent(jLabel113)
                        .addComponent(ttl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel177))
                    .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator33, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(DHstry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout DepositLayout = new javax.swing.GroupLayout(Deposit);
        Deposit.setLayout(DepositLayout);
        DepositLayout.setHorizontalGroup(
            DepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepositLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        DepositLayout.setVerticalGroup(
            DepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepositLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(Deposit, "card4");

        Withdrawal.setBackground(new java.awt.Color(234, 240, 251));

        jPanel6.setBackground(new java.awt.Color(234, 240, 251));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64), 2));

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
        accNo1.setToolTipText("Enter account number");
        accNo1.setBorder(null);

        jLabel123.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(1, 23, 64));
        jLabel123.setText("3. Name");

        deposit1.setBackground(new java.awt.Color(234, 240, 251));
        deposit1.setToolTipText("withdraw");
        deposit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deposit1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deposit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deposit1MouseExited(evt);
            }
        });

        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_paycheque_30px_1.png"))); // NOI18N

        javax.swing.GroupLayout deposit1Layout = new javax.swing.GroupLayout(deposit1);
        deposit1.setLayout(deposit1Layout);
        deposit1Layout.setHorizontalGroup(
            deposit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deposit1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel124)
                .addContainerGap())
        );
        deposit1Layout.setVerticalGroup(
            deposit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deposit1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel124))
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
        jLabel130.setText("5.Withdraw Amount");

        jLabel131.setText("-:");

        dAmount1.setBackground(new java.awt.Color(234, 240, 251));
        dAmount1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        dAmount1.setForeground(new java.awt.Color(1, 23, 64));
        dAmount1.setBorder(null);

        ttl1.setEditable(false);
        ttl1.setBackground(new java.awt.Color(234, 240, 251));
        ttl1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        ttl1.setForeground(new java.awt.Color(1, 23, 64));
        ttl1.setBorder(null);

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

        user1.setEditable(false);
        user1.setBackground(new java.awt.Color(234, 240, 251));
        user1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        user1.setForeground(new java.awt.Color(1, 23, 64));
        user1.setBorder(null);

        jLabel134.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(1, 23, 64));
        jLabel134.setText("Date");

        jLabel135.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(1, 23, 64));
        jLabel135.setText("-:");

        date33.setEditable(false);
        date33.setBackground(new java.awt.Color(234, 240, 251));
        date33.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        date33.setForeground(new java.awt.Color(1, 23, 64));
        date33.setBorder(null);

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
        calculate1.setToolTipText("Total calculate");
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

        WHstry.setBackground(new java.awt.Color(234, 240, 251));
        WHstry.setToolTipText("Transfer History");
        WHstry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WHstryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WHstryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WHstryMouseExited(evt);
            }
        });

        jLabel141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_payment_history_25px.png"))); // NOI18N

        javax.swing.GroupLayout WHstryLayout = new javax.swing.GroupLayout(WHstry);
        WHstry.setLayout(WHstryLayout);
        WHstryLayout.setHorizontalGroup(
            WHstryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WHstryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel141)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        WHstryLayout.setVerticalGroup(
            WHstryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel141)
        );

        jLabel180.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel180.setForeground(new java.awt.Color(1, 23, 64));
        jLabel180.setText("Rs.");

        jLabel181.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel181.setForeground(new java.awt.Color(1, 23, 64));
        jLabel181.setText("Rs.");

        jLabel182.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel182.setForeground(new java.awt.Color(1, 23, 64));
        jLabel182.setText("Rs.");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel132)
                            .addComponent(jLabel134)
                            .addComponent(jLabel136)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addComponent(jLabel139))
                                    .addComponent(jLabel138))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel182)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ttl1))
                                    .addComponent(jSeparator40)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel120)
                                    .addComponent(jLabel130))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel131))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel122)
                                            .addComponent(jLabel121)
                                            .addComponent(jLabel123))
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel126)
                                            .addComponent(jLabel128)
                                            .addComponent(jLabel125))
                                        .addGap(51, 51, 51))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addComponent(jLabel127)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator39)
                                    .addComponent(jSeparator38)
                                    .addComponent(jSeparator35)
                                    .addComponent(jSeparator36)
                                    .addComponent(jSeparator37)
                                    .addComponent(accNo1)
                                    .addComponent(hNo1)
                                    .addComponent(hName1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel180)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(balance1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel181)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dAmount1)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(srch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calculate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deposit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 99, Short.MAX_VALUE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel137)
                        .addGap(18, 18, 18)
                        .addComponent(time3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel135)
                        .addGap(18, 18, 18)
                        .addComponent(date33))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel133)
                        .addGap(18, 18, 18)
                        .addComponent(user1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(WHstry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel132)
                    .addComponent(jLabel133)
                    .addComponent(user1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel134)
                    .addComponent(jLabel135)
                    .addComponent(date33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel136)
                    .addComponent(jLabel137)
                    .addComponent(time3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(srch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel122)
                        .addComponent(jLabel126)
                        .addComponent(accNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator37, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel121)
                    .addComponent(jLabel128)
                    .addComponent(hNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator36, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel123)
                    .addComponent(jLabel125)
                    .addComponent(hName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator35, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel120)
                    .addComponent(jLabel127)
                    .addComponent(balance1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel180))
                .addGap(0, 0, 0)
                .addComponent(jSeparator38, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel130)
                        .addComponent(jLabel131)
                        .addComponent(dAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel181))
                    .addComponent(calculate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator39, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel138)
                            .addComponent(jLabel139)
                            .addComponent(ttl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel182))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator40, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deposit1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(WHstry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout WithdrawalLayout = new javax.swing.GroupLayout(Withdrawal);
        Withdrawal.setLayout(WithdrawalLayout);
        WithdrawalLayout.setHorizontalGroup(
            WithdrawalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WithdrawalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        WithdrawalLayout.setVerticalGroup(
            WithdrawalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WithdrawalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(Withdrawal, "card5");

        transfer.setBackground(new java.awt.Color(234, 240, 251));

        jPanel9.setBackground(new java.awt.Color(234, 240, 251));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64), 2));

        jLabel144.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel144.setForeground(new java.awt.Color(1, 23, 64));
        jLabel144.setText("4. Available Balance");

        jSeparator41.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator41.setForeground(new java.awt.Color(1, 23, 64));

        jLabel145.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(1, 23, 64));
        jLabel145.setText("2. Holder No.");

        jSeparator42.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator42.setForeground(new java.awt.Color(1, 23, 64));

        jLabel146.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(1, 23, 64));
        jLabel146.setText("1. Account No.");

        accNo2.setBackground(new java.awt.Color(234, 240, 251));
        accNo2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        accNo2.setForeground(new java.awt.Color(1, 23, 64));
        accNo2.setToolTipText("Enter Account number");
        accNo2.setBorder(null);

        jLabel147.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel147.setForeground(new java.awt.Color(1, 23, 64));
        jLabel147.setText("3. Name");

        save.setBackground(new java.awt.Color(234, 240, 251));
        save.setToolTipText("transfer");
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

        jLabel148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_paycheque_30px_1.png"))); // NOI18N

        javax.swing.GroupLayout saveLayout = new javax.swing.GroupLayout(save);
        save.setLayout(saveLayout);
        saveLayout.setHorizontalGroup(
            saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saveLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel148)
                .addContainerGap())
        );
        saveLayout.setVerticalGroup(
            saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel148)
        );

        jSeparator43.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator43.setForeground(new java.awt.Color(1, 23, 64));

        jLabel149.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(1, 23, 64));
        jLabel149.setText("-:");

        hName2.setEditable(false);
        hName2.setBackground(new java.awt.Color(234, 240, 251));
        hName2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        hName2.setForeground(new java.awt.Color(1, 23, 64));
        hName2.setBorder(null);

        jLabel150.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel150.setForeground(new java.awt.Color(1, 23, 64));
        jLabel150.setText("-:");

        jLabel151.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel151.setForeground(new java.awt.Color(1, 23, 64));
        jLabel151.setText("-:");

        jLabel152.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(1, 23, 64));
        jLabel152.setText("-:");

        hNo2.setEditable(false);
        hNo2.setBackground(new java.awt.Color(234, 240, 251));
        hNo2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        hNo2.setForeground(new java.awt.Color(1, 23, 64));
        hNo2.setBorder(null);

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

        jLabel153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_25px.png"))); // NOI18N

        javax.swing.GroupLayout srch2Layout = new javax.swing.GroupLayout(srch2);
        srch2.setLayout(srch2Layout);
        srch2Layout.setHorizontalGroup(
            srch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(srch2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel153)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        srch2Layout.setVerticalGroup(
            srch2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, srch2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel153))
        );

        balance2.setEditable(false);
        balance2.setBackground(new java.awt.Color(234, 240, 251));
        balance2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        balance2.setForeground(new java.awt.Color(1, 23, 64));
        balance2.setBorder(null);

        jSeparator44.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator44.setForeground(new java.awt.Color(1, 23, 64));

        jLabel154.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(1, 23, 64));
        jLabel154.setText("5.Transfer Amount");

        jLabel155.setText("-:");

        tAmount1.setBackground(new java.awt.Color(234, 240, 251));
        tAmount1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        tAmount1.setForeground(new java.awt.Color(1, 23, 64));
        tAmount1.setBorder(null);

        Attl1.setEditable(false);
        Attl1.setBackground(new java.awt.Color(234, 240, 251));
        Attl1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Attl1.setForeground(new java.awt.Color(1, 23, 64));
        Attl1.setBorder(null);

        jSeparator45.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator45.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator46.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator46.setForeground(new java.awt.Color(1, 23, 64));

        jLabel156.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel156.setForeground(new java.awt.Color(1, 23, 64));
        jLabel156.setText("User");

        jLabel157.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel157.setForeground(new java.awt.Color(1, 23, 64));
        jLabel157.setText("-:");

        jLabel158.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel158.setForeground(new java.awt.Color(1, 23, 64));
        jLabel158.setText("Date");

        jLabel159.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel159.setForeground(new java.awt.Color(1, 23, 64));
        jLabel159.setText("-:");

        date4.setEditable(false);
        date4.setBackground(new java.awt.Color(234, 240, 251));
        date4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        date4.setForeground(new java.awt.Color(1, 23, 64));
        date4.setBorder(null);

        jLabel160.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel160.setForeground(new java.awt.Color(1, 23, 64));
        jLabel160.setText("Time");

        jLabel161.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel161.setForeground(new java.awt.Color(1, 23, 64));
        jLabel161.setText("-:");

        time4.setEditable(false);
        time4.setBackground(new java.awt.Color(234, 240, 251));
        time4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        time4.setForeground(new java.awt.Color(1, 23, 64));
        time4.setBorder(null);

        jLabel162.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel162.setForeground(new java.awt.Color(1, 23, 64));
        jLabel162.setText("6. Total");

        jLabel163.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel163.setForeground(new java.awt.Color(1, 23, 64));
        jLabel163.setText("-:");

        calculate2.setBackground(new java.awt.Color(234, 240, 251));
        calculate2.setToolTipText("Total calculate");
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

        jLabel164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_reduce_25px.png"))); // NOI18N

        javax.swing.GroupLayout calculate2Layout = new javax.swing.GroupLayout(calculate2);
        calculate2.setLayout(calculate2Layout);
        calculate2Layout.setHorizontalGroup(
            calculate2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calculate2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel164)
                .addContainerGap())
        );
        calculate2Layout.setVerticalGroup(
            calculate2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calculate2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel164))
        );

        jLabel165.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel165.setForeground(new java.awt.Color(1, 23, 64));
        jLabel165.setText("7. Credit Account");

        cAccount.setBackground(new java.awt.Color(234, 240, 251));
        cAccount.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cAccount.setForeground(new java.awt.Color(1, 23, 64));
        cAccount.setToolTipText("enter credit holder's account number");
        cAccount.setBorder(null);

        jLabel166.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel166.setForeground(new java.awt.Color(1, 23, 64));
        jLabel166.setText("-:");

        jLabel167.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel167.setForeground(new java.awt.Color(1, 23, 64));
        jLabel167.setText("8. Balance");

        jLabel168.setText("-:");

        jSeparator47.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator47.setForeground(new java.awt.Color(1, 23, 64));

        cBalance.setEditable(false);
        cBalance.setBackground(new java.awt.Color(234, 240, 251));
        cBalance.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        cBalance.setForeground(new java.awt.Color(1, 23, 64));
        cBalance.setBorder(null);

        jLabel169.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel169.setForeground(new java.awt.Color(1, 23, 64));
        jLabel169.setText("9. Total");

        cTotoal.setEditable(false);
        cTotoal.setBackground(new java.awt.Color(234, 240, 251));
        cTotoal.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        cTotoal.setForeground(new java.awt.Color(1, 23, 64));
        cTotoal.setBorder(null);

        jLabel170.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel170.setForeground(new java.awt.Color(1, 23, 64));
        jLabel170.setText("-:");

        jSeparator48.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator48.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator49.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator49.setForeground(new java.awt.Color(1, 23, 64));

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

        jLabel171.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_25px.png"))); // NOI18N

        javax.swing.GroupLayout search22Layout = new javax.swing.GroupLayout(search22);
        search22.setLayout(search22Layout);
        search22Layout.setHorizontalGroup(
            search22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, search22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel171)
                .addGap(22, 22, 22))
        );
        search22Layout.setVerticalGroup(
            search22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, search22Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel171))
        );

        clcult.setBackground(new java.awt.Color(234, 240, 251));
        clcult.setToolTipText("Total calculate");
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

        jLabel172.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_add_new_25px.png"))); // NOI18N

        javax.swing.GroupLayout clcultLayout = new javax.swing.GroupLayout(clcult);
        clcult.setLayout(clcultLayout);
        clcultLayout.setHorizontalGroup(
            clcultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clcultLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel172)
                .addContainerGap())
        );
        clcultLayout.setVerticalGroup(
            clcultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clcultLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel172))
        );

        USER.setBackground(new java.awt.Color(234, 240, 251));
        USER.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        USER.setForeground(new java.awt.Color(1, 23, 64));
        USER.setBorder(null);

        THstry2.setBackground(new java.awt.Color(234, 240, 251));
        THstry2.setToolTipText("Transfer History");
        THstry2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                THstry2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                THstry2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                THstry2MouseExited(evt);
            }
        });

        jLabel176.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_payment_history_25px.png"))); // NOI18N

        javax.swing.GroupLayout THstry2Layout = new javax.swing.GroupLayout(THstry2);
        THstry2.setLayout(THstry2Layout);
        THstry2Layout.setHorizontalGroup(
            THstry2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(THstry2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel176)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        THstry2Layout.setVerticalGroup(
            THstry2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel176)
        );

        jLabel183.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel183.setForeground(new java.awt.Color(1, 23, 64));
        jLabel183.setText("Rs.");

        jLabel184.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel184.setForeground(new java.awt.Color(1, 23, 64));
        jLabel184.setText("Rs.");

        jLabel185.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel185.setForeground(new java.awt.Color(1, 23, 64));
        jLabel185.setText("Rs.");

        jLabel186.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel186.setForeground(new java.awt.Color(1, 23, 64));
        jLabel186.setText("Rs.");

        jLabel187.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel187.setForeground(new java.awt.Color(1, 23, 64));
        jLabel187.setText("Rs.");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(hName2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(srch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel156)
                            .addComponent(jLabel158)
                            .addComponent(jLabel160))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel161)
                                .addGap(18, 18, 18)
                                .addComponent(time4, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel159)
                                .addGap(18, 18, 18)
                                .addComponent(date4))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel157)
                                .addGap(18, 18, 18)
                                .addComponent(USER)))
                        .addContainerGap())
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(search22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel146)
                                                    .addComponent(jLabel145)
                                                    .addComponent(jLabel147))
                                                .addGap(43, 43, 43))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel165)
                                                    .addComponent(jLabel162)
                                                    .addComponent(jLabel167)
                                                    .addComponent(jLabel169))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel150)
                                            .addComponent(jLabel152)
                                            .addComponent(jLabel149)
                                            .addComponent(jLabel166)
                                            .addComponent(jLabel163)
                                            .addComponent(jLabel168)
                                            .addComponent(jLabel170))
                                        .addGap(52, 52, 52))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel155)
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel144)
                                                    .addComponent(jLabel154))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel151)))))
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator44)
                                    .addComponent(jSeparator41)
                                    .addComponent(jSeparator42)
                                    .addComponent(jSeparator43)
                                    .addComponent(accNo2)
                                    .addComponent(hNo2)
                                    .addComponent(jSeparator45)
                                    .addComponent(jSeparator46)
                                    .addComponent(jSeparator47)
                                    .addComponent(cAccount)
                                    .addComponent(jSeparator48)
                                    .addComponent(jSeparator49)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel183)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(balance2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel184)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel185)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Attl1))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel186)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cBalance))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel187)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cTotoal)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(calculate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clcult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(THstry2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel156)
                            .addComponent(jLabel157)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(USER, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel158)
                        .addComponent(jLabel159))
                    .addComponent(date4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel160)
                    .addComponent(jLabel161)
                    .addComponent(time4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(srch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel146)
                        .addComponent(jLabel150)
                        .addComponent(accNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator43, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel145)
                    .addComponent(jLabel152)
                    .addComponent(hNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator42, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hName2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel149)
                    .addComponent(jLabel147))
                .addGap(0, 0, 0)
                .addComponent(jSeparator41, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balance2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel151)
                    .addComponent(jLabel144)
                    .addComponent(jLabel183))
                .addGap(0, 0, 0)
                .addComponent(jSeparator44, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel154)
                    .addComponent(jLabel155)
                    .addComponent(jLabel184))
                .addGap(0, 0, 0)
                .addComponent(jSeparator45, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calculate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Attl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel166)
                        .addComponent(jLabel162)
                        .addComponent(jLabel185)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator46, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel163)
                        .addComponent(jLabel165))
                    .addComponent(search22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator47, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel168)
                    .addComponent(jLabel167)
                    .addComponent(jLabel186))
                .addGap(0, 0, 0)
                .addComponent(jSeparator48, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cTotoal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel170)
                        .addComponent(jLabel169)
                        .addComponent(jLabel187))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(clcult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparator49, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(THstry2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout transferLayout = new javax.swing.GroupLayout(transfer);
        transfer.setLayout(transferLayout);
        transferLayout.setHorizontalGroup(
            transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        transferLayout.setVerticalGroup(
            transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transferLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(transfer, "card9");

        transactions.setBackground(new java.awt.Color(234, 240, 251));

        jPanel11.setBackground(new java.awt.Color(234, 240, 251));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64), 2));

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

        jSeparator50.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator50.setForeground(new java.awt.Color(1, 23, 64));

        jPanel14.setBackground(new java.awt.Color(234, 240, 251));
        jPanel14.setToolTipText("");

        jLabel175.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_25px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel175)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel175))
        );

        jPanel15.setBackground(new java.awt.Color(234, 240, 251));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64)));

        transactionsTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        transactionsTable.setForeground(new java.awt.Color(1, 23, 64));
        transactionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account_No", "Holder_No", "Name", "AccountType", "Balance", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jScrollPane4.setViewportView(transactionsTable);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(srch13)
                    .addComponent(jSeparator50, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(srch13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator50, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout transactionsLayout = new javax.swing.GroupLayout(transactions);
        transactions.setLayout(transactionsLayout);
        transactionsLayout.setHorizontalGroup(
            transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        transactionsLayout.setVerticalGroup(
            transactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(transactions, "card10");

        Manage_Holders.setBackground(new java.awt.Color(234, 240, 251));

        jPanel7.setBackground(new java.awt.Color(234, 240, 251));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64), 2));

        AddressText2.setBackground(new java.awt.Color(234, 240, 251));
        AddressText2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        AddressText2.setForeground(new java.awt.Color(1, 23, 64));
        AddressText2.setBorder(null);
        AddressText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressText2ActionPerformed(evt);
            }
        });

        jSeparator5.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator5.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator15.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator15.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator17.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator17.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator18.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator18.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator20.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator20.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator21.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator21.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator22.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator22.setForeground(new java.awt.Color(1, 23, 64));

        srchBox2.setBackground(new java.awt.Color(234, 240, 251));
        srchBox2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        srchBox2.setForeground(new java.awt.Color(1, 23, 64));
        srchBox2.setToolTipText("Enter account number or name");
        srchBox2.setBorder(null);

        jSeparator24.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator24.setForeground(new java.awt.Color(1, 23, 64));

        srchBtn.setBackground(new java.awt.Color(234, 240, 251));
        srchBtn.setToolTipText("");
        srchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                srchBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                srchBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                srchBtnMouseExited(evt);
            }
        });

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_25px.png"))); // NOI18N

        javax.swing.GroupLayout srchBtnLayout = new javax.swing.GroupLayout(srchBtn);
        srchBtn.setLayout(srchBtnLayout);
        srchBtnLayout.setHorizontalGroup(
            srchBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, srchBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel82)
                .addContainerGap())
        );
        srchBtnLayout.setVerticalGroup(
            srchBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, srchBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel82))
        );

        idBox2.setEditable(false);
        idBox2.setBackground(new java.awt.Color(234, 240, 251));
        idBox2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        idBox2.setForeground(new java.awt.Color(1, 23, 64));
        idBox2.setBorder(null);

        AtypeBox.setEditable(false);
        AtypeBox.setBackground(new java.awt.Color(234, 240, 251));
        AtypeBox.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        AtypeBox.setForeground(new java.awt.Color(1, 23, 64));
        AtypeBox.setBorder(null);

        jSeparator23.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator23.setForeground(new java.awt.Color(1, 23, 64));

        deleteBtn2.setBackground(new java.awt.Color(234, 240, 251));
        deleteBtn2.setToolTipText("Delete");
        deleteBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtn2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateBtn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateBtn2MouseExited(evt);
            }
        });

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_delete_bin_25px_1.png"))); // NOI18N

        javax.swing.GroupLayout deleteBtn2Layout = new javax.swing.GroupLayout(deleteBtn2);
        deleteBtn2.setLayout(deleteBtn2Layout);
        deleteBtn2Layout.setHorizontalGroup(
            deleteBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteBtn2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deleteBtn2Layout.setVerticalGroup(
            deleteBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteBtn2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel59))
        );

        updateBtn2.setBackground(new java.awt.Color(234, 240, 251));
        updateBtn2.setToolTipText("Update");
        updateBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtn2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateBtn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateBtn2MouseExited(evt);
            }
        });

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_update_file_25px_1.png"))); // NOI18N

        javax.swing.GroupLayout updateBtn2Layout = new javax.swing.GroupLayout(updateBtn2);
        updateBtn2.setLayout(updateBtn2Layout);
        updateBtn2Layout.setHorizontalGroup(
            updateBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateBtn2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel84)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        updateBtn2Layout.setVerticalGroup(
            updateBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateBtn2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel84))
        );

        nameText2.setBackground(new java.awt.Color(234, 240, 251));
        nameText2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        nameText2.setForeground(new java.awt.Color(1, 23, 64));
        nameText2.setBorder(null);

        clearBtn3.setBackground(new java.awt.Color(234, 240, 251));
        clearBtn3.setToolTipText("Clear");
        clearBtn3.setPreferredSize(new java.awt.Dimension(63, 47));
        clearBtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBtn3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearBtn3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearBtn3MouseExited(evt);
            }
        });

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_erase_25px.png"))); // NOI18N

        javax.swing.GroupLayout clearBtn3Layout = new javax.swing.GroupLayout(clearBtn3);
        clearBtn3.setLayout(clearBtn3Layout);
        clearBtn3Layout.setHorizontalGroup(
            clearBtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clearBtn3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel85)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        clearBtn3Layout.setVerticalGroup(
            clearBtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clearBtn3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel85))
        );

        jLabel94.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(1, 23, 64));
        jLabel94.setText("-:");

        jLabel95.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(1, 23, 64));
        jLabel95.setText("-:");

        jLabel96.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel96.setText("-:");

        jLabel74.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(1, 23, 64));
        jLabel74.setText("1. Account no.");

        jLabel75.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(1, 23, 64));
        jLabel75.setText("3. Name");

        jLabel76.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(1, 23, 64));
        jLabel76.setText("4. Address");

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(1, 23, 64));
        jLabel60.setText("5. NIC");

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(1, 23, 64));
        jLabel61.setText("6. BirthDay ");

        jLabel80.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(1, 23, 64));
        jLabel80.setText("7. Email");

        jLabel97.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(1, 23, 64));
        jLabel97.setText("8. Age ");

        nicTxt2.setBackground(new java.awt.Color(234, 240, 251));
        nicTxt2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        nicTxt2.setForeground(new java.awt.Color(1, 23, 64));
        nicTxt2.setBorder(null);

        jLabel98.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(1, 23, 64));
        jLabel98.setText("-:");

        jLabel99.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(1, 23, 64));
        jLabel99.setText("-:");

        jLabel100.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(1, 23, 64));
        jLabel100.setText("-:");

        jLabel104.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(1, 23, 64));
        jLabel104.setText("-:");

        bDay2.setBackground(new java.awt.Color(234, 240, 251));
        bDay2.setForeground(new java.awt.Color(1, 23, 64));

        emailText2.setBackground(new java.awt.Color(234, 240, 251));
        emailText2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        emailText2.setForeground(new java.awt.Color(1, 23, 64));
        emailText2.setBorder(null);

        ageTxt2.setBackground(new java.awt.Color(234, 240, 251));
        ageTxt2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        ageTxt2.setForeground(new java.awt.Color(1, 23, 64));
        ageTxt2.setBorder(null);

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(1, 23, 64));
        jLabel62.setText("9. Gender ");

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(1, 23, 64));
        jLabel63.setText("10. Nationality ");

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(1, 23, 64));
        jLabel64.setText("11. Phone Number ");

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(1, 23, 64));
        jLabel65.setText("12. Account Type ");

        MaleRadio1.setBackground(new java.awt.Color(234, 240, 251));
        GenderGroup2.add(MaleRadio1);
        MaleRadio1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        MaleRadio1.setForeground(new java.awt.Color(1, 23, 64));
        MaleRadio1.setText("Male");
        MaleRadio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRadio1ActionPerformed(evt);
            }
        });

        FemaleRadio1.setBackground(new java.awt.Color(234, 240, 251));
        GenderGroup2.add(FemaleRadio1);
        FemaleRadio1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        FemaleRadio1.setForeground(new java.awt.Color(1, 23, 64));
        FemaleRadio1.setText("Female");

        phoneText2.setBackground(new java.awt.Color(234, 240, 251));
        phoneText2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        phoneText2.setForeground(new java.awt.Color(1, 23, 64));
        phoneText2.setBorder(null);

        nationalityText2.setBackground(new java.awt.Color(234, 240, 251));
        nationalityText2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        nationalityText2.setForeground(new java.awt.Color(1, 23, 64));
        nationalityText2.setBorder(null);

        jSeparator29.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator29.setForeground(new java.awt.Color(1, 23, 64));

        jLabel105.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel105.setText("-:");

        jLabel106.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel106.setText("-:");

        jLabel107.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel107.setText("-:");

        jLabel108.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(1, 23, 64));
        jLabel108.setText("-:");

        jSeparator16.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator16.setForeground(new java.awt.Color(1, 23, 64));

        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(1, 23, 64));
        jLabel70.setText("2. Holder no.");

        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(1, 23, 64));
        jLabel71.setText("-:");

        holderNo2.setBackground(new java.awt.Color(234, 240, 251));
        holderNo2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        holderNo2.setForeground(new java.awt.Color(1, 23, 64));
        holderNo2.setBorder(null);
        holderNo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                holderNo2ActionPerformed(evt);
            }
        });

        jSeparator31.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator31.setForeground(new java.awt.Color(1, 23, 64));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(srchBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(srchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel70)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel71))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel74)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(jLabel108))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel75)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel95))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel60)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel98))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel76)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel94))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel97)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel104))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel61)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel99))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel80)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel100)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator5)
                                    .addComponent(jSeparator17, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nameText2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator21)
                                    .addComponent(bDay2, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                    .addComponent(emailText2)
                                    .addComponent(jSeparator22)
                                    .addComponent(ageTxt2)
                                    .addComponent(idBox2)
                                    .addComponent(AddressText2)
                                    .addComponent(jSeparator18)
                                    .addComponent(nicTxt2)
                                    .addComponent(jSeparator20)
                                    .addComponent(jSeparator16)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator31, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(holderNo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel63)
                                                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(39, 39, 39)
                                            .addComponent(jLabel107))
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addComponent(jLabel65)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel96)))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel64)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel105))
                                    .addComponent(jLabel106))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(MaleRadio1)
                                        .addGap(18, 18, 18)
                                        .addComponent(FemaleRadio1))
                                    .addComponent(nationalityText2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(AtypeBox)
                                        .addComponent(jSeparator15)
                                        .addComponent(phoneText2)
                                        .addComponent(jSeparator29, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clearBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(38, 38, 38))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(srchBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(srchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74)
                    .addComponent(jLabel108))
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel70)
                            .addComponent(jLabel71)
                            .addComponent(holderNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator31, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(nameText2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel95))
                                        .addGap(1, 1, 1)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel75)))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AddressText2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel76)
                                    .addComponent(jLabel94))
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nicTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel98))
                                    .addComponent(jLabel60))
                                .addGap(10, 10, 10))
                            .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel61)
                                    .addComponent(jLabel99))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel80)
                                    .addComponent(jLabel100)
                                    .addComponent(emailText2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(bDay2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel104)
                            .addComponent(jLabel97))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(105, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(MaleRadio1)
                                    .addComponent(FemaleRadio1))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nationalityText2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel106)
                                    .addComponent(jLabel63))
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator29, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(phoneText2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel64)
                                    .addComponent(jLabel105))
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel62)
                                .addComponent(jLabel107)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AtypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel65)
                                .addComponent(jLabel96)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))))
        );

        javax.swing.GroupLayout Manage_HoldersLayout = new javax.swing.GroupLayout(Manage_Holders);
        Manage_Holders.setLayout(Manage_HoldersLayout);
        Manage_HoldersLayout.setHorizontalGroup(
            Manage_HoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Manage_HoldersLayout.setVerticalGroup(
            Manage_HoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Manage_HoldersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(Manage_Holders, "card6");

        Create_Holders.setBackground(new java.awt.Color(234, 240, 251));

        p6.setBackground(new java.awt.Color(234, 240, 251));
        p6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64), 2));

        AcntNoTxt.setEditable(false);
        AcntNoTxt.setBackground(new java.awt.Color(234, 240, 251));
        AcntNoTxt.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        AcntNoTxt.setForeground(new java.awt.Color(1, 23, 64));
        AcntNoTxt.setBorder(null);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(1, 23, 64));
        jLabel21.setText("3. Name ");

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(1, 23, 64));
        jLabel22.setText("4. Address ");

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(1, 23, 64));
        jLabel23.setText("5. NIC ");

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(1, 23, 64));
        jLabel24.setText("6. BirthDay ");

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(1, 23, 64));
        jLabel25.setText("7. Email");

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(1, 23, 64));
        jLabel26.setText("8. Age ");

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(1, 23, 64));
        jLabel27.setText("9. Gender ");

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(1, 23, 64));
        jLabel28.setText("10. Nationality ");

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(1, 23, 64));
        jLabel29.setText("11. Phone Number ");

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(1, 23, 64));
        jLabel30.setText("12. Account Type ");

        nicTxt.setBackground(new java.awt.Color(234, 240, 251));
        nicTxt.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        nicTxt.setForeground(new java.awt.Color(1, 23, 64));
        nicTxt.setBorder(null);

        AddressText.setBackground(new java.awt.Color(234, 240, 251));
        AddressText.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        AddressText.setForeground(new java.awt.Color(1, 23, 64));
        AddressText.setBorder(null);

        nameText.setBackground(new java.awt.Color(234, 240, 251));
        nameText.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        nameText.setForeground(new java.awt.Color(1, 23, 64));
        nameText.setBorder(null);

        emailText.setBackground(new java.awt.Color(234, 240, 251));
        emailText.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        emailText.setForeground(new java.awt.Color(1, 23, 64));
        emailText.setBorder(null);

        ageTxt.setBackground(new java.awt.Color(234, 240, 251));
        ageTxt.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        ageTxt.setForeground(new java.awt.Color(1, 23, 64));
        ageTxt.setBorder(null);
        ageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTxtActionPerformed(evt);
            }
        });

        nationalityText.setBackground(new java.awt.Color(234, 240, 251));
        nationalityText.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        nationalityText.setForeground(new java.awt.Color(1, 23, 64));
        nationalityText.setBorder(null);

        phoneText.setBackground(new java.awt.Color(234, 240, 251));
        phoneText.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        phoneText.setForeground(new java.awt.Color(1, 23, 64));
        phoneText.setBorder(null);

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(1, 23, 64));
        jLabel33.setText("-:");

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(1, 23, 64));
        jLabel34.setText("-:");

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(1, 23, 64));
        jLabel35.setText("-:");

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(1, 23, 64));
        jLabel37.setText("-:");

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(1, 23, 64));
        jLabel38.setText("-:");

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(1, 23, 64));
        jLabel39.setText("-:");

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(1, 23, 64));
        jLabel40.setText("-:");

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(1, 23, 64));
        jLabel41.setText("-:");

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(1, 23, 64));
        jLabel42.setText("-:");

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(1, 23, 64));
        jLabel43.setText("-:");

        jSeparator2.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator2.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator6.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator6.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator7.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator7.setForeground(new java.awt.Color(1, 23, 64));

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

        jSeparator14.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator14.setForeground(new java.awt.Color(1, 23, 64));

        acntType.setBackground(new java.awt.Color(234, 240, 251));
        acntType.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        acntType.setForeground(new java.awt.Color(1, 23, 64));
        acntType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Saving Account", "Current Account" }));
        acntType.setBorder(null);
        acntType.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                acntTypePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        MaleRadio.setBackground(new java.awt.Color(234, 240, 251));
        GenderGroup.add(MaleRadio);
        MaleRadio.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        MaleRadio.setForeground(new java.awt.Color(1, 23, 64));
        MaleRadio.setText("Male");
        MaleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRadioActionPerformed(evt);
            }
        });

        FemaleRadio.setBackground(new java.awt.Color(234, 240, 251));
        GenderGroup.add(FemaleRadio);
        FemaleRadio.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        FemaleRadio.setForeground(new java.awt.Color(1, 23, 64));
        FemaleRadio.setText("Female");

        saveBtn.setBackground(new java.awt.Color(234, 240, 251));
        saveBtn.setToolTipText("Add Holder");
        saveBtn.setPreferredSize(new java.awt.Dimension(45, 36));
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveBtnMouseExited(evt);
            }
        });

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_save_25px_3.png"))); // NOI18N

        javax.swing.GroupLayout saveBtnLayout = new javax.swing.GroupLayout(saveBtn);
        saveBtn.setLayout(saveBtnLayout);
        saveBtnLayout.setHorizontalGroup(
            saveBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saveBtnLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel57)
                .addContainerGap())
        );
        saveBtnLayout.setVerticalGroup(
            saveBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saveBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel57))
        );

        eraseBtn.setBackground(new java.awt.Color(234, 240, 251));
        eraseBtn.setToolTipText("Clear");
        eraseBtn.setPreferredSize(new java.awt.Dimension(45, 36));
        eraseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eraseBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eraseBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eraseBtnMouseExited(evt);
            }
        });

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_erase_25px.png"))); // NOI18N

        javax.swing.GroupLayout eraseBtnLayout = new javax.swing.GroupLayout(eraseBtn);
        eraseBtn.setLayout(eraseBtnLayout);
        eraseBtnLayout.setHorizontalGroup(
            eraseBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eraseBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addGap(15, 15, 15))
        );
        eraseBtnLayout.setVerticalGroup(
            eraseBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eraseBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel45))
        );

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(1, 23, 64));
        jLabel46.setText("1. Account No.");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 23, 64));
        jLabel1.setText("-:");

        bDay.setBackground(new java.awt.Color(234, 240, 251));
        bDay.setForeground(new java.awt.Color(1, 23, 64));

        jLabel69.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(1, 23, 64));
        jLabel69.setText("2. Holder No.");

        jLabel72.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel72.setText("-:");

        holderNo.setBackground(new java.awt.Color(234, 240, 251));
        holderNo.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        holderNo.setForeground(new java.awt.Color(1, 23, 64));
        holderNo.setText("H");
        holderNo.setBorder(null);

        jSeparator30.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator30.setForeground(new java.awt.Color(1, 23, 64));

        jLabel73.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(1, 23, 64));
        jLabel73.setText("14. Date");

        jLabel77.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(1, 23, 64));
        jLabel77.setText("-:");

        Createddate.setEditable(false);
        Createddate.setBackground(new java.awt.Color(234, 240, 251));
        Createddate.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        Createddate.setForeground(new java.awt.Color(1, 23, 64));
        Createddate.setBorder(null);

        jLabel78.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(1, 23, 64));
        jLabel78.setText("15. Time");

        jLabel79.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(1, 23, 64));
        jLabel79.setText("-:");

        autoTime.setEditable(false);
        autoTime.setBackground(new java.awt.Color(234, 240, 251));
        autoTime.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        autoTime.setForeground(new java.awt.Color(1, 23, 64));
        autoTime.setBorder(null);

        jLabel115.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(1, 23, 64));
        jLabel115.setText("13.  Amount");

        jLabel116.setText("-:");

        Aamount.setBackground(new java.awt.Color(234, 240, 251));
        Aamount.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        Aamount.setForeground(new java.awt.Color(1, 23, 64));
        Aamount.setBorder(null);

        jSeparator28.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator28.setForeground(new java.awt.Color(1, 23, 64));

        jLabel117.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(1, 23, 64));
        jLabel117.setText("Rs.");

        javax.swing.GroupLayout p6Layout = new javax.swing.GroupLayout(p6);
        p6.setLayout(p6Layout);
        p6Layout.setHorizontalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p6Layout.createSequentialGroup()
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p6Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel40))
                            .addGroup(p6Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel39))
                            .addGroup(p6Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel41))
                            .addGroup(p6Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(jLabel42))
                            .addGroup(p6Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel43))
                            .addGroup(p6Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)))
                        .addGap(10, 10, 10)
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bDay, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ageTxt)
                                .addComponent(AddressText)
                                .addComponent(nameText)
                                .addComponent(emailText)
                                .addComponent(nicTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p6Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(p6Layout.createSequentialGroup()
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel69))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(p6Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(10, 10, 10)
                                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AcntNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(p6Layout.createSequentialGroup()
                                .addComponent(jLabel72)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator30)
                                    .addComponent(holderNo))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p6Layout.createSequentialGroup()
                        .addComponent(eraseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p6Layout.createSequentialGroup()
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p6Layout.createSequentialGroup()
                                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(p6Layout.createSequentialGroup()
                                        .addComponent(jLabel73)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel77))
                                    .addGroup(p6Layout.createSequentialGroup()
                                        .addComponent(jLabel78)
                                        .addGap(70, 70, 70)
                                        .addComponent(jLabel79))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p6Layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel33))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p6Layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel37))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p6Layout.createSequentialGroup()
                                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel28)
                                            .addComponent(jLabel27))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(18, 18, 18))
                            .addGroup(p6Layout.createSequentialGroup()
                                .addComponent(jLabel115)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel116)
                                .addGap(20, 20, 20)))
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator6)
                            .addComponent(jSeparator7)
                            .addComponent(acntType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phoneText)
                            .addComponent(nationalityText)
                            .addComponent(autoTime)
                            .addGroup(p6Layout.createSequentialGroup()
                                .addComponent(MaleRadio)
                                .addGap(30, 30, 30)
                                .addComponent(FemaleRadio))
                            .addComponent(Createddate)
                            .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p6Layout.createSequentialGroup()
                                .addComponent(jLabel117)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Aamount, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47))))
        );
        p6Layout.setVerticalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35)
                        .addComponent(MaleRadio)
                        .addComponent(FemaleRadio)
                        .addComponent(jLabel27))
                    .addGroup(p6Layout.createSequentialGroup()
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AcntNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38)
                            .addComponent(jLabel46))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p6Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel69)
                            .addComponent(jLabel72)
                            .addComponent(holderNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(p6Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nationalityText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))))
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator30, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p6Layout.createSequentialGroup()
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel33))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(acntType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eraseBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(p6Layout.createSequentialGroup()
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel39))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel40))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(p6Layout.createSequentialGroup()
                                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nicTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel115)
                                    .addComponent(jLabel116)
                                    .addComponent(Aamount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel117))
                                .addGap(0, 0, 0)
                                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(p6Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel42)
                                            .addComponent(jLabel24)))
                                    .addGroup(p6Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel73)
                                                .addComponent(jLabel77)
                                                .addComponent(Createddate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(bDay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(autoTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel79)
                                    .addComponent(jLabel78)))
                            .addGroup(p6Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jLabel25)))
                        .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel43))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(57, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout Create_HoldersLayout = new javax.swing.GroupLayout(Create_Holders);
        Create_Holders.setLayout(Create_HoldersLayout);
        Create_HoldersLayout.setHorizontalGroup(
            Create_HoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Create_HoldersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Create_HoldersLayout.setVerticalGroup(
            Create_HoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Create_HoldersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(Create_Holders, "card2");

        Create_Users.setBackground(new java.awt.Color(234, 240, 251));
        Create_Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Create_UsersMouseClicked(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(1, 13, 54));
        jLabel32.setText("Username");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(1, 13, 54));
        jLabel36.setText("Password");

        username.setBackground(new java.awt.Color(234, 240, 251));
        username.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        username.setForeground(new java.awt.Color(1, 23, 64));
        username.setBorder(null);

        password.setBackground(new java.awt.Color(234, 240, 251));
        password.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        password.setForeground(new java.awt.Color(1, 23, 64));
        password.setBorder(null);

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(1, 13, 54));
        jLabel47.setText("UserType");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel48.setText("-:");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel49.setText("-:");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel50.setText("-:");

        jSeparator3.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator3.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator4.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator4.setForeground(new java.awt.Color(1, 23, 64));

        jPanel5.setBackground(new java.awt.Color(234, 240, 251));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64), 2));

        viewTabl2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        viewTabl2.setForeground(new java.awt.Color(1, 23, 64));
        viewTabl2.setModel(new javax.swing.table.DefaultTableModel(
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
        viewTabl2.setFocusable(false);
        viewTabl2.setGridColor(new java.awt.Color(255, 255, 255));
        viewTabl2.setIntercellSpacing(new java.awt.Dimension(0, 0));
        viewTabl2.setRowHeight(25);
        viewTabl2.setSelectionBackground(new java.awt.Color(156, 190, 254));
        viewTabl2.setShowVerticalLines(false);
        viewTabl2.getTableHeader().setReorderingAllowed(false);
        viewTabl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewTabl2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(viewTabl2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        searchBox2.setBackground(new java.awt.Color(234, 240, 251));
        searchBox2.setToolTipText("Enter Id or UserType");
        searchBox2.setBorder(null);
        searchBox2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBox2KeyReleased(evt);
            }
        });

        jSeparator8.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator8.setForeground(new java.awt.Color(1, 23, 64));

        editBtn.setBackground(new java.awt.Color(234, 240, 251));
        editBtn.setToolTipText("Update");
        editBtn.setPreferredSize(new java.awt.Dimension(45, 38));
        editBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEentered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
        });

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_update_file_25px_1.png"))); // NOI18N

        javax.swing.GroupLayout editBtnLayout = new javax.swing.GroupLayout(editBtn);
        editBtn.setLayout(editBtnLayout);
        editBtnLayout.setHorizontalGroup(
            editBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel52)
                .addContainerGap())
        );
        editBtnLayout.setVerticalGroup(
            editBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel52))
        );

        deleteBtn.setBackground(new java.awt.Color(234, 240, 251));
        deleteBtn.setToolTipText("Delete");
        deleteBtn.setPreferredSize(new java.awt.Dimension(45, 38));
        deleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEentered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
        });

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_delete_bin_25px_1.png"))); // NOI18N

        javax.swing.GroupLayout deleteBtnLayout = new javax.swing.GroupLayout(deleteBtn);
        deleteBtn.setLayout(deleteBtnLayout);
        deleteBtnLayout.setHorizontalGroup(
            deleteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel53)
                .addContainerGap())
        );
        deleteBtnLayout.setVerticalGroup(
            deleteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel53))
        );

        saveBtn2.setBackground(new java.awt.Color(234, 240, 251));
        saveBtn2.setToolTipText("Add");
        saveBtn2.setPreferredSize(new java.awt.Dimension(45, 38));
        saveBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBtn2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEentered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
        });

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_save_25px_1.png"))); // NOI18N

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_add_user_male_25px.png"))); // NOI18N

        javax.swing.GroupLayout saveBtn2Layout = new javax.swing.GroupLayout(saveBtn2);
        saveBtn2.setLayout(saveBtn2Layout);
        saveBtn2Layout.setHorizontalGroup(
            saveBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saveBtn2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(saveBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        saveBtn2Layout.setVerticalGroup(
            saveBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saveBtn2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54))
        );

        usertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cashier", "Manager" }));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(1, 13, 54));
        jLabel55.setText("ID");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(1, 13, 54));
        jLabel56.setText("-:");

        idBox.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        idBox.setForeground(new java.awt.Color(1, 13, 54));
        idBox.setText("id");

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_25px.png"))); // NOI18N

        eraseBtn2.setBackground(new java.awt.Color(234, 240, 251));
        eraseBtn2.setToolTipText("Clear");
        eraseBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eraseBtn2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eraseBtn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eraseBtn2MouseExited(evt);
            }
        });

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_erase_25px.png"))); // NOI18N

        javax.swing.GroupLayout eraseBtn2Layout = new javax.swing.GroupLayout(eraseBtn2);
        eraseBtn2.setLayout(eraseBtn2Layout);
        eraseBtn2Layout.setHorizontalGroup(
            eraseBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eraseBtn2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addContainerGap())
        );
        eraseBtn2Layout.setVerticalGroup(
            eraseBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eraseBtn2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel44))
        );

        javax.swing.GroupLayout Create_UsersLayout = new javax.swing.GroupLayout(Create_Users);
        Create_Users.setLayout(Create_UsersLayout);
        Create_UsersLayout.setHorizontalGroup(
            Create_UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Create_UsersLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Create_UsersLayout.createSequentialGroup()
                .addGroup(Create_UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Create_UsersLayout.createSequentialGroup()
                        .addGroup(Create_UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Create_UsersLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(Create_UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(Create_UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel32)
                                        .addComponent(jLabel36)
                                        .addComponent(jLabel55))
                                    .addComponent(jLabel47))
                                .addGap(26, 26, 26)
                                .addGroup(Create_UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel50)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabel49)
                                    .addComponent(jLabel56))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(Create_UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Create_UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator3)
                                        .addComponent(jSeparator4)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usertype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(idBox))
                                .addGap(284, 284, 284))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Create_UsersLayout.createSequentialGroup()
                                .addContainerGap(635, Short.MAX_VALUE)
                                .addComponent(eraseBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Create_UsersLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Create_UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator8)
                            .addComponent(searchBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel51)
                .addGap(32, 32, 32))
        );
        Create_UsersLayout.setVerticalGroup(
            Create_UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Create_UsersLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(Create_UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51))
                .addGap(2, 2, 2)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(Create_UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idBox)
                    .addComponent(jLabel56)
                    .addComponent(jLabel55))
                .addGap(37, 37, 37)
                .addGroup(Create_UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel32))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(Create_UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel36))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(Create_UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Create_UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel47)
                        .addComponent(jLabel50))
                    .addComponent(usertype, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(Create_UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Create_UsersLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(saveBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Create_UsersLayout.createSequentialGroup()
                        .addGroup(Create_UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eraseBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );

        jPanel4.add(Create_Users, "card7");

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

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

    private void mouseclicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseclicked1
        if(evt.getSource()==MAHbtn1){                       // When click open relevant panels from menu buttons 
            Account_Holders.setVisible(true);
            Create_Holders.setVisible(false);
            Check_Balance.setVisible(false);
            Deposit.setVisible(false);
            Withdrawal.setVisible(false);
            Create_Users.setVisible(false);
            Manage_Holders.setVisible(false);
            transfer.setVisible(false);
            transactions.setVisible(false);
        }
         if(evt.getSource()==MAHbtn6){
            Account_Holders.setVisible(false);
            Create_Holders.setVisible(true);
            autoGenerator();
            autoDate();
            autoTime();
            holderNo.setText("H");
            Check_Balance.setVisible(false);
            Deposit.setVisible(false);
            Withdrawal.setVisible(false);
            Create_Users.setVisible(false);
            Manage_Holders.setVisible(false);
            transfer.setVisible(false);
            transactions.setVisible(false);
        }
          if(evt.getSource()==MAHbtn2){
            Account_Holders.setVisible(false);
            Create_Holders.setVisible(false);
            Check_Balance.setVisible(true);
            Deposit.setVisible(false);
            Withdrawal.setVisible(false);
            Create_Users.setVisible(false);
            Manage_Holders.setVisible(false);
            transfer.setVisible(false);
            transactions.setVisible(false);
        }
           if(evt.getSource()==MAHbtn3){
            Account_Holders.setVisible(false);
            Create_Holders.setVisible(false);
            Check_Balance.setVisible(false);
            Deposit.setVisible(true);
            autoDate();
            autoTime();
            Withdrawal.setVisible(false);
            Create_Users.setVisible(false);
            Manage_Holders.setVisible(false);
            transfer.setVisible(false);
            transactions.setVisible(false);
        }
            if(evt.getSource()==MAHbtn4){
            Account_Holders.setVisible(false);
            Create_Holders.setVisible(false);
            Check_Balance.setVisible(false);
            Deposit.setVisible(false);
            Withdrawal.setVisible(true);
            autoDate();
            autoTime();
            Create_Users.setVisible(false);
            Manage_Holders.setVisible(false);
            transfer.setVisible(false);
            transactions.setVisible(false);
        }
             if(evt.getSource()==MAHbtn7){
            Account_Holders.setVisible(false);
            Create_Holders.setVisible(false);
            Check_Balance.setVisible(false);
            Deposit.setVisible(false);
            Withdrawal.setVisible(false);
            Create_Users.setVisible(true);
            Manage_Holders.setVisible(false);
            transfer.setVisible(false);
            transactions.setVisible(false);
        }
              if(evt.getSource()==MAHbtn5){
            Account_Holders.setVisible(false);
            Create_Holders.setVisible(false);
            Check_Balance.setVisible(false);
            Deposit.setVisible(false);
            Withdrawal.setVisible(false);
            Create_Users.setVisible(false);
            Manage_Holders.setVisible(true);
            transfer.setVisible(false);
            transactions.setVisible(false);
        }
              if(evt.getSource()==MAHbtn8){
            Account_Holders.setVisible(false);
            Create_Holders.setVisible(false);
            Check_Balance.setVisible(false);
            Deposit.setVisible(false);
            Withdrawal.setVisible(false);
            Create_Users.setVisible(false);
            Manage_Holders.setVisible(false);
            transfer.setVisible(true);
            autoDate();
            autoTime();
            transactions.setVisible(false);
        }
        if(evt.getSource()==MAHbtn9){
            Account_Holders.setVisible(false);
            Create_Holders.setVisible(false);
            Check_Balance.setVisible(false);
            Deposit.setVisible(false);
            Withdrawal.setVisible(false);
            Create_Users.setVisible(false);
            Manage_Holders.setVisible(false);
            transfer.setVisible(false);
            transactions.setVisible(true);
        }
    }//GEN-LAST:event_mouseclicked1

   
    
    public void autoGenerator(){                //auto genarate account numbers and holder numbers
        Random r1 = new Random();
            //holderNo.setText("H"+r1.nextInt(10000+1));
            AcntNoTxt.setText(""+r1.nextInt(1000000000+1));
    }
    
    
    private void mouseEntered1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEntered1
        if(evt.getSource()==MAHbtn1){                                //colour changes for  menu btns
            MAHbtn1.setBackground(new java.awt.Color(52, 68, 95)); 
        }
        if(evt.getSource()==MAHbtn2){
            MAHbtn2.setBackground(new java.awt.Color(52, 68, 95)); 
        }
        if(evt.getSource()==MAHbtn3){
            MAHbtn3.setBackground(new java.awt.Color(52, 68, 95)); 
        }
        if(evt.getSource()==MAHbtn4){
            MAHbtn4.setBackground(new java.awt.Color(52, 68, 95));   
        }
        if(evt.getSource()==MAHbtn5){
            MAHbtn5.setBackground(new java.awt.Color(52, 68, 95)); 
        }
        if(evt.getSource()==MAHbtn6){
            MAHbtn6.setBackground(new java.awt.Color(52, 68, 95)); 
        }
        if(evt.getSource()==MAHbtn7){
            MAHbtn7.setBackground(new java.awt.Color(52, 68, 95)); 
        }
        if(evt.getSource()==MAHbtn8){
            MAHbtn8.setBackground(new java.awt.Color(52, 68, 95)); 
        }
        if(evt.getSource()==MAHbtn9){
            MAHbtn9.setBackground(new java.awt.Color(52, 68, 95)); 
        }
    }//GEN-LAST:event_mouseEntered1

    private void mouseExit1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExit1
        if(evt.getSource()==MAHbtn1){                                //colour changes for  menu btns
            MAHbtn1.setBackground(new java.awt.Color(1,13,54)); 
        }
        if(evt.getSource()==MAHbtn2){
            MAHbtn2.setBackground(new java.awt.Color(1,13,54)); 
        }
        if(evt.getSource()==MAHbtn3){
            MAHbtn3.setBackground(new java.awt.Color(1,13,54)); 
        }
        if(evt.getSource()==MAHbtn4){
            MAHbtn4.setBackground(new java.awt.Color(1,13,54));   
        }
        if(evt.getSource()==MAHbtn5){
            MAHbtn5.setBackground(new java.awt.Color(1,13,54)); 
        }
        if(evt.getSource()==MAHbtn6){
            MAHbtn6.setBackground(new java.awt.Color(1,13,54)); 
        }
        if(evt.getSource()==MAHbtn7){
            MAHbtn7.setBackground(new java.awt.Color(1,13,54)); 
        }
        if(evt.getSource()==MAHbtn8){
            MAHbtn8.setBackground(new java.awt.Color(1,13,54)); 
        }
        if(evt.getSource()==MAHbtn9){
            MAHbtn9.setBackground(new java.awt.Color(1,13,54)); 
        }
    }//GEN-LAST:event_mouseExit1

    public void LogoutVerifing (){      //  back to the Login panel
        int check = JOptionPane.showConfirmDialog(null,"Are you sure you want Logout?");
        
        if (check == 0){
           
            Login l1 = new Login();             
        l1.setVisible(true);
        this.setVisible(false);
        }
           // tableload2();
    }
    
    private void logoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseEntered
        if(evt.getSource()==logoutBtn){
            logoutBtn.setBackground(new java.awt.Color(52, 68, 95));
        }
    }//GEN-LAST:event_logoutBtnMouseEntered

    private void logoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseExited
        if(evt.getSource()==logoutBtn){
            logoutBtn.setBackground(new java.awt.Color(1,23,64));
        }
    }//GEN-LAST:event_logoutBtnMouseExited

    private void eraseBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eraseBtnMouseExited
        if(evt.getSource()==eraseBtn){
            eraseBtn.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_eraseBtnMouseExited

    private void eraseBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eraseBtnMouseEntered
        if(evt.getSource()==eraseBtn){
            eraseBtn.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_eraseBtnMouseEntered

    private void eraseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eraseBtnMouseClicked
        erase();
        autoGenerator();
        holderNo.setText("H");
    }//GEN-LAST:event_eraseBtnMouseClicked

    private void saveBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseExited
        if(evt.getSource()==saveBtn){
            saveBtn.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_saveBtnMouseExited

    private void saveBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseEntered
        if(evt.getSource()==saveBtn){
            saveBtn.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_saveBtnMouseEntered

    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
        CreateHolder();
        holderNo.setText("H");
    }//GEN-LAST:event_saveBtnMouseClicked

    public void CreateHolder(){             //created holder details and insert into database
        try {

            // conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system_asel","root","");
            String sql = "insert into account_holders  values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            
           pst.setInt(1, Integer.parseInt(AcntNoTxt.getText()));
            
           
            pst.setString(2,holderNo.getText());
            pst.setString(3,nameText.getText());
            pst.setString(4,AddressText.getText());
            pst.setString(5,nicTxt.getText());
            
            

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(bDay.getDate());
            pst.setString(6, date);
            

            pst.setString(7, emailText.getText());
            pst.setInt(8, Integer.parseInt(ageTxt.getText()));

            String gen;
            if(MaleRadio.isSelected()){
                gen = MaleRadio.getText();
                pst.setString(9, gen);
            }
            if(FemaleRadio.isSelected()){
                gen = FemaleRadio.getText();
                pst.setString(9, gen);
            }

            pst.setString(10, nationalityText.getText());
            pst.setInt(11, Integer.parseInt(phoneText.getText()));

            if(acntType.getSelectedIndex()==1){
                
            String type;
            type = acntType.getSelectedItem().toString();
            pst.setString(12, type);      
                }
            else if(acntType.getSelectedIndex()==2){
                
                    String type;
            type = acntType.getSelectedItem().toString();
            pst.setString(12, type);
                    
                }
            
            else{
                
                    JOptionPane.showMessageDialog(null, "Account type is Wrong!");
                    
                }  
           float amnt = Float.parseFloat(Aamount.getText());
            if(amnt >=3000){
                pst.setFloat(13, amnt);
            }
            else{
                JOptionPane.showMessageDialog(null, "Minimum Deposit is Rs.3000");
            }

            pst.setString(14,Createddate.getText());
            pst.setString(15,autoTime.getText());
            
            pst.executeUpdate();
            NewUserDeposit();
            newUserDepositToTransaction();
            
            tableload();
            erase();  //erase textfields
            
            JOptionPane.showMessageDialog(null,"Successfully Inserted!");
            autoGenerator();
            
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void NewUserDeposit(){
        try {
             String sql = "insert into deposit values (?,?,?,?,?,'manager',?,?)";
            pst = conn.prepareStatement(sql);
            
           pst.setInt(1, Integer.parseInt(AcntNoTxt.getText()));
            pst.setString(2,holderNo.getText());
            pst.setString(3,nameText.getText());
            pst.setString(4,Aamount.getText());
            pst.setString(5,Aamount.getText());
            
            pst.setString(6,Createddate.getText());
            pst.setString(7,autoTime.getText());
           
            pst.executeUpdate();
            BalanceCheck_tableload();
            
           // JOptionPane.showMessageDialog(null,"Successfully Deposited!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void newUserDepositToTransaction(){
        String aNo = AcntNoTxt.getText();
        String hNo = holderNo.getText();
        String name = nameText.getText();
        String amount = Aamount.getText();
        String ttl = Aamount.getText();
        //String user = username.getText();
        String Ddate = Createddate.getText();
        String tTime = autoTime.getText();
        
       try {
             String sql = "insert into transactions (Bank_No, A_Hnumber, A_Name, "
                     + " A_Withdraw_Aamount, A_Diposit_Amount,"
                     + " A_Balance, A_User, A_date, A_time) values ('"+aNo+"','"+hNo+"','"+name+"',0,"
                     + "'"+amount+"','"+ttl+"','user','"+Ddate+"','"+tTime+"')";
            pst = conn.prepareStatement(sql);

            pst.executeUpdate();
            transactionsTableLoad();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
        
    
    public void autoDate(){ //auto date genarate
        Date d1 = new Date();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       Createddate.setText(sdf.format(d1));
       date2.setText(sdf.format(d1));
       date33.setText(sdf.format(d1));
       date4.setText(sdf.format(d1));
       
    }
    
        
    public void autoTime(){    // auto time generate
        
        
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d1 = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
                    autoTime.setText(sdf.format(d1));
                    time2.setText(sdf.format(d1));
                    time3.setText(sdf.format(d1));
                    time4.setText(sdf.format(d1));
            }
        }).start();
        
        
    }
    
    
    private void MaleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleRadioActionPerformed

    private void ageTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTxtActionPerformed

    private void searchBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBoxKeyReleased
        ViewDetailssearch();
    }//GEN-LAST:event_searchBoxKeyReleased

    private void mouseEentered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEentered
        if(evt.getSource()==saveBtn2){          // buttons color changers
            saveBtn2.setBackground(new java.awt.Color(156, 190, 254));
        }
        if(evt.getSource()==deleteBtn){
            deleteBtn.setBackground(new java.awt.Color(156, 190, 254));
        }
        if(evt.getSource()==editBtn){
            editBtn.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_mouseEentered

    private void mouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExit
        if(evt.getSource()==saveBtn2){      // buttons color changers
            saveBtn2.setBackground(new java.awt.Color(234, 240, 251));
        }
        if(evt.getSource()==deleteBtn){
            deleteBtn.setBackground(new java.awt.Color(234, 240, 251));
        }if(evt.getSource()==editBtn){
            editBtn.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_mouseExit

    private void searchBox2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBox2KeyReleased
        search2();
    }//GEN-LAST:event_searchBox2KeyReleased

    private void saveBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtn2MouseClicked
        UserInsert();
    }//GEN-LAST:event_saveBtn2MouseClicked
public void UserInsert(){           //user values store into database
    String uname, pword, utype;
        
        uname = username.getText();
        pword = password.getText();
        utype = usertype.getSelectedItem().toString();
        
        
        
        try {
            String sql = "insert into user_type (D_Username, d_Password, D_UserType)"
                    + " values ('"+uname+"','"+pword+"','"+utype+"')";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"data inserted!");
            erase2();
            tableload2();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
}
    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
     UserDelete ();
    }//GEN-LAST:event_deleteBtnMouseClicked

    public void UserDelete (){          // to delete user details from the database
        int check = JOptionPane.showConfirmDialog(null,"Are you sure you want delete?");
        
        if (check == 0){
           
            String id = idBox.getText();
            
            try {
                String sql = "delete from user_type where D_id = '"+id+"'";
                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
                erase2();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
            tableload2();
    }
    
    private void Create_UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Create_UsersMouseClicked
        
    }//GEN-LAST:event_Create_UsersMouseClicked

    private void editBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseClicked
        update2();
        tableload2();
    }//GEN-LAST:event_editBtnMouseClicked

    private void viewTabl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewTabl2MouseClicked
        tableData();
    }//GEN-LAST:event_viewTabl2MouseClicked

    private void eraseBtn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eraseBtn2MouseEntered
        if(evt.getSource()==eraseBtn2){
            eraseBtn2.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_eraseBtn2MouseEntered

    private void eraseBtn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eraseBtn2MouseExited
        if(evt.getSource()==eraseBtn2){
            eraseBtn2.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_eraseBtn2MouseExited

    private void eraseBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eraseBtn2MouseClicked
        erase2();
    }//GEN-LAST:event_eraseBtn2MouseClicked

    private void restoreDownBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restoreDownBtnMouseClicked
        if(this.getExtendedState()!= Manager.MAXIMIZED_BOTH){       //to restoredown the system
            this.setExtendedState(Manager.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(Manager.NORMAL);
        }
    }//GEN-LAST:event_restoreDownBtnMouseClicked

    private void minimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseClicked
        this.setExtendedState(Manager.ICONIFIED);       //to minimize the system
    }//GEN-LAST:event_minimizeBtnMouseClicked

    private void formBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formBtnMouseClicked
        Cashier_AccountHolders c1 = new Cashier_AccountHolders();
        c1.setVisible(true);
    }//GEN-LAST:event_formBtnMouseClicked

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

    private void updateBtn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtn2MouseExited
        if(evt.getSource()==deleteBtn2){
            deleteBtn2.setBackground(new java.awt.Color(234, 240, 251));
        }
        if(evt.getSource()==updateBtn2){
            updateBtn2.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_updateBtn2MouseExited

    private void updateBtn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtn2MouseEntered
        if(evt.getSource()==deleteBtn2){
            deleteBtn2.setBackground(new java.awt.Color(156, 190, 254));
        }
        if(evt.getSource()==updateBtn2){
            updateBtn2.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_updateBtn2MouseEntered

    private void updateBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtn2MouseClicked
         HoldersUpdate();
    }//GEN-LAST:event_updateBtn2MouseClicked

    public void HoldersUpdate(){        //to update holder details  in database
       String id = idBox2.getText();
        String uname = nameText2.getText();
        String address = AddressText2.getText();
        String nic = nicTxt2.getText();

       SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        String Ddate = sdf2.format(bDay2.getDate());

        String email = emailText2.getText();
        String age = ageTxt2.getText();

        String gen = null;
        if(MaleRadio1.isSelected()){
            gen = MaleRadio1.getText();
        }
        if(FemaleRadio1.isSelected()){
            gen = FemaleRadio1.getText();
        }

        String nationality = nationalityText2.getText();
        String Pnumber = phoneText2.getText();

        try {
                           
            String sql = "update account_holders set A_Name = '"+uname+"', A_Address = '"+address+"',"
                    + " A_NIC = '"+nic+"',A_DOB = '"+Ddate+"',A_Email = '"+email+"',A_Age = '"+age+"',"
                    + "A_Gender = '"+gen+"', A_Nationality = '"+nationality+"',"
                    + "A_PhoneNumber = '"+Pnumber+"' where Bank_No= '"+id+"'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            erase3();
            tableload();
            JOptionPane.showMessageDialog(null,"Successfully Updated!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void srchBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srchBtnMouseExited
        if(evt.getSource()==srchBtn){
            srchBtn.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_srchBtnMouseExited

    private void srchBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srchBtnMouseEntered
        if(evt.getSource()==srchBtn){
            srchBtn.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_srchBtnMouseEntered

    private void srchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srchBtnMouseClicked
        HoldersSearch();
    }//GEN-LAST:event_srchBtnMouseClicked
    
    public void HoldersSearch(){            //to search holder details when insert account number or name 
        String srch = srchBox2.getText();
        try {

            String sql = "select *from account_holders where Bank_No = '"+srch+"' or A_Name = '"+srch+"'" ;
            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();
            if(rs.next()){
                idBox2.setText(rs.getString("Bank_No")); 
                holderNo2.setText(rs.getString("A_Hnumber"));
                nameText2.setText(rs.getString("A_Name"));
                AddressText2.setText(rs.getString("A_Address"));
                nicTxt2.setText(rs.getString("A_NIC"));
                bDay2.setDate(rs.getDate("A_DOB"));
                emailText2.setText(rs.getString("A_Email"));
                ageTxt2.setText(rs.getString("A_Age"));

                if ("Male".equals(rs.getString("A_Gender"))){
                    MaleRadio1.setSelected(true);
                }
                else if ("Female".equals(rs.getString("A_Gender"))){
                    FemaleRadio1.setSelected(true);
                }

                nationalityText2.setText(rs.getString("A_Nationality"));
                phoneText2.setText(rs.getString("A_PhoneNumber"));
                AtypeBox.setText(rs.getString("A_AccountType"));

            }
            else{
                JOptionPane.showMessageDialog(null, "Record not Found!");
            erase3(); 
            }     
                    
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Record not Found!");
            erase3();
        }
    }
    
    private void deleteBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtn2MouseClicked
        HoldersDelete();
    }//GEN-LAST:event_deleteBtn2MouseClicked
   
    public void HoldersDelete(){        // delete holder details from the database
        int check = JOptionPane.showConfirmDialog(null,"Are you sure you want delete?");
        
        if (check == 0){
           
            String id = idBox2.getText();
            
            try {
                String sql = "delete from account_holders where Bank_No = '"+id+"'";
                pst = conn.prepareStatement(sql);
                pst.execute();
                erase3();
                tableload();
                BalanceCheck_tableload();
                transactionsTableLoad();
                JOptionPane.showMessageDialog(null, "Successfully Deleted!");
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    private void clearBtn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtn3MouseEntered
        if(evt.getSource()==clearBtn3){
            clearBtn3.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_clearBtn3MouseEntered

    private void clearBtn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtn3MouseExited
        if(evt.getSource()==clearBtn3){
            clearBtn3.setBackground(new java.awt.Color(234,240,251));
        }
    }//GEN-LAST:event_clearBtn3MouseExited

    private void clearBtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtn3MouseClicked
       erase3();
    }//GEN-LAST:event_clearBtn3MouseClicked

    private void AddressText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressText2ActionPerformed

    private void MaleRadio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleRadio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleRadio1ActionPerformed

    private void holderNo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_holderNo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_holderNo2ActionPerformed

    private void srchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srchMouseExited
        if(evt.getSource()==srch){                                     //colour changes for close, minimize and restore down btns when mouse exit
            srch.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_srchMouseExited

    private void srchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srchMouseEntered
        if(evt.getSource()==srch){
            srch.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_srchMouseEntered

    private void srchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srchMouseClicked
        depositSearch();
    }//GEN-LAST:event_srchMouseClicked

     public void depositSearch(){            //search holder details for a diposit
        try {
            String srch = accNo.getText();
            String sql = "select *from account_holders where Bank_No = '"+srch+"'" ;
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             
             if(rs.next()){
                 hNo.setText(rs.getString("A_Hnumber"));
                 hName.setText(rs.getString("A_Name"));
                 balance.setText(rs.getString("A_amount"));
                         
             }
             else{
                 JOptionPane.showMessageDialog(null, "Record not Found!");
             }
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Record not Found!");
        }
    }
     
     
    
    private void acntTypePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_acntTypePopupMenuWillBecomeInvisible
      
    }//GEN-LAST:event_acntTypePopupMenuWillBecomeInvisible

    private void srch12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_srch12KeyReleased
        Balancesearch2();
    }//GEN-LAST:event_srch12KeyReleased

    private void depositMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositMouseEntered
        if(evt.getSource()==deposit){                                     //colour changes for close, minimize and restore down btns when mouse exit
            deposit.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_depositMouseEntered

    private void depositMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositMouseExited
        if(evt.getSource()==deposit){
            deposit.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_depositMouseExited

    private void calculateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateMouseEntered
        if(evt.getSource()==calculate){                                     //colour changes for close, minimize and restore down btns when mouse exit
            calculate.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_calculateMouseEntered

    private void calculateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateMouseExited
        if(evt.getSource()==calculate){
            calculate.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_calculateMouseExited

    private void calculateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateMouseClicked
        totalBalence_Check();
    }//GEN-LAST:event_calculateMouseClicked

    private void depositMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositMouseClicked
        depositSave();
    }//GEN-LAST:event_depositMouseClicked

    private void DHstryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DHstryMouseClicked
       Diposit_History dd1 = new Diposit_History();
       dd1.setVisible(true);
    }//GEN-LAST:event_DHstryMouseClicked

    private void DHstryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DHstryMouseEntered
        if(evt.getSource()==DHstry){
            DHstry.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_DHstryMouseEntered

    private void DHstryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DHstryMouseExited
        if(evt.getSource()==DHstry){
            DHstry.setBackground(new java.awt.Color( 234, 240, 251));
        }
    }//GEN-LAST:event_DHstryMouseExited

    private void deposit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deposit1MouseClicked
        withdrawSave();
    }//GEN-LAST:event_deposit1MouseClicked

     public void withdrawSave(){            //to withdrawls save into database
        try {
             String sql = "insert into withdraw values (?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            
           pst.setInt(1, Integer.parseInt(accNo1.getText()));
            
           
            pst.setString(2,hNo1.getText());
            pst.setString(3,hName1.getText());

            float amnt = Float.parseFloat(dAmount1.getText());
                pst.setFloat(4, amnt);
            
            
            
            pst.setString(5,ttl1.getText());
            pst.setString(6,user1.getText());
            pst.setString(7,date33.getText());
            pst.setString(8,time3.getText());
            //totalBalence_Check2();
            pst.executeUpdate();
            withdrawBalance_Update();
            withdrawToTransaction();
            transactionsTableLoad();
            BalanceCheck_tableload();
            JOptionPane.showMessageDialog(null,"Successfully withdrew!");
           withdrawerase2();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
     public void withdrawToTransaction(){       //withdrewd details apply for the transaction table in database
        String aNo = accNo1.getText();
        String hNo = hNo1.getText();
        String name = hName1.getText();
        String amount = dAmount1.getText();
        String ttl = ttl1.getText();
        String user = user1.getText();
        String date = date33.getText();
        String Time = time3.getText();
        
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
     
     public void withdrawBalance_Update(){          //  update  account balance in account_Holders table when withdraw
        float blnc = Float.parseFloat(ttl1.getText());
        String id = accNo1.getText();
        
        try {
            String sql = "update account_holders set A_amount = '"+blnc+"' where Bank_No= '"+id+"'";
            pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
     public void withdrawerase2(){        //withdraw panel clear
        accNo1.setText("");
        hNo1.setText("");
        hName1.setText("");
        dAmount1.setText("");
        ttl1.setText("");
       balance1.setText("");
    }
     
    private void deposit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deposit1MouseEntered
        if(evt.getSource()==deposit1){
            deposit1.setBackground(new java.awt.Color(156, 190, 254)); 
        }
    }//GEN-LAST:event_deposit1MouseEntered

    private void deposit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deposit1MouseExited
        if(evt.getSource()==deposit1){
            deposit1.setBackground(new java.awt.Color(234, 240, 251)); 
        }
    }//GEN-LAST:event_deposit1MouseExited

    private void srch1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srch1MouseClicked
        withdrawSearch2();
    }//GEN-LAST:event_srch1MouseClicked

    public void withdrawSearch2(){           //search from holder details for a withdraw
        try {
            String srch = accNo1.getText();
            String sql = "select *from account_holders where Bank_No = '"+srch+"'" ;
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
        totalBalence_Check2();
    }//GEN-LAST:event_calculate1MouseClicked

    public void totalBalence_Check2(){       //calculate to get the total for a withdrawal
        try {
           
            float a1 = Float.parseFloat(balance1.getText());
            float a2 = Float.parseFloat(dAmount1.getText());
            float sum = a1-a2;
            String sum1 = String.valueOf(sum);
            
            if(a1<=a2){
               JOptionPane.showMessageDialog(null, "Holder Deos not have enough Balance!");
            }
            else if(a2<99){
                JOptionPane.showMessageDialog(null, "Minimum withdraw is Rs.100");
            }
            else{
                ttl1.setText(sum1);
                 
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

    private void clcultMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clcultMouseExited
        if(evt.getSource()==clcult){
            clcult.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_clcultMouseExited

    private void clcultMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clcultMouseEntered
        if(evt.getSource()==clcult){
            clcult.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_clcultMouseEntered

    private void clcultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clcultMouseClicked
         CreditAccountBalance_Check();
    }//GEN-LAST:event_clcultMouseClicked

    public void CreditAccountBalance_Check(){       //calculate to get the total
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
    
    private void search22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search22MouseExited
        if(evt.getSource()==search22){
            search22.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_search22MouseExited

    private void search22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search22MouseEntered
        if(evt.getSource()==search22){
            search22.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_search22MouseEntered

    private void search22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search22MouseClicked
          creditAccount_Search();
    }//GEN-LAST:event_search22MouseClicked

    public void creditAccount_Search(){           /*search credit holders' account no. from holder details to 
                                                   transfer holder's funds to credit holder*/
        int a1 = Integer.parseInt(accNo2.getText());
        int a2 = Integer.parseInt(cAccount.getText());      
        
        if(a1==a2){
            JOptionPane.showMessageDialog(null,"Account number and Credit number can not be same");
        }
        else{
        try {
            String srch = cAccount.getText();
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
            JOptionPane.showMessageDialog(null, "Record not Found!");
        }
        }
    }
    
    private void calculate2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculate2MouseExited
        if(evt.getSource()==calculate2){
            calculate2.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_calculate2MouseExited

    private void calculate2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculate2MouseEntered
        if(evt.getSource()==calculate2){
            calculate2.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_calculate2MouseEntered

    private void calculate2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculate2MouseClicked
        totalBalence_Check33();
    }//GEN-LAST:event_calculate2MouseClicked

     public void totalBalence_Check33(){       //calculate holders balance reduce for transfer 
        try {
           
            float a1 = Float.parseFloat(balance2.getText());
            float a2 = Float.parseFloat(tAmount1.getText());
            float sum = a1-a2;
            String sum1 = String.valueOf(sum);
            
            if(a1<=a2){
               JOptionPane.showMessageDialog(null, "Holder Deos not have enough Balance!");
            }
            else if(a2<99){
                JOptionPane.showMessageDialog(null, "Minimum transfer is Rs.100");
            }
            else{
                Attl1.setText(sum1);
                 
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void srch2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srch2MouseExited
        if(evt.getSource()==srch2){
            srch2.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_srch2MouseExited

    private void srch2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srch2MouseEntered
        if(evt.getSource()==srch2){
            srch2.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_srch2MouseEntered

    private void srch2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srch2MouseClicked
        transferSearch2();
    }//GEN-LAST:event_srch2MouseClicked

     public void transferSearch2(){               //search holder details for a  transfer
        try {
            String srch = accNo2.getText();
            String sql = "select *from account_holders where Bank_No like '%"+srch+"%'" ;
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             
             if(rs.next()){
                 hNo2.setText(rs.getString("A_Hnumber"));
                 hName2.setText(rs.getString("A_Name"));
                 balance2.setText(rs.getString("A_amount"));
                         
             }
             else{
                 JOptionPane.showMessageDialog(null, "Record not Found!");
             }
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Record not Found!");
        }
    }
    
    private void saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseExited
        if(evt.getSource()==save){
            save.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_saveMouseExited

    private void saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseEntered
        if(evt.getSource()==save){
            save.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_saveMouseEntered

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        transferHistory(); 
        
        dtransfer_Update();
          credittransfer_Update();
    }//GEN-LAST:event_saveMouseClicked

    private void srch13KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_srch13KeyReleased
       ViewTransactionsSearch();
    }//GEN-LAST:event_srch13KeyReleased

    private void THstry2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_THstry2MouseClicked
        Transfer_History t1 = new Transfer_History();
        t1.setVisible(true);
    }//GEN-LAST:event_THstry2MouseClicked

    private void THstry2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_THstry2MouseEntered
        if(evt.getSource()==THstry2){
            THstry2.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_THstry2MouseEntered

    private void THstry2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_THstry2MouseExited
      if(evt.getSource()==THstry2){
            THstry2.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_THstry2MouseExited

    private void WHstryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WHstryMouseEntered
        if(evt.getSource()==WHstry){
            WHstry.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_WHstryMouseEntered

    private void WHstryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WHstryMouseExited
        if(evt.getSource()==WHstry){
            WHstry.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_WHstryMouseExited

    private void WHstryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WHstryMouseClicked
        Withdraw_History w1 = new Withdraw_History();
        w1.setVisible(true);
    }//GEN-LAST:event_WHstryMouseClicked

    private void lnfoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lnfoBtnMouseClicked
        Info i1 = new Info();
        i1.setVisible(true);
    }//GEN-LAST:event_lnfoBtnMouseClicked

    private void lnfoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lnfoBtnMouseEntered
        if(evt.getSource()==lnfoBtn){
            lnfoBtn.setBackground(new java.awt.Color(52, 68, 95));
        }
    }//GEN-LAST:event_lnfoBtnMouseEntered

    private void lnfoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lnfoBtnMouseExited
        if(evt.getSource()==lnfoBtn){
            lnfoBtn.setBackground(new java.awt.Color(1,23,64));
        }
       
    }//GEN-LAST:event_lnfoBtnMouseExited

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        LogoutVerifing();
    }//GEN-LAST:event_logoutBtnMouseClicked

    public void ViewTransactionsSearch(){           //to search specific transactions
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
    
    
    
     public void dtransfer_Update(){          //  update  balances after transfer
        float blnc = Float.parseFloat(Attl1.getText());
        String id = accNo2.getText();
        
        
        try {
            String sql = "update account_holders set A_amount = '"+blnc+"' where Bank_No= '"+id+"'";
            pst = conn.prepareStatement(sql);
            
            pst.execute();
            BalanceCheck_tableload();
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void credittransfer_Update(){          //  update  Credit holders' balances after transfer
        
        float blnc2 = Float.parseFloat(cTotoal.getText());
        String id2 = cAccount.getText();
        
        try {
            String sql2 = "update account_holders set A_amount = '"+blnc2+"' where Bank_No= '"+id2+"'";
            pst = conn.prepareStatement(sql2);
           
            pst.execute();
            BalanceCheck_tableload();
            transferclear();
            JOptionPane.showMessageDialog(null, "Successfully Trasferred!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void transferHistory(){      //to insert transfer  data into database
         try {
             String sql = "insert into transfer values (?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            
           pst.setInt(1, Integer.parseInt(accNo2.getText()));
            
           
            pst.setString(2,tAmount1.getText());
            pst.setString(3,Attl1.getText()); 
            pst.setString(4,cAccount.getText());
            pst.setString(5,USER.getText());
            pst.setString(6,date4.getText());
            pst.setString(7,time4.getText());
           //totalBalence_Check2();
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void transferclear(){        //clear transfer panel previous details
        accNo2.setText("");
        hNo2.setText("");
        hName2.setText("");
        balance2.setText("");
        tAmount1.setText("");
        Attl1.setText("");
        cAccount.setText("");
        cBalance.setText("");
        cTotoal.setText("");
        
    }
    
     public void depositSave(){ //to save deposit details to database
        try {
             String sql = "insert into deposit values (?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            
           pst.setInt(1, Integer.parseInt(accNo.getText()));
            
           
            pst.setString(2,hNo.getText());
            pst.setString(3,hName.getText()); 
            pst.setString(4,dAmount.getText());
            pst.setString(5,ttl.getText());
            pst.setString(6,user.getText());
            pst.setString(7,date2.getText());
            pst.setString(8,time2.getText());
           //totalBalence_Check2();
            pst.executeUpdate();
            
            depositBalance_Update();
            transactions();
            transactionsTableLoad();
            BalanceCheck_tableload();
            JOptionPane.showMessageDialog(null,"Successfully Deposited!");
            
            DepositTextfiledsErase();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
     public void transactions(){        //view trnsaction from the database
        String aNo = accNo.getText();
        String holderNo = hNo.getText();
        String name = hName.getText();
        String amount = dAmount.getText();
        String totl = ttl.getText();
        String username = user.getText();
        String Ddate = date2.getText();
        String tTime = time2.getText();
        
       try {
             String sql = "insert into transactions (Bank_No, A_Hnumber, A_Name, "
                     + " A_Withdraw_Aamount, A_Diposit_Amount,"
                     + " A_Balance, A_User, A_date, A_time) values ('"+aNo+"','"+holderNo+"','"+name+"',0,"
                     + "'"+amount+"','"+totl+"','"+username+"','"+Ddate+"','"+tTime+"')";
            pst = conn.prepareStatement(sql);

            pst.executeUpdate();
            
            depositBalance_Update();
            BalanceCheck_tableload();
            
            erase();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
     public void depositBalance_Update(){          //  update  balance in accountHolder after a deposit
        float blnc = Float.parseFloat(ttl.getText());
        String id = accNo.getText();
        
        try {
            String sql = "update account_holders set A_amount = '"+blnc+"' where Bank_No= '"+id+"'";
            pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
     public void DepositTextfiledsErase(){        //previous deposit details clear after a deposit
        accNo.setText("");
        hNo.setText("");
        hName.setText("");
        balance.setText("");
        dAmount.setText("");
        ttl.setText("");
        
    }
    
    public void totalBalence_Check(){       //calculate to get the total for a deposit
        
            try {
                float a1 = Float.parseFloat(balance.getText());
            float a2 = Float.parseFloat(dAmount.getText());
            float sum = a1+a2;
            String sum1 = String.valueOf(sum);
            if(a2>99){
            ttl.setText(sum1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Minimum Deposit is Rs.100");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            
        
    }
    
    public void Balancesearch2(){       //to search holder's balances
        String srch = srch12.getText();
        
        try {
            
           String sql = "select Bank_No as AccountNo , A_Hnumber as HolderNo, A_Name as Name, A_AccountType as AccountType,"
                    + " A_amount as Balance from account_holders where Bank_No like '%"+srch+"%' or A_Name like '%"+srch+"%'" ;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            viewTabl3.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
      
     }
    
   public void BalanceCheck_tableload(){ //  table load to view balance check in table
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
    
    public void tableData(){        // when click user from the table, all the details will set to textfields
        int r = viewTabl2.getSelectedRow();
        String id = viewTabl2.getValueAt(r, 0).toString();
        String uname = viewTabl2.getValueAt(r, 1).toString();
        String pword = viewTabl2.getValueAt(r, 2).toString();
        String utype = viewTabl2.getValueAt(r, 3).toString();
        
        idBox.setText(id);
        username.setText(uname);
        password.setText(pword);
        usertype.setSelectedItem(utype);
    }
    
    
    
    private void update2(){     //to update user details
        String id = idBox.getText();
        String uname = username.getText();
        String pword = password.getText();
        String utype = usertype.getSelectedItem().toString();
        
        try {
             String sql = "update user_type set D_Username  = '"+uname+"', d_Password='"+pword+"',"
                     + " D_UserType= '"+utype+"'where D_id = '"+id+"'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully Updated!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
    public void ViewDetailssearch(){           //to search account holders in the table
         String srch = searchBox.getText();
        
        try {
            String sql = "select Bank_No as AccountNo , A_Hnumber as HolderNo, A_Name as Name, A_Address as Address,"
                    + " A_NIC as NIC, A_DOB as BirthDay, A_Email as Email, A_Age as Age, A_Gender as Gender, "
                    + "A_Nationality as Nationality, A_PhoneNumber as PhoneNumber, A_AccountType as AccountType,"
                    + " A_date as Date, A_time as Time from account_holders where Bank_No like "
                    + "'%"+srch+"%' or A_Hnumber like '%"+srch+"%' or A_Name like '%"+srch+"%'" ;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            viewTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void search2(){  
            String srch2 = searchBox2.getText();        //to search and view users
        try {
            String sql = "select  D_id as ID,D_Username as Username, d_Password as Password,"
                    + " D_UserType	as UserType"
                    + " from user_type where D_id like '%"+srch2+"%' or D_UserType like '%"+srch2+"%'" ;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            viewTabl2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void tableload(){    //table details related to the acount holders
          try {
            
            String sql = "select Bank_No as AccountNo, A_Hnumber as HolderNo, A_Name as Name, A_Address as Address, "
                    + "A_NIC as NIC, A_DOB as BirthDay, A_Email as Email, A_Age as Age, A_Gender as Gender, A_Nationality as Nationality,"
                    + "A_PhoneNumber as PhoneNumber, A_AccountType as AccountType, A_date as Date, A_time as Time from account_holders ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            viewTable.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
     }
    
    public void tableload2(){       //show details related to the users in the table
        try {
            String sql = "select D_id as ID, D_Username as Username, d_Password as Password,"
                    + " D_UserType as UserType from user_type";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            viewTabl2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void erase (){       // clar previous holder details 
        AcntNoTxt.setText("");
        holderNo.setText("");
        nameText.setText("");
        AddressText.setText("");
        nicTxt.setText("");
        bDay.setCalendar(null);
        emailText.setText("");
        ageTxt.setText("");
        GenderGroup.clearSelection();
        nationalityText.setText("");
        phoneText.setText("");
        acntType.setSelectedIndex(0);
        Aamount.setText("");
        
    }
    
    public void erase2(){       // clear previous user details
        idBox.setText("");
        username.setText("");
        password.setText("");
        usertype.setSelectedIndex(0);
    }
    
    
    public void erase3(){       // clar previous holder details 
        idBox2.setText("");
        holderNo2.setText("");
        nameText2.setText("");
        AddressText2.setText("");
        nicTxt2.setText("");
        bDay2.setCalendar(null);
        emailText2.setText("");
        ageTxt2.setText("");
        GenderGroup2.clearSelection();
        nationalityText2.setText("");
        phoneText2.setText("");
        AtypeBox.setText("");
        srchBox2.setText("");
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
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Aamount;
    private javax.swing.JPanel Account_Holders;
    private static javax.swing.JTextField AcntNoTxt;
    private javax.swing.JTextField AddressText;
    private javax.swing.JTextField AddressText2;
    private javax.swing.JTextField Attl1;
    private javax.swing.JTextField AtypeBox;
    private javax.swing.JPanel Check_Balance;
    private javax.swing.JPanel CloseBtn1;
    private javax.swing.JPanel Create_Holders;
    private javax.swing.JPanel Create_Users;
    private javax.swing.JTextField Createddate;
    private javax.swing.JPanel DHstry;
    private javax.swing.JPanel Deposit;
    private javax.swing.JRadioButton FemaleRadio;
    private javax.swing.JRadioButton FemaleRadio1;
    private javax.swing.ButtonGroup GenderGroup;
    private javax.swing.ButtonGroup GenderGroup2;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Logout1;
    private javax.swing.JPanel MAHbtn1;
    private javax.swing.JPanel MAHbtn2;
    private javax.swing.JPanel MAHbtn3;
    private javax.swing.JPanel MAHbtn4;
    private javax.swing.JPanel MAHbtn5;
    private javax.swing.JPanel MAHbtn6;
    private javax.swing.JPanel MAHbtn7;
    private javax.swing.JPanel MAHbtn8;
    private javax.swing.JPanel MAHbtn9;
    private javax.swing.JRadioButton MaleRadio;
    private javax.swing.JRadioButton MaleRadio1;
    private javax.swing.JPanel Manage_Holders;
    private javax.swing.JPanel THstry2;
    public static javax.swing.JTextField USER;
    private javax.swing.JPanel WHstry;
    private javax.swing.JPanel Withdrawal;
    private javax.swing.JTextField accNo;
    private javax.swing.JTextField accNo1;
    private javax.swing.JTextField accNo2;
    private javax.swing.JComboBox<String> acntType;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JTextField ageTxt2;
    private javax.swing.JTextField autoTime;
    private com.toedter.calendar.JDateChooser bDay;
    private com.toedter.calendar.JDateChooser bDay2;
    private javax.swing.JTextField balance;
    private javax.swing.JTextField balance1;
    private javax.swing.JTextField balance2;
    private javax.swing.JTextField cAccount;
    private javax.swing.JTextField cBalance;
    private javax.swing.JTextField cTotoal;
    private javax.swing.JPanel calculate;
    private javax.swing.JPanel calculate1;
    private javax.swing.JPanel calculate2;
    private javax.swing.JPanel clcult;
    private javax.swing.JPanel clearBtn3;
    private javax.swing.JTextField dAmount;
    private javax.swing.JTextField dAmount1;
    private javax.swing.JTextField date2;
    private javax.swing.JTextField date33;
    private javax.swing.JTextField date4;
    private javax.swing.JPanel deleteBtn;
    private javax.swing.JPanel deleteBtn2;
    private javax.swing.JPanel deposit;
    private javax.swing.JPanel deposit1;
    private javax.swing.JPanel editBtn;
    private javax.swing.JTextField emailText;
    private javax.swing.JTextField emailText2;
    private javax.swing.JPanel eraseBtn;
    private javax.swing.JPanel eraseBtn2;
    private javax.swing.JPanel formBtn;
    private javax.swing.JTextField hName;
    private javax.swing.JTextField hName1;
    private javax.swing.JTextField hName2;
    private javax.swing.JTextField hNo;
    private javax.swing.JTextField hNo1;
    private javax.swing.JTextField hNo2;
    private javax.swing.JTextField holderNo;
    private javax.swing.JTextField holderNo2;
    private javax.swing.JLabel idBox;
    private javax.swing.JTextField idBox2;
    private javax.swing.JPanel j1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
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
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
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
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
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
    private javax.swing.JScrollPane jScrollPane4;
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
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JSeparator jSeparator43;
    private javax.swing.JSeparator jSeparator44;
    private javax.swing.JSeparator jSeparator45;
    private javax.swing.JSeparator jSeparator46;
    private javax.swing.JSeparator jSeparator47;
    private javax.swing.JSeparator jSeparator48;
    private javax.swing.JSeparator jSeparator49;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator50;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel lnfoBtn;
    private javax.swing.JPanel logoutBtn;
    private javax.swing.JPanel minimizeBtn;
    public static javax.swing.JTextField nameText;
    private javax.swing.JTextField nameText2;
    private javax.swing.JTextField nationalityText;
    private javax.swing.JTextField nationalityText2;
    private javax.swing.JTextField nicTxt;
    private javax.swing.JTextField nicTxt2;
    private javax.swing.JPanel p6;
    private javax.swing.JTextField password;
    private javax.swing.JTextField phoneText;
    private javax.swing.JTextField phoneText2;
    private javax.swing.JPanel restoreDownBtn;
    private javax.swing.JPanel save;
    private javax.swing.JPanel saveBtn;
    private javax.swing.JPanel saveBtn2;
    private javax.swing.JPanel search22;
    private javax.swing.JSeparator searchBar;
    private javax.swing.JTextField searchBox;
    private javax.swing.JTextField searchBox2;
    private javax.swing.JPanel srch;
    private javax.swing.JPanel srch1;
    private javax.swing.JTextField srch12;
    private javax.swing.JTextField srch13;
    private javax.swing.JPanel srch2;
    private javax.swing.JTextField srchBox2;
    private javax.swing.JPanel srchBtn;
    private javax.swing.JTextField tAmount1;
    private javax.swing.JTextField time2;
    private javax.swing.JTextField time3;
    private javax.swing.JTextField time4;
    private javax.swing.JPanel transactions;
    private javax.swing.JTable transactionsTable;
    private javax.swing.JPanel transfer;
    private javax.swing.JTextField ttl;
    private javax.swing.JTextField ttl1;
    private javax.swing.JPanel updateBtn2;
    public static javax.swing.JTextField user;
    public static javax.swing.JTextField user1;
    private javax.swing.JTextField username;
    private javax.swing.JComboBox<String> usertype;
    private javax.swing.JTable viewTabl2;
    private javax.swing.JTable viewTabl3;
    private javax.swing.JTable viewTable;
    // End of variables declaration//GEN-END:variables
}
