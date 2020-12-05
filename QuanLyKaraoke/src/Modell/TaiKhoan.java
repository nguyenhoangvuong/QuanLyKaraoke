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
public class TaiKhoan {
    private  String Use;
    private String Pass;
    private String phanquyen;
    private String ID;

    public TaiKhoan(String ID ,String Use, String Pass, String phanquyen) {
        this.Use = Use;
        this.Pass = Pass;
        this.phanquyen = phanquyen;
        this.ID=ID;
        
    }
    

    public String getID() {
        return ID;
    }

    public String getUse() {
        return Use;
    }

    public String getPass() {
        return Pass;
    }

    public String getPhanquyen() {
        return phanquyen;
    }
    
}
