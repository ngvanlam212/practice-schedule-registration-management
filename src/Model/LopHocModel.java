/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author lamng
 */
public class LopHocModel implements Serializable{
    private String maLop;
    private String tenLop;
    private int slSV;
    private TaiKhoanModel tk;

    public LopHocModel() {
    }

    public LopHocModel(String maLop) {
        this.maLop = maLop;
    }

    public LopHocModel(String maLop, String tenLop, int slSV, TaiKhoanModel tk) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.slSV = slSV;
        this.tk = tk;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getSlSV() {
        return slSV;
    }

    public void setSlSV(int slSV) throws Exception{
        if (slSV <= 0) {
            throw new Exception();
        }
        this.slSV = slSV;
    }

    public TaiKhoanModel getTk() {
        return tk;
    }

    public void setTk(TaiKhoanModel tk) {
        this.tk = tk;
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
        final LopHocModel other = (LopHocModel) obj;
        return Objects.equals(this.maLop, other.maLop);
    }
    
    
}
