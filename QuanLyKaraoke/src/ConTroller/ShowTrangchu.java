/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConTroller;

import Dao.HoaDonDao;
import Modell.Datphong;
import Modell.DichVu;
import Modell.KhachHang;
import Modell.HoaDon;
import Modell.NhanVien;
import Modell.Phong;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDayChooser;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Admin
 */
public class ShowTrangchu {
 
 public <T> DefaultTableModel ShowThongTinKhach(List<T> t,DefaultTableModel Modell){
       Modell.setRowCount(0);
        int i = 1;
        for (T t1 : t) {
            if (t1 instanceof HoaDon) {
            HoaDon lichsu= (HoaDon) t1;
            Modell.addRow(new Object[]{
          i++, lichsu.getDatphong().getKhachHang().getTen(),lichsu.getDatphong().getKhachHang().getCMND(),
          lichsu.getDatphong().getKhachHang().getGioiTinh(),lichsu.getDatphong().getKhachHang().getLienLac(),
          lichsu.getDatphong().getPhong().getTenphong(),lichsu.getDatphong().getNgaydat()
                });
            }
        }
     return Modell;
 }
 public List<HoaDon> TimKiemThongke(List<HoaDon> lichsus,JDateChooser jDateChooser3,JDateChooser jDateChooser2){
       Component rootPane = null;
     if(((JTextField) jDateChooser3.getDateEditor().getUiComponent()).getText().length()>0&&((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().length()>0)
       {    try {
           Date date =new SimpleDateFormat("yyyy-MM-dd").parse(((JTextField) jDateChooser3.getDateEditor().getUiComponent()).getText());
           Date date1 =new  SimpleDateFormat("yyyy-MM-dd").parse(((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText());
           lichsus.clear();
        HoaDonDao hoaDonDao=new HoaDonDao();
           lichsus=hoaDonDao.Timkiemthongkes(((JTextField) jDateChooser3.getDateEditor().getUiComponent()).getText(),((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText());
        } catch (ParseException ex) {  
            JOptionPane.showMessageDialog(rootPane, "Bạn nhập sai định dạng ngày ");    
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(rootPane,"Không thông kê được");
       }
       }
       else if( ((JTextField) jDateChooser3.getDateEditor().getUiComponent()).getText().length()==0){
           JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn ngày bắt đầu ");
       }
        else if( ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().length()==0){
           JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn ngày kết thúc ");
       } 
   return lichsus;
 }
  public <T> DefaultTableModel ShowData(List<T> list,DefaultTableModel Modell){
     Modell.setRowCount(0);
        int i = 1;
        for (T t : list) {
            if (t instanceof NhanVien) {
                NhanVien nhanVien = (NhanVien) t;
                Modell.addRow(new Object[]{
                    i++, nhanVien.getID(), nhanVien.getTen(), nhanVien.getNamSinh(), nhanVien.getChucVu(),
                    nhanVien.getLuong(), nhanVien.getGioiTinh(), nhanVien.getChuThich()

                });
            }
            if (t instanceof Phong) {
                Phong phong = (Phong) t;
                Modell.addRow(new Object[]{
                    phong.getMaphong(), phong.getTenphong(), phong.getLoaiphonh(),
                    phong.getGiaphong(), phong.getTinhtrang(), phong.getChuy()
                });

            }
            if (t instanceof Datphong) {
                Datphong phong = (Datphong) t;

                Modell.addRow(new Object[]{
                    phong.getKhachHang().getTen(), phong.getPhong().getTenphong(), phong.getPhong().getLoaiphonh(),
                    phong.getPhong().getGiaphong(), phong.getNgaydat().format(DateTimeFormatter.ofPattern("hh:mm a dd-MM-yyyy")), phong.getNhanVien().getTen()
                });

            }
            if (t instanceof DichVu) {

                DichVu dichVu = (DichVu) t;
                Modell.addRow(new Object[]{
                  i++,  dichVu.getID(), dichVu.getTenDV(), dichVu.getGiaDV(),});

            }
            if(t instanceof  HoaDon){
                HoaDon lichsu = (HoaDon) t;
                   Modell.addRow(new Object[]{
                     i++ ,lichsu.getDatphong().getPhong().getTenphong(),
                      lichsu.getTong(), lichsu.getDatphong().getNgaydat().format(DateTimeFormatter.ofPattern("hh:mm a dd-MM-yyyy")),
                   });

            }

        }
      
      return Modell; }
    public <T> DefaultTableModel ShowData2(List<T> list,DefaultTableModel Modell){
       Modell.setRowCount(0);
        for (T t : list) {
            if (t instanceof NhanVien) {
                NhanVien nhanVien = (NhanVien) t;
                Modell.addRow(new Object[]{
                    nhanVien.getID(), nhanVien.getTen(), nhanVien.getChucVu()
                });

            }
            if (t instanceof Phong) {
                Phong phong = (Phong) t;
                Modell.addRow(new Object[]{
                    phong.getMaphong(), phong.getTenphong(), phong.getLoaiphonh()
                });
            }
            if (t instanceof Datphong) {
                Datphong phong = (Datphong) t;
                Modell.addRow(new Object[]{
                    phong.getPhong().getMaphong(), phong.getPhong().getTenphong(), phong.getPhong().getLoaiphonh()
                });
            }

            if (t instanceof KhachHang) {
                KhachHang khachHang = (KhachHang) t;
                Modell.addRow(new Object[]{
                    khachHang.getTen(), khachHang.getGioiTinh(), khachHang.getCMND()

                });
            }
        }
      
      return Modell; }
    public <T> JTextField TimKiem(DefaultTableModel Modell,JTextField jTextField ,JTable table){
          TableRowSorter tableRowSorter=new TableRowSorter(Modell);
        table.setRowSorter(tableRowSorter);
        jTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
              // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
              if(jTextField.getText().trim().length()==0){
                 tableRowSorter.setRowFilter(null);
              }
              else{
                  tableRowSorter.setRowFilter(RowFilter.regexFilter("(?i)"+jTextField.getText()));
              }

            }

            @Override
            public void removeUpdate(DocumentEvent e) {
             ///   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if(jTextField.getText().trim().length()==0){
                 tableRowSorter.setRowFilter(null);
              }
              else{
                  tableRowSorter.setRowFilter(RowFilter.regexFilter("(?i)"+jTextField.getText()));
              }
            
            }

            
            @Override
            public void changedUpdate(DocumentEvent e) {
               /// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        
        return jTextField;
        
        
    }
    public <T> JPanel ThongKe( List<HoaDon> lichsu,JPanel jPanel20){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
       for (HoaDon lichsu1 : lichsu) {
           dataset.addValue(lichsu1.getTong(), "", lichsu1.getNgay());
       }
       JFreeChart BChart=ChartFactory.createBarChart(
         "Biểu đồ thống kê tổng tiền theo ngày".toUpperCase(), "Thời gian ","Tổng tiền ", dataset,
          PlotOrientation.VERTICAL, false, true, false);
       ChartPanel chartPanel=new ChartPanel(BChart);
       chartPanel.setPreferredSize(new Dimension(jPanel20.getWidth(),500));
       jPanel20.removeAll();
       jPanel20.setLayout(new CardLayout());
       jPanel20.add(chartPanel);
       jPanel20.validate();
       jPanel20.repaint();
        
        
        
        return jPanel20;
    }
    public  JLabel ShowDongHo(JLabel jLabel){
                new Thread() {
            public void run() {
                while (true) {
                    Calendar ca = new GregorianCalendar();
                    int hour = ca.get(Calendar.HOUR);
                    int minute = ca.get(Calendar.MINUTE);
                    int second = ca.get(Calendar.SECOND);
                    int PM_AM = ca.get(Calendar.AM_PM);
                    String day_night;
                    if (PM_AM == 1) {
                        day_night = "PM";
                    } else {
                        day_night = "AM";
                    }
                    String time = hour + ":" + minute + ":" + second + " " + day_night;
                    jLabel.setText(time);
                }
            }
        }.start();

        return jLabel;
    }
    public  JLabel ShowNgay(JLabel jLabel){
Calendar ca = new GregorianCalendar();
        int day = ca.get(Calendar.DAY_OF_MONTH);
        int month = ca.get(Calendar.MONTH) + 1;
        int year = ca.get(Calendar.YEAR);
        String time ="Ngày :"+ month + "-" + day + "-" + year;
        jLabel.setText(time);
        return jLabel;
    }
}
