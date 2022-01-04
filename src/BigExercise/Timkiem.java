/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BigExercise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Orange
 */
public class Timkiem extends javax.swing.JPanel {

    /**
     * Creates new form Timkiem
     */
    public Timkiem() {
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

        bt_timkiem = new javax.swing.JButton();
        txt_timkiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_ketqua = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        bt_timkiem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_timkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Icon/search-icon-16.png"))); // NOI18N
        bt_timkiem.setText("Search");
        bt_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_timkiemActionPerformed(evt);
            }
        });

        txt_timkiem.setForeground(new java.awt.Color(255, 102, 0));

        tb_ketqua.setForeground(new java.awt.Color(255, 102, 51));
        tb_ketqua.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sinh viên", "Học phần", "Số tín chỉ", "Điểm chuyên cần", "Điểm giữa kỳ", "Điểm cuối kỳ", "Thang điểm 10", "Thang điểm 4", "Điểm chữ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_ketqua);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Icon/logo-1.png"))); // NOI18N

        tb_1.setForeground(new java.awt.Color(255, 102, 0));
        tb_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sinh viên", "Họ và tên", "Ngày sinh", "Quê quán", "Gmail", "Số điện thoại", "Khoa", "Lớp"
            }
        ));
        jScrollPane2.setViewportView(tb_1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Icon/10207-man-student-light-skin-tone-icon-24.png"))); // NOI18N
        jLabel1.setText("Thông tin điểm các học phần");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Icon/10207-man-student-light-skin-tone-icon-24.png"))); // NOI18N
        jLabel2.setText("Thông tin sinh viên");

        jLabel3.setText("Nhập mã sinh viên:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_timkiem)))
                .addContainerGap(269, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private boolean Timkiemthongtin() {
        try {
            tb_1.removeAll();
            String[] arr = {"Mã sinh viên","Họ và tên", "Ngày sinh", "Giới tính", "Quê quán", "Gmail", "SĐT", "Khoa","Lớp"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);
            Connection conn = ConnectionUtils.getSQLServerConnection();
            String query = "SELECT * FROM TB_QLThongtin WHERE Masinhvien=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, txt_timkiem.getText());
            ResultSet rs = ps.executeQuery();    
            while (rs.next()) {
                Vector vec = new Vector();
                vec.add(rs.getInt("Masinhvien"));
                vec.add(rs.getString("Hovaten"));
                vec.add(rs.getString("Ngaysinh"));
                vec.add(rs.getString("Gioitinh"));
                vec.add(rs.getString("Quequan"));
                vec.add(rs.getString("Gmail"));
                vec.add(rs.getString("Sodienthoai"));
                vec.add(rs.getString("Khoa"));
                vec.add(rs.getString("Lop"));
                model.addRow(vec);
            }
            tb_1.setModel(model);
        } catch (ClassNotFoundException | SQLException e) {

        }
        return true;
    }
    private boolean Timkiemdiem() {
        try {
            tb_ketqua.removeAll();
            String[] arr = {"Mã sinh viên","Học phần","Số tín chỉ","Điểm chuyên cần", "Điểm giữa kỳ", "Điểm cuối kỳ", "Điểm thang 10", "Điểm thang 4", "Điểm chữ"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);
            Connection conn = ConnectionUtils.getSQLServerConnection();
            String query = "SELECT * FROM TB_QLDiem WHERE Masinhvien=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, txt_timkiem.getText());
            ResultSet rs = ps.executeQuery();    
            while (rs.next()) {
                Vector vec = new Vector();
                vec.add(rs.getInt("Masinhvien"));
                vec.add(rs.getString("Hocphan"));
                vec.add(rs.getInt("Sotinchi"));
                vec.add(rs.getFloat("Diemcc"));
                vec.add(rs.getFloat("Diemgk"));
                vec.add(rs.getString("Diemck"));
                vec.add(rs.getFloat("Diemthang10"));
                vec.add(rs.getFloat("Diemthang4"));
                vec.add(rs.getString("Diemchu"));
                model.addRow(vec);
            }
            tb_ketqua.setModel(model);
        } catch (ClassNotFoundException | SQLException e) {

        }
        return true;
    }
    private void bt_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_timkiemActionPerformed
        Timkiemthongtin();
        Timkiemdiem();
    }//GEN-LAST:event_bt_timkiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_timkiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb_1;
    private javax.swing.JTable tb_ketqua;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
}