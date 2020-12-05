/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modell;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class NhanVien {

    private String ID;
    private String Ten;
    private String ChucVu;
    private String Luong;
    private String GioiTinh;
    private String NamSinh;
    private String ChuThich;

    public NhanVien() {
    }

    public NhanVien(String ID, String Ten, String Chucvu1, String Gioitinh, String Luong, String NamSinh, String ChuThich) {
       this.ID = ID;
        this.Ten = Ten;
        this.ChucVu = Chucvu1;
        this.Luong = Luong;
        this.GioiTinh = Gioitinh;
        this.NamSinh = NamSinh;
        this.ChuThich = ChuThich;
    }

    

    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getLuong() {
        return Luong;
    }

    public void setLuong(String Luong) {
        this.Luong = Luong;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(String NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getChuThich() {
        return ChuThich;
    }

    public void setChuThich(String ChuThich) {
        this.ChuThich = ChuThich;
    }
   
}
