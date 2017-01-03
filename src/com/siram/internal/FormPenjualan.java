/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siram.internal;

import com.siram.main.FormMain;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author BadikIrwan
 */
public class FormPenjualan extends javax.swing.JInternalFrame {
    FormMain n = new FormMain();
    public String tglchooser;
    /**
     * Creates new form FormPenjualan
     */
    public FormPenjualan() {
        initComponents();
        kode_bahan();
        tabel_transaksi();
        autokode();
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
        tabel = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbproduk = new javax.swing.JComboBox<>();
        tanggal = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnamaproduk = new javax.swing.JTextField();
        txtnotransaksi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnamapelanggan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtjumlahbeli = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtketerangan = new javax.swing.JTextArea();
        btnadd = new javax.swing.JButton();
        txtsatuan = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnsimpan = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        txttotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtbayar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtkembali = new javax.swing.JTextField();
        btnprint = new javax.swing.JButton();

        setBorder(null);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabel);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data penjualan"));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Nama Product");

        cbproduk.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbproduk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH" }));
        cbproduk.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbprodukItemStateChanged(evt);
            }
        });

        tanggal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tanggal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tanggalPropertyChange(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Kode product");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Tanggal");

        txtharga.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Jumlah Beli");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("No ");

        txtnamaproduk.setEditable(false);

        txtnotransaksi.setEditable(false);
        txtnotransaksi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Harga");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nama Pelanggan");

        txtnamapelanggan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Keterangan");

        txtjumlahbeli.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtketerangan.setColumns(20);
        txtketerangan.setRows(5);
        jScrollPane2.setViewportView(txtketerangan);

        btnadd.setText("Add item");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        txtsatuan.setEditable(false);
        txtsatuan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Satuan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(jLabel8))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnamaproduk, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtjumlahbeli, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd)
                    .addComponent(cbproduk, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addGap(23, 23, 23)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnotransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(60, 60, 60))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtnamapelanggan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(571, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbproduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtnamaproduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtjumlahbeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(btnadd)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtnotransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtnamapelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btnsimpan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siram/picture/save.png"))); // NOI18N
        btnsimpan.setText("Beli");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnhapus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siram/picture/delete.png"))); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnkeluar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siram/picture/exit.png"))); // NOI18N
        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        txttotal.setEditable(false);
        txttotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Total");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Bayar");

        txtbayar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbayarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Kembali");

        txtkembali.setEditable(false);
        txtkembali.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnprint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siram/picture/print.png"))); // NOI18N
        btnprint.setText("Cetak");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnsimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnhapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnprint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnkeluar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttotal)
                            .addComponent(txtbayar)
                            .addComponent(txtkembali, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnsimpan)
                        .addComponent(btnhapus)
                        .addComponent(btnkeluar)
                        .addComponent(btnprint)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtkembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        Connection con = com.siram.koneksi.Koneksi.getKoneksi();
        int total = Integer.parseInt(txtharga.getText()) * Integer.parseInt(txtjumlahbeli.getText());
            int simpan2 = 0;
            if(txttotal.getText().equals("")){
                simpan2 = 0;
            }
            else
                simpan2 = Integer.valueOf(txttotal.getText());

            String sql = "INSERT INTO item_penjualan(kode_barang,nama_barang,satuan,nama_pelanggan,qty,harga,jumlah,order_no) "
                    + "VALUES('"+cbproduk.getSelectedItem().toString()+"','"+txtnamaproduk.getText()+"','"+txtsatuan.getText()+"',"
                    + "'"+txtnamapelanggan.getText()+"','"+txtjumlahbeli.getText()+"','"+txtharga.getText()+"','"+total+"','"+txtnotransaksi.getText()+"')";
            try {
                    //simpan_no();
                    Statement st = con.createStatement();
                    st.executeUpdate(sql);
                    txttotal.setText(String.valueOf(simpan2+total));
                    //JOptionPane.showMessageDialog(this, "Barang Berhasil Dibeli");
                    tampil_tabel();
                    //tabel_transaksi();
                    //tampil_tabel_transaksi();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        Connection con = com.siram.koneksi.Koneksi.getKoneksi();
        try {
            Statement st = con.createStatement();
            String sql = "INSERT INTO penjualan(order_no,order_date,nama_kasir,total,bayar,kembali)"
                    + "VALUES('"+txtnotransaksi.getText()+"','"+tglchooser+"','"+n.txtuser.getText()+"',"
                    + "'"+txttotal.getText()+"','"+txtbayar.getText()+"','"+txtkembali.getText()+"')";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Barang Berhasil Dibeli");
        } catch(Exception e) {
           JOptionPane.showMessageDialog(this, "Data gagal tersimpan", "Pesan", JOptionPane.WARNING_MESSAGE); 
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        Connection con = (Connection)com.siram.koneksi.Koneksi.getKoneksi();
        int baris = tabel.getSelectedRow();
        try {
            Statement st = con.createStatement();
            if(baris == -1) {
                JOptionPane.showMessageDialog(rootPane, "Anda belum memilih tabel");
            } else {
                String sql = "DELETE FROM item_penjualan WHERE no='"+tabel.getModel().getValueAt(baris, 0)+"'";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Data berhasil di hapus");
                getData();
            }
            
        } catch(Exception e) {
            
        }
        tampil_tabel();
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void cbprodukItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbprodukItemStateChanged
        // TODO add your handling code here:
        Connection con = com.siram.koneksi.Koneksi.getKoneksi();
        ResultSet rs;
        String sql = "SELECT * FROM produk WHERE kode = '"+cbproduk.getSelectedItem().toString()+"'";
        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                txtnamaproduk.setText(rs.getString("nama"));
                txtharga.setText(rs.getString("harga"));
                txtsatuan.setText(rs.getString("satuan"));
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cbprodukItemStateChanged

    private void tanggalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggalPropertyChange
        // TODO add your handling code here:
        if(tanggal.getDate()!=null) {
           SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
           tglchooser = format.format(tanggal.getDate()); 
        }
    }//GEN-LAST:event_tanggalPropertyChange

    private void txtbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbayarActionPerformed
        // TODO add your handling code here:
        int kembali = (Integer.parseInt(txtbayar.getText())) - (Integer.parseInt(txttotal.getText()));
        txtkembali.setText(""+kembali);
    }//GEN-LAST:event_txtbayarActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        // TODO add your handling code here:
        Connection con = com.siram.koneksi.Koneksi.getKoneksi();
            String NamaFile = "/com/siram/report/Struk_Pembayaran.jasper";
            HashMap hash = new HashMap();
        try {
            hash.put("order_no", txtnotransaksi.getText());
            runReportDefault(NamaFile,hash);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnprintActionPerformed

     public void runReportDefault(String sourcefilename, HashMap hash) {
        Connection con = com.siram.koneksi.Koneksi.getKoneksi();
        try {
            InputStream report;
            report = getClass().getResourceAsStream(sourcefilename);
            JasperPrint jprint = JasperFillManager.fillReport(report,hash, con);
            JasperViewer viewer = new JasperViewer(jprint, false);
            viewer.setFitPageZoomRatio();
            viewer.setVisible(true);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
     
    private void autokode() {
        try {
            Connection con = com.siram.koneksi.Koneksi.getKoneksi();
            String sql= "SELECT MAX(right(order_no,2)) AS no FROM penjualan";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                if(rs.first()==false) {
                    txtnotransaksi.setText("PJ0000001");
                } else {
                    rs.last();
                   int auto_id = rs.getInt(1) + 1;
                   String no = String.valueOf(auto_id);
                   int noLong = no.length();
                   //MENGATUR jumlah 0
                    for(int a=0;a<7-noLong;a++)
                    { 
                        no = "0" + no;
                    }
                   txtnotransaksi.setText("PJ" + no);
                }
            }
        } catch (Exception e) {
            
        }
    }
    
     public void getData() {
        DefaultTableModel tbm = new DefaultTableModel();
        try {
            Connection con = com.siram.koneksi.Koneksi.getKoneksi();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from item_penjualan");
            while(rs.next()) {
                tbm.addRow(new Object[] {
                   rs.getString("no"),rs.getString("kode_barang"),rs.getString("nama_barang"), rs.getString("satuan"), rs.getString("nama_pelanggan"), 
                   rs.getString("qty"), rs.getString("harga"), rs.getString("jumlah")});
               tabel.setModel(tbm);
            }
        } catch(Exception e) {
            
        }
       //AutoSizeTable();
    }
     
     private void tabel_transaksi(){
        DefaultTableModel tbm = new DefaultTableModel();
        tbm.addColumn("NOMOR");
        tbm.addColumn("KODE PRODUK");
        tbm.addColumn("NAMA PRODUK");
        tbm.addColumn("SATUAN");
        tbm.addColumn("NAMA PELANGGAN");
        tbm.addColumn("QTY");
        tbm.addColumn("HARGA");
        tbm.addColumn("TOTAL");
        tabel.setModel(tbm);
    }
     
    public void tampil_tabel() {
        DefaultTableModel tbm = new DefaultTableModel();
        tbm.addColumn("NOMOR");
        tbm.addColumn("KODE PRODUK");
        tbm.addColumn("NAMA PRODUK");
        tbm.addColumn("SATUAN");
        tbm.addColumn("NAMA PELANGGAN");
        tbm.addColumn("QTY");
        tbm.addColumn("HARGA");
        tbm.addColumn("TOTAL");
        try {
            Connection con = com.siram.koneksi.Koneksi.getKoneksi();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from item_penjualan WHERE order_no='"+txtnotransaksi.getText()+"'");
            while(rs.next()) {
                tbm.addRow(new Object[] {
                    rs.getString("no"),rs.getString("kode_barang"),rs.getString("nama_barang"), rs.getString("satuan"), rs.getString("nama_pelanggan"), 
                    rs.getString("qty"), rs.getString("harga"), rs.getString("jumlah")});
               tabel.setModel(tbm);
            }
        } catch(Exception e) {
            
        }
       //AutoSizeTable();
    }

     public void kode_bahan(){
        Connection con = com.siram.koneksi.Koneksi.getKoneksi();
        String sql = "SELECT * FROM produk";
        try {
         Statement st = con.createStatement();
         ResultSet rs= st.executeQuery(sql);
         while(rs.next()){
             cbproduk.addItem(rs.getString("kode"));
         }
        } catch (Exception e) {
        }
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JComboBox<String> cbproduk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabel;
    private com.toedter.calendar.JDateChooser tanggal;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjumlahbeli;
    private javax.swing.JTextField txtkembali;
    private javax.swing.JTextArea txtketerangan;
    private javax.swing.JTextField txtnamapelanggan;
    private javax.swing.JTextField txtnamaproduk;
    private javax.swing.JTextField txtnotransaksi;
    private javax.swing.JTextField txtsatuan;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
