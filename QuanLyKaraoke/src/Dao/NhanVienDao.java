/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modell.NhanVien;
import Modell.TaiKhoan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhanVienDao implements Dao {

    private String input;
    private Use use;

    public NhanVienDao() {
        use = new Use();
    }

    @Override
    public <T> void InsertInto(T t) throws SQLException {
        java.sql.PreparedStatement preparedStatement = null;
        if (t instanceof NhanVien) {
            NhanVien nhanVien = (NhanVien) t;
            input = "insert into nhanvien values(?,?,?,?,?,?,?)";
            preparedStatement = use.getConnectionll().prepareStatement(input);
            preparedStatement.setString(1, nhanVien.getID());
            preparedStatement.setString(2, nhanVien.getTen());
            preparedStatement.setString(3, nhanVien.getChucVu());
            preparedStatement.setString(4, nhanVien.getGioiTinh());
            preparedStatement.setString(5, nhanVien.getLuong());
            preparedStatement.setString(6, nhanVien.getNamSinh());
            preparedStatement.setString(7, nhanVien.getChuThich());
        }
        if (t instanceof TaiKhoan) {
            TaiKhoan taiKhoan = (TaiKhoan) t;
            input = "insert into Taikhoan values(?,?,?,?)";
            preparedStatement = use.getConnectionll().prepareStatement(input);
            preparedStatement.setString(1, taiKhoan.getID());
            preparedStatement.setString(2, taiKhoan.getUse());
            preparedStatement.setString(3, taiKhoan.getPass());
            preparedStatement.setString(4, taiKhoan.getPhanquyen());
        }
        preparedStatement.execute();
        preparedStatement.close();
    }

    @Override
    public <T> void Update(T t) throws SQLException {
        java.sql.PreparedStatement preparedStatement = null;
        if (t instanceof NhanVien) {
            NhanVien nhanVien = (NhanVien) t;
            input = "Update Nhanvien set Tên_NV= ?,Chức_Vụ=?,Giới_Tính=?,Lương=?,Năm_Sinh=?,Chú_Thích=? where ID = ?";
            preparedStatement = use.getConnectionll().prepareStatement(input);
            preparedStatement.setString(7, nhanVien.getID());
            preparedStatement.setString(1, nhanVien.getTen());
            preparedStatement.setString(2, nhanVien.getChucVu());
            preparedStatement.setString(3, nhanVien.getGioiTinh());
            preparedStatement.setString(4, nhanVien.getLuong());
            preparedStatement.setString(5, nhanVien.getNamSinh());
            preparedStatement.setString(6, nhanVien.getChuThich());
        }
      
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }
    public void updatetk (NhanVien nhanVien) throws SQLException{
          java.sql.PreparedStatement preparedStatement=null;
           input="Update taikhoan set chucvu= ? where id = ?";
              preparedStatement=use.getConnectionll().prepareStatement(input);
              preparedStatement.setString(1,nhanVien.getChucVu());
              preparedStatement.setString(2,nhanVien.getID());
             preparedStatement.executeUpdate();
             preparedStatement.close();
    }
    @Override
    public <T> void Delete(T t) throws SQLException {
        java.sql.PreparedStatement preparedStatement = null;
        if (t instanceof NhanVien) {
            NhanVien nhanVien = (NhanVien) t;
            input = "DELETE Nhanvien where ID = ?";
            preparedStatement = use.getConnectionll().prepareStatement(input);
            preparedStatement.setString(1, nhanVien.getID());
        }
          if(t instanceof TaiKhoan){
               TaiKhoan taiKhoan =(TaiKhoan) t;
              input="DELETE taikhoan where id = ?"  ;
              preparedStatement=use.getConnectionll().prepareStatement(input);
              preparedStatement.setString(1,taiKhoan.getID());
        }
        preparedStatement.execute();
        preparedStatement.close();
    }

    public List<NhanVien> getAllNhanVien() throws SQLException {
        List<NhanVien> list = new ArrayList<>();
        java.sql.Statement statement = null;
        input = "Select* from Nhanvien";
        statement = use.getConnectionll().createStatement();
        ResultSet rs = statement.executeQuery(input);
        while (rs.next()) {
            String ID = rs.getString("ID");
            String Ten = rs.getString("Tên_NV");
            String Chucvu = rs.getString("Chức_Vụ");
            String Gioitinh = rs.getString("Giới_Tính");
            String Luong = rs.getString("Lương");
            String NamSinh = rs.getString("Năm_Sinh");
            String ChuThich = rs.getString("Chú_Thích");
            NhanVien nhanvien = new NhanVien(ID, Ten, Chucvu, Gioitinh, Luong, NamSinh, ChuThich);
            list.add(nhanvien);
        }
        statement.close();

        return list;
    }
      public  List<TaiKhoan> Selecttaikhoan() throws SQLException{
             List<TaiKhoan> list = new ArrayList<>();
             java.sql.Statement statement =null;
             input="Select* from Taikhoan";
              statement=use.getConnectionll().createStatement();
            ResultSet rs = statement.executeQuery(input);
            while(rs.next()){
                String ID = rs.getString("id");
                 String use = rs.getString("use");
                String Ten = rs.getString("pass");
                String loai = rs.getString("chucvu");
                TaiKhoan taiKhoan=new TaiKhoan(ID,use , Ten,loai);
                list.add(taiKhoan);
            }
            statement.close();

        return list;
    }
}
