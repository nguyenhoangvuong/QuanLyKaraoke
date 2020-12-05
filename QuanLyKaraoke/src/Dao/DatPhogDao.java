/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modell.Datphong;
import Modell.DichVu;
import Modell.KhachHang;
import Modell.HoaDon;
import Modell.NhanVien;
import Modell.Phong;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DatPhogDao implements Dao{
      private String input;
  private Use use;

    public DatPhogDao() {
      use=new Use();
    }

     public  List<Datphong> getDatDichVu (List<Datphong> datphongs) throws SQLException{
 
        java.sql.Statement statement =null;
             input="Select* from Datdichvu ";
            statement=use.getConnectionll().createStatement();
            ResultSet rs = statement.executeQuery(input);
            while(rs.next()){
                String CMND=rs.getString("CMND");
                int ID = rs.getInt("ID");
                String Ten = rs.getString("Ten");
                int  Gia = rs.getInt("Gia");
                String Ngay=rs.getString("NgayDat");
                int soluong=rs.getInt("Soluong");
                
            DichVu dichVu=new DichVu(ID, Ten, Gia,Ngay,soluong);
                for (Datphong datphong : datphongs) {
                    if (datphong.getKhachHang().getCMND().equals(CMND)) {
                        datphong.getDichVus().add(dichVu);
                    }
                }
            }
            statement.close();
        return datphongs;
    }
    
    @Override
    public <T> void InsertInto(T t) throws SQLException {
         java.sql.PreparedStatement preparedStatement =null;
        if(t instanceof Datphong){
            Datphong phong =(Datphong) t;
            input="insert into KhachHang values(?,?,?,?,?,?,?,?)";
             preparedStatement=use.getConnectionll().prepareStatement(input);
              preparedStatement.setString(1,phong.getKhachHang().getTen());
              preparedStatement.setString(2,phong.getKhachHang().getCMND());
              preparedStatement.setString(3,phong.getKhachHang().getGioiTinh());
              preparedStatement.setString(4,phong.getKhachHang().getLienLac());
          preparedStatement.setString(5,phong.getPhong().getMaphong());
              preparedStatement.setString(6,phong.getNhanVien().getID());
             preparedStatement.setString(7,phong.getNgaydat().format(DateTimeFormatter.ofPattern("hh:mm a dd-MM-yyyy")));
             preparedStatement.setString(8,phong.getNgaydatdichvu());
              }
        preparedStatement.execute();
        preparedStatement.close();
    }

    @Override
    public <T> void Update(T t) throws SQLException {
             java.sql.PreparedStatement preparedStatement=null;   
        if(t instanceof Datphong){
          Datphong phong= (Datphong) t;
            input="Update khachhang set TEN= ?,Gioitinh=?,Lienlac=?,Maphong=? ,NDdichvu=? where CMND = ?";
              preparedStatement= use.getConnectionll().prepareStatement(input);
              preparedStatement.setString(1,phong.getKhachHang().getTen());
              preparedStatement.setString(2,phong.getKhachHang().getGioiTinh());
              preparedStatement.setString(3,phong.getKhachHang().getLienLac());
              preparedStatement.setString(4,phong.getPhong().getMaphong());
              preparedStatement.setString(6,phong.getKhachHang().getCMND());
              preparedStatement.setString(5,phong.getNgaydatdichvu());
        }
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    @Override
    public <T> void Delete(T t) throws SQLException {
        java.sql.PreparedStatement preparedStatement=null;
             if(t instanceof Datphong){
            Datphong phong=(Datphong) t;
            input="DELETE KhachHang where CMND = ?";
                preparedStatement=use.getConnectionll().prepareStatement(input);
                preparedStatement.setString(1,phong.getKhachHang().getCMND());
        preparedStatement.execute();
        preparedStatement.close();
                     
      }     
    }
       public  List<Datphong> getAllDatphong() throws SQLException{
         List<Datphong> list = new ArrayList<>();
        java.sql.Statement statement =null;
             input="select* from  khachhang as datphong,phong,nhanvien where datphong.Manhavien=NhanVien.ID and datphong.Maphong=phong.ID";
            statement=use.getConnectionll().createStatement();
            ResultSet rs = statement.executeQuery(input);
            while(rs.next()){
                String tenkhach = rs.getString("Ten");
                String CMND = rs.getString("CMND");
                String Gioitinh = rs.getString("Gioitinh");
                String lienlac="0";
                        lienlac+= rs.getString("Lienlac");
                String manv = rs.getString("Manhavien");
                String Ngaydat = rs.getString("Ngaydatphong");
                String ID = rs.getString("ID");
                String Ten = rs.getString("Tenphong");
                String loai = rs.getString("loaiphong");
                int gia = rs.getInt("Gia");
                String tìnhtrang = rs.getString("tinhtrang");
                String Chu_y= rs.getString("CHU_y");
            
                String Tennv = rs.getString("Tên_NV");
                String Chucvu = rs.getString("Chức_Vụ");
                String Gioitinhnv = rs.getString("Giới_Tính");
                String Luong = rs.getString("Lương");
                String NamSinh = rs.getString("Năm_Sinh");
                String ChuThich = rs.getString("Chú_Thích");
                String ngaydatdichvu=rs.getString("NDdichvu");
                NhanVien nhanvien = new NhanVien(manv ,Tennv, Chucvu, Gioitinhnv, Luong, NamSinh, ChuThich); 
                Phong phong = new Phong(ID ,Ten, loai,gia, tìnhtrang, Chu_y);
                KhachHang khachHang= new KhachHang(tenkhach, CMND, Gioitinh, lienlac);
               Datphong PDatphong=new Datphong(khachHang, phong, nhanvien);
               LocalDateTime localDateTime=null;
               PDatphong.setNgaydat(localDateTime.parse(Ngaydat, DateTimeFormatter.ofPattern("hh:mm a dd-MM-yyyy")));
               PDatphong.setNgaydatdichvu(ngaydatdichvu);
                list.add(PDatphong);
            }
            statement.close();

        return list;
    }
          public void insert(Datphong datphong){
           PreparedStatement preparedStatement=null;
            input="insert into Datdichvu values(?,?,?,?,?,?)";
        for (DichVu dichVu : datphong.getDichVus()) {
            try {     
             preparedStatement = use.getConnectionll().prepareStatement(input);
             preparedStatement.setString(1,datphong.getKhachHang().getCMND());
             preparedStatement.setInt(2, dichVu.getID());
             preparedStatement.setString(3,dichVu.getTenDV());
               preparedStatement.setInt(4, dichVu.getGiaDV());
             preparedStatement.setString(5,dichVu.getNgaydat());
              preparedStatement.setInt(6, dichVu.getSoluong());
               
               preparedStatement.execute();
           preparedStatement.close();
 
       } catch (SQLException ex) {
         
       }}
     }
    

       public void delete(DichVu dichVu,String CMND) throws SQLException{
          java.sql.PreparedStatement preparedStatement=null;
            input="DELETE datDichvu where ID = ? and CMND=?";
                preparedStatement=use.getConnectionll().prepareStatement(input);
                preparedStatement.setInt(1,dichVu.getID());
                preparedStatement.setString(2,CMND);
        preparedStatement.execute();
             preparedStatement.close();
    }    
  
        
    public void Updatedatdichvu(DichVu dichVu,String CMND) throws SQLException{
          java.sql.PreparedStatement preparedStatement=null;
          input="update datDichvu set soluong = ?  where ID = ? and CMND=?";
          preparedStatement=use.getConnectionll().prepareStatement(input);
           preparedStatement.setInt(1,dichVu.getSoluong());
           preparedStatement.setInt(2,dichVu.getID());
        preparedStatement.setString(3,CMND);
          preparedStatement.executeUpdate();
             preparedStatement.close();
    }
    
    
    
    
}
