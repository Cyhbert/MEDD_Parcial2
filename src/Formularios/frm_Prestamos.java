package Formularios;

import Entidades.Cliente;
import Entidades.Prestamo;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import static j2html.TagCreator.body;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.header;
import static j2html.TagCreator.html;
import static j2html.TagCreator.img;
import static j2html.TagCreator.link;
import static j2html.TagCreator.title;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frm_Prestamos extends javax.swing.JFrame {

      //Instancias
      Cliente cliente;
      Prestamo prestamo;
      List<Cliente> lClientes;
      List<Cliente> lClientesCSV;
      DefaultTableModel modeloTabla;
      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
      StringBuilder html;

      public frm_Prestamos() {
            initComponents();
            this.showFrame();
            this.lClientes = new ArrayList<>();
            this.lClientesCSV = new ArrayList<>();

      }

      private void generarDatosEstablecidos() {
            this.cliente = new Cliente("ALBERTO GALDAMEZ", "06121343-2", "7444-2442", "Santa Ana");
            this.lClientes.add(cliente);
            for (int i = 0; i < 4; i++) {
                  this.prestamo = new Prestamo("C-00" + (2 * i), "" + (i + 1) * 24, "02/04/202" + i);
                  this.lClientes.get(0).agregarPrestamoLista(prestamo);
            }
            this.cliente = new Cliente("LUIS ANGEL", "06242343-2", "724-9022", "San Salvador");
            this.lClientes.add(cliente);
            for (int i = 0; i < 4; i++) {
                  this.prestamo = new Prestamo("C-01" + (2 * i), "" + (i + 4) * 34, "03/06/202" + i);
                  this.lClientes.get(1).agregarPrestamoLista(prestamo);
            }
            this.cliente = new Cliente("JOSE SANCHEZ", "5555433-2", "8944-6542", "Santa Ana");
            this.lClientes.add(cliente);
            for (int i = 0; i < 4; i++) {
                  this.prestamo = new Prestamo("C-10" + (7 * i), "" + (i + 5) * 64, "02/10/202" + i);
                  this.lClientes.get(2).agregarPrestamoLista(prestamo);
            }
            this.cliente = new Cliente("LUIS MIGUEL", "06853265-9", "7324-9000", "Soyapango");
            this.lClientes.add(cliente);
            for (int i = 0; i < 4; i++) {
                  this.prestamo = new Prestamo("C-01" + (2 * i), "" + (i + 2) * 34, "03/06/202" + i);
                  this.lClientes.get(3).agregarPrestamoLista(prestamo);
            }
            this.cliente = new Cliente("BENTIO BENITEZ", "86821399-0", "7244-1472", "SONSONATE");
            this.lClientes.add(cliente);
            for (int i = 0; i < 4; i++) {
                  this.prestamo = new Prestamo("C-67" + (2 * i), "" + (i + 1) * 24, "02/04/202" + i);
                  this.lClientes.get(4).agregarPrestamoLista(prestamo);
            }
            this.cliente = new Cliente("FLICKER SALAZAR", "06552346-6", "7224-9729", "USULUTAN");
            this.lClientes.add(cliente);
            for (int i = 0; i < 4; i++) {
                  this.prestamo = new Prestamo("C-88" + (6 * i), "" + (i + 3) * 34, "03/06/202" + i);
                  this.lClientes.get(5).agregarPrestamoLista(prestamo);
            }
            this.cliente = new Cliente("JONATHAN ESTRADA", "5211133-2", "8944-0001", "AHUACHAPAN");
            this.lClientes.add(cliente);
            for (int i = 0; i < 4; i++) {
                  this.prestamo = new Prestamo("C-80" + (1 * i), "" + (i + 15) * 64, "02/10/202" + i);
                  this.lClientes.get(6).agregarPrestamoLista(prestamo);
            }
            this.cliente = new Cliente("JOSE BENITO", "06859320-9", "7332-2061", "SANTA ANA");
            this.lClientes.add(cliente);
            for (int i = 0; i < 4; i++) {
                  this.prestamo = new Prestamo("C-09" + (2 * i), "" + (i + 5) * 34, "03/06/202" + i);
                  this.lClientes.get(7).agregarPrestamoLista(prestamo);
            }
            this.cliente = new Cliente("MANUEL PELADO", "52112332-5", "1844-0075", "AHUACHAPAN");
            this.lClientes.add(cliente);
            for (int i = 0; i < 4; i++) {
                  this.prestamo = new Prestamo("C-60" + (1 * i), "" + (i + 12) * 64, "02/10/202" + i);
                  this.lClientes.get(8).agregarPrestamoLista(prestamo);
            }
            this.cliente = new Cliente("MARIA GIRON", "16853320-9", "8975-2065", "LA UNION");
            this.lClientes.add(cliente);
            for (int i = 0; i < 4; i++) {
                  this.prestamo = new Prestamo("C-69" + (3 * i), "" + (i + 8) * 14, "03/06/202" + i);
                  this.lClientes.get(9).agregarPrestamoLista(prestamo);
            }
      }

      private void showFrame() {
            this.setEnabled(true);
            this.setVisible(true);
            this.setTitle("Control de Prestamos");
            this.setResizable(false);
            this.setLocationRelativeTo(null);
      }

      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            btnGroupRegistroPrestamos = new javax.swing.ButtonGroup();
            jtPanelPrestamos = new javax.swing.JTabbedPane();
            jPanel1 = new javax.swing.JPanel();
            jPanel3 = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();
            rbPrestamosPrueba = new javax.swing.JRadioButton();
            rbNuevosPrestamos = new javax.swing.JRadioButton();
            btnGuardarCSV = new javax.swing.JButton();
            jPanel4 = new javax.swing.JPanel();
            jPanel5 = new javax.swing.JPanel();
            jLabel8 = new javax.swing.JLabel();
            txtDireccionCliente = new javax.swing.JTextField();
            btnRegistrarCliente = new javax.swing.JButton();
            jLabel9 = new javax.swing.JLabel();
            txtNombreCliente = new javax.swing.JTextField();
            jLabel10 = new javax.swing.JLabel();
            ffDUI = new javax.swing.JFormattedTextField();
            jLabel11 = new javax.swing.JLabel();
            ffCelular = new javax.swing.JFormattedTextField();
            jLabel12 = new javax.swing.JLabel();
            jPanel6 = new javax.swing.JPanel();
            jScrollPane1 = new javax.swing.JScrollPane();
            jtClientesRegistro = new javax.swing.JTable();
            jLabel13 = new javax.swing.JLabel();
            jLabel14 = new javax.swing.JLabel();
            jLabel15 = new javax.swing.JLabel();
            ffIDPrestamo = new javax.swing.JFormattedTextField();
            jLabel16 = new javax.swing.JLabel();
            spnCantPrestada = new javax.swing.JSpinner();
            jLabel17 = new javax.swing.JLabel();
            spnFechaPrestamo = new javax.swing.JSpinner();
            btnAsignarPrestamoCliente = new javax.swing.JButton();
            jLabel18 = new javax.swing.JLabel();
            jPanel2 = new javax.swing.JPanel();
            jButton1 = new javax.swing.JButton();
            jScrollPane2 = new javax.swing.JScrollPane();
            jtClientesCSV = new javax.swing.JTable();
            jScrollPane3 = new javax.swing.JScrollPane();
            jtPrestamosCSV = new javax.swing.JTable();
            jLabel1 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            txtRutaCSV = new javax.swing.JTextField();
            jLabel4 = new javax.swing.JLabel();
            btnGenerarHTML = new javax.swing.JButton();
            btnGenerarPDF = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jtPanelPrestamos.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N

            jPanel1.setLayout(new java.awt.BorderLayout());

            jPanel3.setPreferredSize(new java.awt.Dimension(883, 85));

            jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
            jLabel2.setText("Creación de Prestamos");

            btnGroupRegistroPrestamos.add(rbPrestamosPrueba);
            rbPrestamosPrueba.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
            rbPrestamosPrueba.setText("Registar prestamos de prueba");
            rbPrestamosPrueba.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        rbPrestamosPruebaActionPerformed(evt);
                  }
            });

            btnGroupRegistroPrestamos.add(rbNuevosPrestamos);
            rbNuevosPrestamos.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
            rbNuevosPrestamos.setText("Registar nuevos prestamos");
            rbNuevosPrestamos.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        rbNuevosPrestamosActionPerformed(evt);
                  }
            });

            btnGuardarCSV.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
            btnGuardarCSV.setText("Guardar CSV");
            btnGuardarCSV.setEnabled(false);
            btnGuardarCSV.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnGuardarCSVActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                  jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(rbPrestamosPrueba)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbNuevosPrestamos)
                                    .addGap(0, 418, Short.MAX_VALUE))
                              .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnGuardarCSV)))
                        .addContainerGap())
            );
            jPanel3Layout.setVerticalGroup(
                  jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel2)
                              .addComponent(btnGuardarCSV))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rbPrestamosPrueba)
                              .addComponent(rbNuevosPrestamos))
                        .addContainerGap(12, Short.MAX_VALUE))
            );

            jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

            jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
            jLabel8.setText("Registrar Cliente");

            txtDireccionCliente.setEditable(false);
            txtDireccionCliente.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

            btnRegistrarCliente.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
            btnRegistrarCliente.setText("Aceptar");
            btnRegistrarCliente.setEnabled(false);
            btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnRegistrarClienteActionPerformed(evt);
                  }
            });

            jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
            jLabel9.setText("Nombre");

            txtNombreCliente.setEditable(false);
            txtNombreCliente.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

            jLabel10.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
            jLabel10.setText("ID");

            ffDUI.setEditable(false);
            try {
                  ffDUI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
            } catch (java.text.ParseException ex) {
                  ex.printStackTrace();
            }
            ffDUI.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

            jLabel11.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
            jLabel11.setText("Núm. Celular");

            ffCelular.setEditable(false);
            try {
                  ffCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
            } catch (java.text.ParseException ex) {
                  ex.printStackTrace();
            }
            ffCelular.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

            jLabel12.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
            jLabel12.setText("Dirección");

            javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
            jPanel5.setLayout(jPanel5Layout);
            jPanel5Layout.setHorizontalGroup(
                  jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel8)
                              .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ffDUI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ffCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(btnRegistrarCliente)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel5Layout.setVerticalGroup(
                  jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel9)
                              .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel10)
                              .addComponent(ffDUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRegistrarCliente))
                              .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(ffCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jtClientesRegistro.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "Nombre", "ID", "Núm. Celular", "Dirección"
                  }
            ) {
                  boolean[] canEdit = new boolean [] {
                        false, false, false, false
                  };

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            jtClientesRegistro.setEnabled(false);
            jtClientesRegistro.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            jtClientesRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jtClientesRegistroMouseClicked(evt);
                  }
            });
            jScrollPane1.setViewportView(jtClientesRegistro);
            if (jtClientesRegistro.getColumnModel().getColumnCount() > 0) {
                  jtClientesRegistro.getColumnModel().getColumn(0).setResizable(false);
                  jtClientesRegistro.getColumnModel().getColumn(1).setResizable(false);
                  jtClientesRegistro.getColumnModel().getColumn(2).setResizable(false);
                  jtClientesRegistro.getColumnModel().getColumn(3).setResizable(false);
            }

            jLabel13.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
            jLabel13.setText("Datos del prestamo");

            jLabel14.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
            jLabel14.setText("Asignar Prestamo a Cliente");

            jLabel15.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
            jLabel15.setText("ID Prestamo");

            ffIDPrestamo.setEditable(false);
            try {
                  ffIDPrestamo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("C-###")));
            } catch (java.text.ParseException ex) {
                  ex.printStackTrace();
            }
            ffIDPrestamo.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

            jLabel16.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
            jLabel16.setText("Cantidad Prestada $");

            spnCantPrestada.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
            spnCantPrestada.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, 1000.0d, 1.0d));
            spnCantPrestada.setEnabled(false);

            jLabel17.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
            jLabel17.setText("Fecha");

            spnFechaPrestamo.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
            spnFechaPrestamo.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(1588353544610L), null, java.util.Calendar.MONTH));
            spnFechaPrestamo.setEnabled(false);

            btnAsignarPrestamoCliente.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
            btnAsignarPrestamoCliente.setText("Asignar");
            btnAsignarPrestamoCliente.setEnabled(false);
            btnAsignarPrestamoCliente.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnAsignarPrestamoClienteActionPerformed(evt);
                  }
            });

            jLabel18.setFont(new java.awt.Font("Liberation Sans", 3, 12)); // NOI18N
            jLabel18.setText("*Seleccione un cliente al cual asignara el prestamo");

            javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
            jPanel6.setLayout(jPanel6Layout);
            jPanel6Layout.setHorizontalGroup(
                  jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jLabel18)
                                          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))
                              .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(180, 180, 180)
                                    .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(jLabel13))
                              .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ffIDPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spnCantPrestada, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spnFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addComponent(btnAsignarPrestamoCliente))
                        .addContainerGap())
            );
            jPanel6Layout.setVerticalGroup(
                  jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel13)
                              .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(jLabel15)
                                          .addComponent(ffIDPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(jLabel16)
                                          .addComponent(spnCantPrestada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(jLabel17)
                                          .addComponent(spnFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnAsignarPrestamoCliente)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)
                        .addContainerGap(93, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                  jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
            );
            jPanel4Layout.setVerticalGroup(
                  jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jPanel1.add(jPanel4, java.awt.BorderLayout.LINE_START);

            jtPanelPrestamos.addTab("Prestamos", jPanel1);

            jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
            jButton1.setText("Cargar Archivo");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                  }
            });

            jtClientesCSV.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "Nombre", "ID", "Núm. Celular", "Dirección"
                  }
            ) {
                  boolean[] canEdit = new boolean [] {
                        false, false, false, false
                  };

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            jtClientesCSV.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            jtClientesCSV.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jtClientesCSVMouseClicked(evt);
                  }
            });
            jScrollPane2.setViewportView(jtClientesCSV);
            if (jtClientesCSV.getColumnModel().getColumnCount() > 0) {
                  jtClientesCSV.getColumnModel().getColumn(0).setResizable(false);
                  jtClientesCSV.getColumnModel().getColumn(1).setResizable(false);
                  jtClientesCSV.getColumnModel().getColumn(2).setResizable(false);
                  jtClientesCSV.getColumnModel().getColumn(3).setResizable(false);
                  jtClientesCSV.getColumnModel().getColumn(3).setHeaderValue("Dirección");
            }

            jtPrestamosCSV.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "ID Prestamo", "Cant. Prestada", "Fecha"
                  }
            ) {
                  boolean[] canEdit = new boolean [] {
                        false, false, false
                  };

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            jScrollPane3.setViewportView(jtPrestamosCSV);
            if (jtPrestamosCSV.getColumnModel().getColumnCount() > 0) {
                  jtPrestamosCSV.getColumnModel().getColumn(0).setResizable(false);
                  jtPrestamosCSV.getColumnModel().getColumn(1).setResizable(false);
                  jtPrestamosCSV.getColumnModel().getColumn(2).setResizable(false);
            }

            jLabel1.setFont(new java.awt.Font("Liberation Sans", 3, 20)); // NOI18N
            jLabel1.setText("Registro de Prestamos");

            jLabel3.setFont(new java.awt.Font("Liberation Sans", 3, 20)); // NOI18N
            jLabel3.setText("Registro de Clientes");

            txtRutaCSV.setEditable(false);
            txtRutaCSV.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

            jLabel4.setFont(new java.awt.Font("Liberation Sans", 3, 14)); // NOI18N
            jLabel4.setText("Ruta De Archivo: ");

            btnGenerarHTML.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
            btnGenerarHTML.setText("Generar HTML");
            btnGenerarHTML.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnGenerarHTMLActionPerformed(evt);
                  }
            });

            btnGenerarPDF.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
            btnGenerarPDF.setText("Generar PDF");
            btnGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnGenerarPDFActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jScrollPane2)
                  .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 887, Short.MAX_VALUE)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel4)
                                                .addGap(3, 3, 3)
                                                .addComponent(txtRutaCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(btnGenerarPDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(btnGenerarHTML, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(56, 56, 56))
                              .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            );
            jPanel2Layout.setVerticalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtRutaCSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4))
                                          .addComponent(jButton1)))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(btnGenerarHTML)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel3))
                              .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnGenerarPDF)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
            );

            jtPanelPrestamos.addTab("CSV", jPanel2);

            getContentPane().add(jtPanelPrestamos, java.awt.BorderLayout.CENTER);

            pack();
      }// </editor-fold>//GEN-END:initComponents

    private void rbNuevosPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNuevosPrestamosActionPerformed
          if (this.rbNuevosPrestamos.isSelected()) {
                this.ffCelular.setEditable(true);
                this.ffDUI.setEditable(true);
                this.txtNombreCliente.setEditable(true);
                this.btnGuardarCSV.setEnabled(false);
                this.txtDireccionCliente.setEditable(true);
                this.btnRegistrarCliente.setEnabled(true);
          }
    }//GEN-LAST:event_rbNuevosPrestamosActionPerformed

    private void rbPrestamosPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPrestamosPruebaActionPerformed
          if (this.rbPrestamosPrueba.isSelected()) {
                this.ffCelular.setEditable(false);
                this.ffDUI.setEditable(false);
                this.txtNombreCliente.setEditable(false);
                this.btnGuardarCSV.setEnabled(true);
                this.txtDireccionCliente.setEditable(false);
                this.btnRegistrarCliente.setEnabled(false);
          }
          this.activarSeccionPrestamo(false);
    }//GEN-LAST:event_rbPrestamosPruebaActionPerformed

    private void btnAsignarPrestamoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarPrestamoClienteActionPerformed
          this.asignarPrestamoClienteLista();
          this.btnGuardarCSV.setEnabled(true);
    }//GEN-LAST:event_btnAsignarPrestamoClienteActionPerformed

      private void asignarPrestamoClienteLista() {
            String fechaFormateada = this.formatter.format(this.spnFechaPrestamo.getValue());
            this.prestamo = new Prestamo(this.ffIDPrestamo.getText(), this.spnCantPrestada.getValue().toString(), fechaFormateada);
            this.lClientes.get(this.jtClientesRegistro.getSelectedRow()).agregarPrestamoLista(prestamo);
      }
    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
          this.activarSeccionPrestamo(true);
          this.registrarCliente();
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void jtClientesRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClientesRegistroMouseClicked
          this.btnAsignarPrestamoCliente.setEnabled(true);
    }//GEN-LAST:event_jtClientesRegistroMouseClicked

    private void btnGuardarCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCSVActionPerformed
          if (this.rbPrestamosPrueba.isSelected()) {
                this.generarDatosEstablecidos();
          } else {

          }
          this.exportarCSV();
    }//GEN-LAST:event_btnGuardarCSVActionPerformed

      private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            this.limpiarArraysCSV();
            this.modeloTabla = (DefaultTableModel) this.jtPrestamosCSV.getModel();
            this.modeloTabla.getDataVector().removeAllElements();
            this.modeloTabla.fireTableDataChanged();
            try {
                  this.importarCSV();
            } catch (IOException ex) {
                  Logger.getLogger(frm_Prestamos.class.getName()).log(Level.SEVERE, null, ex);
            }
      }//GEN-LAST:event_jButton1ActionPerformed

      private void jtClientesCSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClientesCSVMouseClicked
            this.modeloTabla = (DefaultTableModel) this.jtPrestamosCSV.getModel();
            this.modeloTabla.getDataVector().removeAllElements();
            for (int i = 0; i < this.lClientesCSV.get(this.jtClientesCSV.getSelectedRow()).getlPrestamos().size(); i++) {
                  String arrowTabla[] = {this.lClientesCSV.get(this.jtClientesCSV.getSelectedRow()).getlPrestamos().get(i).getIdPrestamo(),
                        this.lClientesCSV.get(this.jtClientesCSV.getSelectedRow()).getlPrestamos().get(i).getCantPrestada(),
                        this.lClientesCSV.get(this.jtClientesCSV.getSelectedRow()).getlPrestamos().get(i).getFechaPrestamo(),};
                  modeloTabla.addRow(arrowTabla);
            }
      }//GEN-LAST:event_jtClientesCSVMouseClicked

      private void btnGenerarHTMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarHTMLActionPerformed
            this.generarHTML();
      }//GEN-LAST:event_btnGenerarHTMLActionPerformed

      private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFActionPerformed
            this.generarPDF();
      }//GEN-LAST:event_btnGenerarPDFActionPerformed

      private void generarPDF() {
            JFileChooser fileChooser = new JFileChooser();
            int seleccion = fileChooser.showOpenDialog(this);

            if (seleccion == JFileChooser.APPROVE_OPTION) {
                  File rutaArchivo = fileChooser.getSelectedFile();
                  String rutaFichero = rutaArchivo.getAbsolutePath();
                  try {
                        FileOutputStream archivoPDF = new FileOutputStream(rutaArchivo);
                        Document docPDF = new Document();
                        PdfWriter.getInstance(docPDF, archivoPDF);
                        docPDF.open();
                        docPDF.addTitle("Prestamos de Clientes");
                        docPDF.addAuthor("Galdámez");
                        docPDF.add(new Paragraph("[CLIENTES]: "));
                        for (int i = 0; i < this.lClientesCSV.size(); i++) {
                              docPDF.add(new Paragraph("\nNombre: " + this.lClientesCSV.get(i).getNombre()
                                      + "\n ID: " + this.lClientesCSV.get(i).getId()
                                      + "\n Núm Celular: " + this.lClientesCSV.get(i).getNumeroCelular()
                                      + "\n Dirección: " + this.lClientesCSV.get(i).getDireccion()));
                              docPDF.add(new Paragraph("[----Prestamos Realizados----] "));
                              for (int j = 0; j < this.lClientesCSV.get(i).getlPrestamos().size(); j++) {
                                    docPDF.add(new Paragraph("[---------------------------------------------------------------------------------------------------------------------------------]" 
                                            + "\nID de prestamo: " + this.lClientesCSV.get(i).getlPrestamos().get(j).getIdPrestamo()
                                    + "          Cant. Prestada: " + this.lClientesCSV.get(i).getlPrestamos().get(j).getCantPrestada()
                                    + "          Fecha: " + this.lClientesCSV.get(i).getlPrestamos().get(j).getFechaPrestamo()));
                              }

                        }
                        docPDF.close();
                        JOptionPane.showMessageDialog(null, "Creado correctamente");
                  } catch (Exception e) {
                  }
            }
      }

      private void limpiarArraysCSV() {
            this.lClientesCSV.removeAll(lClientesCSV);
      }

      private void importarCSV() throws IOException {
            JFileChooser fileChooser = new JFileChooser();
            int seleccion = fileChooser.showOpenDialog(this);

            if (seleccion == JFileChooser.APPROVE_OPTION) {
                  File rutaArchivo = fileChooser.getSelectedFile();
                  String rutaFichero = rutaArchivo.getAbsolutePath();

                  String salidaArchivo = rutaFichero;
                  boolean existe = new File(rutaFichero).exists();
                  this.txtRutaCSV.setText(rutaFichero);
                  int numCliente = -1;
                  try {
                        CsvReader leerClientes = new CsvReader(rutaFichero);
                        leerClientes.readHeaders();
                        while (leerClientes.readRecord()) {
                              String nombre = leerClientes.get(0);
                              if (nombre.equals("<Cliente>")) {
                                    System.out.println("Viene un cliente");
                                    System.out.println("Nombre: " + leerClientes.get(1) + " ID: " + leerClientes.get(2) + " Número: " + leerClientes.get(3));
                                    this.cliente = new Cliente(leerClientes.get(1), leerClientes.get(2), leerClientes.get(3), leerClientes.get(4));
                                    this.lClientesCSV.add(cliente);
                                    numCliente++;
                              } else {
                                    System.out.println("Viene un prestamo");
                                    System.out.println("ID " + leerClientes.get(1) + " Monto: " + leerClientes.get(2) + " Fecha: " + leerClientes.get(3));
                                    this.prestamo = new Prestamo(leerClientes.get(1), leerClientes.get(2), leerClientes.get(3));
                                    this.lClientesCSV.get(numCliente).agregarPrestamoLista(prestamo);

                              }

                        }
                        leerClientes.close();
                  } catch (FileNotFoundException ex) {
                        Logger.getLogger(frm_Prestamos.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  this.actualizarTablaClientesCSV();
            }
      }

      private void exportarCSV() {
            JFileChooser fileChooser = new JFileChooser();
            int seleccion = fileChooser.showOpenDialog(this);

            if (seleccion == JFileChooser.APPROVE_OPTION) {
                  File rutaArchivo = fileChooser.getSelectedFile();
                  String rutaFichero = rutaArchivo.getAbsolutePath();

                  String salidaArchivo = rutaFichero;
                  boolean existe = new File(salidaArchivo).exists();

                  if (existe) {
                        File archivoUsuarios = new File(salidaArchivo);
                        archivoUsuarios.delete();
                  }

                  try {
                        // Crea el archivo
                        CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true), ',');

                        // Datos para identificar las columnas
                        salidaCSV.write("<Tipo de dato>");
                        salidaCSV.write("Nombre");
                        salidaCSV.write("ID");
                        salidaCSV.write("Núm. Celular");
                        salidaCSV.write("Dirección.");

                        salidaCSV.endRecord(); // Deja de escribir en el archivo
                        for (int i = 0; i < this.lClientes.size(); i++) {
                              salidaCSV.write("<Cliente>");
                              salidaCSV.write(this.lClientes.get(i).getNombre());
                              salidaCSV.write(this.lClientes.get(i).getId());
                              salidaCSV.write(this.lClientes.get(i).getNumeroCelular());
                              salidaCSV.write(this.lClientes.get(i).getDireccion());
                              salidaCSV.endRecord();
                              for (int j = 0; j < this.lClientes.get(i).getlPrestamos().size(); j++) {
                                    salidaCSV.write("<Prestamo>");
                                    salidaCSV.write(this.lClientes.get(i).getlPrestamos().get(j).getIdPrestamo());
                                    salidaCSV.write("$ " + this.lClientes.get(i).getlPrestamos().get(j).getCantPrestada());
                                    salidaCSV.write(this.lClientes.get(i).getlPrestamos().get(j).getFechaPrestamo());
                                    salidaCSV.endRecord();
                              }

                        }
                        salidaCSV.endRecord();
                        salidaCSV.close(); // Cierra el archivo

                  } catch (IOException e) {
                        e.printStackTrace();
                  }
            }
      }

      private void registrarCliente() {
            this.cliente = new Cliente(this.txtNombreCliente.getText().toUpperCase().trim(), this.ffDUI.getText(), this.ffCelular.getText(), this.txtDireccionCliente.getText());
            this.lClientes.add(cliente);
            this.modeloTabla = (DefaultTableModel) this.jtClientesRegistro.getModel();
            this.actualizarTabla(modeloTabla);
      }

      private void actualizarTabla(DefaultTableModel tableModel) {
            tableModel.getDataVector().removeAllElements();
            tableModel.fireTableDataChanged();
            for (int i = 0; i < this.lClientes.size(); i++) {
                  String arrowtabla[] = {this.lClientes.get(i).getNombre(), this.lClientes.get(i).getId(),
                        this.lClientes.get(i).getNumeroCelular(), this.lClientes.get(i).getDireccion()};
                  tableModel.addRow(arrowtabla);

            }
      }

      private void generarHTML() {
            JFileChooser fileChooser = new JFileChooser();
            int seleccion = fileChooser.showOpenDialog(this);

            if (seleccion == JFileChooser.APPROVE_OPTION) {
                  File rutaArchivo = fileChooser.getSelectedFile();
                  String rutaFichero = rutaArchivo.getAbsolutePath();

                  FileWriter filewriter = null;
                  PrintWriter printw = null;
                  try {
                        filewriter = new FileWriter(rutaFichero + ".html");//declarar el archivo
                        printw = new PrintWriter(filewriter);//declarar un impresor

                        printw.println("<html>");
                        printw.println("<head><title>Prestamos Bancarios</title></head>");
                        //si queremos escribir una comilla " en el
                        //archivo uzamos la diagonal invertida \"
                        printw.println("<body bgcolor=\"#99CC99\">");
                        for (int i = 0; i < this.lClientesCSV.size(); i++) {
                              System.out.println(this.lClientesCSV.size());
                              printw.println("<ul>");
                              printw.println("<li>" + "Nombre: " + this.lClientesCSV.get(i).getNombre() + "</li>");
                              printw.println("<li>" + "ID: " + this.lClientesCSV.get(i).getId() + "</li>");
                              printw.println("<li>" + "Núm. celular: " + this.lClientesCSV.get(i).getNumeroCelular() + "</li>");
                              printw.println("</ul>");
                              for (int j = 0; j < this.lClientesCSV.get(i).getlPrestamos().size(); j++) {
                                    printw.println("\n ID Prestamo: " + this.lClientesCSV.get(i).getlPrestamos().get(j).getIdPrestamo());
                                    printw.println("<br> ");
                                    printw.println("\nCantidad.: " + this.lClientesCSV.get(i).getlPrestamos().get(j).getCantPrestada());
                                    printw.println("<br>");
                                    printw.println("\n Fecha: " + this.lClientesCSV.get(i).getlPrestamos().get(j).getFechaPrestamo() + "\n");
                                    printw.println("<br>");
                                    printw.println("<br>");

                              }

                        }
                        printw.println("</body>");
                        printw.println("</html>");
                        printw.close();//cerramos el archivo
                        System.out.println("Generado exitosamente");
                  } catch (IOException ex) {

                  }
            }
      }

      private void actualizarTablaClientesCSV() {
            this.modeloTabla = (DefaultTableModel) this.jtClientesCSV.getModel();
            this.modeloTabla.getDataVector().removeAllElements();
            this.modeloTabla.fireTableDataChanged();
            for (int i = 0; i < this.lClientesCSV.size(); i++) {
                  String arrowTabla[] = {this.lClientesCSV.get(i).getNombre(), this.lClientesCSV.get(i).getId(), this.lClientesCSV.get(i).getNumeroCelular(), this.lClientesCSV.get(i).getDireccion()};
                  modeloTabla.addRow(arrowTabla);
            }
      }

      private void activarSeccionPrestamo(boolean bool) {
            this.ffIDPrestamo.setEditable(bool);
            this.spnCantPrestada.setEnabled(bool);
            this.spnFechaPrestamo.setEnabled(bool);
            this.jtClientesRegistro.setEnabled(bool);

      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton btnAsignarPrestamoCliente;
      private javax.swing.JButton btnGenerarHTML;
      private javax.swing.JButton btnGenerarPDF;
      private javax.swing.ButtonGroup btnGroupRegistroPrestamos;
      private javax.swing.JButton btnGuardarCSV;
      private javax.swing.JButton btnRegistrarCliente;
      private javax.swing.JFormattedTextField ffCelular;
      private javax.swing.JFormattedTextField ffDUI;
      private javax.swing.JFormattedTextField ffIDPrestamo;
      private javax.swing.JButton jButton1;
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
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel8;
      private javax.swing.JLabel jLabel9;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JPanel jPanel3;
      private javax.swing.JPanel jPanel4;
      private javax.swing.JPanel jPanel5;
      private javax.swing.JPanel jPanel6;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JScrollPane jScrollPane2;
      private javax.swing.JScrollPane jScrollPane3;
      private javax.swing.JTable jtClientesCSV;
      private javax.swing.JTable jtClientesRegistro;
      private javax.swing.JTabbedPane jtPanelPrestamos;
      private javax.swing.JTable jtPrestamosCSV;
      private javax.swing.JRadioButton rbNuevosPrestamos;
      private javax.swing.JRadioButton rbPrestamosPrueba;
      private javax.swing.JSpinner spnCantPrestada;
      private javax.swing.JSpinner spnFechaPrestamo;
      private javax.swing.JTextField txtDireccionCliente;
      private javax.swing.JTextField txtNombreCliente;
      private javax.swing.JTextField txtRutaCSV;
      // End of variables declaration//GEN-END:variables
}
