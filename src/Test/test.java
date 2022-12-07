/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import Model.TaiKhoanModel;
import UI.JFLogin;
import UI.JFMainAdmin;
import UI.JFMainNormalUser;

/**
 *
 * @author lamng
 */
public class test {
    public static JFMainAdmin jfmainAdmin;
    public static JFMainNormalUser jfMainNormalUser;
    public static JFLogin jflogin;
    public static TaiKhoanModel tk;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        login();
    }
    public static void login(){
        jflogin = new JFLogin();
        jflogin.setLocationRelativeTo(null);
        jflogin.setTitle("Đăng nhập");
        jflogin.setVisible(true);       
    }  
    public static void loadAdmin(){
        jfmainAdmin = new JFMainAdmin();
        jfmainAdmin.setLocationRelativeTo(null);
        jfmainAdmin.setVisible(true);       
    }
    
    public static void loadNormalUser() {
        jfMainNormalUser = new JFMainNormalUser();
        jfMainNormalUser.setLocationRelativeTo(null);
        jfMainNormalUser.setVisible(true);   
    }
    
}
