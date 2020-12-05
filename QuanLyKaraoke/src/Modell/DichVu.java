/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modell;

import java.util.List;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class DichVu {
    private int ID;
    private String TenDV;
    private int GiaDV;
    private String ngaydat;
   private int  Soluong ;
    public DichVu(int ID, String TenDV, int GiaDV) {
        this.ID = ID;
        this.TenDV = TenDV;
        this.GiaDV = GiaDV;
    }

    public DichVu(int ID, String Ten, int Gia, String Ngay, int soluong) {
      this.GiaDV=Gia;
      this.ID=ID;
      this.TenDV=Ten;
      this.ngaydat=Ngay;
      this.Soluong=soluong;          
    }

    public int getID() {
        return ID;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }
  
    public String getNgaydat() {
        return ngaydat;
    }

    public void setNgaydat(String ngaydat) {
        this.ngaydat = ngaydat;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenDV() {
        return TenDV;
    }

    public void setTenDV(String TenDV) {
        this.TenDV = TenDV;
    }

    public int getGiaDV() {
        return GiaDV;
    }

    public void setGiaDV(int GiaDV) {
        this.GiaDV = GiaDV;
    }


}
