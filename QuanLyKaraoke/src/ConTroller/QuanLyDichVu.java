/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConTroller;

import Dao.DichVuDao;
import Modell.DichVu;
import View.TrangChu;
import java.awt.Component;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class QuanLyDichVu {
 private boolean check=true;
 private DichVuDao dichVuDao=new DichVuDao();
    public boolean ThêmDichvu(DichVu dichVu,JTextField jTextField){
     Component rootPane=null;
 if (dichVu.getTenDV().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhâp tên sản phẩm ");
            check = false;
        } else if (jTextField.getText().length()== 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhâp giá sản phẩm ");
            check = false;
        }
        if (jTextField.getText().length() > 0) {
            try {
                Integer.parseInt(jTextField.getText());
                check = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Gía bạn nhập bằng số ");
                check = false;
            }

        }
        if (check == true) {
            do {
                 try {
                    Random random = new Random();
                 int id = random.nextInt(1000);
              DichVu dichVu1 = new DichVu(id,dichVu.getTenDV(), Integer.parseInt(jTextField.getText()));
                     dichVuDao.InsertInto(dichVu1);
                     check=true;
                 } catch (SQLException ex) {
                     check=false;
                 }
                
            } while (check == false);

        }
         return check;
    }
     public boolean SuaDichvu(DichVu dichVu,JTextField jTextField){
     Component rootPane=null;
 if (dichVu.getTenDV().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhâp tên sản phẩm ");
            check = false;
        } else if (jTextField.getText().length()== 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhâp giá sản phẩm ");
            check = false;
        }
        if (jTextField.getText().length() > 0) {
            try {
                Integer.parseInt(jTextField.getText());
                check = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Gía bạn nhập bằng số ");
                check = false;
            }

        }
          if (check == true) {
            try {
                DichVu dichVu1 = new DichVu(dichVu.getID(),dichVu.getTenDV(),Integer.parseInt(jTextField.getText()));
                dichVuDao.Update(dichVu1);
            } catch (SQLException ex) {
                check=false;
                Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         return check;
    }
     
    
}
