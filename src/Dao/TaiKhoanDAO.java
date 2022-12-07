/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.TaiKhoanModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lamng
 */
public class TaiKhoanDAO extends AbstractTableModel{
    public String coloumns[] = {"STT", "ID", "Tên đăng nhập", "Mật khẩu", "Họ tên giáo viên","Ngày sinh","Địa chỉ", "Email", "SĐT", "Quyền"};
    public Class classess[] = {int.class, int.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class};
    
    private ArrayList<TaiKhoanModel> listTK;
    SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
    public TaiKhoanDAO() {
        listTK = new ArrayList<TaiKhoanModel>();
    }
    
    
    public TaiKhoanDAO(ArrayList<TaiKhoanModel> tk){
          listTK = tk;
    } 

    public ArrayList<TaiKhoanModel> getDsTaiKhoan() {
        return listTK;
    }
    
    @Override
    public int getRowCount() {
        return listTK.size();
    }

    @Override
    public int getColumnCount() {
        return coloumns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return rowIndex + 1;
            case 1: return listTK.get(rowIndex).getMaGV();
            case 2 :
                return listTK.get(rowIndex).getUsername();
            case 3:
                return listTK.get(rowIndex).getPassword();
            case 4 :
                return listTK.get(rowIndex).getHoTen();
            case 5 :
                return fm.format(listTK.get(rowIndex).getNgaySinh());
            case 6 :
                return listTK.get(rowIndex).getDiaChi();
            case 7 :
                return listTK.get(rowIndex).getEmail();
            case 8 :
                return listTK.get(rowIndex).getSDT();
            case 9 :
                if (listTK.get(rowIndex).getQuyen() == 0) {
                    return "Thông thường";
                } else {
                    return "Admin";
                }
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
