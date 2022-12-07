/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.MonHocModel;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class MonHocDAO extends AbstractTableModel{
    public String coloumns[] = {"STT", "Mã môn", "Tên môn", "Số tín chỉ"};
    public Class classess[] = {int.class, String.class, String.class, int.class};
    
    private ArrayList<MonHocModel> listMon;

    public MonHocDAO() {
        listMon = new ArrayList<MonHocModel>();
    }
    
    
    public MonHocDAO(ArrayList<MonHocModel> tk){
          listMon = tk;
    } 

    public ArrayList<MonHocModel> getDsMon() {
        return listMon;
    }
    
    @Override
    public int getRowCount() {
        return listMon.size();
    }

    @Override
    public int getColumnCount() {
        return coloumns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return rowIndex + 1;
            case 1: return listMon.get(rowIndex).getMaMH();
            case 2 :
                return listMon.get(rowIndex).getTenMH();
            case 3:
                return listMon.get(rowIndex).getSoTinChi();
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
