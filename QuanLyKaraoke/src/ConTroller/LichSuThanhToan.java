/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConTroller;

import Dao.DatPhogDao;
import Dao.HoaDonDao;
import Dao.PhongDao;
import Modell.HoaDon;
import Modell.Phong;
import View.TrangChu;
import java.awt.Component;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class LichSuThanhToan {
    private HoaDonDao hoaDonDao=new HoaDonDao();
    private DatPhogDao datPhogDao=new DatPhogDao();
    private PhongDao phongDao =new PhongDao();
   private List<Phong>phongs=new ArrayList<>();
    public LichSuThanhToan() {
        try {
            phongs=phongDao.getAllPhong();
        } catch (SQLException ex) {
            Logger.getLogger(LichSuThanhToan.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
   public  boolean  HoanHoaDon(HoaDon lichsus){
      boolean check=true;
      int cout=0;
      Component parentComponent=null;
      String ngay=LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));  
      if(lichsus.getNgay().equalsIgnoreCase(ngay)){
       for (int i = 0; i < phongs.size(); i++){
       if(phongs.get(i).getMaphong().equalsIgnoreCase(lichsus.getDatphong().getPhong().getMaphong()))
       {
        if(phongs.get(i).getTinhtrang().equalsIgnoreCase("Đang Trống")){
            cout++;
            try {
             datPhogDao.InsertInto(lichsus.getDatphong());
            datPhogDao.insert(lichsus.getDatphong());
            hoaDonDao.Delete(lichsus.getDatphong());
            hoaDonDao.Delete(lichsus);
             lichsus.getDatphong().getPhong().setTinhtrang("Đã Đặt");
             phongDao.Update(lichsus.getDatphong().getPhong());
             check=true;
             break;
            } catch (SQLException ex) {
            }
       }  
       }}
       if(cout==0){
           JOptionPane.showMessageDialog(parentComponent, "Phòng này đang sử dụng");
           check=false;
       }
      }
      else{
          check=false;
          JOptionPane.showMessageDialog(parentComponent, " Hóa Đơn này không thể hoàn"); 
      }
       return check;
   }
  
    
    
    
}
