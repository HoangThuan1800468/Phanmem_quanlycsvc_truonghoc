/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_doan2;

import javax.swing.JOptionPane;

/**
 *
 * @author lyhoa
 */
public class Menu_Quan_Ly extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Quan_Ly
     */
    public Menu_Quan_Ly() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button_Thoat = new javax.swing.JButton();
        button_DanhSachCSVC = new javax.swing.JButton();
        button_KiemKeCSVC = new javax.swing.JButton();
        button_QuanLyPhongBan = new javax.swing.JButton();
        button_DanhSachBaoTri = new javax.swing.JButton();
        button_TaiKhoan = new javax.swing.JButton();
        button_XuatFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Phần mềm quản lý cơ sở vật chất");
        setLocation(new java.awt.Point(600, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_doan2/image/icons8-home-48.png"))); // NOI18N
        jLabel1.setText("MENU QUẢN LÝ CÔNG VIỆC");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_doan2/image/icons8-admin-settings-male-60.png"))); // NOI18N
        jLabel2.setText("PHẦN MỀM QUẢN LÝ CƠ SỞ VẬT CHẤT");

        button_Thoat.setBackground(java.awt.Color.lightGray);
        button_Thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_doan2/image/icons8-exit-sign-24.png"))); // NOI18N
        button_Thoat.setText("Thoát phần mềm");
        button_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ThoatActionPerformed(evt);
            }
        });

        button_DanhSachCSVC.setBackground(java.awt.Color.lightGray);
        button_DanhSachCSVC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_doan2/image/icons8-new-product-24.png"))); // NOI18N
        button_DanhSachCSVC.setText("Danh sách CSVC");
        button_DanhSachCSVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_DanhSachCSVCActionPerformed(evt);
            }
        });

        button_KiemKeCSVC.setBackground(java.awt.Color.lightGray);
        button_KiemKeCSVC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_doan2/image/icons8-add-list-24.png"))); // NOI18N
        button_KiemKeCSVC.setText("Kiểm kê CSVC");
        button_KiemKeCSVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_KiemKeCSVCActionPerformed(evt);
            }
        });

        button_QuanLyPhongBan.setBackground(java.awt.Color.lightGray);
        button_QuanLyPhongBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_doan2/image/icons8-room-24.png"))); // NOI18N
        button_QuanLyPhongBan.setText("Quản lý phòng học");
        button_QuanLyPhongBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_QuanLyPhongBanActionPerformed(evt);
            }
        });

        button_DanhSachBaoTri.setBackground(java.awt.Color.lightGray);
        button_DanhSachBaoTri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_doan2/image/icons8-maintenance-24.png"))); // NOI18N
        button_DanhSachBaoTri.setText("Danh sách bảo trì");
        button_DanhSachBaoTri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_DanhSachBaoTriActionPerformed(evt);
            }
        });

        button_TaiKhoan.setBackground(java.awt.Color.lightGray);
        button_TaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_doan2/image/icons8-test-account-24.png"))); // NOI18N
        button_TaiKhoan.setText("Tài Khoản");
        button_TaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_TaiKhoanActionPerformed(evt);
            }
        });

        button_XuatFile.setBackground(java.awt.Color.lightGray);
        button_XuatFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo_doan2/image/icons8-file-24.png"))); // NOI18N
        button_XuatFile.setText("Xuất file");
        button_XuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_XuatFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button_DanhSachCSVC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button_KiemKeCSVC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button_QuanLyPhongBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button_DanhSachBaoTri, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button_XuatFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(button_Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_DanhSachCSVC, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_XuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_QuanLyPhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_KiemKeCSVC, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_DanhSachBaoTri, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_button_ThoatActionPerformed

    private void button_DanhSachCSVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_DanhSachCSVCActionPerformed
        // TODO add your handling code here:
        Menu_Quan_Ly.this.setVisible(false);
       new Danh_Sach_CSVC().setVisible(true);
    }//GEN-LAST:event_button_DanhSachCSVCActionPerformed

    private void button_KiemKeCSVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_KiemKeCSVCActionPerformed
        // TODO add your handling code here:
         Menu_Quan_Ly.this.setVisible(false);
       new Kiem_Ke_CSVC().setVisible(true);
    }//GEN-LAST:event_button_KiemKeCSVCActionPerformed

    private void button_QuanLyPhongBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_QuanLyPhongBanActionPerformed
        // TODO add your handling code here:
         Menu_Quan_Ly.this.setVisible(false);
       new Quan_Ly_Phong_Ban().setVisible(true);
    }//GEN-LAST:event_button_QuanLyPhongBanActionPerformed

    private void button_DanhSachBaoTriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_DanhSachBaoTriActionPerformed
        // TODO add your handling code here:
        Menu_Quan_Ly.this.setVisible(false);
       new Danh_Sach_Bao_Tri().setVisible(true);
    }//GEN-LAST:event_button_DanhSachBaoTriActionPerformed

    private void button_TaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_TaiKhoanActionPerformed
        // TODO add your handling code here:
         Menu_Quan_Ly.this.setVisible(false);
       new Tai_Khoan().setVisible(true);
    }//GEN-LAST:event_button_TaiKhoanActionPerformed

    private void button_XuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_XuatFileActionPerformed
        // TODO add your handling code here:
        Menu_Quan_Ly.this.setVisible(false);
       new Xuat_File().setVisible(true);
    }//GEN-LAST:event_button_XuatFileActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "Thoát phần mềm?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
               System.exit(0);
            }
        
    }//GEN-LAST:event_formWindowClosing

    /**table_DanhSachCSVC
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
            java.util.logging.Logger.getLogger(Menu_Quan_Ly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Quan_Ly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Quan_Ly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Quan_Ly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Quan_Ly().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_DanhSachBaoTri;
    private javax.swing.JButton button_DanhSachCSVC;
    private javax.swing.JButton button_KiemKeCSVC;
    private javax.swing.JButton button_QuanLyPhongBan;
    private javax.swing.JButton button_TaiKhoan;
    private javax.swing.JButton button_Thoat;
    private javax.swing.JButton button_XuatFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    private void Exit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
