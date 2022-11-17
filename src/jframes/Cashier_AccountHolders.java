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
import javax.swing.JOptionPane;

public class Cashier_AccountHolders extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Cashier_AccountHolders() {
        conn = DB_Connect.connect();   //connect from DB_Connect 
        initComponents();
    }

     public void HoldersSearch(){        // to view holder details
        String srch = srchBox2.getText();
        try {
            String sql = "select *from account_holders where Bank_No= '"+srch+"' or A_Hnumber like '"+srch+"' or A_Name= '"+srch+"'" ;
             pst = conn.prepareStatement(sql); rs = pst.executeQuery();
             
            if(rs.next()){
                AcntNoTxt3.setText(rs.getString("Bank_No"));
                nameBox.setText(rs.getString("A_Name"));
                AddressText3.setText(rs.getString("A_Address"));
                nicTxt3.setText(rs.getString("A_NIC"));
                bDayBox.setText(rs.getString("A_DOB"));
                emailText3.setText(rs.getString("A_Email"));
                ageTxt3.setText(rs.getString("A_Age"));
                genderBox2.setText(rs.getString("A_Gender"));
                nationalityText3.setText(rs.getString("A_Nationality"));
                phoneText3.setText(rs.getString("A_PhoneNumber"));
                aTypeBox.setText(rs.getString("A_AccountType"));    
                cDate.setText(rs.getString("A_date")); 
                cTime.setText(rs.getString("A_time"));    
            }
            else{
                JOptionPane.showMessageDialog(null, "Record not Found!");
            }   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Record not Found!");
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        a1 = new javax.swing.JPanel();
        AcntNoTxt3 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        nicTxt3 = new javax.swing.JTextField();
        AddressText3 = new javax.swing.JTextField();
        nameBox = new javax.swing.JTextField();
        emailText3 = new javax.swing.JTextField();
        ageTxt3 = new javax.swing.JTextField();
        nationalityText3 = new javax.swing.JTextField();
        phoneText3 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        srchBox2 = new javax.swing.JTextField();
        jSeparator24 = new javax.swing.JSeparator();
        srchBtn = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        genderBox2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        aTypeBox = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        bDayBox = new javax.swing.JTextField();
        eraseBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cDate = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cTime = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        CloseBtn1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        okBtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(234, 240, 251));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64)));

        a1.setBackground(new java.awt.Color(234, 240, 251));
        a1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64), 2));

        AcntNoTxt3.setEditable(false);
        AcntNoTxt3.setBackground(new java.awt.Color(234, 240, 251));
        AcntNoTxt3.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        AcntNoTxt3.setForeground(new java.awt.Color(1, 23, 64));
        AcntNoTxt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AcntNoTxt3.setBorder(null);

        jLabel60.setBackground(new java.awt.Color(255, 255, 255));
        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(1, 23, 64));
        jLabel60.setText("2. Name ");

        jLabel61.setBackground(new java.awt.Color(255, 255, 255));
        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(1, 23, 64));
        jLabel61.setText("3. Address ");

        jLabel62.setBackground(new java.awt.Color(255, 255, 255));
        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(1, 23, 64));
        jLabel62.setText("4. NIC ");

        jLabel63.setBackground(new java.awt.Color(255, 255, 255));
        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(1, 23, 64));
        jLabel63.setText("5. BirthDay ");

        jLabel64.setBackground(new java.awt.Color(255, 255, 255));
        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(1, 23, 64));
        jLabel64.setText("6. Email");

        jLabel65.setBackground(new java.awt.Color(255, 255, 255));
        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(1, 23, 64));
        jLabel65.setText("7. Age ");

        jLabel66.setBackground(new java.awt.Color(255, 255, 255));
        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(1, 23, 64));
        jLabel66.setText("8. Gender ");

        jLabel67.setBackground(new java.awt.Color(255, 255, 255));
        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(1, 23, 64));
        jLabel67.setText("9. Nationality ");

        jLabel68.setBackground(new java.awt.Color(255, 255, 255));
        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(1, 23, 64));
        jLabel68.setText("10. Phone Number ");

        jLabel69.setBackground(new java.awt.Color(255, 255, 255));
        jLabel69.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(1, 23, 64));
        jLabel69.setText("11. Account Type ");

        nicTxt3.setEditable(false);
        nicTxt3.setBackground(new java.awt.Color(234, 240, 251));
        nicTxt3.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        nicTxt3.setForeground(new java.awt.Color(1, 23, 64));
        nicTxt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nicTxt3.setBorder(null);

        AddressText3.setEditable(false);
        AddressText3.setBackground(new java.awt.Color(234, 240, 251));
        AddressText3.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        AddressText3.setForeground(new java.awt.Color(1, 23, 64));
        AddressText3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AddressText3.setBorder(null);

        nameBox.setEditable(false);
        nameBox.setBackground(new java.awt.Color(234, 240, 251));
        nameBox.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        nameBox.setForeground(new java.awt.Color(1, 23, 64));
        nameBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameBox.setBorder(null);

        emailText3.setEditable(false);
        emailText3.setBackground(new java.awt.Color(234, 240, 251));
        emailText3.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        emailText3.setForeground(new java.awt.Color(1, 23, 64));
        emailText3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailText3.setBorder(null);

        ageTxt3.setEditable(false);
        ageTxt3.setBackground(new java.awt.Color(234, 240, 251));
        ageTxt3.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        ageTxt3.setForeground(new java.awt.Color(1, 23, 64));
        ageTxt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ageTxt3.setBorder(null);
        ageTxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTxt3ActionPerformed(evt);
            }
        });

        nationalityText3.setEditable(false);
        nationalityText3.setBackground(new java.awt.Color(234, 240, 251));
        nationalityText3.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        nationalityText3.setForeground(new java.awt.Color(1, 23, 64));
        nationalityText3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nationalityText3.setBorder(null);

        phoneText3.setEditable(false);
        phoneText3.setBackground(new java.awt.Color(234, 240, 251));
        phoneText3.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        phoneText3.setForeground(new java.awt.Color(1, 23, 64));
        phoneText3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phoneText3.setBorder(null);

        jLabel70.setBackground(new java.awt.Color(255, 255, 255));
        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(1, 23, 64));
        jLabel70.setText("-:");

        jLabel71.setBackground(new java.awt.Color(255, 255, 255));
        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(1, 23, 64));
        jLabel71.setText("-:");

        jLabel72.setBackground(new java.awt.Color(255, 255, 255));
        jLabel72.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(1, 23, 64));
        jLabel72.setText("-:");

        jLabel73.setBackground(new java.awt.Color(255, 255, 255));
        jLabel73.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(1, 23, 64));
        jLabel73.setText("-:");

        jLabel74.setBackground(new java.awt.Color(255, 255, 255));
        jLabel74.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(1, 23, 64));
        jLabel74.setText("-:");

        jLabel75.setBackground(new java.awt.Color(255, 255, 255));
        jLabel75.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(1, 23, 64));
        jLabel75.setText("-:");

        jLabel76.setBackground(new java.awt.Color(255, 255, 255));
        jLabel76.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(1, 23, 64));
        jLabel76.setText("-:");

        jLabel77.setBackground(new java.awt.Color(255, 255, 255));
        jLabel77.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(1, 23, 64));
        jLabel77.setText("-:");

        jLabel78.setBackground(new java.awt.Color(255, 255, 255));
        jLabel78.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(1, 23, 64));
        jLabel78.setText("-:");

        jLabel79.setBackground(new java.awt.Color(255, 255, 255));
        jLabel79.setForeground(new java.awt.Color(1, 23, 64));
        jLabel79.setText("-:");

        jSeparator5.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator5.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator15.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator15.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator16.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator16.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator17.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator17.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator18.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator18.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator19.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator19.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator20.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator20.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator21.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator21.setForeground(new java.awt.Color(1, 23, 64));

        jSeparator22.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator22.setForeground(new java.awt.Color(1, 23, 64));

        jLabel80.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(1, 23, 64));
        jLabel80.setText("1. Account No.");

        jLabel81.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(1, 23, 64));
        jLabel81.setText("-:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_museum_35px.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(165, 165, 165));
        jLabel5.setText("City Bank.");

        jSeparator1.setBackground(new java.awt.Color(165, 165, 165));
        jSeparator1.setForeground(new java.awt.Color(165, 165, 165));

        srchBox2.setBackground(new java.awt.Color(234, 240, 251));
        srchBox2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        srchBox2.setForeground(new java.awt.Color(1, 23, 64));
        srchBox2.setToolTipText("Enter Account number or Holder number orName");
        srchBox2.setBorder(null);

        jSeparator24.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator24.setForeground(new java.awt.Color(1, 23, 64));

        srchBtn.setBackground(new java.awt.Color(234, 240, 251));
        srchBtn.setToolTipText("Search");
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

        genderBox2.setEditable(false);
        genderBox2.setBackground(new java.awt.Color(234, 240, 251));
        genderBox2.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        genderBox2.setForeground(new java.awt.Color(1, 23, 64));
        genderBox2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        genderBox2.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator2.setForeground(new java.awt.Color(1, 23, 64));

        aTypeBox.setEditable(false);
        aTypeBox.setBackground(new java.awt.Color(234, 240, 251));
        aTypeBox.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        aTypeBox.setForeground(new java.awt.Color(1, 23, 64));
        aTypeBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        aTypeBox.setBorder(null);

        jSeparator3.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator3.setForeground(new java.awt.Color(1, 23, 64));

        bDayBox.setEditable(false);
        bDayBox.setBackground(new java.awt.Color(234, 240, 251));
        bDayBox.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        bDayBox.setForeground(new java.awt.Color(1, 23, 64));
        bDayBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bDayBox.setBorder(null);
        bDayBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDayBoxActionPerformed(evt);
            }
        });

        eraseBtn.setBackground(new java.awt.Color(234, 240, 251));
        eraseBtn.setToolTipText("clear");
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_erase_25px.png"))); // NOI18N

        javax.swing.GroupLayout eraseBtnLayout = new javax.swing.GroupLayout(eraseBtn);
        eraseBtn.setLayout(eraseBtnLayout);
        eraseBtnLayout.setHorizontalGroup(
            eraseBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eraseBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        eraseBtnLayout.setVerticalGroup(
            eraseBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eraseBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(1, 23, 64));
        jLabel6.setText("12. Created Date");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(1, 23, 64));
        jLabel7.setText("-:");

        cDate.setBackground(new java.awt.Color(234, 240, 251));
        cDate.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        cDate.setForeground(new java.awt.Color(1, 23, 64));
        cDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cDate.setBorder(null);

        jSeparator4.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator4.setForeground(new java.awt.Color(1, 23, 64));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(1, 23, 64));
        jLabel8.setText("13. Created Date");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(1, 23, 64));
        jLabel9.setText("-:");

        cTime.setBackground(new java.awt.Color(234, 240, 251));
        cTime.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        cTime.setForeground(new java.awt.Color(1, 23, 64));
        cTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cTime.setBorder(null);

        jSeparator6.setBackground(new java.awt.Color(1, 23, 64));
        jSeparator6.setForeground(new java.awt.Color(1, 23, 64));

        javax.swing.GroupLayout a1Layout = new javax.swing.GroupLayout(a1);
        a1.setLayout(a1Layout);
        a1Layout.setHorizontalGroup(
            a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(a1Layout.createSequentialGroup()
                        .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(a1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(srchBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(srchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(a1Layout.createSequentialGroup()
                        .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, a1Layout.createSequentialGroup()
                                .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(a1Layout.createSequentialGroup()
                                        .addComponent(jLabel80)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                        .addComponent(jLabel74))
                                    .addGroup(a1Layout.createSequentialGroup()
                                        .addComponent(jLabel61)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel76))
                                    .addGroup(a1Layout.createSequentialGroup()
                                        .addComponent(jLabel60)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel75))
                                    .addGroup(a1Layout.createSequentialGroup()
                                        .addComponent(jLabel62)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel77))
                                    .addGroup(a1Layout.createSequentialGroup()
                                        .addComponent(jLabel63)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel78))
                                    .addGroup(a1Layout.createSequentialGroup()
                                        .addComponent(jLabel65)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel79))
                                    .addGroup(a1Layout.createSequentialGroup()
                                        .addComponent(jLabel64)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel81)))
                                .addGap(18, 18, 18)
                                .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ageTxt3)
                                        .addComponent(AcntNoTxt3)
                                        .addComponent(AddressText3)
                                        .addComponent(nameBox)
                                        .addComponent(emailText3)
                                        .addComponent(nicTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bDayBox, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(a1Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36)
                        .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(a1Layout.createSequentialGroup()
                                .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(a1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, a1Layout.createSequentialGroup()
                                        .addComponent(jLabel68)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel70))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, a1Layout.createSequentialGroup()
                                        .addComponent(jLabel66)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel72))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, a1Layout.createSequentialGroup()
                                        .addComponent(jLabel67)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel71))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, a1Layout.createSequentialGroup()
                                        .addComponent(jLabel69)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel73))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, a1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)))
                                .addGap(18, 18, 18)
                                .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator6)
                                    .addComponent(jSeparator4)
                                    .addComponent(jSeparator3)
                                    .addComponent(jSeparator2)
                                    .addComponent(genderBox2)
                                    .addComponent(jSeparator15)
                                    .addComponent(jSeparator16)
                                    .addComponent(phoneText3)
                                    .addComponent(nationalityText3)
                                    .addComponent(aTypeBox)
                                    .addComponent(cDate)
                                    .addComponent(cTime, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, a1Layout.createSequentialGroup()
                                .addComponent(eraseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        a1Layout.setVerticalGroup(
            a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, a1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, a1Layout.createSequentialGroup()
                        .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, a1Layout.createSequentialGroup()
                        .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(srchBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(srchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(a1Layout.createSequentialGroup()
                        .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AcntNoTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel74)
                            .addComponent(jLabel80))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60)
                            .addComponent(jLabel75))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddressText3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61)
                            .addComponent(jLabel76))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(a1Layout.createSequentialGroup()
                                .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nicTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel62)
                                    .addComponent(jLabel77))
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel78)
                                    .addComponent(jLabel63)
                                    .addComponent(bDayBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel81))
                            .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(emailText3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(a1Layout.createSequentialGroup()
                            .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel72)
                                .addComponent(genderBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel66))
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nationalityText3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel71)
                                .addComponent(jLabel67))
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(phoneText3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel68)
                                .addComponent(jLabel70))
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(a1Layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel69)
                                        .addComponent(jLabel73)))
                                .addGroup(a1Layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(aTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(cDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(cTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(a1Layout.createSequentialGroup()
                        .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65)
                            .addComponent(jLabel79))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(eraseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        jPanel2.setBackground(new java.awt.Color(234, 240, 251));

        CloseBtn1.setBackground(new java.awt.Color(234, 240, 251));
        CloseBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseBtn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseBtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseBtn1MouseExited(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 838, Short.MAX_VALUE)
                .addComponent(CloseBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(CloseBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        cancelBtn.setBackground(new java.awt.Color(234, 240, 251));
        cancelBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64)));
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClick(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 23, 64));
        jLabel2.setText("Cancel");

        javax.swing.GroupLayout cancelBtnLayout = new javax.swing.GroupLayout(cancelBtn);
        cancelBtn.setLayout(cancelBtnLayout);
        cancelBtnLayout.setHorizontalGroup(
            cancelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelBtnLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        cancelBtnLayout.setVerticalGroup(
            cancelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        okBtn.setBackground(new java.awt.Color(234, 240, 251));
        okBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 23, 64)));
        okBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClick(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 23, 64));
        jLabel3.setText("OK");

        javax.swing.GroupLayout okBtnLayout = new javax.swing.GroupLayout(okBtn);
        okBtn.setLayout(okBtnLayout);
        okBtnLayout.setHorizontalGroup(
            okBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(okBtnLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        okBtnLayout.setVerticalGroup(
            okBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, okBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(a1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(okBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ageTxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTxt3ActionPerformed

    private void bDayBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDayBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bDayBoxActionPerformed

    private void srchBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srchBtnMouseEntered
        if(evt.getSource()==srchBtn){
            srchBtn.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_srchBtnMouseEntered

    private void srchBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srchBtnMouseExited
        if(evt.getSource()==srchBtn){
            srchBtn.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_srchBtnMouseExited

    private void srchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srchBtnMouseClicked
       HoldersSearch();
    }//GEN-LAST:event_srchBtnMouseClicked

   
    
    private void eraseBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eraseBtnMouseEntered
        if(evt.getSource()==eraseBtn){
            eraseBtn.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_eraseBtnMouseEntered

    private void eraseBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eraseBtnMouseExited
        if(evt.getSource()==eraseBtn){
           eraseBtn.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_eraseBtnMouseExited

    private void eraseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eraseBtnMouseClicked
             detailsClear();            
    }//GEN-LAST:event_eraseBtnMouseClicked
   
    public void detailsClear(){     //to clear previouse details
            AcntNoTxt3.setText("");
                nameBox.setText("");
                AddressText3.setText("");
                nicTxt3.setText("");
                bDayBox.setText("");
                emailText3.setText("");
                ageTxt3.setText("");
                genderBox2.setText("");
                nationalityText3.setText("");
                phoneText3.setText("");
                aTypeBox.setText("");
                srchBox2.setText("");
                cDate.setText("");
                cTime.setText("");
    }
    
    private void CloseBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtn1MouseEntered
        if(evt.getSource()==CloseBtn1){
            CloseBtn1.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_CloseBtn1MouseEntered

    private void CloseBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtn1MouseExited
        if(evt.getSource()==CloseBtn1){
          CloseBtn1.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_CloseBtn1MouseExited

    private void CloseBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtn1MouseClicked
        dispose();
    }//GEN-LAST:event_CloseBtn1MouseClicked

    private void MouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseClick
        dispose();
    }//GEN-LAST:event_MouseClick

    private void MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseEntered
        if(evt.getSource()==okBtn){
            okBtn.setBackground(new java.awt.Color(156, 190, 254));
        }
        if(evt.getSource()==cancelBtn){
            cancelBtn.setBackground(new java.awt.Color(156, 190, 254));
        }
    }//GEN-LAST:event_MouseEntered

    private void mouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExit
        if(evt.getSource()==okBtn){
            okBtn.setBackground(new java.awt.Color(234, 240, 251));
        }
        if(evt.getSource()==cancelBtn){
            cancelBtn.setBackground(new java.awt.Color(234, 240, 251));
        }
    }//GEN-LAST:event_mouseExit

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
            java.util.logging.Logger.getLogger(Cashier_AccountHolders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cashier_AccountHolders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cashier_AccountHolders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cashier_AccountHolders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cashier_AccountHolders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AcntNoTxt3;
    private javax.swing.JTextField AddressText3;
    private javax.swing.JPanel CloseBtn1;
    private javax.swing.ButtonGroup GenderGroup3;
    private javax.swing.JPanel a1;
    private javax.swing.JTextField aTypeBox;
    private javax.swing.JTextField ageTxt3;
    private javax.swing.JTextField bDayBox;
    private javax.swing.JTextField cDate;
    private javax.swing.JTextField cTime;
    private javax.swing.JPanel cancelBtn;
    private javax.swing.JTextField emailText3;
    private javax.swing.JPanel eraseBtn;
    private javax.swing.JTextField genderBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField nameBox;
    private javax.swing.JTextField nationalityText3;
    private javax.swing.JTextField nicTxt3;
    private javax.swing.JPanel okBtn;
    private javax.swing.JTextField phoneText3;
    private javax.swing.JTextField srchBox2;
    private javax.swing.JPanel srchBtn;
    // End of variables declaration//GEN-END:variables
}
