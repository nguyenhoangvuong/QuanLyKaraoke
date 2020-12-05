/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modell;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Datphong {
    private KhachHang khachHang;
    private Phong phong;
    private NhanVien nhanVien;
    private List <DichVu>dichVus= new ArrayList<>();

    private  LocalDateTime Ngaydat;
    private String Ngaydatdichvu;

    public Datphong(KhachHang khachHang, Phong phong,NhanVien nhanVien) {
        this.khachHang = khachHang;
        this.phong = phong;
       this.nhanVien=nhanVien;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }


    
    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    public List<DichVu> getDichVus() {
        return dichVus;
    }

    public void setDichVus(List<DichVu> dichVus) {
        this.dichVus = dichVus;
    }

    public LocalDateTime getNgaydat() {
        return Ngaydat;
    }

    public void setNgaydat(LocalDateTime Ngaydat) {
        this.Ngaydat = Ngaydat;
    }
 public String toString( )  {
      String hoadon="=======================Hóa Đơn=================================\n\n"+
                            "Nhân viên phục vụ : "+nhanVien.getTen()+"\n\n"+
                            "Khách hàng : "+khachHang.getTen();
              if(dichVus.size()>0){
            hoadon+="\n\n==========================Dịch vụ=============================";
         for (DichVu dichVu : this.dichVus) {
            hoadon+="\n"+dichVu.getTenDV()+ "   Tổng : "+dichVu.getGiaDV()+" x "+
                    dichVu.getSoluong()+" = "+dichVu.getSoluong()*dichVu.getGiaDV()+"\n";
            hoadon+=".....................................................................";
        } 
              } 
           hoadon+="\n\n..................................................";
        hoadon+=" \n\nPhong :"+phong.getTenphong()+"\n\n"+
         " Loai : "+phong.getLoaiphonh()+"      Gía phòng : "+phong.getGiaphong()+" VND\n\n"
        +" Giờ vào : "+getNgaydat().format(DateTimeFormatter.ofPattern("hh:mm a"))
        +" Giờ ra : "+LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm a"))+"\n\n";
          LocalDateTime localDateTime = LocalDateTime.now();
        int phutHienTai = localDateTime.getHour()*60 + localDateTime.getMinute();
       int gio = (phutHienTai - ((getNgaydat().getHour()*60)+(getNgaydat().getMinute())))/60;
        float du = (phutHienTai - ((getNgaydat().getHour()*60)+(getNgaydat().getMinute())))%60;
        if(du >= 30){
            du = 1;
        }
        else du = 0;
        int sum = 0;
        for (int i = 0; i<this.dichVus.size(); i++) {     
            sum += this.dichVus.get(i).getSoluong() *getDichVus().get(i).getGiaDV();
          
        }
        hoadon+=" Tổng tiền = "+(sum+((gio+du)*getPhong().getGiaphong()))+"\n\n"+
                " Ngay thanh toán "+localDateTime.format(DateTimeFormatter.ofPattern("hh:mm a dd-MM-yyyy"))+
                "\n\n==========================================================";
        
      return hoadon;
            
              
    }
  

    public String getNgaydatdichvu() {
        return Ngaydatdichvu;
    }

    public void setNgaydatdichvu(String Ngaydatdichvu) {
        this.Ngaydatdichvu = Ngaydatdichvu;
    }

    
}
