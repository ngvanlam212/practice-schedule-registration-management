/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Objects;

public class PhongTHModel implements Serializable{
    private String maPhong;
    private String tenPhong;
    private int tang;
    private String toaNha;
    private String cauHinh;
    private int soMay;
    private String tinhTrang;

    public PhongTHModel() {
    }

    public PhongTHModel(String maPhong) {
        this.maPhong = maPhong;
    }

    public PhongTHModel(String maPhong, String tenPhong, int tang, String toaNha, String cauHinh, int soMay, String tinhTrang) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.tang = tang;
        this.toaNha = toaNha;
        this.cauHinh = cauHinh;
        this.soMay = soMay;
        this.tinhTrang = tinhTrang;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    public String getToaNha() {
        return toaNha;
    }

    public void setToaNha(String toaNha) {
        this.toaNha = toaNha;
    }

    public String getCauHinh() {
        return cauHinh;
    }

    public void setCauHinh(String cauHinh) {
        this.cauHinh = cauHinh;
    }

    public int getSoMay() {
        return soMay;
    }

    public void setSoMay(int soMay) throws Exception{
        if (soMay <= 0) {
            throw new Exception("Số máy phải lớn hơn không");
        }
        this.soMay = soMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PhongTHModel other = (PhongTHModel) obj;
        return Objects.equals(this.maPhong, other.maPhong);
    }
    
    
}
