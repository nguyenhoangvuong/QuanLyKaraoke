/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ConTroller.LichSuThanhToan;
import ConTroller.QuanLyDichVu;
import ConTroller.QuanLyNV;
import ConTroller.QuanLyPhong;
import ConTroller.ShowTrangchu;
import Dao.DatPhogDao;
import Dao.DichVuDao;
import Dao.HoaDonDao;
import Dao.NhanVienDao;
import Dao.PhongDao;
import Modell.Datphong;
import Modell.DichVu;
import Modell.KhachHang;
import Modell.HoaDon;
import Modell.NhanVien;
import Modell.Phong;
import Modell.TaiKhoan;
import java.awt.Color;
import java.awt.Window;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TrangChu extends javax.swing.JFrame {
    public  TaiKhoan taiKhoan1;
    private  List<TaiKhoan> taiKhoan;
    private DefaultTableModel defaultTableModel;
    private List<DichVu> dichVu;
    private List<HoaDon> lichsus;
    static List<Datphong> datphongs;
    private List<KhachHang> khachHangs;
    private List<NhanVien> nhanViens;
    static List<Phong> phongs;
    private List<NhanVien> phucvu;
    private List<Phong> phongtrong;
    private DefaultTableModel ModellThemnv;
    private DefaultTableModel modethanhtoan;
    private DefaultTableModel ModellNvdatphong;
    private DefaultTableModel ModellPhong;
    private DefaultTableModel ModellPhongtrong;
     private DefaultTableModel Modelllichsu;
    private DefaultTableModel Modelthemkhach;
    private DefaultTableModel ModelDatphong;
    private DefaultTableModel ModelDichvu;
    private DefaultTableModel Modelthongtinkhach;
   private  NhanVienDao nhanVienDao;
   static DatPhogDao datPhogDao;
   static PhongDao  phongDao;
   static  DichVuDao dichVuDao;
   static  HoaDonDao hoaDonDao;
   private ShowTrangchu trangchu ;
   private QuanLyNV quanLyNV=new QuanLyNV();
  private ConTroller.QuanLyKhachKhang khachHangConTroll=new ConTroller.QuanLyKhachKhang();
  private QuanLyDichVu quanLyDichVu=new QuanLyDichVu();
  private QuanLyPhong quanLyPhong =new QuanLyPhong();
  
int demmau=0;
ImageIcon icon;
    public TrangChu( TaiKhoan taiKhoan ) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.taiKhoan1=taiKhoan;
        this.taiKhoan=new ArrayList<>();
        trangchu =new ShowTrangchu();
       jLabel31= trangchu.ShowDongHo(jLabel31);
        Phanquyen( taiKhoan );
       Loandatase();   DoiMau();
       jPanel5.setBackground(new Color(0,0,0,0));
       icon = new ImageIcon("C:\\Users\\Admin\\Desktop\\QuanLyKaraoke1\\QuanLyKaraoke\\src\\View\\icon\\micneeee.png");
        setIconImage(icon.getImage());
        setTitle("Karaoke");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        Delete = new javax.swing.JMenuItem();
        update = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPopupMenu6 = new javax.swing.JPopupMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        Body = new javax.swing.JPanel();
        Gioithieu = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        Datphong = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        Dichvu = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jTextField17 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Khachhang = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        Lưu = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        Nhanvien = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton33 = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        Nam = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox6 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton32 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jLabel40 = new javax.swing.JLabel();
        Phonghat = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel70 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        Thongke = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel29 = new javax.swing.JLabel();
        Lichsu = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        lichsu = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        Delete.setText("Xóa");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Delete);
        Delete.getAccessibleContext().setAccessibleName("delete");

        update.setText("Chỉnh sưa");
        update.setActionCommand("Chỉnh sữa");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPopupMenu1.add(update);
        update.getAccessibleContext().setAccessibleName("Update");

        jMenuItem1.setText("Chỉnh sữa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem1);

        jMenuItem2.setText("Xóa");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu3.add(jMenuItem2);
        jMenuItem2.getAccessibleContext().setAccessibleDescription("");

        jPopupMenu3.getAccessibleContext().setAccessibleName("Xóa");

        jMenuItem4.setText("Chỉnh sữa");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu4.add(jMenuItem4);

        jMenuItem5.setText("Tạo tài khoản");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jPopupMenu6.add(jMenuItem5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        Body.setBackground(new java.awt.Color(153, 153, 153));
        Body.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Body.setToolTipText("");
        Body.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Body.setLayout(new java.awt.CardLayout());

        Gioithieu.setBackground(new java.awt.Color(255, 255, 255));
        Gioithieu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/hinh1.jpg"))); // NOI18N
        jLabel71.setText("jLabel71");
        Gioithieu.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 514, 334));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/hinh3.jpg"))); // NOI18N
        jLabel28.setText("jLabel28");
        Gioithieu.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, 338));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/111111.jpg"))); // NOI18N
        jLabel48.setText("jLabel48");
        Gioithieu.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 344, 1162, -1));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/12.jpg"))); // NOI18N
        jLabel49.setText("jLabel49");
        Gioithieu.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -7, 1050, 680));

        Body.add(Gioithieu, "card8");

        Datphong.setBackground(new java.awt.Color(255, 255, 255));
        Datphong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Thông Tin Khách Hàng");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel2.setText("Tên KH :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel3.setText("CMND :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel4.setText("Giới Tính :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel5.setText("Liên Lạc :");

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        jButton11.setBackground(new java.awt.Color(204, 204, 204));
        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/addne.png"))); // NOI18N
        jButton11.setText("Thêm KH");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(204, 204, 204));
        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/huy.png"))); // NOI18N
        jButton13.setText("Bỏ Chọn");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Datphong.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 310));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Thông Tin Khách Hàng");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTable4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên KH", "Giới Tính", "CMND"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        Datphong.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 0, 256, 310));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Danh Sách Phòng Trống");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(47, 47, 47))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        jTable2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Phòng", "Tên Phòng", "Loại Phòng"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        Datphong.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 0, -1, 310));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel12.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Nhân Viên Phục Vụ");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jTable3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Tên NV", "Chức Vụ"
            }
        ));
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        Datphong.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 0, -1, 310));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên KH", "Tên Phòng", "Loại Phòng", "Giá Phòng", "Ngày Đặt Phòng", "Nhân viên"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Danh Sách Phòng Đã Đặt");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Datphong.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 383, 1022, 280));

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/addne.png"))); // NOI18N
        jButton9.setText("ĐẶT PHÒNG");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Datphong.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jButton14.setBackground(new java.awt.Color(204, 204, 204));
        jButton14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/dangxuat.png"))); // NOI18N
        jButton14.setText("CHUYỂN PHÒNG");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        Datphong.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        jButton24.setBackground(new java.awt.Color(204, 204, 204));
        jButton24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/dichvu.png"))); // NOI18N
        jButton24.setText("ĐẶT DỊCH VỤ");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        Datphong.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, -1));

        jButton34.setBackground(new java.awt.Color(204, 204, 204));
        jButton34.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/xemhoadon.png"))); // NOI18N
        jButton34.setText("XEM HOÁ ĐƠN");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        Datphong.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 320, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/12.jpg"))); // NOI18N
        jLabel21.setText("jLabel21");
        Datphong.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1050, 720));

        Body.add(Datphong, "card3");

        Dichvu.setBackground(new java.awt.Color(255, 255, 255));
        Dichvu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        jTable7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ID", "Tên Dịch Vụ", "Giá Dịch Vụ"
            }
        ));
        jTable7.setRowHeight(25);
        jTable7.setShowHorizontalLines(false);
        jTable7.setShowVerticalLines(false);
        jTable7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable7MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jTable7);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(0).setMinWidth(50);
            jTable7.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable7.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable7.getColumnModel().getColumn(1).setMinWidth(100);
            jTable7.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable7.getColumnModel().getColumn(1).setMaxWidth(150);
        }

        jTextField17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField17MouseClicked(evt);
            }
        });
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/search_26px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField17)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );

        Dichvu.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 1020, 340));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("Tên DV");
        jPanel21.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 140, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("Giá DV");
        jPanel21.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 140, -1));

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField4.setText("TenDV");
        jTextField4.setBorder(null);
        jPanel21.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 280, -1));

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField5.setText("GiaDV");
        jTextField5.setBorder(null);
        jPanel21.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 280, 20));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Nhập Dịch Vụ");
        jPanel21.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 13, 155, 40));

        jButton23.setBackground(new java.awt.Color(204, 204, 204));
        jButton23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/plus_math_50px.png"))); // NOI18N
        jButton23.setText("THÊM");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 110, 40));

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/edit_property_26px.png"))); // NOI18N
        jButton6.setText("SỬA");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 110, 40));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/delete_26px.png"))); // NOI18N
        jButton3.setText("HỦY");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 100, 40));
        jPanel21.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 132, 300, 10));
        jPanel21.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 300, 10));

        Dichvu.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 530, 270));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Dịch Vụ");
        Dichvu.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 240, 40));

        jPanel15.setBackground(new java.awt.Color(204, 255, 255));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/quay-bar-khach-san-15.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        Dichvu.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 480, 270));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/12.jpg"))); // NOI18N
        jLabel20.setText("jLabel20");
        Dichvu.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -7, 1050, 690));

        Body.add(Dichvu, "card5");

        Khachhang.setBackground(new java.awt.Color(255, 255, 255));
        Khachhang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jTable8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stt", "Tên KH", "CMND KH", "Giới Tính", "Liên Lạc"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable8.setRowHeight(25);
        jTable8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable8MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable8);
        if (jTable8.getColumnModel().getColumnCount() > 0) {
            jTable8.getColumnModel().getColumn(0).setResizable(false);
            jTable8.getColumnModel().getColumn(1).setResizable(false);
            jTable8.getColumnModel().getColumn(2).setResizable(false);
            jTable8.getColumnModel().getColumn(3).setResizable(false);
            jTable8.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );

        Khachhang.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 206, 1020, 460));

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        Khachhang.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 230, 30));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel27.setText("Giới Tính KH :");
        Khachhang.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 120, -1));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel26.setText("Liên Hệ KH :");
        Khachhang.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 100, -1));

        jTextField8.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jTextField8.setBorder(null);
        Khachhang.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 230, 30));

        jTextField7.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jTextField7.setBorder(null);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        Khachhang.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 81, 250, 30));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel25.setText("CMND KH :");
        Khachhang.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 86, -1, 20));

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jTextField6.setBorder(null);
        Khachhang.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 31, 250, 30));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel24.setText("Tên KH :");
        Khachhang.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 66, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/search_26px.png"))); // NOI18N

        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField9MouseClicked(evt);
            }
        });

        Lưu.setBackground(new java.awt.Color(204, 204, 204));
        Lưu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Lưu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/save.png"))); // NOI18N
        Lưu.setText("LƯU");
        Lưu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LưuActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(204, 204, 204));
        jButton27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/update.png"))); // NOI18N
        jButton27.setText("LÀM MỚI");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Lưu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(jSeparator4))
                        .addGap(192, 192, 192)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Lưu)
                        .addComponent(jButton27))
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        Khachhang.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1020, 190));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/12.jpg"))); // NOI18N
        jLabel23.setText("jLabel23");
        Khachhang.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 720));

        Body.add(Khachhang, "card4");

        Nhanvien.setBackground(new java.awt.Color(204, 204, 204));
        Nhanvien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Quản lý Nhân Viên");
        Nhanvien.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel31.setBackground(new java.awt.Color(0, 0, 0));

        jLabel32.setBackground(new java.awt.Color(153, 153, 153));
        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Thông Tin Nhân Viên");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        jPanel30.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 1021, -1));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel33.setText("Mã NV :");
        jPanel30.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 53, 69, -1));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel34.setText("Tên NV :");
        jPanel30.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 96, 69, -1));

        jTextField10.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jTextField10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel30.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 49, 172, 29));

        jTextField11.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jTextField11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel30.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 172, 29));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel35.setText("Lương :");
        jPanel30.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 53, 80, -1));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel36.setText("Năm Sinh :");
        jPanel30.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 96, 81, -1));

        jTextField12.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jTextField12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel30.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 49, 190, 29));

        jButton30.setBackground(new java.awt.Color(204, 204, 204));
        jButton30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/xoa.png"))); // NOI18N
        jButton30.setText("XÓA");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel30.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 149, 131, -1));

        jButton31.setBackground(new java.awt.Color(204, 204, 204));
        jButton31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/caidat.png"))); // NOI18N
        jButton31.setText("SỬA");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel30.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 149, 131, -1));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel38.setText("Giới Tính :");
        jPanel30.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 49, 81, -1));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel39.setText("Chú Thích :");
        jPanel30.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 81, -1));

        jTextField13.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTextField13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel30.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 96, 235, 30));

        jButton33.setBackground(new java.awt.Color(204, 204, 204));
        jButton33.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/addne.png"))); // NOI18N
        jButton33.setText("THÊM");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel30.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 149, 124, -1));

        jLabel69.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel69.setText("Chức Vụ :");
        jPanel30.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        Nam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Nam);
        Nam.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        Nam.setText("Nam");
        jPanel30.add(Nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 49, 66, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Nữ");
        jPanel30.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 49, 76, -1));

        jComboBox6.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên", "Quản Lý", "Bảo Vệ" }));
        jPanel30.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 147, 124, 30));

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setDateFormatString("dd-MM-yyyy");
        jDateChooser1.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jPanel30.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 96, 153, 29));

        jButton32.setBackground(new java.awt.Color(204, 204, 204));
        jButton32.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/update.png"))); // NOI18N
        jButton32.setText("LÀM MỚI");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel30.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, 150, 50));
        jPanel30.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 79, 172, 10));
        jPanel30.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 170, 10));
        jPanel30.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 200, 10));
        jPanel30.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 240, 10));

        Nhanvien.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, -1, 210));

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        jPanel34.setBackground(new java.awt.Color(0, 0, 0));

        jLabel37.setBackground(new java.awt.Color(153, 153, 153));
        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Danh Sách Nhân Viên");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        jTable9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ID", "Tên", "Ngày sinh", "Chức vụ", "Lương", "Giới Tính", "Chú thích"
            }
        ));
        jTable9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable9MouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(jTable9);
        if (jTable9.getColumnModel().getColumnCount() > 0) {
            jTable9.getColumnModel().getColumn(0).setResizable(false);
            jTable9.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable9.getColumnModel().getColumn(1).setResizable(false);
            jTable9.getColumnModel().getColumn(2).setResizable(false);
            jTable9.getColumnModel().getColumn(4).setResizable(false);
            jTable9.getColumnModel().getColumn(5).setResizable(false);
            jTable9.getColumnModel().getColumn(6).setResizable(false);
            jTable9.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
        );

        Nhanvien.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 273, 1022, 400));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/12.jpg"))); // NOI18N
        jLabel40.setText("jLabel40");
        Nhanvien.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 680));

        Body.add(Nhanvien, "card4");

        Phonghat.setBackground(new java.awt.Color(255, 255, 255));
        Phonghat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Tên Phòng :");
        jPanel32.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 80, -1));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Chú Thích :");
        jPanel32.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 80, -1));

        jLabel44.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Loại Phòng :");
        jPanel32.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 90, -1));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Giá Phòng/1h");
        jPanel32.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 100, -1));

        jTextField14.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jPanel32.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 240, -1));

        jTextField15.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jPanel32.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 240, -1));

        jComboBox5.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Phòng Thương", "Phòng VIP" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel32.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 240, -1));

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/xoa.png"))); // NOI18N
        jButton5.setText("XÓA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel32.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 123, 34));

        jButton10.setBackground(new java.awt.Color(204, 204, 204));
        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/addne.png"))); // NOI18N
        jButton10.setText("THÊM");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel32.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 140, 34));

        jButton15.setBackground(new java.awt.Color(204, 204, 204));
        jButton15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/update.png"))); // NOI18N
        jButton15.setText("CẬP NHẬT");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel32.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, 34));

        jLabel70.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Tên Phòng :");
        jPanel32.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 80, -1));

        jTextField30.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jPanel32.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 240, -1));

        jLabel72.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("jLabel72");
        jPanel32.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 240, -1));

        jTable11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên Phòng", "Loại", "Giá", "Tình Trạng", "Chú Thích"
            }
        ));
        jTable11.setRowHeight(25);
        jTable11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable11MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(jTable11);

        jPanel32.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 283, 1010, 390));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/update.png"))); // NOI18N
        jButton4.setText("LÀM MỚI");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel32.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 140, 34));

        jComboBox7.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--" }));
        jComboBox7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox7MouseClicked(evt);
            }
        });
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });
        jPanel32.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, 180, 40));

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel47.setText("Tìm Phòng");
        jPanel32.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 120, 40));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/12.jpg"))); // NOI18N
        jLabel41.setText("jLabel41");
        jPanel32.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 700));

        jPanel29.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 1060, 700));

        Phonghat.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Body.add(Phonghat, "card4");

        Thongke.setBackground(new java.awt.Color(255, 255, 255));
        Thongke.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        Thongke.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        Thongke.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 77, 1010, 580));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Từ ngày");
        Thongke.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 62, 40));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Đến ");
        Thongke.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 53, 40));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/thongke.png"))); // NOI18N
        jButton2.setText("THỐNG KÊ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Thongke.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 186, -1));

        jDateChooser2.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        jDateChooser2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Thongke.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 19, 160, 30));

        jDateChooser3.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser3.setDateFormatString("yyyy-MM-dd");
        jDateChooser3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Thongke.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 19, 170, 30));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/12.jpg"))); // NOI18N
        jLabel29.setText("jLabel29");
        Thongke.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 690));

        Body.add(Thongke, "card8");

        Lichsu.setBackground(new java.awt.Color(255, 255, 255));
        Lichsu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lichsu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Phòng", "Tông", "Giờ vào"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lichsu.setRowHeight(25);
        jScrollPane6.setViewportView(lichsu);
        if (lichsu.getColumnModel().getColumnCount() > 0) {
            lichsu.getColumnModel().getColumn(0).setMinWidth(50);
            lichsu.getColumnModel().getColumn(0).setPreferredWidth(50);
            lichsu.getColumnModel().getColumn(0).setMaxWidth(50);
            lichsu.getColumnModel().getColumn(1).setResizable(false);
            lichsu.getColumnModel().getColumn(2).setResizable(false);
            lichsu.getColumnModel().getColumn(3).setResizable(false);
        }

        Lichsu.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 86, 1020, 580));

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/hoanhoadon.png"))); // NOI18N
        jButton7.setText("HOÀN HÓA ĐƠN");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Lichsu.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/12.jpg"))); // NOI18N
        jLabel46.setText("jLabel46");
        Lichsu.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 680));

        Body.add(Lichsu, "card9");

        jPanel11.setBackground(new java.awt.Color(153, 153, 153));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white));
        jPanel11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel11MouseMoved(evt);
            }
        });
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/thongtin.png"))); // NOI18N
        jButton1.setText("THÔNG TIN");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        buttonGroup2.add(jButton1);
        jButton1.setContentAreaFilled(false);
        jButton1.setSelected(true);
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 400, 270, 37));

        jButton16.setBackground(new java.awt.Color(255, 255, 153));
        jButton16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/xemhoadon.png"))); // NOI18N
        jButton16.setText("ĐẶT PHÒNG");
        jButton16.setBorder(null);
        jButton16.setBorderPainted(false);
        buttonGroup2.add(jButton16);
        jButton16.setContentAreaFilled(false);
        jButton16.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton16MouseMoved(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 150, 270, 37));

        jButton17.setBackground(new java.awt.Color(255, 255, 153));
        jButton17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/dichvu.png"))); // NOI18N
        jButton17.setText("DỊCH VỤ");
        jButton17.setBorder(null);
        jButton17.setBorderPainted(false);
        buttonGroup2.add(jButton17);
        jButton17.setContentAreaFilled(false);
        jButton17.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton17MouseMoved(evt);
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 350, 290, 37));

        jButton19.setBackground(new java.awt.Color(255, 255, 153));
        jButton19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/nhanvie.png"))); // NOI18N
        jButton19.setText("NHÂN VIÊN");
        jButton19.setBorder(null);
        jButton19.setBorderPainted(false);
        buttonGroup2.add(jButton19);
        jButton19.setContentAreaFilled(false);
        jButton19.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton19MouseMoved(evt);
            }
        });
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton19MouseClicked(evt);
            }
        });
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 300, 270, 37));

        jButton20.setBackground(new java.awt.Color(255, 255, 153));
        jButton20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/micro.png"))); // NOI18N
        jButton20.setText("PHÒNG HÁT");
        jButton20.setBorder(null);
        jButton20.setBorderPainted(false);
        buttonGroup2.add(jButton20);
        jButton20.setContentAreaFilled(false);
        jButton20.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton20MouseMoved(evt);
            }
        });
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 250, 260, 37));

        jButton21.setBackground(new java.awt.Color(255, 255, 255));
        jButton21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/Untitled-2 copy.png"))); // NOI18N
        jButton21.setText("GIỚI THIỆU");
        jButton21.setBorder(null);
        jButton21.setBorderPainted(false);
        buttonGroup2.add(jButton21);
        jButton21.setContentAreaFilled(false);
        jButton21.setDefaultCapable(false);
        jButton21.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton21MouseMoved(evt);
            }
        });
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 100, 270, 38));

        jButton25.setBackground(new java.awt.Color(255, 255, 153));
        jButton25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/khachhang1.png"))); // NOI18N
        jButton25.setText("KHÁCH HÀNG");
        jButton25.setBorder(null);
        jButton25.setBorderPainted(false);
        buttonGroup2.add(jButton25);
        jButton25.setContentAreaFilled(false);
        jButton25.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton25MouseMoved(evt);
            }
        });
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 200, 250, 37));

        jButton26.setBackground(new java.awt.Color(255, 255, 153));
        jButton26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/dangxuat.png"))); // NOI18N
        jButton26.setText("ĐĂNG XUẤT");
        jButton26.setBorder(null);
        jButton26.setBorderPainted(false);
        buttonGroup2.add(jButton26);
        jButton26.setContentAreaFilled(false);
        jButton26.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton26MouseMoved(evt);
            }
        });
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 600, 260, 34));

        jButton28.setBackground(new java.awt.Color(255, 255, 153));
        jButton28.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/thongke.png"))); // NOI18N
        jButton28.setText("THỐNG KÊ");
        jButton28.setBorder(null);
        jButton28.setBorderPainted(false);
        buttonGroup2.add(jButton28);
        jButton28.setContentAreaFilled(false);
        jButton28.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton28MouseMoved(evt);
            }
        });
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 450, 270, 37));

        jButton29.setBackground(new java.awt.Color(0, 0, 0));
        jButton29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/taikhoan1.png"))); // NOI18N
        jButton29.setText("TÀI KHOẢN");
        jButton29.setBorder(null);
        jButton29.setBorderPainted(false);
        buttonGroup2.add(jButton29);
        jButton29.setContentAreaFilled(false);
        jButton29.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton29MouseMoved(evt);
            }
        });
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 500, 270, 37));

        jButton35.setBackground(new java.awt.Color(0, 0, 0));
        jButton35.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/lich.png"))); // NOI18N
        jButton35.setText(" LỊCH SỬ");
        jButton35.setBorder(null);
        jButton35.setBorderPainted(false);
        buttonGroup2.add(jButton35);
        jButton35.setContentAreaFilled(false);
        jButton35.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton35MouseMoved(evt);
            }
        });
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 550, 290, 34));

        jLabel52.setFont(new java.awt.Font("Magneto", 0, 20)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Ngày");
        jLabel52.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel52AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel11.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 210, -1));

        jLabel31.setBackground(new java.awt.Color(0, 0, 0));
        jLabel31.setFont(new java.awt.Font("Magneto", 0, 20)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Giò");
        jLabel31.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel31AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel11.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/12.jpg"))); // NOI18N
        jLabel17.setText("jLabel17");
        jPanel11.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 210, 690));

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setBackground(new java.awt.Color(255, 51, 51));
        jLabel8.setFont(new java.awt.Font("Magneto", 0, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("******* ShenGoMenGo154 *******");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, 1046, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        Ve(Datphong);
        Reset();
        jTable4.setComponentPopupMenu(jPopupMenu3);
        DoiMau();
        jButton16.setForeground(new Color(255,255,255));
        demmau=16;
            Loandatase();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        Ve(Dichvu);
        Timkiem(jTextField17,ModelDichvu,jTable7);
        Reset();
        DoiMau();
        jButton17.setForeground(new Color(255,255,255));
            Loandatase();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int khachhang1 = jTable4.getSelectedRow();
        int phong = jTable2.getSelectedRow();
        int nhanvien = jTable3.getSelectedRow();
       boolean KiemTra=khachHangConTroll.DatPhong(khachhang1, phong, nhanvien, phongtrong, nhanViens, khachHangs);
     if (KiemTra==true) { 
             khachHangs.remove(khachhang1);
             Loandatase();    JOptionPane.showMessageDialog(rootPane, "Đặt Phòng Thành Công ");
                }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        Ve(Khachhang);
        jTable8.setComponentPopupMenu(jPopupMenu4);
        kiemtra(false);
        DoiMau();demmau=25;
        jButton25.setForeground(new Color(255,255,255));
         Loandatase();
    }//GEN-LAST:event_jButton25ActionPerformed
    void kiemtra(boolean check) {
        jTextField6.setEditable(check);
        jTextField7.setEditable(false);
        jTextField8.setEditable(check);
        jComboBox2.setEditable(check);
        Lưu.setEnabled(check);
    }
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed

        showdata(datphongs, ModelDatphong);
        show(datphongs, modethanhtoan);
        showthongtin(datphongs, Modelthongtinkhach);
        kiemtra(false);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
     Ve(Phonghat);
            Loandatase();  
        jTable11.setComponentPopupMenu(jPopupMenu2);
        DoiMau();demmau=20;
        jButton20.setForeground(new Color(255,255,255));
       
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
              Ve(Nhanvien);
            Loandatase();
        DoiMau();
        jButton19.setForeground(new Color(255,255,255));
        demmau=19;
         jTable9.setComponentPopupMenu(jPopupMenu6);

    }//GEN-LAST:event_jButton19ActionPerformed

    private void jLabel31AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel31AncestorAdded

    }//GEN-LAST:event_jLabel31AncestorAdded
   void DoiMau(){
        jButton21.setForeground(new Color(0,0,0));
        jButton25.setForeground(new Color(0,0,0));
        jButton16.setForeground(new Color(0,0,0));
        jButton20.setForeground(new Color(0,0,0));
        jButton19.setForeground(new Color(0,0,0));
        jButton17.setForeground(new Color(0,0,0));
        jButton1.setForeground(new Color(0,0,0));
        jButton28.setForeground(new Color(0,0,0));
        jButton29.setForeground(new Color(0,0,0));
        jButton35.setForeground(new Color(0,0,0));
 }
 
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DoiMau();
        jButton1.setForeground(new Color(255,255,255));
        demmau=1;
        Loandatase();
        Thongtin newJDialog = new Thongtin(this, rootPaneCheckingEnabled);
        newJDialog.setVisible(true);
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
      dangnhapne dangnhap =new dangnhapne();
      dangnhap.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseClicked
        int selectedRow = jTable9.getSelectedRow();

    }//GEN-LAST:event_jButton19MouseClicked

    private void jLabel52AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel52AncestorAdded
    jLabel52=trangchu.ShowNgay(jLabel52);
    }//GEN-LAST:event_jLabel52AncestorAdded

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        boolean check = true;
        String date=((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText();
        String ma=jTextField10.getText();
        String Ten=jTextField11.getText();
        String Luong=jTextField12.getText();
        String Thongtin=jTextField13.getText();
        String GioiTinh="";
          if (Nam.isSelected()) {
                GioiTinh+="Nam";
            }
            if (jRadioButton2.isSelected()) {
                GioiTinh+="Nữ"; 
            }
    check=quanLyNV.ThemNhanVien(ma, Ten, jComboBox6.getSelectedItem().toString(),GioiTinh, Luong, date, Thongtin);
          if(check==true) {
                Loandatase();
                     Reset();
          }
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        boolean check = true;
        String date=((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText();
        String ma=jTextField10.getText();
        String Ten=jTextField11.getText();
        String Luong=jTextField12.getText();
        String Thongtin=jTextField13.getText();
        String GioiTinh="";
          if (Nam.isSelected()) {
                GioiTinh+="Nam";
            }
            if (jRadioButton2.isSelected()) {
                GioiTinh+="Nữ"; 
            }
    check=quanLyNV.ChinhSưaNhanVien(ma, Ten, jComboBox6.getSelectedItem().toString(),GioiTinh, Luong, date, Thongtin);
          if(check==true) {
                Loandatase();
                Reset();  
          }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jTable9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable9MouseClicked
        try {
            int check = jTable9.getSelectedRow();
            jTextField11.setText("" + nhanViens.get(check).getTen());
            jTextField10.setText("" + nhanViens.get(check).getID());
            jTextField10.setEnabled(false);
            jComboBox6.setSelectedItem(nhanViens.get(check).getChucVu());
            jTextField12.setText("" + nhanViens.get(check).getLuong());
            ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(nhanViens.get(check).getNamSinh());
            jTextField13.setText(nhanViens.get(check).getChuThich());
            if (nhanViens.get(check).getGioiTinh().contains("Nam")) {
                Nam.setSelected(true);
            }
           else if (nhanViens.get(check).getGioiTinh().contains("Nữ")) {
                jRadioButton2.setSelected(true);
            }
            jButton31.setEnabled(true);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jTable9MouseClicked

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
           int check2 = jTable9.getSelectedRow();
        check=(int) jTable9.getValueAt(check2,0)-1;
         TaiKhoan taiKhoan=new TaiKhoan(nhanViens.get(check).getID(),null, null, null);
     boolean check1=quanLyNV.XoaNhanVien(nhanViens.get(check), taiKhoan);
     if(check1==true){      
   JOptionPane.showMessageDialog(rootPane, "Xóa Thành công"); 
         Loandatase(); Reset();}
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        KhachHang khachHang = new KhachHang();
            khachHang.setCMND(jTextField2.getText());
            khachHang.setGioiTinh(jComboBox1.getSelectedItem().toString());
            khachHang.setLienLac(jTextField3.getText());
            khachHang.setTen(jTextField1.getText());
            if(khachHangConTroll.ThemKhachHang(khachHang)!=null){
             khachHangs.add(khachHangConTroll.ThemKhachHang(khachHang));
            show(khachHangs, Modelthemkhach);
            Reset();    
        }


    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
    Loandatase(); show(khachHangs, Modelthemkhach);        Reset();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
     boolean check = true;
    DichVu dichVu = new DichVu(1,jTextField4.getText(),1);
    check=quanLyDichVu.ThêmDichvu(dichVu,jTextField5);
        if (check == true) {
            Loandatase();
            JOptionPane.showMessageDialog(rootPane,"Thêm Thành công"); Reset();
        }
    }//GEN-LAST:event_jButton23ActionPerformed
    int check;
    private void jTable7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable7MouseClicked
       

    }//GEN-LAST:event_jTable7MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    boolean check = true;
    DichVu dichVu = new DichVu(this.dichVu.get(this.check).getID(), jTextField4.getText(),1);
    check=quanLyDichVu.SuaDichvu(dichVu,jTextField5);
        if (check == true) {
            Loandatase();
           Reset();   jButton23.setEnabled(true);
                jButton6.setEnabled(false);
            JOptionPane.showMessageDialog(rootPane,"Cập nhật Thành công"); 
        }
      
    }//GEN-LAST:event_jButton6ActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed

        try {
         check=(int) jTable7.getValueAt(jTable7.getSelectedRow(),0)-1;
            dichVuDao.Delete(dichVu.get(check));
            Loandatase();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn dịch vụ để xóa");
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
        check=(int) jTable7.getValueAt(jTable7.getSelectedRow(),0)-1;
         jButton23.setEnabled(false);
            jTextField4.setText(dichVu.get(check).getTenDV());
            jTextField5.setText(dichVu.get(check).getGiaDV() + "");
            jButton6.setEnabled(true);
            jButton23.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chon dịch vụ để xóa");
        }

    }//GEN-LAST:event_updateActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            int check = jTable11.getSelectedRow();
            jTextField14.setText(phongs.get(check).getMaphong());
            jTextField14.setEnabled(false);
            jTextField15.setText(phongs.get(check).getChuy());
            jTextField30.setText(phongs.get(check).getTenphong());
            jComboBox5.setSelectedItem(phongs.get(check).getLoaiphonh());
            jLabel72.setText("" + phongs.get(check).getGiaphong());
            jButton15.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chon phòng để chỉnh sửa");
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Reset();
            Loandatase();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            khachHangs.remove(jTable4.getSelectedRow());
            show(khachHangs, Modelthemkhach);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn khách hàng cần xóa");
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
     
         kiemtra(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Vui Lòng chọn khách hàng để chỉnh sửa");
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void LưuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LưuActionPerformed
            KhachHang khachHang = new KhachHang();
            khachHang.setCMND(jTextField7.getText());
            khachHang.setGioiTinh(jComboBox2.getSelectedItem().toString());
            khachHang.setLienLac(jTextField8.getText());
            khachHang.setTen(jTextField6.getText());
      if(khachHangConTroll.SuaKhachHang(khachHang)==true){Loandatase();}
    }//GEN-LAST:event_LưuActionPerformed
    int thanhtoan;
    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
           thanhtoan = jTable1.getSelectedRow();
              Thanhtoan thanhtoan =new Thanhtoan(this,rootPaneCheckingEnabled, this.thanhtoan);
              thanhtoan.setVisible(true);
              Reset();
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jTable8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable8MouseClicked
     try {
            int check = (int) jTable8.getValueAt(jTable8.getSelectedRow(),0)-1;
            jTextField6.setText(lichsus.get(check).getDatphong().getKhachHang().getTen());
            jTextField7.setText(lichsus.get(check).getDatphong().getKhachHang().getCMND());
            jTextField8.setText(lichsus.get(check).getDatphong().getKhachHang().getLienLac() + "");
          jComboBox2.setSelectedItem(lichsus.get(check).getDatphong().getKhachHang().getGioiTinh());
            kiemtra(false);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jTable8MouseClicked

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
          int phong = jTable2.getSelectedRow();
            if(chuyenphong>-1&&phong>-1){
           boolean KiemTra =khachHangConTroll.ChuyenPhong(chuyenphong , phongtrong.get(phong));
            if (KiemTra==true){
                   Loandatase();
            JOptionPane.showMessageDialog(rootPane, "Chuyển thành công ");
            Reset();
            jButton14.setEnabled(false);}}
            else{
                JOptionPane.showMessageDialog(rootPane, "Vui Lòng chọn phòng chuyển đến");
            }
    }//GEN-LAST:event_jButton14ActionPerformed
    int chuyenphong;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        chuyenphong = jTable1.getSelectedRow();
        jButton14.setEnabled(true);
        jButton24.setEnabled(true);
        jButton34.setEnabled(true);

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
     int check= jTable1.getSelectedRow(); 
            if(datphongs.size()==0){
               JOptionPane.showMessageDialog(rootPane,"Chưa có phòng để đặt");
            }
            else if (check>-1) {
                   Dichvu dichvu =new Dichvu(this,dichVu, check);
                   dichvu.setVisible(true);
                   Reset();
            }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        try {
            DoiMau();
           jButton28.setForeground(new Color(255,255,255));
            Ve(Thongke);  lichsus.clear(); 
            String NGAString=LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
          lichsus = hoaDonDao.Timkiemthongkes("2020-01-01",NGAString);
            thongke();    
        } catch (SQLException ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
           DoiMau();
           jButton29.setForeground(new Color(255,255,255));
        Taikhoan tk = new Taikhoan(this, rootPaneCheckingEnabled, taiKhoan1);
      tk.aa.setSelectedIndex(1);
      tk.setVisible(true);
            Loandatase();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
     int check=jTable9.getSelectedRow();
     if(check>-1){    
         Taikhoan taikhoan =new Taikhoan(this, rootPaneCheckingEnabled,nhanViens.get(check));
         taikhoan.aa.setSelectedIndex(0);
         taikhoan.setVisible(true);
     }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
     Loandatase();
                Reset();
     
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   List<HoaDon> lichsus=new ArrayList<>();
     lichsus=trangchu.TimKiemThongke(this.lichsus, jDateChooser3, jDateChooser2);
     this.lichsus.clear();this.lichsus=lichsus;
     thongke();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField17MouseClicked

    }//GEN-LAST:event_jTextField17MouseClicked

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Reset();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        String ngay=LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Loandatase();
        showdata(this.lichsus, Modelllichsu);  
        Ve(Lichsu);
        
      DoiMau();demmau=35;
    }//GEN-LAST:event_jButton35ActionPerformed
    public void Ve(JPanel jPanel){
       Body.removeAll();
        Body.repaint();
        Body.validate();
        Body.add(jPanel);
        Body.repaint();
        Body.validate();
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      int check=lichsu.getSelectedRow();
     if(check>-1){ 
          LichSuThanhToan lichSuThanhToan=new LichSuThanhToan();
      if(lichSuThanhToan.HoanHoaDon(lichsus.get(check))==true) {Loandatase();}
     }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton16MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseMoved
jButton16.setFont(new java.awt.Font("Times New Roman", 1, 16));  
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton16MouseMoved

    private void jButton25MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton25MouseMoved
jButton25.setFont(new java.awt.Font("Times New Roman", 1, 16));  
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton25MouseMoved

    private void jButton20MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseMoved
jButton20.setFont(new java.awt.Font("Times New Roman", 1, 16));  
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton20MouseMoved

    private void jButton19MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseMoved
jButton19.setFont(new java.awt.Font("Times New Roman", 1, 16));  
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton19MouseMoved

    private void jButton17MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseMoved
jButton17.setFont(new java.awt.Font("Times New Roman", 1, 16));          // TODO add your handling code here:
    }//GEN-LAST:event_jButton17MouseMoved

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
jButton1.setFont(new java.awt.Font("Times New Roman", 1, 16));  
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseMoved

    private void jButton28MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton28MouseMoved
jButton28.setFont(new java.awt.Font("Times New Roman", 1, 16));         // TODO add your handling code here:
    }//GEN-LAST:event_jButton28MouseMoved

    private void jButton29MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton29MouseMoved
jButton29.setFont(new java.awt.Font("Times New Roman", 1, 16));     // TODO add your handling code here:
    }//GEN-LAST:event_jButton29MouseMoved

    private void jButton26MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton26MouseMoved

           jButton26.setFont(new java.awt.Font("Times New Roman", 1, 16));      // TODO add your handling code here:
    }//GEN-LAST:event_jButton26MouseMoved

    private void jButton35MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton35MouseMoved
        jButton35.setFont(new java.awt.Font("Times New Roman", 1, 16));  
    }//GEN-LAST:event_jButton35MouseMoved

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
       String CMND=jTextField2.getText();
       if(CMND.length()>=8){
             for (int i = 0; i < lichsus.size(); i++) {
            if(lichsus.get(i).getDatphong().getKhachHang().getCMND().equalsIgnoreCase(CMND)){
                 ShowKhach(lichsus.get(i).getDatphong().getKhachHang());
                  break;
            } 
        }
       }
      
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        Ve(Gioithieu);
        Loandatase();
        DoiMau();
        jButton21.setForeground(new Color(255,255,255));
        demmau=21;
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton21MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseMoved
        
        jButton21.setFont(new java.awt.Font("Times New Roman", 1, 16));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21MouseMoved

    private void jTable11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable11MouseClicked
        try {
            int check = jTable11.getSelectedRow();
            jTextField14.setText(phongs.get(check).getMaphong());
            jTextField14.setEnabled(false);
            jTextField15.setText(phongs.get(check).getChuy());
            jTextField30.setText(phongs.get(check).getTenphong());
            jComboBox5.setSelectedItem(phongs.get(check).getLoaiphonh());
            jLabel72.setText("" + phongs.get(check).getGiaphong());
            jButton15.setEnabled(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTable11MouseClicked

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        List<Phong> phongs1 = new ArrayList<>();
        int n = jComboBox7.getSelectedIndex() - 1;
        if (n >= 0) {
            phongs1.add(this.phongs.get(n));
            showdata(phongs1, ModellPhong);
        }
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jComboBox7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox7MouseClicked

    }//GEN-LAST:event_jComboBox7MouseClicked

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        boolean check = true;
        Phong phong = new Phong();
        phong.setMaphong(jTextField14.getText());
        phong.setTenphong(jTextField30.getText());
        phong.setChuy(jTextField15.getText());
        phong.setLoaiphonh(jComboBox5.getSelectedItem().toString());
        check=quanLyPhong.ChinhSua(phong,jLabel72);
        if (check==true) {
            Loandatase();
            JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công");
            Reset();
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        boolean check = true;
        Phong phong = new Phong();
        phong.setMaphong(jTextField14.getText());
        phong.setTenphong(jTextField30.getText());
        phong.setChuy(jTextField15.getText());
        phong.setLoaiphonh(jComboBox5.getSelectedItem().toString());
        check=quanLyPhong.ThemPhong(phong,jLabel72);
        if (check == true) { Loandatase();
            Reset();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    if (jTable11.getSelectedRow() < -1) {
            JOptionPane.showMessageDialog(rootPane,"Vui lòng chọn phòng để xóa");
        }
        else {
            try {
                phongDao.Delete(phongs.get(jTable11.getSelectedRow()));
                Loandatase();
                JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
                Reset();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Phòng này đang có người đặt");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
    if (jComboBox5.getSelectedIndex() == 1) {
            jLabel72.setText(jComboBox5.getSelectedItem().toString());
            jLabel72.setText("300000");
        }
        if (jComboBox5.getSelectedIndex() == 2) {
            jLabel72.setText("500000");
        }
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jTextField9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseClicked
      Timkiem(jTextField9,Modelthongtinkhach,jTable8);
    }//GEN-LAST:event_jTextField9MouseClicked

    private void jPanel11MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseMoved
      jButton21.setFont(new java.awt.Font("Times New Roman", 1, 14));  
      jButton16.setFont(new java.awt.Font("Times New Roman", 1, 14));  
      jButton25.setFont(new java.awt.Font("Times New Roman", 1, 14));  
      jButton20.setFont(new java.awt.Font("Times New Roman", 1, 14));  
      jButton19.setFont(new java.awt.Font("Times New Roman", 1, 14));  
      jButton17.setFont(new java.awt.Font("Times New Roman", 1, 14));  
      jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14));  
      jButton28.setFont(new java.awt.Font("Times New Roman", 1, 14));  
      jButton29.setFont(new java.awt.Font("Times New Roman", 1, 14));  
      jButton35.setFont(new java.awt.Font("Times New Roman", 1, 14));  
    }//GEN-LAST:event_jPanel11MouseMoved

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Datphong;
    private javax.swing.JMenuItem Delete;
    private javax.swing.JPanel Dichvu;
    private javax.swing.JPanel Gioithieu;
    private javax.swing.JPanel Khachhang;
    private javax.swing.JPanel Lichsu;
    private javax.swing.JButton Lưu;
    private javax.swing.JRadioButton Nam;
    private javax.swing.JPanel Nhanvien;
    private javax.swing.JPanel Phonghat;
    private javax.swing.JPanel Thongke;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JPopupMenu jPopupMenu6;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable lichsu;
    private javax.swing.JMenuItem update;
    // End of variables declaration//GEN-END:variables

    private void Reset() {
        jTextField11.setText("");
        jTextField10.setText("");
        jTextField10.setEnabled(true);
        jComboBox6.setSelectedIndex(0);
        jTextField12.setText("");
        ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");
        jTextField13.setText("");
        jButton31.setEnabled(false);
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField30.setText("");
        jComboBox5.setSelectedIndex(0);
        jLabel72.setText("Mời chọn loại phòng ");
        jButton15.setEnabled(false);
        jTextField14.setEnabled(true);
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jButton6.setEnabled(false);
      jButton23.setEnabled(true);
        jButton6.setEnabled(false);
        jButton14.setEnabled(false);
        jButton24.setEnabled(false);
        jButton34.setEnabled(false);
    }
   public  void thongke (){
     trangchu.ThongKe(lichsus, jPanel20);
   }
    private <T> void showdata(List<T> list, DefaultTableModel Modell) {
      trangchu.ShowData(list, Modell);
    }
    private <T> void show(List<T> T, DefaultTableModel Modell) {
       trangchu.ShowData2(T, Modell);
    }

    public void Loandatase(){   
        try {
        KhơiTao();
         lichsus=hoaDonDao.lichsus();
        datphongs = datPhogDao.getAllDatphong();
        nhanViens = nhanVienDao.getAllNhanVien();
        phongs = phongDao.getAllPhong();
        dichVu = dichVuDao.getAllDichVu();
        taiKhoan=nhanVienDao.Selecttaikhoan();
        datphongs = datPhogDao.getDatDichVu(datphongs);
        showdata(nhanViens, ModellThemnv);
        showdata(phongs, ModellPhong);
        showdata(dichVu, ModelDichvu);
       showdata(lichsus, Modelllichsu);
        jComboBox7.removeAllItems();
        jComboBox7.addItem("  ---Select--- ");
        for (Phong phong : phongs) {
            jComboBox7.addItem(phong.getTenphong());
            if (phong.getTinhtrang().equalsIgnoreCase("Đang trống")) {
                phongtrong.add(phong);
            }
        }

        for (NhanVien nhanVien : nhanViens) {
            if (nhanVien.getChucVu().equalsIgnoreCase("Nhân viên")) {
                phucvu.add(nhanVien);
            }
        }
        showdata(datphongs, ModelDatphong);
        showthongtin(lichsus, Modelthongtinkhach);
        show(phongtrong, ModellPhongtrong);
        show(phucvu, ModellNvdatphong);
        } catch (SQLException ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private <T> void showthongtin(List<T> t, DefaultTableModel Modell) {
        Modell=trangchu.ShowThongTinKhach(t, Modell);
    }

    void DatDichvu(List<DichVu> dichvus ,int check) {  
            try {
               datphongs.get(check).getDichVus().addAll(dichvus);
                datphongs.get(check).setNgaydatdichvu(LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm a dd-MM-yyyy")));
                datPhogDao.Update(datphongs.get(check));
                datPhogDao.insert(datphongs.get(check));
                Reset();
            } catch (SQLException ex) {
            }

    }

    void addTaikhoan(TaiKhoan taiKhoan) {
       check=0;
        for (int i = 0; i < this.taiKhoan.size(); i++) {
         if(!taiKhoan.getID().equalsIgnoreCase(this.taiKhoan.get(i).getID())){
            try {
            nhanVienDao.InsertInto(taiKhoan);
            this.taiKhoan.clear(); check++;
            this.taiKhoan=nhanVienDao.Selecttaikhoan(); 
            JOptionPane.showMessageDialog(rootPane,"Tạo Thành Công"); 
            break;
        } catch (SQLException ex) {
        }}}
        if(check==0){
            JOptionPane.showMessageDialog(rootPane,"Nhân viên này đã có tài khoản trước đó");   
        }          
    }

    private void Phanquyen(TaiKhoan taiKhoan2) {
        if(taiKhoan2.getPhanquyen().equalsIgnoreCase("Nhân viên")){
            jButton19.setEnabled(false);
            jButton20.setEnabled(false);
            jButton17.setEnabled(false);
     }
    }

    private void Timkiem(JTextField jTextField17,DefaultTableModel ModelDichvu,JTable jTable7 ) {
      jTextField17=trangchu.TimKiem(ModelDichvu, jTextField17, jTable7);
    }

    private void KhơiTao() throws SQLException {
        nhanVienDao=new NhanVienDao();
        dichVu = new ArrayList<>();
        datphongs = new ArrayList<>();
        lichsus=new ArrayList<>();
        khachHangs = new ArrayList<>();
        nhanViens = new ArrayList<>();
        phongs = new ArrayList<>();
        phongtrong = new ArrayList<>();
        phucvu = new ArrayList<>();
        dichVuDao=new DichVuDao();
        phongDao=new PhongDao();
       Modelllichsu= (DefaultTableModel) lichsu.getModel();
        ModelDatphong = (DefaultTableModel) jTable1.getModel();
        Modelthemkhach = (DefaultTableModel) jTable4.getModel();
        ModellPhongtrong = (DefaultTableModel) jTable2.getModel();
        ModellPhong = (DefaultTableModel) jTable11.getModel();
        ModellThemnv = (DefaultTableModel) jTable9.getModel();
        ModellNvdatphong = (DefaultTableModel) jTable3.getModel();
        ModelDichvu = (DefaultTableModel) jTable7.getModel();
        Modelthongtinkhach = (DefaultTableModel) jTable8.getModel();
        jTable7.setComponentPopupMenu(jPopupMenu1);
        jButton31.setEnabled(false);
        jButton15.setEnabled(false);
        datPhogDao=new DatPhogDao();
        hoaDonDao=new HoaDonDao();

    }
    private void ShowKhach(KhachHang khachHang) {
       jTextField2.setText(khachHang.getCMND());
        jTextField1.setText(khachHang.getTen());
         jTextField3.setText(khachHang.getLienLac()+"");
         jComboBox1.setSelectedItem(khachHang.getGioiTinh());
    }

}
