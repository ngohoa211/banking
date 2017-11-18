/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.staff;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Hung Nguyen Manh
 */
public class ThemNguoiDungPhu extends javax.swing.JFrame {

    TaoTaiKhoan preFrame;
    BufferedReader input;
    PrintWriter output;

    /**
     * Creates new form ThemNguoiDungPhu
     */
    public ThemNguoiDungPhu(TaoTaiKhoan preFrame, BufferedReader input, PrintWriter output) {
        initComponents();
        this.preFrame = preFrame;
        this.input = input;
        this.output = output;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfSoCMTND = new javax.swing.JTextField();
        tfHoTen = new javax.swing.JTextField();
        tfDiaChi = new javax.swing.JTextField();
        btThoat = new javax.swing.JButton();
        btXong = new javax.swing.JButton();
        ngaysinh = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("THÊM NGƯỜI DÙNG PHỤ");

        jLabel2.setText("Số CMTND");

        jLabel3.setText("Họ tên");

        jLabel4.setText("Ngày sinh");

        jLabel5.setText("Địa chỉ");

        btThoat.setText("thoát");
        btThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoatActionPerformed(evt);
            }
        });

        btXong.setText("xong");
        btXong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXongActionPerformed(evt);
            }
        });

        ngaysinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngaysinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btXong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btThoat))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfHoTen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(tfSoCMTND, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDiaChi)
                                    .addComponent(ngaysinh, javax.swing.GroupLayout.Alignment.LEADING))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfSoCMTND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThoat)
                    .addComponent(btXong))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatActionPerformed
        // TODO add your handling code here:
        preFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btThoatActionPerformed

    private void btXongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXongActionPerformed
        // TODO add your handling code here:
        String[] infor = new String[4];
        String text = preFrame.tp.getText();
        if (readUser(infor)) {
            
            text += "Số CMTND: " + infor[0] + "\n" + "Họ và Tên: " + infor[1] + "\nNgày sinh: " + infor[2] + 
                    "\nĐịa chỉ: " + infor[3] + "\n\n";
            
            preFrame.tp.setText(text);
            preFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btXongActionPerformed

    private void ngaysinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngaysinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ngaysinhActionPerformed

    private boolean readUser(String infor[]) {
        String soCMTND = tfSoCMTND.getText().trim();
        String hoTen = tfHoTen.getText().trim();
        String ngaySinh = ngaysinh.getText().trim();
        String diaChi = tfDiaChi.getText().trim();
        if (soCMTND.isEmpty() || hoTen.isEmpty() || ngaySinh == null
                || diaChi.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập đủ thông tin");
            return false;
        } else if (!phu_tro.Verify.isNumeric(soCMTND)) {
            JOptionPane.showMessageDialog(rootPane, "Số CMTND không hợp lệ");
            return false;
        }
        infor[0] = soCMTND;
        infor[1] = hoTen;
        infor[2] = ngaySinh;
        infor[3] = diaChi;
        return true;
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
            java.util.logging.Logger.getLogger(ThemNguoiDungPhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemNguoiDungPhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemNguoiDungPhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemNguoiDungPhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new ThemNguoiDungPhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btXong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField ngaysinh;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfHoTen;
    private javax.swing.JTextField tfSoCMTND;
    // End of variables declaration//GEN-END:variables
}