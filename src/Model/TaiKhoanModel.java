
package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 *
 * @author lamng
 */
public class TaiKhoanModel implements Serializable{
    private int maGV;
    private String username;
    private String password;
    private String hoTen;
    private Date ngaySinh;
    private String diaChi;
    private String email;
    private String SDT;
    private int quyen;

    public TaiKhoanModel(int maGV, String username, String password, String hoTen, Date ngaySinh, String diaChi, String email, String SDT, int quyen) {
        this.maGV = maGV;
        this.username = username;
        this.password = password;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.email = email;
        this.SDT = SDT;
        this.quyen = quyen;
    }

    public TaiKhoanModel() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public TaiKhoanModel(int maGV, String hoTen) {
        this.maGV = maGV;
        this.hoTen = hoTen;
    }

    
    
    public TaiKhoanModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getMaGV() {
        return maGV;
    }

    public void setMaGV(int maGV) {
        this.maGV = maGV;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        
        this.email = email;
    }

    public String getSDT(){
        return SDT;
    }

    public void setSDT(String SDT) throws Exception{
        String pattern = "^\\d+$";
        if (!Pattern.matches(pattern, SDT)) {
            throw new Exception();
        }
        this.SDT = SDT;
    }

    public int getQuyen() {
        return quyen;
    }

    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final TaiKhoanModel other = (TaiKhoanModel) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return Objects.equals(this.password, other.password);
    }
    
    
}
