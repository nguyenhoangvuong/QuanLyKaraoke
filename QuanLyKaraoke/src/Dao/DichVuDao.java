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
public class DichVuDao implements Dao{
 
     private String input;
  private Use use;

    public DichVuDao() {
      use=new Use();
    }
    
    @Override
    public <T> void InsertInto(T t) throws SQLException {
             java.sql.PreparedStatement preparedStatement=null;
        if(t instanceof DichVu){
           DichVu dichVu =(DichVu) t;
            input="insert into Dichvu values(?,?,?)";
             preparedStatement=use.getConnectionll().prepareStatement(input);
              preparedStatement.setInt(1,dichVu.getID());
              preparedStatement.setString(2,dichVu.getTenDV());
              preparedStatement.setInt(3,dichVu.getGiaDV());
        }
          preparedStatement.execute();
             preparedStatement.close();
        
    }

    @Override
    public <T> void Update(T t) throws SQLException {
       java.sql.PreparedStatement preparedStatement=null;
        if(t instanceof DichVu){
           DichVu dichVu =(DichVu) t;
            input="Update Dichvu set Ten = ?,Gia=? where ID= ?";
             preparedStatement=use.getConnectionll().prepareStatement(input);
              preparedStatement.setInt(3,dichVu.getID());
              preparedStatement.setString(1,dichVu.getTenDV());
              preparedStatement.setInt(2,dichVu.getGiaDV());
        }

         preparedStatement.executeUpdate();
             preparedStatement.close();
    }

    @Override
    public <T> void Delete(T t) throws SQLException {
         java.sql.PreparedStatement preparedStatement=null;
     
        if(t instanceof DichVu){
            DichVu dichVu=(DichVu) t;
            input="DELETE Dichvu where ID = ?";
                preparedStatement=use.getConnectionll().prepareStatement(input);
                preparedStatement.setInt(1,dichVu.getID());
        } 
     
        preparedStatement.execute();
             preparedStatement.close();
    }
          public  List<DichVu> getAllDichVu () throws SQLException{
         List<DichVu> list = new ArrayList<>();
        java.sql.Statement statement =null;
             input="Select* from Dichvu";
            statement=use.getConnectionll().createStatement();
            ResultSet rs = statement.executeQuery(input);
            while(rs.next()){
                int ID = rs.getInt("ID");
                String Ten = rs.getString("Ten");
                int  Gia = rs.getInt("Gia");
            DichVu dichVu=new DichVu(ID, Ten, Gia);
               list.add(dichVu);
            }
            statement.close();

        return list;
    }
    
}
