/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modell.Datphong;
import Modell.DichVu;
import Modell.HoaDon;
import Modell.NhanVien;
import Modell.Phong;
import Modell.TaiKhoan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PhongDao implements Dao{
  private String input;
  private Use use;

    public PhongDao() {
      use=new Use();
    }
  
    @Override
    public <T> void InsertInto(T t) throws SQLException {
        java.sql.PreparedStatement preparedStatement =null;
        if(t instanceof Phong){
            Phong phong =(Phong) t;
            input="insert into Phong values(?,?,?,?,?,?)";
             preparedStatement=use.getConnectionll().prepareStatement(input);
              preparedStatement.setString(1,phong.getMaphong());
              preparedStatement.setString(2,phong.getTenphong());
              preparedStatement.setString(3,phong.getLoaiphonh());
              preparedStatement.setInt(4,phong.getGiaphong());
              preparedStatement.setString(5,phong.getTinhtrang());
              preparedStatement.setString(6,phong.getChuy());
        }
          preparedStatement.execute();
          preparedStatement.close();
    }

    @Override
    public <T> void Update(T t) throws SQLException {
         java.sql.PreparedStatement preparedStatement=null;
        if(t instanceof Phong){
          Phong phong= (Phong) t;
            input="Update Phong set TENPHONG= ?,LOAIPHONG=?,GIA=?,Tinhtrang=?,CHU_Y=? where ID = ?";
              preparedStatement= use.getConnectionll().prepareStatement(input);
              preparedStatement.setString(1,phong.getTenphong());
              preparedStatement.setString(2,phong.getLoaiphonh());
              preparedStatement.setInt(3,phong.getGiaphong());
              preparedStatement.setString(4,phong.getTinhtrang());
              preparedStatement.setString(5,phong.getChuy());
              preparedStatement.setString(6,phong.getMaphong());
        }
        
         preparedStatement.executeUpdate();
             preparedStatement.close();
    }

    @Override
    public <T> void Delete(T t) throws SQLException {
      java.sql.PreparedStatement preparedStatement=null;
         if(t instanceof Phong){
            Phong phong=(Phong) t;
            input="DELETE Phong where ID = ?";
                preparedStatement=use.getConnectionll().prepareStatement(input);
                preparedStatement.setString(1,phong.getMaphong());
        } 
        preparedStatement.execute();
             preparedStatement.close();
    }
       public  List<Phong> getAllPhong() throws SQLException{
         List<Phong> list = new ArrayList<>();
        java.sql.Statement statement =null;
             input="Select* from phong";
            statement=use.getConnectionll().createStatement();
            ResultSet rs = statement.executeQuery(input);
            while(rs.next()){
                String ID = rs.getString("ID");
                String Ten = rs.getString("Tenphong");
                String loai = rs.getString("loaiphong");
                int gia = rs.getInt("Gia");
                String tìnhtrang = rs.getString("tinhtrang");
                String Chu_y= rs.getString("CHU_y");
            
                Phong phong = new Phong(ID ,Ten, loai,gia, tìnhtrang, Chu_y);
                list.add(phong);
            }
            statement.close();

        return list;
    }
}
