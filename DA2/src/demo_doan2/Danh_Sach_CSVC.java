/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_doan2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lyhoa
 */
public class Danh_Sach_CSVC extends javax.swing.JFrame {

    /**
     * Creates new form Danh_Sach_CSVC
     */
    DefaultTableModel tbn = new DefaultTableModel();
    public Danh_Sach_CSVC() {
        initComponents();
        TaiDuLieu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_DanhSachCSVC = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        label_TroVeTrangChu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button_CapNhat = new javax.swing.JButton();
        button_Xoa = new javax.swing.JButton();
        button_ThemMoi = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        textbox_TimKiem = new javax.swing.JTextField();
        button_Tim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Phần mềm quản lý cơ sở vật chất");
        setLocation(new java.awt.Point(600, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        table_DanhSachCSVC.setBackground(java.awt.Color.white);
        table_DanhSachCSVC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên", "SL", "Giá", "Tình trạng"
            }
        ));
        jScrollPane1.setViewportView(table_DanhSachCSVC);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_doan2/image/icons8-product-48.png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ THÔNG TIN CƠ SỞ VẬT CHẤT");

        label_TroVeTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_doan2/image/icons8-go-back-24.png"))); // NOI18N
        label_TroVeTrangChu.setText("Trở về");
        label_TroVeTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_TroVeTrangChuMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Danh sách Cơ Sở Vật Chất");

        button_CapNhat.setBackground(java.awt.Color.lightGray);
        button_CapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_doan2/image/icons8-update-24.png"))); // NOI18N
        button_CapNhat.setText("Cập Nhật");
        button_CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CapNhatActionPerformed(evt);
            }
        });

        button_Xoa.setBackground(java.awt.Color.lightGray);
        button_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_doan2/image/icons8-delete-bin-24.png"))); // NOI18N
        button_Xoa.setText("Xóa");
        button_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_XoaActionPerformed(evt);
            }
        });

        button_ThemMoi.setBackground(java.awt.Color.lightGray);
        button_ThemMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_doan2/image/icons8-add-column-24.png"))); // NOI18N
        button_ThemMoi.setText("Thêm Mới");
        button_ThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ThemMoiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Chức năng");

        jLabel4.setText("---------------------------------------------");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));

        button_Tim.setBackground(java.awt.Color.lightGray);
        button_Tim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_doan2/image/icons8-search-26.png"))); // NOI18N
        button_Tim.setText("Tìm kiếm");
        button_Tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_TimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_Tim, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textbox_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(textbox_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_Tim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(213, 213, 213))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_TroVeTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(button_CapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button_ThemMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button_Xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(39, 39, 39))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(button_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(button_CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_ThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_TroVeTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void TaiDuLieu(){
        DefaultTableModel DanhSachCSVC = (DefaultTableModel)table_DanhSachCSVC.getModel();
        try{
            Connect a = new Connect();
            Connection conn = a.getConnection();
            if (conn!=null){
                Statement dd = conn.createStatement();            
                 ResultSet  kq = dd.executeQuery("Select macsvc, tencsvc, soluong, giatri, tinhtrangcsvc from cosovatchat where xoa = 0");
                 while(kq.next()){
                    String macsvc = kq.getString(1);
                    String tencsvc =kq.getString(2);
                    String soluong =kq.getString(3);
                    String giatri =kq.getString(4);
                    String tinhtrangcsvc =kq.getString(5);
                    DanhSachCSVC.addRow(new Object[]{macsvc, tencsvc,soluong,giatri,tinhtrangcsvc});
                }
                
            }
                      
        }catch(Exception ex){
            System.out.print(ex.toString());
        }
    }
    
    
    private void label_TroVeTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_TroVeTrangChuMouseClicked
        // TODO add your handling code here:
         Danh_Sach_CSVC.this.setVisible(false);
       new Menu_Quan_Ly().setVisible(true);
    }//GEN-LAST:event_label_TroVeTrangChuMouseClicked

    private void button_ThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ThemMoiActionPerformed
        // TODO add your handling code here:   
       new Them_CSVC().setVisible(true);
       Danh_Sach_CSVC.this.setVisible(false);
    }//GEN-LAST:event_button_ThemMoiActionPerformed

    private void button_CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CapNhatActionPerformed
        // TODO add your handling code here:
        try{
        int Row = table_DanhSachCSVC.getSelectedRow();
        String macsvc = (String) table_DanhSachCSVC.getValueAt(Row,0);
        System.out.print(macsvc);
        new Cap_Nhat(macsvc).setVisible(true);
        Danh_Sach_CSVC.this.setVisible(false);
        }catch(Exception ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null,"Vui lòng chọn cơ sở vật chất!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_button_CapNhatActionPerformed

    public void bo(){
        int Row = table_DanhSachCSVC.getSelectedRow();
        String macsvcthongtin = (String) table_DanhSachCSVC.getValueAt(Row,0);
        DefaultTableModel DanhSachCSVC = (DefaultTableModel)table_DanhSachCSVC.getModel();
        try{
            Connect a = new Connect();
            Connection conn = a.getConnection();
            if (conn!=null){
                Statement da = conn.createStatement(); 
                da.executeUpdate("delete from baotrivasuachua where macsvc = '"+macsvcthongtin+"'");
                da.executeUpdate("update cosovatchat set tinhtrangcsvc = N'Bỏ',xoa = 1 where macsvc = '"+macsvcthongtin+"'");
                DanhSachCSVC.removeRow(Row);
                JOptionPane.showMessageDialog(null,"Đã xóa khỏi danh sách!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            }
                      
        }catch(Exception ex){
            System.out.print(ex);
        }
    }
    private void button_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_XoaActionPerformed
        // TODO add your handling code here:
         try{
             bo();
        }catch(Exception ex){
            System.out.println(ex);
         JOptionPane.showMessageDialog(null,"Vui lòng chọn cơ sở vật chất!", "Thông báo",JOptionPane.INFORMATION_MESSAGE);
        }
            
            
       
    }//GEN-LAST:event_button_XoaActionPerformed

    private void button_TimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_TimActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tbn = (DefaultTableModel)table_DanhSachCSVC.getModel();
        String getTen = textbox_TimKiem.getText();
        tbn.setRowCount(0);
        try {
            Connect a = new Connect();
            Connection conn = a.getConnection();
            Statement dd = conn.createStatement();
            ResultSet rs = dd.executeQuery("select macsvc, tencsvc, soluong, giatri, tinhtrangcsvc from cosovatchat where tencsvc like N'%" + getTen + "%' or macsvc like '"+getTen+"'");
            
            while(rs.next()){
                String macsvc = rs.getString(1);
                String tencsvc = rs.getString(2);
                String soluong = String.valueOf(rs.getInt(3));
                String giatri = String.valueOf(rs.getString(4));
                String tinhtrang = rs.getString(5);
                tbn.addRow(new Object[]{macsvc, tencsvc, soluong, giatri, tinhtrang});
            }
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Không thành công!","Thông báo",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_button_TimActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
if (JOptionPane.showConfirmDialog(this, "Thoát phần mềm?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
               System.exit(0);
            }    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Danh_Sach_CSVC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Danh_Sach_CSVC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Danh_Sach_CSVC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Danh_Sach_CSVC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Danh_Sach_CSVC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_CapNhat;
    private javax.swing.JButton button_ThemMoi;
    private javax.swing.JButton button_Tim;
    private javax.swing.JButton button_Xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_TroVeTrangChu;
    private javax.swing.JTable table_DanhSachCSVC;
    private javax.swing.JTextField textbox_TimKiem;
    // End of variables declaration//GEN-END:variables
}
