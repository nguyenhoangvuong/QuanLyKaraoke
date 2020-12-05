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
import Modell.TaiKhoan;
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
public class HoaDonDao implements Dao{
          private String input;
  private Use use;

    public HoaDonDao() {
      use=new Use();
    }
  
    
    @Override
    public <T> void InsertInto(T t) throws SQLException {
        java.sql.PreparedStatement preparedStatement =null;
                if(t instanceof HoaDon){
            HoaDon phong =(HoaDon) t;
            input="insert into LICHSU values(?,?,?,?,?,?,?,?,?,?)";
             preparedStatement=use.getConnectionll().prepareStatement(input);
              preparedStatement.setString(1,phong.getDatphong().getKhachHang().getTen());
              preparedStatement.setString(2,phong.getDatphong().getKhachHang().getCMND());
              preparedStatement.setString(3,phong.getDatphong().getKhachHang().getGioiTinh());
              preparedStatement.setString(4,phong.getDatphong().getKhachHang().getLienLac());
          preparedStatement.setString(5,phong.getDatphong().getPhong().getMaphong());
              preparedStatement.setString(6,phong.getDatphong().getNhanVien().getID());
             preparedStatement.setString(7,phong.getDatphong().getNgaydat().format(DateTimeFormatter.ofPattern("hh:mm a dd-MM-yyyy")));
             preparedStatement.setString(8,phong.getDatphong().getNgaydatdichvu());
               preparedStatement.setString(9,phong.getNgay());
                 preparedStatement.setInt(10,phong.getTong());
               insert1(phong.getDatphong());
              } 
              preparedStatement.execute();
             preparedStatement.close();
    }
       public void insert1(Datphong datphong){
           PreparedStatement preparedStatement=null;
            input="insert into dichvudung values(?,?,?,?,?,?)";
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

    @Override
    public <T> void Update(T t) throws SQLException {
              java.sql.PreparedStatement preparedStatement=null;   
        if(t instanceof KhachHang){
            KhachHang phong= (KhachHang) t;
            input="Update LichSu set TEN= ?,Gioitinh=?,Lienlac=? where CMND = ?";
              preparedStatement= use.getConnectionll().prepareStatement(input);
              preparedStatement.setString(1,phong.getTen());
              preparedStatement.setString(2,phong.getGioiTinh());
              preparedStatement.setString(3,phong.getLienLac());
              preparedStatement.setString(4,phong.getCMND()); 
        }
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    @Override
    public <T> void Delete(T t) throws SQLException {
         
   java.sql.PreparedStatement preparedStatement=null;
           
    if(t instanceof Datphong){
         input="DELETE dichvudung where CMND = ? ";
        Datphong datphong=(Datphong) t;
           preparedStatement=use.getConnectionll().prepareStatement(input);
           preparedStatement.setString(1,datphong.getKhachHang().getCMND());
           preparedStatement.execute();
            preparedStatement.close();}
      if(t instanceof HoaDon){
            HoaDon phong=(HoaDon) t;
            input="DELETE LICHSU where CMND = ?";
            preparedStatement=use.getConnectionll().prepareStatement(input);
           preparedStatement.setString(1,phong.getDatphong().getKhachHang().getCMND());
           Delete(phong.getDatphong());
            preparedStatement.execute();
            preparedStatement.close();}
    }
   
    public  ArrayList<HoaDon> lichsus() throws SQLException{
        ArrayList<HoaDon> list = new ArrayList<>();
             java.sql.Statement statement =null;
             input="select* from  LICHSU ,phong,nhanvien where lichsu.Manhanvien=NhanVien.ID and LICHSU.Maphong=phong.ID";
            statement=use.getConnectionll().createStatement();
            ResultSet rs = statement.executeQuery(input);
            while(rs.next()){
                String tenkhach = rs.getString("Ten");
                String CMND = rs.getString("CMND");
                String Gioitinh = rs.getString("Gioitinh");
                    String lienlac="0";
    lienlac+= rs.getString("Lienlac");
                String manv = rs.getString("Manhanvien");
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
               String Ngay = rs.getString("NgayTT");
                int tong = rs.getInt("TONG");
               HoaDon lichsu= new HoaDon(PDatphong, Ngay, tong);
               list.add(lichsu);
               list=(ArrayList<HoaDon>) getDatDichVu1(list);
            }
            statement.close();
            return  list;
   }
               public  List<HoaDon> getDatDichVu1 (List<HoaDon> datphongs) throws SQLException{
        java.sql.Statement statement =null;
             input="Select* from dichvudung ";
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
                for (HoaDon datphong : datphongs) {
                    if (datphong.getDatphong().getKhachHang().getCMND().equals(CMND)) {
                        datphong.getDatphong().getDichVus().add(dichVu);
                    }
                }
            }
            statement.close();
        return datphongs;
    }
    
        public  ArrayList<HoaDon> Timkiemthongkes(String ngay1,String ngay2 ) throws SQLException{
        ArrayList<HoaDon> list = new ArrayList<>();
             java.sql.Statement statement =null;
             input="select NGAYTT ,SUM(tong) as tong from lICHSU  WHERE NgayTT >='"+ngay1+"'AND NgayTT <='"+ngay2+"'"+"Group by ngayTT ";
              statement=use.getConnectionll().createStatement();
            ResultSet rs = statement.executeQuery(input);
            while(rs.next()){
                String ngay = rs.getString("NgayTT");
                int sum = rs.getInt("tong");
              HoaDon lichsu= new HoaDon(ngay,sum);
               list.add(lichsu);
            }
            statement.close();
            return  list;
   }
    
}
