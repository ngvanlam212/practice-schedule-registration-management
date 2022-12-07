/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package FileHandle;

import Model.LopHocModel;
import Model.MonHocModel;
import Model.PhieuDangKyModel;
import Model.PhongTHModel;
import Model.TaiKhoanModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author lamng
 */
public class FileHandleImp implements FileHandle{

    String fileTaiKhoan = "TaiKhoan.txt";
    String fileLopHoc = "LopHoc.txt";
    String filePhongTH = "PhongTH.txt";
    String fileMonHoc = "MonHoc.txt";
    String filePhieuDK = "PhieuDK.txt";
    
    @Override
    public <T> void writeToFile(ArrayList<T> list, String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public <T> ArrayList<T> readFile(String fileName) {
        ArrayList<T> list = new ArrayList<>();
        File file = new File(fileName);
        if(file.length() > 0) {
            try {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Object o = ois.readObject();
                list = (ArrayList<T>)o;
                ois.close();
                fis.close();
            } catch(IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
        return list;
    }
    
    public ArrayList<TaiKhoanModel> getDSTaiKhoan() {
        return readFile(fileTaiKhoan);
    }
    
    public void ghiDSTaiKhoan(ArrayList<TaiKhoanModel> tk) {
        writeToFile(tk, fileTaiKhoan);
    }
    
    public ArrayList<LopHocModel> getDSLopHoc() {
        return readFile(fileLopHoc);
    }
    
    public ArrayList<LopHocModel> getDSLopHocByMaGV(int maGV) {
        ArrayList<LopHocModel> dsLopByMaGV = new ArrayList<LopHocModel>();
        for (LopHocModel lh : getDSLopHoc()) {
            if(lh.getTk().getMaGV() == maGV) {
                dsLopByMaGV.add(lh);
            }
        }
        return dsLopByMaGV;
    }
    
    public void ghiDSLopHoc(ArrayList<LopHocModel> lh) {
        writeToFile(lh, fileLopHoc);
    }
    
    public ArrayList<PhongTHModel> getDSPhongTH() {
        return readFile(filePhongTH);
    }
    
    public void ghiDSPhongTH(ArrayList<PhongTHModel> pth) {
        writeToFile(pth, filePhongTH);
    }
    
    public ArrayList<MonHocModel> getDSMon() {
        return readFile(fileMonHoc);
    }
    
    public void ghiDSMon(ArrayList<MonHocModel> mh) {
        writeToFile(mh, fileMonHoc);
    }
    
    public ArrayList<PhieuDangKyModel> getDSPhieuDK() {
        return readFile(filePhieuDK);
    }
    
    public void ghiDSPhieuDK(ArrayList<PhieuDangKyModel> pdk) {
        writeToFile(pdk, filePhieuDK);
    }
    
    public ArrayList<PhieuDangKyModel> getDSPhieuDKByMaGV(int maGV) {
        ArrayList<PhieuDangKyModel> dsPhieuByMaGV = new ArrayList<PhieuDangKyModel>();
        for (PhieuDangKyModel pdk : getDSPhieuDK()) {
            if(pdk.getTk().getMaGV() == maGV) {
                dsPhieuByMaGV.add(pdk);
            }
        }
        return dsPhieuByMaGV;
    }
    
    
}
