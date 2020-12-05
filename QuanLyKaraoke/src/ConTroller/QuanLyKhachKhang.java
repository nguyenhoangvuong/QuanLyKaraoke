/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConTroller;

import Dao.DatPhogDao;
import Dao.HoaDonDao;
import Dao.PhongDao;
import Modell.Datphong;
import Modell.KhachHang;
import Modell.NhanVien;
import Modell.Phong;
import View.TrangChu;
import java.awt.Component;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class QuanLyKhachKhang {
  private DatPhogDao datPhogDao=new DatPhogDao();
  private PhongDao phongDao=new PhongDao();
  private List<Phong>phongs=new ArrayList<>();
  private List<Datphong>datphongs=new ArrayList<>();
    public QuanLyKhachKhang() {
          ShowData();
    }
  
    public KhachHang ThemKhachHang(KhachHang khachHang) {
        boolean kiemtra = true;
        KhachHang khachHang1 = null;  
        Component rootPane = null;
        if (khachHang.getTen().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập tên KH");
            kiemtra = false;
        } else if (khachHang.getLienLac().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập thông tin liên hệ KH");
            kiemtra = false;
        }
        if (khachHang.getLienLac().length() > 0) {
            if (!khachHang.getLienLac().matches("03+\\d{8}")) {
                if (!khachHang.getLienLac().matches("09+\\d{8}")) {
                    JOptionPane.showMessageDialog(rootPane, "Sai định dạng SĐT");
                    kiemtra = false;
                }
            }
        }
        if (kiemtra == true) {
            khachHang1 = khachHang;
        }
        return khachHang1;
    }
     public boolean SuaKhachHang(KhachHang khachHang){
     boolean kiemtra=true;
      Component rootPane=null;
         if (khachHang.getTen().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập tên KH");
            kiemtra = false;
        } else if (khachHang.getLienLac().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập thông tin liên hệ KH");
            kiemtra = false;
        }
        if (khachHang.getLienLac().length()> 0) {
                      if (!khachHang.getLienLac().matches("03+\\d{8}")) {
            if (!khachHang.getLienLac().matches("09+\\d{8}")) {
                JOptionPane.showMessageDialog(rootPane, "Sai định dạng SĐT");
               kiemtra= false;
            }
        }
        }
        if (kiemtra == true) {
            try {
           HoaDonDao hoaDonDao=new HoaDonDao();
            System.out.println("ConTroller.QuanLyKhachKhang.SuaKhachHang()"+khachHang.getCMND());
           hoaDonDao.Update(khachHang);
          JOptionPane.showMessageDialog(rootPane, "Đã lưu");
            } catch (SQLException ex) {
                Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
     
     return  kiemtra;}
     
   
 public  boolean  DatPhong( int khachhang1,int phong ,int nhanvien, List<Phong>phongtrong,List<NhanVien>nhanViens,List<Modell.KhachHang>khachHangs){
      boolean check=true;
      ShowData();
      Component rootPane=null;
          if (khachhang1 == -1) {
            JOptionPane.showMessageDialog(rootPane ,"Bạn vui lòng chọn khách hàng");
            check=false;
        } else if (phong == -1) {
            JOptionPane.showMessageDialog(rootPane, "Bạn vui lòng chọn phòng");
       check=false;
        } else if (nhanvien == -1) {
            JOptionPane.showMessageDialog(rootPane, "Bạn vui lòng chọn nhân viên");
               check=false;
        }
        if (khachhang1 > -1 && phong > -1 && nhanvien > -1) {
            for (int i = 0; i < phongs.size(); i++) {
                if (phongs.get(i).getMaphong().equals(phongtrong.get(phong).getMaphong())) {
                    try {
                        LocalDateTime localDateTime = LocalDateTime.now();
                        Datphong datphong = new Datphong(khachHangs.get(khachhang1), phongtrong.get(phong), nhanViens.get(nhanvien));
                        datphong.setNgaydat(localDateTime);
                        datPhogDao.InsertInto(datphong);
                        phongs.get(i).setTinhtrang("Đã đặt");
                        phongDao.Update(phongs.get(i));
                        JOptionPane.showMessageDialog(rootPane, "Đặt Phòng Thành Công ");
                        break;
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, "Vui lòng kiểm tra lại chứng minh của khách hàng này");
                           check=false;
                    }
                }
            }
        }
      return  check;
  }

  public boolean ChuyenPhong( int chuyenphong, Phong phong1) {
      boolean check=true;
      System.err.print(chuyenphong);
      ShowData();
      try {
           phong1.setTinhtrang("Đã đặt");
            phongDao.Update(phong1);
            datphongs.get(chuyenphong).getPhong().setTinhtrang("Đang trống");
          phongDao.Update(datphongs.get(chuyenphong).getPhong());
            datphongs.get(chuyenphong).setPhong(phong1);
            datPhogDao.Update(datphongs.get(chuyenphong));
      } catch (SQLException ex) {
          Logger.getLogger(QuanLyKhachKhang.class.getName()).log(Level.SEVERE, null, ex);
          Component parentComponent=null;
          JOptionPane.showMessageDialog(parentComponent,"Chuyển phòng không thành công");
          check=false;
      }
          
   return check;
    }

    private void ShowData() {
      try {
          datphongs.clear();
          phongs=phongDao.getAllPhong();
           datphongs= datPhogDao.getAllDatphong();
      } catch (SQLException ex) {
          Logger.getLogger(QuanLyKhachKhang.class.getName()).log(Level.SEVERE, null, ex);
      }
        
    }
    
    
}
