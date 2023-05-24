package tienda;

import javax.swing.table.DefaultTableModel;

public class tiendaderopa extends javax.swing.JFrame {

    public tiendaderopa() {
        initComponents();
        this.tabladetalles.setModel(modelo);
        this.modelo.addColumn("Nacionalidad");
        this.modelo.addColumn("Genero");
        this.modelo.addColumn("Talla");
        this.modelo.addColumn("Prenda");
        this.modelo.addColumn("Cantidad");
        this.modelo.addColumn("Precio");
        this.modelo.addColumn("Total a Pagar");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cboh = new javax.swing.JRadioButton();
        cbom = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbonacionalidad = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbotallas = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtprenda = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        btngenerar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladetalles = new javax.swing.JTable();
        btnlimpiartabla = new javax.swing.JButton();
        btnquitar = new javax.swing.JButton();
        btnnetopagar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtnetopagar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("REALIZAR COMPRA"));

        buttonGroup1.add(cboh);
        cboh.setText("Hombre");

        buttonGroup1.add(cbom);
        cbom.setText("Mujer");

        jLabel5.setText("Genero");

        jLabel6.setText("Nacionalidad");

        cbonacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Peruano", "Extranjero" }));

        jLabel7.setText("Tallas");

        cbotallas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "TALLA S", "TALLA M", "TALLA L" }));

        jLabel8.setText("Prenda");

        jLabel9.setText("Cantidad");

        jLabel10.setText("Precio");

        btngenerar.setText("Generar");
        btngenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerarActionPerformed(evt);
            }
        });

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        jLabel11.setText("Total a pagar");

        txttotal.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btngenerar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnlimpiar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cboh)
                        .addGap(18, 18, 18)
                        .addComponent(cbonacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbom))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cbotallas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addComponent(txtprecio, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtcantidad)
                    .addComponent(txtprenda)
                    .addComponent(txttotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboh)
                    .addComponent(cbonacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbotallas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbom)
                    .addComponent(jLabel9))
                .addGap(4, 4, 4)
                .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btngenerar)
                    .addComponent(btnlimpiar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("TIPO"));

        jLabel2.setText("DE MONEDA");

        jLabel3.setText("DOLARES/");

        jLabel4.setText("SOLES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setText("SOFT_HANS");

        tabladetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabladetalles);

        btnlimpiartabla.setText("Limpiar tabla");
        btnlimpiartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiartablaActionPerformed(evt);
            }
        });

        btnquitar.setText("Quitar compra");
        btnquitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitarActionPerformed(evt);
            }
        });

        btnnetopagar.setText("Neto a pagar");
        btnnetopagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnetopagarActionPerformed(evt);
            }
        });

        jLabel12.setText("Monto a pagar.");

        txtnetopagar.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnlimpiartabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnquitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnetopagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addComponent(txtnetopagar))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnlimpiartabla)
                        .addGap(18, 18, 18)
                        .addComponent(btnquitar)
                        .addGap(18, 18, 18)
                        .addComponent(btnnetopagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnetopagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerarActionPerformed
        // TODO add your handling code here:
        descuento_hombres_extranjeros();
        descuento_mujeres_extranjeros();
        descuento_hombres_peruanos();
        descuento_mujeres_peruanos();
        if (cboh.isSelected()) {
            this.modelo.addRow(new Object[]{this.cbonacionalidad.getSelectedItem(), "Hombre",
                this.cbotallas.getSelectedItem(), this.txtprenda.getText(), this.txtcantidad.getText(),
                this.txtprecio.getText(), this.txttotal.getText()});
        } else if (cbom.isSelected()) {
            this.modelo.addRow(new Object[]{this.cbonacionalidad.getSelectedItem(), "Mujer",
                this.cbotallas.getSelectedItem(), this.txtprenda.getText(), this.txtcantidad.getText(),
                this.txtprecio.getText(), this.txttotal.getText()});
        }
    }//GEN-LAST:event_btngenerarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
        this.cbonacionalidad.setSelectedIndex(0);
        if (cboh.isSelected()) {
        }
        if (cbom.isSelected()) {
        }
        this.cbotallas.setSelectedIndex(0);
        this.txtprenda.setText("");
        this.txtcantidad.setText("");
        this.txtprecio.setText("");
        this.txttotal.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnlimpiartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiartablaActionPerformed
        // TODO add your handling code here:
        int x = this.modelo.getRowCount();
        for (int y = 0; y <= x; y++) {
            this.modelo.removeRow(0);
        }
        this.txtnetopagar.setText("");
    }//GEN-LAST:event_btnlimpiartablaActionPerformed

    private void btnquitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitarActionPerformed
        // TODO add your handling code here:
        modelo.removeRow(this.tabladetalles.getSelectedRow());
    }//GEN-LAST:event_btnquitarActionPerformed

    private void btnnetopagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnetopagarActionPerformed
        // TODO add your handling code here:
        double netoap = 0;
        double sumatoria;
        int totalrow = tabladetalles.getRowCount();
        totalrow -= 1;
        for (int i = 0; i <= totalrow; i++) {
            sumatoria = Double.parseDouble(String.valueOf(tabladetalles.getValueAt(i, 6)));
            netoap = netoap + sumatoria;
        }

        txtnetopagar.setText("S. " + String.valueOf(netoap));
    }//GEN-LAST:event_btnnetopagarActionPerformed

    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * @param args the command line arguments
     */
    public void descuento_hombres_extranjeros() {
        double cantidad_s, precio_s, total_s, desc_s = 0.10;
        double cantidad_m, precio_m, total_m, desc_m = 0.10;
        double cantidad_l, precio_l, total_l, desc_l = 0.10;

        if (cbonacionalidad.getSelectedIndex() == 2) {
            if (this.cboh.isSelected()) {
                if (cbotallas.getSelectedIndex() == 1) {
                    cantidad_s = Double.parseDouble(this.txtcantidad.getText());
                    precio_s = Double.parseDouble(this.txtprecio.getText());
                    total_s = (precio_s * cantidad_s) - ((cantidad_s * precio_s) * desc_s);
                    this.txttotal.setText(String.valueOf(total_s));
                }
            }
        }
        if (cbonacionalidad.getSelectedIndex() == 2) {
            if (this.cboh.isSelected()) {
                if (cbotallas.getSelectedIndex() == 2) {
                    cantidad_m = Double.parseDouble(this.txtcantidad.getText());
                    precio_m = Double.parseDouble(this.txtprecio.getText());
                    total_m = (precio_m * cantidad_m) - ((cantidad_m * precio_m) * desc_m);
                    this.txttotal.setText(String.valueOf(total_m));
                }
            }
        }
        if (cbonacionalidad.getSelectedIndex() == 2) {
            if (this.cboh.isSelected()) {
                if (cbotallas.getSelectedIndex() == 3) {
                    cantidad_l = Double.parseDouble(this.txtcantidad.getText());
                    precio_l = Double.parseDouble(this.txtprecio.getText());
                    total_l = (precio_l * cantidad_l) - ((cantidad_l * precio_l) * desc_l);
                    this.txttotal.setText(String.valueOf(total_l));
                }
            }
        }
    }

    public void descuento_mujeres_extranjeros() {
        double cantidad_s, precio_s, total_s, desc_s = 0.20;
        double cantidad_m, precio_m, total_m, desc_m = 0.20;
        double cantidad_l, precio_l, total_l, desc_l = 0.20;

        if (cbonacionalidad.getSelectedIndex() == 2) {
            if (this.cbom.isSelected()) {
                if (cbotallas.getSelectedIndex() == 1) {
                    cantidad_s = Double.parseDouble(this.txtcantidad.getText());
                    precio_s = Double.parseDouble(this.txtprecio.getText());
                    total_s = (precio_s * cantidad_s) - ((cantidad_s * precio_s) * desc_s);
                    this.txttotal.setText(String.valueOf(total_s));
                }
            }
        }
        if (cbonacionalidad.getSelectedIndex() == 2) {
            if (this.cbom.isSelected()) {
                if (cbotallas.getSelectedIndex() == 2) {
                    cantidad_m = Double.parseDouble(this.txtcantidad.getText());
                    precio_m = Double.parseDouble(this.txtprecio.getText());
                    total_m = (precio_m * cantidad_m) - ((cantidad_m * precio_m) * desc_m);
                    this.txttotal.setText(String.valueOf(total_m));
                }
            }
        }
        if (cbonacionalidad.getSelectedIndex() == 2) {
            if (this.cbom.isSelected()) {
                if (cbotallas.getSelectedIndex() == 3) {
                    cantidad_l = Double.parseDouble(this.txtcantidad.getText());
                    precio_l = Double.parseDouble(this.txtprecio.getText());
                    total_l = (precio_l * cantidad_l) - ((cantidad_l * precio_l) * desc_l);
                    this.txttotal.setText(String.valueOf(total_l));
                }
            }
        }
    }

    public void descuento_hombres_peruanos() {
        double cantidad_s, precio_s, total_s, desc_s = 0.10;
        double cantidad_m, precio_m, total_m, desc_m = 0.10;
        double cantidad_l, precio_l, total_l, desc_l = 0.10;

        if (cbonacionalidad.getSelectedIndex() == 1) {
            if (this.cboh.isSelected()) {
                if (cbotallas.getSelectedIndex() == 1) {
                    cantidad_s = Double.parseDouble(this.txtcantidad.getText());
                    precio_s = Double.parseDouble(this.txtprecio.getText());
                    total_s = (precio_s * cantidad_s) - ((cantidad_s * precio_s) * desc_s);
                    this.txttotal.setText(String.valueOf(total_s));
                }
            }
        }
        if (cbonacionalidad.getSelectedIndex() == 1) {
            if (this.cboh.isSelected()) {
                if (cbotallas.getSelectedIndex() == 2) {
                    cantidad_m = Double.parseDouble(this.txtcantidad.getText());
                    precio_m = Double.parseDouble(this.txtprecio.getText());
                    total_m = (precio_m * cantidad_m) - ((cantidad_m * precio_m) * desc_m);
                    this.txttotal.setText(String.valueOf(total_m));
                }
            }
        }
        if (cbonacionalidad.getSelectedIndex() == 1) {
            if (this.cboh.isSelected()) {
                if (cbotallas.getSelectedIndex() == 3) {
                    cantidad_l = Double.parseDouble(this.txtcantidad.getText());
                    precio_l = Double.parseDouble(this.txtprecio.getText());
                    total_l = (precio_l * cantidad_l) - ((cantidad_l * precio_l) * desc_l);
                    this.txttotal.setText(String.valueOf(total_l));
                }
            }
        }
    }

    public void descuento_mujeres_peruanos() {
        double cantidad_s, precio_s, total_s, desc_s = 0.30;
        double cantidad_m, precio_m, total_m, desc_m = 0.20;
        double cantidad_l, precio_l, total_l, desc_l = 0.10;

        if (cbonacionalidad.getSelectedIndex() == 1) {
            if (this.cbom.isSelected()) {
                if (cbotallas.getSelectedIndex() == 1) {
                    cantidad_s = Double.parseDouble(this.txtcantidad.getText());
                    precio_s = Double.parseDouble(this.txtprecio.getText());
                    total_s = (precio_s * cantidad_s) - ((cantidad_s * precio_s) * desc_s);
                    this.txttotal.setText(String.valueOf(total_s));
                }
            }
        }
        if (cbonacionalidad.getSelectedIndex() == 1) {
            if (this.cbom.isSelected()) {
                if (cbotallas.getSelectedIndex() == 2) {
                    cantidad_m = Double.parseDouble(this.txtcantidad.getText());
                    precio_m = Double.parseDouble(this.txtprecio.getText());
                    total_m = (precio_m * cantidad_m) - ((cantidad_m * precio_m) * desc_m);
                    this.txttotal.setText(String.valueOf(total_m));
                }
            }
        }
        if (cbonacionalidad.getSelectedIndex() == 1) {
            if (this.cbom.isSelected()) {
                if (cbotallas.getSelectedIndex() == 3) {
                    cantidad_l = Double.parseDouble(this.txtcantidad.getText());
                    precio_l = Double.parseDouble(this.txtprecio.getText());
                    total_l = (precio_l * cantidad_l) - ((cantidad_l * precio_l) * desc_l);
                    this.txttotal.setText(String.valueOf(total_l));
                }
            }
        }
    }

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
            java.util.logging.Logger.getLogger(tiendaderopa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tiendaderopa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tiendaderopa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tiendaderopa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tiendaderopa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngenerar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnlimpiartabla;
    private javax.swing.JButton btnnetopagar;
    private javax.swing.JButton btnquitar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cboh;
    private javax.swing.JRadioButton cbom;
    private javax.swing.JComboBox<String> cbonacionalidad;
    private javax.swing.JComboBox<String> cbotallas;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladetalles;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtnetopagar;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtprenda;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
