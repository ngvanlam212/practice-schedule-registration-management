/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.LopHocModel;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lamng
 */
public class LopHocDAO extends AbstractTableModel{

    public String coloumns[] = {"STT", "Mã lớp", "Tên lớp", "Số lượng sinh viên", "Giảng viên"};
    public Class classess[] = {int.class, String.class, String.class, int.class, String.class};
    
    private ArrayList<LopHocModel> listLopHoc;

    public LopHocDAO() {
        listLopHoc = new ArrayList<LopHocModel>();
    }
    
    
    public LopHocDAO(ArrayList<LopHocModel> tk){
          listLopHoc = tk;
    } 

    public ArrayList<LopHocModel> getDsTaiKhoan() {
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
            case 1: return listLopHoc.get(rowIndex).getMaLop();
            case 2 :
                return listLopHoc.get(rowIndex).getTenLop();
            case 3:
                return listLopHoc.get(rowIndex).getSlSV();
            case 4:
                return listLopHoc.get(rowIndex).getTk().getHoTen();
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
