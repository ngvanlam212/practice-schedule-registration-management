/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import UI.Admin.JPQLTaiKhoan;
import UI.Admin.JPQLPhongTH;
import UI.Admin.JPQLMonTH;
import UI.Admin.JPQLLopTH;
import UI.Admin.JPQLLichTH;
import Test.test;
import java.awt.BorderLayout;

/**
 *
 * @author lamng
 */
public class JFMainAdmin extends javax.swing.JFrame {

    public JFMainAdmin() {
        initComponents();
        jlbHoTen.setText(test.tk.getHoTen());
    }
    
//    Danh sách các panel cần gọi
    JPQLTaiKhoan jpQLTK;
    JPQLLichTH jpQLLichTH;
    JPQLPhongTH jpQLPhongTH;
    JPQLLopTH jpQLLopTH;
    JPQLMonTH jpQLMonTH;
    
    // Load panel ra màn hình
    public void reloadPanel(int i) {
        JPLayout.removeAll();
        JPLayout.setLayout(new BorderLayout());
        JPLayout.validate();
        switch (i) {
            case 1:
                if (jpQLTK == null) {
                    jpQLTK = new JPQLTaiKhoan();
                } 
                JPLayout.add(jpQLTK);
                break;
            case 2:
                if (jpQLLichTH == null) {
                    jpQLLichTH = new JPQLLichTH();
                }

                JPLayout.add(jpQLLichTH);
                break;
            case 3:
                if(jpQLPhongTH == null){
                    jpQLPhongTH = new JPQLPhongTH();
                }

                JPLayout.add(jpQLPhongTH);
                break;
            case 4:
                jpQLLopTH = new JPQLLopTH();
                
                JPLayout.add(jpQLLopTH);
                break;
            case 5:
                if (jpQLMonTH == null) {
                    jpQLMonTH = new JPQLMonTH();
                }   
                JPLayout.add(jpQLMonTH);
                break;              
            default:
                break;
        }
        JPLayout.updateUI();
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
        jlbHoTen = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JPMenu = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jlbQLLichTH = new javax.swing.JLabel();
        jlbQLTaiKhoan = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jlbQLPhongTH = new javax.swing.JLabel();
        jlbQLLopTH = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jlbQLMonTH = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        JPLayout = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Xin chào");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, 30));

        jlbHoTen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbHoTen.setForeground(new java.awt.Color(255, 255, 255));
        jlbHoTen.setText("jLabel7");
        jPanel1.add(jlbHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 140, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout-white.png"))); // NOI18N
        jLabel2.setText("Đăng xuất");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 100, 30));

        JPMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JPMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JPMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 38, 221, 10));

        jlbQLLichTH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbQLLichTH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calendar-interface-symbol-tool.png"))); // NOI18N
        jlbQLLichTH.setText("Quản lý lịch thực hành");
        jlbQLLichTH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbQLLichTH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbQLLichTHMouseClicked(evt);
            }
        });
        JPMenu.add(jlbQLLichTH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, 40));

        jlbQLTaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbQLTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        jlbQLTaiKhoan.setText("Quản lý tài khoản");
        jlbQLTaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbQLTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbQLTaiKhoanMouseClicked(evt);
            }
        });
        JPMenu.add(jlbQLTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 40));
        JPMenu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 80, 221, 10));
        JPMenu.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 221, 10));

        jlbQLPhongTH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbQLPhongTH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/open-door.png"))); // NOI18N
        jlbQLPhongTH.setText("Quản lý phòng thực hành");
        jlbQLPhongTH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbQLPhongTH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbQLPhongTHMouseClicked(evt);
            }
        });
        JPMenu.add(jlbQLPhongTH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 200, 40));

        jlbQLLopTH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbQLLopTH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/presentation.png"))); // NOI18N
        jlbQLLopTH.setText("Quản lý lớp thực hành");
        jlbQLLopTH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbQLLopTH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbQLLopTHMouseClicked(evt);
            }
        });
        JPMenu.add(jlbQLLopTH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 200, 40));
        JPMenu.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 221, 10));

        jlbQLMonTH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbQLMonTH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book.png"))); // NOI18N
        jlbQLMonTH.setText("Quản lý môn thực hành");
        jlbQLMonTH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbQLMonTH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbQLMonTHMouseClicked(evt);
            }
        });
        JPMenu.add(jlbQLMonTH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 200, 40));
        JPMenu.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 221, 10));

        JPLayout.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout JPLayoutLayout = new javax.swing.GroupLayout(JPLayout);
        JPLayout.setLayout(JPLayoutLayout);
        JPLayoutLayout.setHorizontalGroup(
            JPLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 946, Short.MAX_VALUE)
        );
        JPLayoutLayout.setVerticalGroup(
            JPLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlbQLTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbQLTaiKhoanMouseClicked
        // TODO add your handling code here:
        reloadPanel(1);
    }//GEN-LAST:event_jlbQLTaiKhoanMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
        test.login();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jlbQLLopTHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbQLLopTHMouseClicked
        // TODO add your handling code here:
        reloadPanel(4);
    }//GEN-LAST:event_jlbQLLopTHMouseClicked

    private void jlbQLPhongTHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbQLPhongTHMouseClicked
        reloadPanel(3);
    }//GEN-LAST:event_jlbQLPhongTHMouseClicked

    private void jlbQLMonTHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbQLMonTHMouseClicked
        reloadPanel(5);
    }//GEN-LAST:event_jlbQLMonTHMouseClicked

    private void jlbQLLichTHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbQLLichTHMouseClicked
        reloadPanel(2);
    }//GEN-LAST:event_jlbQLLichTHMouseClicked

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPLayout;
    private javax.swing.JPanel JPMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel jlbHoTen;
    private javax.swing.JLabel jlbQLLichTH;
    private javax.swing.JLabel jlbQLLopTH;
    private javax.swing.JLabel jlbQLMonTH;
    private javax.swing.JLabel jlbQLPhongTH;
    private javax.swing.JLabel jlbQLTaiKhoan;
    // End of variables declaration//GEN-END:variables
}