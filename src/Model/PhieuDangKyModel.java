/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Date;

public class PhieuDangKyModel implements Serializable{
    private TaiKhoanModel tk;
    private MonHocModel mh;
    private PhongTHModel pth;
    private LopHocModel lh;
    private int maPhieu;
    private String ca;
    private String thu;
    private Date tuNgay;
    private Date denNgay;
    private String trangThai;

    public PhieuDangKyModel() {
    }

    public PhieuDangKyModel(TaiKhoanModel tk, MonHocModel mh, PhongTHModel pth, LopHocModel lh, int maPhieu, String ca, String thu, Date tuNgay, Date denNgay, String trangThai) {
        this.tk = tk;
        this.mh = mh;
        this.pth = pth;
        this.lh = lh;
        this.maPhieu = maPhieu;
        this.ca = ca;
        this.thu = thu;
        this.tuNgay = tuNgay;
        this.denNgay = denNgay;
        this.trangThai = trangThai;
    }

    public PhieuDangKyModel(int maPhieu) {
        this.maPhieu = maPhieu;
    }
    
    public TaiKhoanModel getTk() {
        return tk;
    }

    public void setTk(TaiKhoanModel tk) {
        this.tk = tk;
    }

    public MonHocModel getMh() {
        return mh;
    }

    public void setMh(MonHocModel mh) {
        this.mh = mh;
    }

    public PhongTHModel getPth() {
        return pth;
    }

    public void setPth(PhongTHModel pth) {
        this.pth = pth;
    }

    public LopHocModel getLh() {
        return lh;
    }

    public void setLh(LopHocModel lh) {
        this.lh = lh;
    }

    public int getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(int maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public String getThu() {
        return thu;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }

    public Date getTuNgay() {
        return tuNgay;
    }

    public void setTuNgay(Date tuNgay) {
        this.tuNgay = tuNgay;
    }

    public Date getDenNgay() {
        return denNgay;
    }

    public void setDenNgay(Date denNgay) {
        this.denNgay = denNgay;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final PhieuDangKyModel other = (PhieuDangKyModel) obj;
        return this.maPhieu == other.maPhieu;
    }

    
}
