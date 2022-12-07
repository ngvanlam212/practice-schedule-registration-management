/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.PhongTHModel;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lamng
 */
public class PhongTHDAO extends AbstractTableModel{

    public String coloumns[] = {"STT", "Mã phòng", "Tên phòng", "Tầng", "Tòa nhà", "Cấu hình", "Số máy", "Tình trạng"};
    public Class classess[] = {int.class, String.class, String.class, int.class, String.class, String.class, int.class, String.class};
    
    private ArrayList<PhongTHModel> listLopHoc;

    public PhongTHDAO() {
        listLopHoc = new ArrayList<PhongTHModel>();
    }
    
    
    public PhongTHDAO(ArrayList<PhongTHModel> tk){
          listLopHoc = tk;
    } 

    public ArrayList<PhongTHModel> getDsMon() {
        return listLopHoc;
    }
    
    @Override
    public int getRowCount() {
        return listLopHoc.size();
    }

    @Override
    public int getColumnCount() {
        return coloumns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return rowIndex + 1;
            case 1: return listLopHoc.get(rowIndex).getMaPhong();
            case 2 :
                return listLopHoc.get(rowIndex).getTenPhong();
            case 3:
                return listLopHoc.get(rowIndex).getTang();
            case 4:
                return listLopHoc.get(rowIndex).getToaNha();
            case 5:
                return listLopHoc.get(rowIndex).getCauHinh();
            case 6:
                return listLopHoc.get(rowIndex).getSoMay();
            case 7:
                return listLopHoc.get(rowIndex).getTinhTrang();
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
