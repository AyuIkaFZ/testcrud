
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ika
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
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

        jLabel3 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        txtNIS = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        rdLaki = new javax.swing.JRadioButton();
        rdPerempuan = new javax.swing.JRadioButton();
        txtKelas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        Edit = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Form Biodata Siswa SMK Telkom");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 410, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("The Real Informatic Schools");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 40, 180, 20);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 10, 80, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 910, 100);

        jPanel2.setBackground(new java.awt.Color(51, 255, 0));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Alamat");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 340, 130, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Isian Data Siswa");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 10, 130, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("NIS");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 50, 130, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Nama");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 110, 130, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Jenis Kelamin");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 170, 130, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Kelas");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 220, 130, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Email");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 280, 130, 20);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(0, 40, 280, 10);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel2.add(txtEmail);
        txtEmail.setBounds(10, 300, 220, 30);
        jPanel2.add(txtNIS);
        txtNIS.setBounds(10, 70, 150, 30);
        jPanel2.add(txtNama);
        txtNama.setBounds(10, 130, 220, 30);

        buttonGroup1.add(rdLaki);
        rdLaki.setText("Laki - Laki");
        jPanel2.add(rdLaki);
        rdLaki.setBounds(10, 190, 100, 23);

        buttonGroup1.add(rdPerempuan);
        rdPerempuan.setText("Perempuan");
        rdPerempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdPerempuanActionPerformed(evt);
            }
        });
        jPanel2.add(rdPerempuan);
        rdPerempuan.setBounds(120, 190, 110, 23);
        jPanel2.add(txtKelas);
        txtKelas.setBounds(10, 240, 220, 30);

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 360, 240, 96);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 110, 280, 500);

        jPanel3.setBackground(new java.awt.Color(51, 255, 0));
        jPanel3.setLayout(null);

        Edit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        jPanel3.add(Edit);
        Edit.setBounds(490, 10, 90, 30);

        Save.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel3.add(Save);
        Save.setBounds(10, 10, 90, 30);

        Delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel3.add(Delete);
        Delete.setBounds(130, 10, 90, 30);

        Clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel3.add(Clear);
        Clear.setBounds(250, 10, 90, 30);

        Refresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel3.add(Refresh);
        Refresh.setBounds(370, 10, 90, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(300, 110, 600, 50);

        jPanel4.setBackground(new java.awt.Color(51, 255, 0));
        jPanel4.setLayout(null);

        tblData.setBackground(new java.awt.Color(51, 255, 0));
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "NamaSiswa", "Jenis Kelamin", "Kelas", "Email", "Alamat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 580, 390);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(300, 170, 600, 410);

        setSize(new java.awt.Dimension(918, 618));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void rdPerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdPerempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdPerempuanActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        if("".equals(txtNIS.getText()) || "".equals(txtAlamat.getText()) || "".equals(txtKelas.getText()) || "".equals(txtNama.getText()) || "".equals(txtEmail.getText())){
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data","Error", JOptionPane.WARNING_MESSAGE);
        }else{
            String JK = "";
                if(rdLaki.isSelected()){
                    JK = "L";
                }else{
                    JK = "P";
                }
        
        String SQL = "insert into  t_siswa (NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat) "
                + "VALUES('"+txtNIS.getText()+"','"+txtNama.getText()+"','"+JK+"',"
                + "'"+txtKelas.getText()+"','"+txtEmail.getText()+"','"+txtAlamat.getText()+"')";
        int status = KoneksiDB.execute(SQL);
        if(status == 1){
            JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            selectData();
        }else{
            JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        int baris = tblData.getSelectedRow();
        if (baris != -1){
            String NIS = tblData.getValueAt(baris,0).toString();
            String SQL = "DELETE FROM t_siswa WHERE NIS='"+NIS+"'";
            int status = KoneksiDB.execute(SQL);
            if(status==1){
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Data gagal dihapus","Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih dahulu","Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        txtNama.setText("");
        txtNIS.setText("");
        txtKelas.setText("");
        buttonGroup1.clearSelection();
        txtEmail.setText("");
        txtAlamat.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        selectData();
    }//GEN-LAST:event_RefreshActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        if ("".equals(txtNIS.getText())||"".equals(txtNama.getText())||
                "".equals(txtKelas.getText())||"".equals(txtEmail.getText())||
                "".equals(txtAlamat.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);    
        }else{
            int baris = tblData.getSelectedRow();
            String nis = tblData.getValueAt(baris, 0).toString();
            String JK = "";
            if (rdLaki.isSelected()) {
                JK = "L";
            }else{
                JK = "P";
            }
            String SQL = "UPDATE t_siswa SET" 
                    +" NIS='"+txtNIS.getText()+"',"
                    +" NamaSiswa='"+txtNama.getText()+"',"+" JenisKelamin='"+JK+"',"
                    +" Kelas='"+txtKelas.getText()+"',"+" Email='"+txtEmail.getText()+"',"
                    +" Alamat='"+txtAlamat.getText()+"' WHERE NIS="+nis;
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                 JOptionPane.showMessageDialog(this, "Data berhasil diupdate","Sukses", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Data gagal diupdate", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_EditActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        int baris = tblData.getSelectedRow();
        if(baris != -1){
            txtNIS.setText(tblData.getValueAt(baris,0).toString());
            txtNama.setText(tblData.getValueAt(baris,1).toString());
            if("Laki-Laki".equals(tblData.getValueAt(baris,2).toString())){
                rdLaki.setSelected(true);
            }else{
                rdPerempuan.setSelected(true);
            }
        }   
        txtKelas.setText(tblData.getValueAt(baris,3).toString());
        txtEmail.setText(tblData.getValueAt(baris,4).toString());
        txtAlamat.setText(tblData.getValueAt(baris,5).toString());
    }//GEN-LAST:event_tblDataMouseClicked

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Save;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rdLaki;
    private javax.swing.JRadioButton rdPerempuan;
    private javax.swing.JTable tblData;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNIS;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
       String kolom[] = {"NIS","NamaSiswa","JenisKelamin","Kelas","Email","Alamat"};
       DefaultTableModel dtm = new DefaultTableModel(null, kolom);
       String SQL = "SELECT * FROM t_siswa";
       ResultSet rs = KoneksiDB.executeQuery(SQL);
       try{
           while(rs.next()){
               String NIS = rs.getString(1);
               String NamaSiswa = rs.getString(2);               
               String JenisKelamin = "";
               if("L".equals(rs.getString(3))){
                   JenisKelamin = "Laki-Laki";
               }else{
                   JenisKelamin = "Perempuan";
               }
               String Kelas = rs.getString(4);
               String Email = rs.getString(5);
               String Alamat = rs.getString(6);
               String data [] = {NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat};
               dtm.addRow(data);
           }   
        }catch(SQLException ex){
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
       tblData.setModel(dtm);
    }
}
