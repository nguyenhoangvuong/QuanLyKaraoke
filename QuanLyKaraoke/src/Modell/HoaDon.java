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
public class HoaDon {
    private Datphong datphong;
    private String Ngay;
    private int Tong;

    public HoaDon(Datphong datphong, String Ngay, int Tong) {
        this.datphong = datphong;
        this.Ngay = Ngay;
        this.Tong = Tong;
    }

    public HoaDon(String Ngay, int Tong) {
        this.Ngay = Ngay;
        this.Tong = Tong;
    }

    public Datphong getDatphong() {
        return datphong;
    }

    public String getNgay() {
        return Ngay;
    }

    public int getTong() {
        return Tong;
    }

  
    
    
}
