/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.PhieuDangKyModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lamng
 */
public class PhieuDangKyDAO extends AbstractTableModel{
    public String coloumns[] = {"STT", "Mã phiếu", "Giáo viên", "Mã môn", "Mã lớp", "Mã phòng", "Ca", "Thứ", "Từ ngày", "Đến ngày", "Trạng thái"};
    public Class classess[] = {int.class, int.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class};
    
    private ArrayList<PhieuDangKyModel> listPhieuDK;
    SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
    public PhieuDangKyDAO(){
        listPhieuDK = new ArrayList<PhieuDangKyModel>();
    }
    
    
    public PhieuDangKyDAO(ArrayList<PhieuDangKyModel> pdk){
          listPhieuDK = pdk;
    } 

    public ArrayList<PhieuDangKyModel> getDsPhieuDK() {
        return listPhieuDK;
    }
    
    @Override
    public int getRowCount() {
        return listPhieuDK.size();
    }

    @Override
    public int getColumnCount() {
        return coloumns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return rowIndex + 1;
            case 1: return listPhieuDK.get(rowIndex).getMaPhieu();
            case 2: return listPhieuDK.get(rowIndex).getTk().getHoTen();
            case 3 :
                return listPhieuDK.get(rowIndex).getMh().getMaMH();
            case 4:
                return listPhieuDK.get(rowIndex).getLh().getMaLop();
            case 5:
                return listPhieuDK.get(rowIndex).getPth().getMaPhong();
            case 6:
                return listPhieuDK.get(rowIndex).getCa();
            case 7:
                return listPhieuDK.get(rowIndex).getThu();  
            case 8:
                return fm.format(listPhieuDK.get(rowIndex).getTuNgay());
            case 9:
                return fm.format(listPhieuDK.get(rowIndex).getDenNgay());
            case 10:
                return listPhieuDK.get(rowIndex).getTrangThai();  
            default: return null;
        }
    }
    
    @Override
    public Class getColumnClass(int columnIndex){
           return classess[columnIndex];
    }
    
    @Override
    public String getColumnName(int columnIndex){
           return coloumns[columnIndex];
    }
}
