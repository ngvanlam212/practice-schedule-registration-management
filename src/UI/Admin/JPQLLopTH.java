/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Admin;

import Dao.LopHocDAO;
import FileHandle.FileHandleImp;
import Model.LopHocModel;
import Model.TaiKhoanModel;
import Test.test;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author lamng
 */
public class JPQLLopTH extends javax.swing.JPanel {
    private ArrayList<LopHocModel> listLopHoc;
    private ArrayList<TaiKhoanModel> listTK;;
    private FileHandleImp fileHandle;
    
    public static JPQLLopTH jpQLLopTH;
    public JPQLLopTH() {
        jpQLLopTH = this;
        fileHandle = new FileHandleImp();
        listTK = fileHandle.getDSTaiKhoan();
        listLopHoc = fileHandle.getDSLopHoc();
        initComponents();
        loadTable();
    }

    //Lấy danh sách tài khoản
    public ArrayList<TaiKhoanModel> getListTK() {
        return listTK;
    }
    
    //Lấy danh sách lớp học
    public ArrayList<LopHocModel> getListLopHoc() {
        return listLopHoc;
    }
    
    //Lấy danh sách tên giáo viên
    public ArrayList<String> getListTenGV() {
        ArrayList<String> listTenGV = new ArrayList<String>();
        for (TaiKhoanModel tk : listTK) {
            listTenGV.add(tk.getHoTen());
        }
        return listTenGV;
    }


    public void loadTable() {
        tbLopHoc.setModel(new LopHocDAO(listLopHoc));
        
        //Dùng để sắp xếp các cột
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tbLopHoc.getModel());       
        tbLopHoc.setRowSorter(rowSorter);
        
        //Lấy kí tự nhập vào form tìm kiếm
        txtSearch.getDocument().addDocumentListener(new DocumentListener() {
            //Mỗi khi thêm kí tự
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = txtSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                }else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            
             //Mỗi khi xóa kí tự
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = txtSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                }else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
        
        tbLopHoc.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
    }
    
    public void ghiDSLopHoc() {
        fileHandle.ghiDSLopHoc(listLopHoc);
    }
    
    public void themLopHoc(LopHocModel lh) {
        listLopHoc.add(lh);
        ghiDSLopHoc();
    }
    
    public void suaLopHoc(LopHocModel lh, int index) {
        listLopHoc.set(index, lh);
        ghiDSLopHoc();
    }
    
    public void xoaLopHoc(int index) {
        listLopHoc.remove(index);
        ghiDSLopHoc();
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
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLopHoc = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Quản lý lớp thực hành");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 940, -1));

        jPanel2.setName(""); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel2.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 100, 60));
        jPanel2.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 190, 30));

        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel2.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, 100, 60));

        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 100, 60));

        tbLopHoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbLopHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbLopHoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbLopHoc.setRowHeight(24);
        jScrollPane1.setViewportView(tbLopHoc);
        tbLopHoc.getAccessibleContext().setAccessibleName("");

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 710, 320));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Tìm kiếm");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 938, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        DLThemLopHoc themLH = new DLThemLopHoc(test.jfmainAdmin, true);
        themLH.setTitle("Thêm lớp thực hành mới");
        themLH.setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        //Lấy thông tin lớp thực hành đã chọn và mở form sửa khi nhấn nút sửa
        int selectedRowIndex = tbLopHoc.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn lớp học nào !");
        } else {
            LopHocModel lh = new LopHocModel();
            lh.setMaLop(tbLopHoc.getValueAt(selectedRowIndex, 1).toString());
            lh.setTenLop(tbLopHoc.getValueAt(selectedRowIndex, 2).toString());
            try {
                lh.setSlSV((int)tbLopHoc.getValueAt(selectedRowIndex, 3));
                lh.setTk(new TaiKhoanModel(0, tbLopHoc.getValueAt(selectedRowIndex, 4).toString()));
                //Truyền lh từ lựa chọn trên bảng vào form sửa
                DLSuaLopHoc suaLH = new DLSuaLopHoc(test.jfmainAdmin, true, lh, listLopHoc.indexOf(lh));
                suaLH.setTitle("Sửa thông tin lớp học");
                suaLH.setVisible(true);
            } catch(Exception e) {
                
            }

        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
      
        int selectedRowIndex = tbLopHoc.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn lớp học nào !");
        } else {
            String maLop = tbLopHoc.getValueAt(selectedRowIndex, 1).toString();
            LopHocModel lhXoa = new LopHocModel(maLop);
            //Hiển thị xác nhận xóa
            int qs;
            qs = JOptionPane.showConfirmDialog(null, "Xóa lớp: " + maLop, "Xóa tài khoản", JOptionPane.YES_NO_OPTION);
            if (qs == JOptionPane.YES_OPTION){
                xoaLopHoc(listLopHoc.indexOf(lhXoa));
                loadTable();
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbLopHoc;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
