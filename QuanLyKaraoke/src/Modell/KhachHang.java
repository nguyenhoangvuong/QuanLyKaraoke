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
public class KhachHang {
   
    public KhachHang( String Ten, String CMND, String GioiTinh, String LienLac) {
        this.Ten = Ten;
        this.CMND = CMND;
        this.GioiTinh = GioiTinh;
        this.LienLac = LienLac;
    
    }

    public KhachHang() {
    }


    private String Ten;
    private String CMND;
    private String GioiTinh;
    private String LienLac;

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getLienLac() {
        return LienLac;
    }

    public void setLienLac(String LienLac) {
        this.LienLac = LienLac;
    }

 

  
}
