/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package UI.Admin;

import Model.PhongTHModel;
import javax.swing.JOptionPane;

public class DLThemPhongTH extends javax.swing.JDialog {

    /**
     * Creates new form DLThemPhongTH
     */
    public DLThemPhongTH(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMaPhong = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenPhong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSoMay = new javax.swing.JTextField();
        txtTinhTrang = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCauHinh = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        cbToaNha = new javax.swing.JComboBox<>();
        cbTang = new javax.swing.JComboBox<>();
        btnLuu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Th??ng tin ph??ng th???c h??nh", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(51, 153, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("M?? ph??ng:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 100, 30));

        txtMaPhong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtMaPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 160, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("T??a nh??");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 100, 30));

        txtTenPhong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtTenPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 160, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("T??n ph??ng:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("T???ng:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 100, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("C???u h??nh:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 80, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("S??? m??y:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 100, 30));

        txtSoMay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtSoMay, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 70, 30));

        txtTinhTrang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtTinhTrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 210, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("T??nh tr???ng:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 100, 30));

        txtCauHinh.setColumns(20);
        txtCauHinh.setRows(5);
        jScrollPane1.setViewportView(txtCauHinh);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 23, 180, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 33, 170, 0));

        cbToaNha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A1", "C1" }));
        jPanel2.add(cbToaNha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 50, 30));

        cbTang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));
        jPanel2.add(cbTang, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 50, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 770, 270));

        btnLuu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(51, 153, 255));
        btnLuu.setText("Th??m ph??ng th???c h??nh");
        btnLuu.setToolTipText("");
        btnLuu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        getContentPane().add(btnLuu, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 200, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        if (txtTenPhong.getText().isEmpty() ||
            txtMaPhong.getText().isEmpty() || txtCauHinh.getText().isEmpty() || txtSoMay.getText().isEmpty()||
            txtTinhTrang.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui l??ng nh???p ?????y ?????");
        } else {
            PhongTHModel pth = new PhongTHModel();
            pth.setMaPhong(txtMaPhong.getText());
            if(JPQLPhongTH.jPQLPhongTH.getListPhongTH().contains(pth)) {
                JOptionPane.showMessageDialog(null, "M?? ph??ng ???? t???n t???i");
            } else {
                pth.setTenPhong(txtTenPhong.getText());
                pth.setTang(Integer.parseInt(cbTang.getSelectedItem().toString()));
                pth.setToaNha(cbToaNha.getSelectedItem().toString());
                pth.setCauHinh(txtCauHinh.getText());
                try {
                    pth.setSoMay(Integer.parseInt(txtSoMay.getText()));
                    pth.setTinhTrang(txtTinhTrang.getText());                
                    JPQLPhongTH.jPQLPhongTH.themPhongTH(pth);
                    JOptionPane.showMessageDialog(null, "Th??m th??nh c??ng");
                    JPQLPhongTH.jPQLPhongTH.loadTable();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "S??? m??y ph???i l?? s??? nguy??n d????ng");
                }

            }
            
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JComboBox<String> cbTang;
    private javax.swing.JComboBox<String> cbToaNha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea txtCauHinh;
    private javax.swing.JTextField txtMaPhong;
    private javax.swing.JTextField txtSoMay;
    private javax.swing.JTextField txtTenPhong;
    private javax.swing.JTextField txtTinhTrang;
    // End of variables declaration//GEN-END:variables
}
