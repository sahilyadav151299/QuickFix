/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickfix;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sahil
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
   
    public Dashboard() {
        initComponents();
        jPanel3.setSize(0,560);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        hamburger = new rojerusan.RSButtonMetro();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        logout1 = new rojerusan.RSButtonMetro();
        home = new rojerusan.RSButtonMetro();
        seller = new rojerusan.RSButtonMetro();
        buyer = new rojerusan.RSButtonMetro();
        contact = new rojerusan.RSButtonMetro();
        aboutus = new rojerusan.RSButtonMetro();
        feedback = new rojerusan.RSButtonMetro();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        welcomeuser = new javax.swing.JTextField();
        welcomePart9 = new javax.swing.JTextField();
        welcomePart10 = new javax.swing.JTextField();
        welcomePart11 = new javax.swing.JTextField();
        welcomePart13 = new javax.swing.JTextField();
        welcomePart14 = new javax.swing.JTextField();
        welcomePart5 = new javax.swing.JTextField();
        welcomePart12 = new javax.swing.JTextField();
        seller2 = new rojerusan.RSButtonMetro();
        seller3 = new rojerusan.RSButtonMetro();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QuickFix : A Place To Exchange 2nd Hand Stuff");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        hamburger.setBackground(new java.awt.Color(102, 153, 255));
        hamburger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hameburger1.png"))); // NOI18N
        hamburger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hamburgerMousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QuickFix");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(hamburger, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 595, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(hamburger, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 70));

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout1.setBackground(new java.awt.Color(204, 204, 204));
        logout1.setForeground(new java.awt.Color(153, 153, 153));
        logout1.setText("LOGOUT");
        logout1.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        logout1.setPreferredSize(new java.awt.Dimension(150, 80));
        logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout1ActionPerformed(evt);
            }
        });
        jPanel3.add(logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 160, -1));

        home.setBackground(new java.awt.Color(204, 204, 204));
        home.setForeground(new java.awt.Color(153, 153, 153));
        home.setText("HOME");
        home.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        home.setPreferredSize(new java.awt.Dimension(150, 80));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel3.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, -1));

        seller.setBackground(new java.awt.Color(204, 204, 204));
        seller.setForeground(new java.awt.Color(153, 153, 153));
        seller.setText("SELLER");
        seller.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        seller.setPreferredSize(new java.awt.Dimension(150, 80));
        seller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerActionPerformed(evt);
            }
        });
        jPanel3.add(seller, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 160, -1));

        buyer.setBackground(new java.awt.Color(204, 204, 204));
        buyer.setForeground(new java.awt.Color(153, 153, 153));
        buyer.setText("BUYER");
        buyer.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        buyer.setPreferredSize(new java.awt.Dimension(150, 80));
        buyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyerActionPerformed(evt);
            }
        });
        jPanel3.add(buyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 160, -1));

        contact.setBackground(new java.awt.Color(204, 204, 204));
        contact.setForeground(new java.awt.Color(153, 153, 153));
        contact.setText("CONTACT");
        contact.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        contact.setPreferredSize(new java.awt.Dimension(150, 80));
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel3.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 160, -1));

        aboutus.setBackground(new java.awt.Color(204, 204, 204));
        aboutus.setForeground(new java.awt.Color(153, 153, 153));
        aboutus.setText("ABOUT US");
        aboutus.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        aboutus.setPreferredSize(new java.awt.Dimension(150, 80));
        aboutus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutusActionPerformed(evt);
            }
        });
        jPanel3.add(aboutus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 160, -1));

        feedback.setBackground(new java.awt.Color(204, 204, 204));
        feedback.setForeground(new java.awt.Color(153, 153, 153));
        feedback.setText("FEEDBACK");
        feedback.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        feedback.setPreferredSize(new java.awt.Dimension(150, 80));
        feedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackActionPerformed(evt);
            }
        });
        jPanel3.add(feedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 160, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 560));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel2.setText("in labs & practicals. Here you can find all your stuff/items for your studies.");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 630, 30));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel3.setText("Hey guy's, your welcome on our application of buying, selling and  ");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 560, 30));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel4.setText("exchanging of things/stuff/material such as your previous semester/class ");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 620, 30));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel5.setText("notes, books, guides, practical tools and other type of equipements used ");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 620, 30));

        welcomeuser.setEditable(false);
        welcomeuser.setBackground(new java.awt.Color(255, 255, 255));
        welcomeuser.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        welcomeuser.setForeground(new java.awt.Color(51, 51, 51));
        welcomeuser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        welcomeuser.setText(" Welcome Here !");
        welcomeuser.setBorder(null);
        welcomeuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                welcomeuserActionPerformed(evt);
            }
        });
        jPanel5.add(welcomeuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 280, 50));

        welcomePart9.setEditable(false);
        welcomePart9.setBackground(new java.awt.Color(255, 255, 255));
        welcomePart9.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        welcomePart9.setForeground(new java.awt.Color(51, 51, 51));
        welcomePart9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        welcomePart9.setText("FROM");
        welcomePart9.setBorder(null);
        welcomePart9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                welcomePart9ActionPerformed(evt);
            }
        });
        jPanel5.add(welcomePart9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 100, 40));

        welcomePart10.setEditable(false);
        welcomePart10.setBackground(new java.awt.Color(255, 255, 255));
        welcomePart10.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        welcomePart10.setForeground(new java.awt.Color(51, 51, 51));
        welcomePart10.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        welcomePart10.setText("CAN");
        welcomePart10.setBorder(null);
        welcomePart10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                welcomePart10ActionPerformed(evt);
            }
        });
        jPanel5.add(welcomePart10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 100, 40));

        welcomePart11.setEditable(false);
        welcomePart11.setBackground(new java.awt.Color(255, 255, 255));
        welcomePart11.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        welcomePart11.setForeground(new java.awt.Color(51, 51, 51));
        welcomePart11.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        welcomePart11.setText("YOU");
        welcomePart11.setBorder(null);
        welcomePart11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                welcomePart11ActionPerformed(evt);
            }
        });
        jPanel5.add(welcomePart11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 80, 40));

        welcomePart13.setEditable(false);
        welcomePart13.setBackground(new java.awt.Color(255, 255, 255));
        welcomePart13.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        welcomePart13.setForeground(new java.awt.Color(51, 51, 51));
        welcomePart13.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        welcomePart13.setText("THIS");
        welcomePart13.setBorder(null);
        welcomePart13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                welcomePart13ActionPerformed(evt);
            }
        });
        jPanel5.add(welcomePart13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 80, 40));

        welcomePart14.setEditable(false);
        welcomePart14.setBackground(new java.awt.Color(255, 255, 255));
        welcomePart14.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        welcomePart14.setForeground(new java.awt.Color(51, 51, 51));
        welcomePart14.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        welcomePart14.setText("START");
        welcomePart14.setBorder(null);
        welcomePart14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                welcomePart14ActionPerformed(evt);
            }
        });
        jPanel5.add(welcomePart14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 120, 40));

        welcomePart5.setEditable(false);
        welcomePart5.setBackground(new java.awt.Color(255, 255, 255));
        welcomePart5.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        welcomePart5.setForeground(new java.awt.Color(51, 51, 51));
        welcomePart5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        welcomePart5.setText("HERE");
        welcomePart5.setBorder(null);
        welcomePart5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                welcomePart5ActionPerformed(evt);
            }
        });
        jPanel5.add(welcomePart5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 100, 40));

        welcomePart12.setEditable(false);
        welcomePart12.setBackground(new java.awt.Color(255, 255, 255));
        welcomePart12.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        welcomePart12.setForeground(new java.awt.Color(51, 51, 51));
        welcomePart12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        welcomePart12.setText("START AS A");
        welcomePart12.setBorder(null);
        welcomePart12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                welcomePart12ActionPerformed(evt);
            }
        });
        jPanel5.add(welcomePart12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 270, 40));

        seller2.setBackground(new java.awt.Color(204, 204, 204));
        seller2.setForeground(new java.awt.Color(153, 153, 153));
        seller2.setText("SELLER");
        seller2.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        seller2.setPreferredSize(new java.awt.Dimension(150, 80));
        seller2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seller2ActionPerformed(evt);
            }
        });
        jPanel5.add(seller2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 110, 150));

        seller3.setBackground(new java.awt.Color(204, 204, 204));
        seller3.setForeground(new java.awt.Color(153, 153, 153));
        seller3.setText("BUYER");
        seller3.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        seller3.setPreferredSize(new java.awt.Dimension(150, 80));
        seller3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seller3ActionPerformed(evt);
            }
        });
        jPanel5.add(seller3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 110, 150));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/contactus (2).png"))); // NOI18N
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, 120));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/buyer.png"))); // NOI18N
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 140, 140));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 740, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(900, 622));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
    
            setVisible(false);       
            Dashboard home = new Dashboard();
            home.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void sellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerActionPerformed
       
        setVisible(false);       
        SellerItem seller = new SellerItem();
        seller.setVisible(true);
       
        // TODO add your handling code here:
    }//GEN-LAST:event_sellerActionPerformed

    private void buyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyerActionPerformed
        
        setVisible(false);       
        Buyer buyer = new Buyer();
        buyer.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_buyerActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
      setVisible(false);       
        ContactUs contact = new ContactUs();
        contact.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void aboutusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutusActionPerformed
        setVisible(false);       
        AboutUs about = new AboutUs();
        about.setVisible(true);
        
// TODO add your handling code here:
    }//GEN-LAST:event_aboutusActionPerformed

    private void feedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackActionPerformed
        setVisible(false);       
        Feedback feed = new Feedback();
        feed.setVisible(true);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_feedbackActionPerformed

    private void logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout1ActionPerformed
        
        Thread th = new Thread();
        try {
            th.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Buyer.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);
        Login logout = new Login();
        logout.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_logout1ActionPerformed

    private void welcomeuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_welcomeuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_welcomeuserActionPerformed

    private void welcomePart9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_welcomePart9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_welcomePart9ActionPerformed

    private void welcomePart10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_welcomePart10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_welcomePart10ActionPerformed

    private void welcomePart11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_welcomePart11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_welcomePart11ActionPerformed

    private void welcomePart13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_welcomePart13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_welcomePart13ActionPerformed

    private void welcomePart14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_welcomePart14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_welcomePart14ActionPerformed

    private void welcomePart5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_welcomePart5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_welcomePart5ActionPerformed

    private void welcomePart12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_welcomePart12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_welcomePart12ActionPerformed

    private void seller2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seller2ActionPerformed
        setVisible(false);       
        SellerItem seller = new SellerItem();
        seller.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_seller2ActionPerformed

    private void seller3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seller3ActionPerformed
        setVisible(false);       
        Buyer buyer = new Buyer();
        buyer.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_seller3ActionPerformed

    private void hamburgerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hamburgerMousePressed
 // TODO add your handling code here:
    }//GEN-LAST:event_hamburgerMousePressed

    
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonMetro aboutus;
    private rojerusan.RSButtonMetro buyer;
    private rojerusan.RSButtonMetro contact;
    private rojerusan.RSButtonMetro feedback;
    private rojerusan.RSButtonMetro hamburger;
    private rojerusan.RSButtonMetro home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private rojerusan.RSButtonMetro logout1;
    private rojerusan.RSButtonMetro seller;
    private rojerusan.RSButtonMetro seller2;
    private rojerusan.RSButtonMetro seller3;
    private javax.swing.JTextField welcomePart10;
    private javax.swing.JTextField welcomePart11;
    private javax.swing.JTextField welcomePart12;
    private javax.swing.JTextField welcomePart13;
    private javax.swing.JTextField welcomePart14;
    private javax.swing.JTextField welcomePart5;
    private javax.swing.JTextField welcomePart9;
    private javax.swing.JTextField welcomeuser;
    // End of variables declaration//GEN-END:variables
}
