/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConTroller;

import Dao.NhanVienDao;
import Modell.NhanVien;
import Modell.TaiKhoan;
import View.TrangChu;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class QuanLyNV {
    private NhanVienDao nhanVienDao=new NhanVienDao();
    private Component rootPane;
    public boolean ThemNhanVien(String ID, String Ten, String Chucvu1, String Gioitinh, String Luong, String NamSinh, String ChuThich){
        Component rootPane = null;
        boolean check=true;
          NhanVien nhanVien = new NhanVien();
          if (ID.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập mã nhân viên");
            check = false;
        } else if (Ten.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập tên nhân viên");
            check = false;
        } else if (Luong.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập lương nhân viên");
            check = false;
        } else if (NamSinh.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập ngày sinh nhân viên");
            check = false;
        } else if (Luong.length() > 0) {

            try {
                Integer.parseInt(Luong);
                check = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập số ");
                check = false;
            }
        }
        if (check == true) {
            nhanVien.setGioiTinh(Gioitinh);
            nhanVien.setTen(Ten);
            nhanVien.setID(ID);
            nhanVien.setChucVu(Chucvu1);
            nhanVien.setLuong(Luong);
            nhanVien.setNamSinh(NamSinh);
            nhanVien.setChuThich(ChuThich);
        
            try {
                nhanVienDao.InsertInto(nhanVien);
            } catch (SQLException ex) {
       Logger.getLogger(QuanLyNV.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showConfirmDialog(rootPane, "ID Bạn vừa nhập đã tồn tại");
       check=false;
            }
        }
        return check;
    }
  public boolean ChinhSưaNhanVien(String ID, String Ten, String Chucvu1, String Gioitinh, String Luong, String NamSinh, String ChuThich){
        Component rootPane = null;
        boolean check=true;
          NhanVien nhanVien = new NhanVien();
          if (ID.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập mã nhân viên");
            check = false;
        } else if (Ten.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập tên nhân viên");
            check = false;
        } else if (Luong.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập lương nhân viên");
            check = false;
        } else if (NamSinh.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập ngày sinh nhân viên");
            check = false;
        } else if (Luong.length() > 0) {

            try {
                Integer.parseInt(Luong);
                check = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập số ");
                check = false;
            }
        }
        if (check == true) {
            nhanVien.setGioiTinh(Gioitinh);
            nhanVien.setTen(Ten);
            nhanVien.setID(ID);
            nhanVien.setChucVu(Chucvu1);
            nhanVien.setLuong(Luong);
            nhanVien.setNamSinh(NamSinh);
            nhanVien.setChuThich(ChuThich);
    
            try {
               nhanVienDao.Update(nhanVien);
                nhanVienDao.updatetk(nhanVien);
            } catch (SQLException ex) {
       Logger.getLogger(QuanLyNV.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showConfirmDialog(rootPane, "ID Bạn vừa nhập đã tồn tại");
       check=false;
            }
        }
        return check;
    }
  public boolean XoaNhanVien(NhanVien nhanVien,TaiKhoan taiKhoan){
      boolean Check=true;
            try {
            nhanVienDao.Delete(taiKhoan);
            nhanVienDao.Delete(nhanVien);
        } catch (SQLException ex) {
      JOptionPane.showMessageDialog(rootPane,"Nhân viên này không thể xóa vui lòng kiểm tra lại ");
            try {
            nhanVienDao.InsertInto(taiKhoan);
            } catch (SQLException ex1) {
             //   Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex1);
            }
        Check=false;
        }
      return  Check;
  }
  
    
}
