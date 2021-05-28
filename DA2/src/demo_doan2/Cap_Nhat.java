/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_doan2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author lyhoa
 */
public class Cap_Nhat extends javax.swing.JFrame {

    Connect a = new Connect();
    Connection conn = a.getConnection();
    public Cap_Nhat(String macsvc) {
        initComponents();
        TaiDuLieuCN(macsvc);
    }

    private Cap_Nhat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void loadtenphong(String macsvcthongtin){          
        try{
        
         if (conn!=null){
             Statement dd = conn.createStatement();  
              ResultSet  tp = dd.executeQuery("select tenphong  from phonghoc,cosovatchat  where phonghoc.maphong = cosovatchat.maphong  and macsvc like'"+macsvcthongtin+"'"); 
              while(tp.next()){
                       String phongluutru=tp.getString(1);
                       textbox_PhongLuuTru.setText(phongluutru);
                    }
         }
        conn.close();
        }catch(Exception ex){
            System.out.print(ex.toString());
        }
      
       
        
    }
    public void TaiDuLieuCN(String macsvc){
        
         try{
        Connect a = new Connect();
        Connection conn = a.getConnection();
         if (conn!=null){
             Statement dd = conn.createStatement();  
             ResultSet  kq = dd.executeQuery("select * from cosovatchat where macsvc = '"+macsvc+"' ");  
             while(kq.next()){
                    String tencsvc= kq.getString(1);
                    String macsvc2 = kq.getString(2);
                    String tinhtrang=kq.getString(3);
                    Date ngaynhan =kq.getDate(4);
                    String loai=kq.getString(5);
                    int soluong=kq.getInt(6);
                    String donvi=kq.getString(7);
                    int giatri=kq.getInt(8);
                    Date hansudung =kq.getDate(9);
                    String hinhthucthanhtoan=kq.getString(10);
                    String phongluutru=kq.getString(11);
                    String nguontien=kq.getString(12);
                    String nguoigiaodich=kq.getString(13);
                    String maphong=kq.getString(14);
                    
                    
                    
                    textbox_TenCSVC.setText(tencsvc);
                    textbox_MaCSVC.setText(macsvc);
                    textbox_SoLuong.setText(String.valueOf(soluong));
                    textbox_DonViTinh.setSelectedItem(donvi);
                    textbox_GiaTriCSVC.setText(String.valueOf(giatri));
                    textbox_TinhTrang.setSelectedItem(tinhtrang);
                    textbox_HinhThucThanhToan.setSelectedItem(hinhthucthanhtoan);
                    loadtenphong(macsvc);
                    textbox_LoaiCSVC.setSelectedItem(loai);
                    textbox_NguonVonTrichXuat.setSelectedItem(nguontien);
                    textbox_NguoiDaiDienGiaoDich.setText(nguoigiaodich);
                    textbox_Phong.setText(maphong);
                    String giaX1 = String.valueOf(giatri/soluong);
                    textbox_giax1.setText(giaX1);
                    
                    String str[] = ngaynhan.toString().split("-");
                    String str1[] = hansudung.toString().split("-");
                    
                    txt_ngay1.setSelectedItem(str[2]);
                    txt_thang1.setSelectedItem(str[1]);
                    txt_nam1.setText(str[0]);
                    
                    txt_ngay2.setSelectedItem(str1[2]);
                    txt_thang2.setSelectedItem(str1[1]);
                    txt_nam2.setText(str1[0]);
                    
                    if (tinhtrang.equals("Đang bảo trì") ||tinhtrang.equals("Bảo trì") ){
                        textbox_TinhTrang.enable(false);
                    }
             }
         }
        conn.close();
        }catch(Exception ex){
            System.out.print(ex.toString());
        }
        
    }
    public boolean textloi (String a){
         boolean inputFinish = false;
         int number;
         try
         {
           number = Integer.parseInt(a);  
           inputFinish = true;
         }
          catch (Exception ignore)
          {
              inputFinish = false;
          }
        
        return inputFinish;
    }
    public boolean testngay(String day){
        boolean kt = false;
        try{
            java.util.Date ngay = new SimpleDateFormat("yyyy-MM-dd").parse(day);
            kt=true;
            return kt;
        }catch(Exception ex){
            return kt;
        }
    }
    public void chinhsuathongtin(){
        try{
            String tencsvc =textbox_TenCSVC.getText();
            String MaCSVC =textbox_MaCSVC.getText();
            String SoLuong =textbox_SoLuong.getText();
            String DonViTinh =textbox_DonViTinh.getSelectedItem().toString();
            String GiaTriCSVC =textbox_GiaTriCSVC.getText();
            String TinhTrang =textbox_TinhTrang.getSelectedItem().toString();
            String ngaynhan1 = txt_nam1.getText().trim()+"-"+txt_thang1.getSelectedItem().toString().trim()+"-"+txt_ngay1.getSelectedItem().toString().trim();
            String hansudung1 = txt_nam2.getText().trim()+"-"+txt_thang2.getSelectedItem().toString().trim()+"-"+txt_ngay2.getSelectedItem().toString().trim();
            int nam1=Integer.parseInt(txt_nam1.getText());
            int nam2=Integer.parseInt(txt_nam2.getText());
            java.util.Date ngaynhan = new SimpleDateFormat("yyyy-MM-dd").parse(ngaynhan1);
            java.util.Date hansudung = new SimpleDateFormat("yyyy-MM-dd").parse(hansudung1);
            String Phongluutru =textbox_PhongLuuTru.getText();
            String HinhThucThanhToan =textbox_HinhThucThanhToan.getSelectedItem().toString();
            String LoaiCSVC =textbox_LoaiCSVC.getSelectedItem().toString();
            String NguonVonTrichXuat =textbox_NguonVonTrichXuat.getSelectedItem().toString();
            String NguoiDaiDienGiaoDich =textbox_NguoiDaiDienGiaoDich.getText();
            String Phong = textbox_Phong.getText();
            
            
            if(tencsvc.equals("")||SoLuong.equals("")||DonViTinh.equals("---Chọn---")
                ||GiaTriCSVC.equals("")||TinhTrang.equals("")||ngaynhan1.equals("")
                ||hansudung1.equals("")||HinhThucThanhToan.equals("---Chọn---")||Phongluutru.equals("")
                ||LoaiCSVC.equals("---Chọn---")||NguonVonTrichXuat.equals("---Chọn---")||NguoiDaiDienGiaoDich.equals("")||Phong.equals("")){
                JOptionPane.showMessageDialog(null,"Nhập thiếu thông tin nhập lại!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                }else if(textloi(SoLuong) == false||textloi(GiaTriCSVC) == false){
                    JOptionPane.showMessageDialog(null,"Nhập sai thông tin nhập lại!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                }else if(testngay(ngaynhan1)==false||testngay(hansudung1)==false){
                    JOptionPane.showMessageDialog(null,"Vui lòng nhập năm theo đúng định dạng!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                }else if(nam1>=3000||nam1<2020||nam2>=3000||nam2<2020){
                    JOptionPane.showMessageDialog(null,"Vui lòng nhập năm sau 2020 và trước 2999!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                }else if(hansudung.before(ngaynhan)==true){
                    JOptionPane.showMessageDialog(null,"Vui lòng nhập hạn sử dụng sau ngày nhận csvc!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    int numbersoluong = Integer.parseInt(SoLuong);  
                    int numberGiaTriCSVC = Integer.parseInt(GiaTriCSVC);  
                    try{
                        Connect a = new Connect();
                        Connection conn = a.getConnection();
                        Statement dd = conn.createStatement();            
                        dd.executeUpdate("update cosovatchat set  tencsvc= N'"+tencsvc+"' , soluong="+numbersoluong+", giatri="+numberGiaTriCSVC+", "
                            + "donvi=N'"+DonViTinh+"',tinhtrangcsvc=N'"+TinhTrang+"',loaicsvc=N'"+LoaiCSVC+"',hinhthucthanhtoan= N'"+HinhThucThanhToan+"' ,"
                            + "phongluutru= N'"+Phongluutru+"' ,nguontien= N'"+NguonVonTrichXuat+"',nguoigiaodich = N'"+NguoiDaiDienGiaoDich+"' , "
                            + "maphong = N'"+Phong+"', ngaynhancsvc = '"+ngaynhan1+"', hansudungcsvc = '"+hansudung1+"'  where macsvc like '"+MaCSVC+"' ");
                        JOptionPane.showMessageDialog(null,"Đã cập nhật thông tin csvc!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                        Cap_Nhat.this.setVisible(false);
                        new Danh_Sach_CSVC().setVisible(true);
                        }catch(Exception ex){
                         System.out.print(ex);
                         JOptionPane.showMessageDialog(null,"Vui lòng nhập ngày theo đúng định dạng: year-month-day !","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
        }catch(Exception ex){
            System.out.print(ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        textbox_TenCSVC = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        textbox_SoLuong = new javax.swing.JTextField();
        textbox_NguoiDaiDienGiaoDich = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textbox_GiaTriCSVC = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textbox_MaCSVC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        label_TroVeTrangTruoc = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textbox_Phong = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btn_ChinhSua = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        textbox_giax1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textbox_PhongLuuTru = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        textbox_LoaiCSVC = new javax.swing.JComboBox<>();
        textbox_DonViTinh = new javax.swing.JComboBox<>();
        textbox_HinhThucThanhToan = new javax.swing.JComboBox<>();
        textbox_NguonVonTrichXuat = new javax.swing.JComboBox<>();
        textbox_TinhTrang = new javax.swing.JComboBox<>();
        txt_thang1 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_nam1 = new javax.swing.JTextField();
        txt_thang2 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_nam2 = new javax.swing.JTextField();
        txt_ngay2 = new javax.swing.JComboBox<>();
        txt_ngay1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Phần mềm quản lý cơ sở vật chất");
        setLocation(new java.awt.Point(600, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Loại CSVC:");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Người đại diện giao dịch:");

        textbox_SoLuong.setEnabled(false);
        textbox_SoLuong.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                textbox_SoLuongVetoableChange(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Tổng giá trị:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Mã CSVC:");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Mã phòng:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Tình trạng:");

        textbox_MaCSVC.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Đơn vị tính:");

        label_TroVeTrangTruoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_doan2/image/icons8-go-back-24.png"))); // NOI18N
        label_TroVeTrangTruoc.setText("Trở về");
        label_TroVeTrangTruoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_TroVeTrangTruocMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Số lượng:");

        textbox_Phong.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("HSD:");

        btn_ChinhSua.setBackground(java.awt.Color.lightGray);
        btn_ChinhSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_doan2/image/icons8-edit-24.png"))); // NOI18N
        btn_ChinhSua.setText("Chỉnh sửa");
        btn_ChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChinhSuaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Ngày nhận:");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setText("Giá x 1:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Tên phòng:");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_doan2/image/icons8-product-48.png"))); // NOI18N
        jLabel12.setText("THÔNG TIN CƠ SỞ VẬT CHẤT");

        textbox_PhongLuuTru.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Hình thức thanh toán:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Tên CSVC:");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Nguồn tiền:");

        textbox_LoaiCSVC.setBackground(java.awt.Color.white);
        textbox_LoaiCSVC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Chọn---", "Bàn", "Tủ", "Thiết bị điện", "Giấy tờ", "Dụng cụ thực hành", "Mô hình" }));

        textbox_DonViTinh.setBackground(java.awt.Color.white);
        textbox_DonViTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Chọn---", "Cái", "Lọ", "Chai", "Hộp" }));

        textbox_HinhThucThanhToan.setBackground(java.awt.Color.white);
        textbox_HinhThucThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Chọn---", "Tiền mặt", "Chuyển khoản", "Ghi nợ", "Trả góp" }));

        textbox_NguonVonTrichXuat.setBackground(java.awt.Color.white);
        textbox_NguonVonTrichXuat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Chọn---", "Quỹ trường", "Quỹ khuyến học", "Quỹ bộ Giáo Dục", "Quỹ phụ huynh" }));

        textbox_TinhTrang.setBackground(java.awt.Color.white);
        textbox_TinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tốt", "Hỏng", "Bảo trì", "Bỏ", "Đã bảo trì", "Đang bảo trì" }));

        txt_thang1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel18.setText("/");

        jLabel19.setText("/");

        txt_nam1.setText("2020");

        txt_thang2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel20.setText("/");

        jLabel21.setText("/");

        txt_nam2.setText("2020");

        txt_ngay2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        txt_ngay1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(label_TroVeTrangTruoc))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_ChinhSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(textbox_NguoiDaiDienGiaoDich))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel15))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textbox_NguonVonTrichXuat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textbox_HinhThucThanhToan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textbox_GiaTriCSVC, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)
                                .addGap(37, 37, 37)
                                .addComponent(textbox_giax1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel13))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textbox_TenCSVC)
                                    .addComponent(textbox_TinhTrang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textbox_LoaiCSVC, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(textbox_DonViTinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textbox_SoLuong)
                                            .addComponent(textbox_MaCSVC)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_ngay2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_thang2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_nam2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textbox_PhongLuuTru, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(textbox_Phong))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_ngay1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_thang1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_nam1)))))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textbox_TenCSVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(textbox_MaCSVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(textbox_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textbox_TinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(textbox_LoaiCSVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textbox_DonViTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textbox_GiaTriCSVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(textbox_giax1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(textbox_PhongLuuTru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(textbox_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ngay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_thang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(txt_nam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ngay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_thang2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(txt_nam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(textbox_HinhThucThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(textbox_NguonVonTrichXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(textbox_NguoiDaiDienGiaoDich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_ChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_TroVeTrangTruoc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textbox_SoLuongVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_textbox_SoLuongVetoableChange
        // TODO add your handling code here:
        int soluong = Integer.parseInt(textbox_SoLuong.getText());
        int giatri = Integer.parseInt(textbox_GiaTriCSVC.getText());
        String giaX1 = String.valueOf(giatri/soluong);
        textbox_giax1.setText(giaX1);
    }//GEN-LAST:event_textbox_SoLuongVetoableChange

    private void btn_ChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChinhSuaActionPerformed
        // TODO add your handling code here:
        chinhsuathongtin();
    }//GEN-LAST:event_btn_ChinhSuaActionPerformed

    private void label_TroVeTrangTruocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_TroVeTrangTruocMouseClicked
        // TODO add your handling code here:
        Cap_Nhat.this.setVisible(false);
        new Danh_Sach_CSVC().setVisible(true);
    }//GEN-LAST:event_label_TroVeTrangTruocMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(this, "Thoát phần mềm?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
               System.exit(0);    }//GEN-LAST:event_formWindowClosing
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cap_Nhat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cap_Nhat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cap_Nhat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cap_Nhat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cap_Nhat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ChinhSua;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label_TroVeTrangTruoc;
    private javax.swing.JComboBox<String> textbox_DonViTinh;
    private javax.swing.JTextField textbox_GiaTriCSVC;
    private javax.swing.JComboBox<String> textbox_HinhThucThanhToan;
    private javax.swing.JComboBox<String> textbox_LoaiCSVC;
    private javax.swing.JTextField textbox_MaCSVC;
    private javax.swing.JTextField textbox_NguoiDaiDienGiaoDich;
    private javax.swing.JComboBox<String> textbox_NguonVonTrichXuat;
    private javax.swing.JTextField textbox_Phong;
    private javax.swing.JTextField textbox_PhongLuuTru;
    private javax.swing.JTextField textbox_SoLuong;
    private javax.swing.JTextField textbox_TenCSVC;
    private javax.swing.JComboBox<String> textbox_TinhTrang;
    private javax.swing.JTextField textbox_giax1;
    private javax.swing.JTextField txt_nam1;
    private javax.swing.JTextField txt_nam2;
    private javax.swing.JComboBox<String> txt_ngay1;
    private javax.swing.JComboBox<String> txt_ngay2;
    private javax.swing.JComboBox<String> txt_thang1;
    private javax.swing.JComboBox<String> txt_thang2;
    // End of variables declaration//GEN-END:variables
}
