/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modell;

/**
 *
 * @author Admin
 */
public class Phong {
   private String Maphong;
   private String Tenphong;
   private int Giaphong ;
   private String Loaiphonh;
   private  String Tinhtrang="Đang trống";
   private String Chuy;

    public Phong() {
    }

   

    public Phong(String ID, String Ten, String loai, int gia, String tìnhtrang, String Chu_y) {
      this.Maphong = ID;
        this.Tenphong = Ten;
        this.Giaphong = gia;
        this.Loaiphonh = loai;
        this.Chuy = Chu_y;
        this.Tinhtrang=tìnhtrang;
    }

    public String getMaphong() {
        return Maphong;
    }

    public String getTenphong() {
        return Tenphong;
    }

    public int getGiaphong() {
        return Giaphong;
    }

    public String getLoaiphonh() {
        return Loaiphonh;
    }

    public String getTinhtrang() {
        return Tinhtrang;
    }

    public String getChuy() {
        return Chuy;
    }

    public void setMaphong(String Maphong) {
        this.Maphong = Maphong;
    }

    public void setTenphong(String Tenphong) {
        this.Tenphong = Tenphong;
    }

    public void setGiaphong(int Giaphong) {
        this.Giaphong = Giaphong;
    }

    public void setLoaiphonh(String Loaiphonh) {
        this.Loaiphonh = Loaiphonh;
    }

    public void setTinhtrang(String Tinhtrang) {
        this.Tinhtrang = Tinhtrang;
    }

    public void setChuy(String Chuy) {
        this.Chuy = Chuy;
    }
   
   
}
