/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConTroller;

import Dao.PhongDao;
import Modell.Phong;
import java.awt.Component;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class QuanLyPhong {
    private PhongDao phongDao=new PhongDao();
    public boolean ThemPhong(Phong phong,JLabel jLabel){
       boolean check=true;
           if (phong.getMaphong().length() == 0) {
            JOptionPane.showInputDialog("Bạn chưa nhập mã phòng ");
            check = false;
        }
        if (phong.getTenphong().length() == 0) {
         JOptionPane.showInputDialog("Bạn đặt tên phòng ");
            check = false;
        }
        Component rootPane=null;
        if (phong.getLoaiphonh().contains("Se")) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn loại phòng");
            check = false;
        }
        if (check == true) {
            try {
             Phong phong1 = new Phong();
            phong.setMaphong(phong.getMaphong());
            phong.setTenphong(phong.getTenphong());
            phong.setChuy(phong.getChuy());
            phong.setLoaiphonh(phong.getLoaiphonh());
           phong.setGiaphong(Integer.parseInt(jLabel.getText()));  
                phongDao.InsertInto(phong);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Trùng mã");
                check=false;
            }}
       
       return  check;
    }
     public boolean ChinhSua(Phong phong,JLabel jLabel){
       boolean check=true;
           if (phong.getMaphong().length() == 0) {
            JOptionPane.showInputDialog("Bạn chưa nhập mã phòng ");
            check = false;
        }
        if (phong.getTenphong().length() == 0) {
         JOptionPane.showInputDialog("Bạn đặt tên phòng ");
            check = false;
        }
        Component rootPane=null;
        if (phong.getLoaiphonh().contains("Se")) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn loại phòng");
            check = false;
        }
        if (check == true) {
            try {
             Phong phong1 = new Phong();
            phong.setMaphong(phong.getMaphong());
            phong.setTenphong(phong.getTenphong());
            phong.setChuy(phong.getChuy());
            phong.setLoaiphonh(phong.getLoaiphonh());
           phong.setGiaphong(Integer.parseInt(jLabel.getText()));  
                phongDao.Update(phong);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Trùng mã");
                check=false;
            }}
       
       return  check;
    }
    
}
