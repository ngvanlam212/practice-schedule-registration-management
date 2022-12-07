/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package UI.Admin;

import Model.LopHocModel;
import Model.TaiKhoanModel;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author lamng
 */
public class DLSuaLopHoc extends javax.swing.JDialog {
    private ArrayList<TaiKhoanModel> listGV;
    private int index;
    private LopHocModel lh;
    public DLSuaLopHoc(java.awt.Frame parent, boolean modal, LopHocModel lh, int index) {
        super(parent, modal);
        this.lh = lh;
        this.index = index;
        listGV = JPQLLopTH.jpQLLopTH.getListTK();
        initComponents();
        setView(lh);
    }

    //Lấy thông tin lớp học đã chọn và hiển thị ra form sửa
    public void setView(LopHocModel lh) {
        txtMaLop.setText(lh.getMaLop());
        txtTenLop.setText(lh.getTenLop());
        txtSLSV.setText(String.valueOf(lh.getSlSV()));
        cbGV.setSelectedItem(lh.getTk().getHoTen());
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
        txtSLSV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbGV = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtMaLop = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTenLop = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin lớp thực hành", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(51, 153, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("SL sinh viên:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, 30));

        txtSLSV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtSLSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 80, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Giảng viên: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 80, 30));

        cbGV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbGV.setModel(new DefaultComboBoxModel(JPQLLopTH.jpQLLopTH.getListTenGV().toArray())
        );
        jPanel1.add(cbGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 230, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mã lớp:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 30));

        txtMaLop.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtMaLop, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 230, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Tên lớp:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, 30));

        txtTenLop.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtTenLop, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 230, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 420, 220));

        btnLuu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(51, 153, 255));
        btnLuu.setText("Sửa lớp thực hành");
        btnLuu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        getContentPane().add(btnLuu, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 180, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        if (txtSLSV.getText().isEmpty() || txtMaLop.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ");
        } else {
            LopHocModel lhNew = new LopHocModel();
            lhNew.setMaLop(txtMaLop.getText());
            if (JPQLLopTH.jpQLLopTH.getListLopHoc().contains(lhNew) || !lhNew.getMaLop().equals(lh.getMaLop())) {
                JOptionPane.showMessageDialog(null, "Mã lớp đã tồn tại");
            } else {
                lhNew.setTenLop(txtTenLop.getText());
                lhNew.setTk(new TaiKhoanModel(listGV.get(cbGV.getSelectedIndex()).getMaGV(), cbGV.getSelectedItem().toString()));
                try {
                    lhNew.setSlSV(Integer.parseInt(txtSLSV.getText()));
                    JPQLLopTH.jpQLLopTH.suaLopHoc(lhNew, index);
                    JOptionPane.showMessageDialog(null, "Sửa thành công");
                    JPQLLopTH.jpQLLopTH.loadTable();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Số lượng sinh viên phải là số nguyên dương");
                }
            }
            
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JComboBox<String> cbGV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMaLop;
    private javax.swing.JTextField txtSLSV;
    private javax.swing.JTextField txtTenLop;
    // End of variables declaration//GEN-END:variables
}
