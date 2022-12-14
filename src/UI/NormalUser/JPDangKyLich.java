/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.NormalUser;

import FileHandle.FileHandleImp;
import Model.LopHocModel;
import Model.MonHocModel;
import Model.PhieuDangKyModel;
import Model.PhongTHModel;
import Model.TaiKhoanModel;
import Test.test;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author lamng
 */
public class JPDangKyLich extends javax.swing.JPanel {
    private ArrayList<TaiKhoanModel> listGV;
    private ArrayList<LopHocModel> listLopByMaGV;
    private ArrayList<MonHocModel> listMonHoc;
    private ArrayList<PhongTHModel> listPhongTH;
    private ArrayList<PhieuDangKyModel> listPhieuDK;
    private ArrayList<PhieuDangKyModel> listPhieuDKByMaGV;
    private FileHandleImp fileHandle;
    public static JPDangKyLich jpDangKyLich;
    
    public JPDangKyLich() {
        jpDangKyLich = this;
        fileHandle = new FileHandleImp();
        listPhieuDK = fileHandle.getDSPhieuDK();
        initComponents();
        loadTable();
    }
    
    public ArrayList<String> getListMaLop() {
        listLopByMaGV = fileHandle.getDSLopHocByMaGV(test.tk.getMaGV());
        ArrayList<String> listMaLop = new ArrayList<String>();
        for (LopHocModel lh : listLopByMaGV) {
            listMaLop.add(lh.getMaLop());
        }
        return listMaLop;
    }
    
    public ArrayList<String> getListMaMon() {
        listMonHoc = fileHandle.getDSMon();
        ArrayList<String> listMaMon = new ArrayList<String>();
        for (MonHocModel mh : listMonHoc) {
            listMaMon.add(mh.getMaMH());
        }
        return listMaMon;
    }
    
    public ArrayList<String> getListMaPhong() {
        listPhongTH = fileHandle.getDSPhongTH();
        ArrayList<String> listMaPhong = new ArrayList<String>();
        for (PhongTHModel pth : listPhongTH) {
            listMaPhong.add(pth.getMaPhong());
        }
        return listMaPhong;
    }

    public void loadTable() {
        listPhieuDKByMaGV = fileHandle.getDSPhieuDKByMaGV(test.tk.getMaGV());
        //Set header
        tbDaDangKy.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        //Danh sach cac cot
        String col[] = {"STT","M?? phi???u","M?? l???p", "M?? m??n", "M?? ph??ng", "Ca", "Th???", "T??? ng??y", "?????n ng??y", "Tr???ng th??i"};
        DefaultTableModel model = new DefaultTableModel(col, 0);
        int stt = 0;
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        for (PhieuDangKyModel pdk : listPhieuDKByMaGV) {
            stt++;
            Object[] obj = {stt, pdk.getMaPhieu(), pdk.getLh().getMaLop(), pdk.getMh().getMaMH(), 
                pdk.getPth().getMaPhong(), pdk.getCa(), pdk.getThu(), 
                fm.format(pdk.getTuNgay()), fm.format(pdk.getDenNgay()), pdk.getTrangThai()};
            model.addRow(obj);
        }
        
        tbDaDangKy.setModel(model);
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tbDaDangKy.getModel());
        tbDaDangKy.setRowSorter(rowSorter);
    }
    
    //L???y m?? phi???u l???n nh???t
    public int getLastId() {
        if (!listPhieuDK.isEmpty()) {
            int lastId = listPhieuDK.get(0).getMaPhieu();
            for (int i = 1; i < listPhieuDK.size(); i++) {
                if (listPhieuDK.get(i).getMaPhieu() > lastId) {
                    lastId = listPhieuDK.get(i).getMaPhieu();
                } 
            }
            return lastId;
        }
        return 0;
    }
    
    //H??m ki???m tra tr??ng l???ch
    public boolean isTrungLich(String maPhong, String ca, String thu, Date tuNgay, Date denNgay) {
        for (PhieuDangKyModel pdk : listPhieuDK) {
            if (pdk.getTrangThai().equals("T??? ch???i")) {
                continue;
            }
            if (pdk.getPth().getMaPhong().equals(maPhong) && pdk.getCa().equals(ca) && pdk.getThu().equals(thu)) {
                if(tuNgay.compareTo(pdk.getDenNgay()) > 0) {
                    return false;
                }
                if (denNgay.compareTo(pdk.getTuNgay()) < 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    public void ghiDSPhieuDangKy() {
        fileHandle.ghiDSPhieuDK(listPhieuDK);
    }
    
    public void themPhieuDangKy(PhieuDangKyModel pdk) {
        listPhieuDK.add(pdk);
        ghiDSPhieuDangKy();
    }
    
    public void suaPhieuDangky(PhieuDangKyModel pdk, int index) {
        listPhieuDK.set(index, pdk);        
        ghiDSPhieuDangKy();
    }
    
    public void xoaPhieuDangKy(int index) {
        listPhieuDK.remove(index);
        ghiDSPhieuDangKy();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDaDangKy = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 910, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("????ng k?? l???ch th???c h??nh");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        tbDaDangKy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbDaDangKy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "M?? phi???u", "M?? l???p", "M?? m??n", "M?? ph??ng", "Ca", "Th???", "T??? ng??y", "?????n ng??y", "Tr???ng th??i"
            }
        ));
        tbDaDangKy.setRowHeight(25);
        jScrollPane1.setViewportView(tbDaDangKy);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 680, 310));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Danh s??ch ph??ng ???? ????ng k??");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 270, -1));

        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        btnThem.setText("????ng k?? m???i");
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 150, 60));

        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        btnSua.setText("S???a phi???u");
        btnSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 150, 60));

        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        btnXoa.setText("H???y l???ch");
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, 150, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        DLDangKyLich dlDangKyLich = new DLDangKyLich(test.jfMainNormalUser, true);
        dlDangKyLich.setTitle("????ng k?? l???ch th???c h??nh m???i");
        dlDangKyLich.setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // L???y th??ng tin phi???u ????ng k?? t??? l???a ch???n tr??n b???ng v?? truy???n v??o form s???a
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        int selectedRowIndex = tbDaDangKy.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "B???n ch??a ch???n phi???u ????ng k?? n??o !");
        } else {
            PhieuDangKyModel pdk = new PhieuDangKyModel();
            pdk.setMaPhieu((int)tbDaDangKy.getValueAt(selectedRowIndex, 1));
            pdk.setLh(new LopHocModel(tbDaDangKy.getValueAt(selectedRowIndex, 2).toString()));
            pdk.setMh(new MonHocModel(tbDaDangKy.getValueAt(selectedRowIndex, 3).toString()));
            pdk.setPth(new PhongTHModel(tbDaDangKy.getValueAt(selectedRowIndex, 4).toString()));
            pdk.setCa(tbDaDangKy.getValueAt(selectedRowIndex, 5).toString());
            pdk.setThu(tbDaDangKy.getValueAt(selectedRowIndex, 6).toString());
            try {
                pdk.setTuNgay(fm.parse(tbDaDangKy.getValueAt(selectedRowIndex, 7).toString()));
            } catch (ParseException ex) {
                Logger.getLogger(JPDangKyLich.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                pdk.setDenNgay(fm.parse(tbDaDangKy.getValueAt(selectedRowIndex, 8).toString()));
            } catch (ParseException ex) {
                Logger.getLogger(JPDangKyLich.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                //Truy???n pdk v??o form s???a v?? hi???n th??? form s???a
                DLSuaLich dlSuaLich = new DLSuaLich(test.jfMainNormalUser, true, pdk, listPhieuDK.indexOf(pdk));
                dlSuaLich.setTitle("S???a th??ng tin l???ch ????ng k??");
                dlSuaLich.setVisible(true);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int selectedRowIndex = tbDaDangKy.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "B???n phi???u ????ng k?? n??o !");
        } else {
            int maPhieu = (int) tbDaDangKy.getValueAt(selectedRowIndex, 1);
            
            PhieuDangKyModel pdkXoa = new PhieuDangKyModel(maPhieu);
            
            //Hi???n th??? form x??c nh???n x??a
            int qs;
            qs = JOptionPane.showConfirmDialog(null, "X??a phi???u c?? m??: " + maPhieu, "X??a phi???u ????ng k??", JOptionPane.YES_NO_OPTION);
            if (qs == JOptionPane.YES_OPTION){
                xoaPhieuDangKy(listPhieuDK.indexOf(pdkXoa));
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbDaDangKy;
    // End of variables declaration//GEN-END:variables
}
