package insertnotes;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CreateStudentScreen extends javax.swing.JFrame
{
    int xMouse, yMouse;
    
    public CreateStudentScreen()
    {
        initComponents();
        this.setLocationRelativeTo(null);//Funcion para centrar la ventana
        txtDocument.setBackground(new Color(0,0,0,1));
        txtNombre.setBackground(new Color(0,0,0,1));
        txtApellido.setBackground(new Color(0,0,0,1));
        txtCurso.setBackground(new Color(0,0,0,1));
        txtTelefono.setBackground(new Color(0,0,0,1));
        txtCorreo.setBackground(new Color(0,0,0,1));
    }
    
    public void register()
    {
        Conexion c1 =  new Conexion();//Se instancia la clase donde se hizo la conexion
        Connection c2 = c1.Conexion();//Y se crea un objeto que capture el metodo donde se hizo la conexion

        try {

            //Se crea un objeto tipo PreparedStatement para darle una intruccion a nuestra base de datos
            PreparedStatement psd = c2.prepareStatement("insert into alumnos values(?,?,?,?,?,?)"/*La instrucción es la de
                insertar los valores que el
                usuario registro*/);
            
            //Se obtiene la informacion que el usuario ingreso, y se posiciona en la base de datos
            psd.setString(1,txtDocument.getText().trim());
            psd.setString(2,txtNombre.getText().trim());
            psd.setString(3,txtApellido.getText().trim());
            psd.setInt(4,Integer.parseInt(txtCurso.getText()));
            psd.setString(5,txtTelefono.getText().trim());
            psd.setString(6,txtCorreo.getText().trim());
            //Se informa a la base de datos que ejecute las intrucciones que dimos
            psd.executeUpdate();

            //Se llenan los cuadros de texto
            txtDocument.setText("Ingrese su documento");
            txtNombre.setText("Ingrese su nombre");
            txtApellido.setText("Ingrese su apellido");
            txtCurso.setText("Ingrese su curso");
            txtTelefono.setText("Ingrese su telefono");
            txtCorreo.setText("Ingrese su correo electronico");

            JOptionPane.showMessageDialog(null,"Registro exitoso");

        } catch (SQLException ex)
        {
            //Caso de error, se informa y se dejan los valores en nulo
            System.out.println(ex);
            txtDocument.setText(null);
            txtNombre.setText(null);
            txtCurso.setText(null);
            txtTelefono.setText(null);
            txtCorreo.setText(null);

            txtDocument.setText("Ingrese su documento");
            txtNombre.setText("Ingrese su nombre");
            txtApellido.setText("Ingrese su apellido");
            txtCurso.setText("Ingrese su curso");
            txtTelefono.setText("Ingrese su telefono");
            txtCorreo.setText("Ingrese su correo electronico");

            JOptionPane.showMessageDialog(null,"Error de conexion");
        }
    }        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPanel16 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pnlRegister = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtTelefono = new javax.swing.JTextField();
        lbTellphone = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtCurso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtApellido = new javax.swing.JTextField();
        lbLastName = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        lbName = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lbDocument = new javax.swing.JLabel();
        txtDocument = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lateralPanel = new javax.swing.JPanel();
        pnlCreate = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pnlDelete = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        pnlBack = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        pnlMinimizar = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JButton();
        pnlExit = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setOpaque(false);
        jPanel16.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel16MouseDragged(evt);
            }
        });
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel16MousePressed(evt);
            }
        });
        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRegister.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegister.setLayout(new java.awt.BorderLayout());

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(6, 35, 86));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseExited(evt);
            }
        });
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        pnlRegister.add(btnRegistrar, java.awt.BorderLayout.CENTER);

        jPanel1.add(pnlRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 140, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREAR ESTUDIANTES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setText("Ingrese su correo electronico");
        txtCorreo.setBorder(null);
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel3.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CORREO");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jPanel13);

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 2));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 220, 50));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setText("Ingrese su telefono");
        txtTelefono.setBorder(null);
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTelefonoMousePressed(evt);
            }
        });
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jPanel4.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, 20));

        lbTellphone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTellphone.setForeground(new java.awt.Color(255, 255, 255));
        lbTellphone.setText("TELEFONO");
        jPanel4.add(lbTellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 2));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, 50));

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCurso.setForeground(new java.awt.Color(255, 255, 255));
        txtCurso.setText("Ingrese su curso");
        txtCurso.setBorder(null);
        txtCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCursoMousePressed(evt);
            }
        });
        jPanel5.add(txtCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CURSO");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 2));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 220, 50));

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setText("Ingrese su apellido");
        txtApellido.setBorder(null);
        txtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtApellidoMousePressed(evt);
            }
        });
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel6.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, 20));

        lbLastName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbLastName.setForeground(new java.awt.Color(255, 255, 255));
        lbLastName.setText("APELLIDO");
        jPanel6.add(lbLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 2));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 220, 50));

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setText("Ingrese su nombre");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel7.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, 20));

        lbName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setText("NOMBRE");
        jPanel7.add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 2));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 220, 50));

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbDocument.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDocument.setForeground(new java.awt.Color(255, 255, 255));
        lbDocument.setText("DOCUMENTO");
        jPanel8.add(lbDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtDocument.setForeground(new java.awt.Color(255, 255, 255));
        txtDocument.setText("Ingrese su documento");
        txtDocument.setToolTipText("");
        txtDocument.setBorder(null);
        txtDocument.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDocumentMousePressed(evt);
            }
        });
        txtDocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentActionPerformed(evt);
            }
        });
        jPanel8.add(txtDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, 20));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 220, -1));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 220, 2));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 288, 3));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/StudentsEdit#1.jpg"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, 0, 1010, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 600));

        lateralPanel.setBackground(new java.awt.Color(255, 255, 255));
        lateralPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCreate.setBackground(new java.awt.Color(25, 62, 126));
        pnlCreate.setLayout(new java.awt.BorderLayout());

        btnCreate.setBackground(new java.awt.Color(166, 201, 239));
        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("AÑADIR");
        btnCreate.setContentAreaFilled(false);
        btnCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreateMouseExited(evt);
            }
        });
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        pnlCreate.add(btnCreate, java.awt.BorderLayout.CENTER);

        lateralPanel.add(pnlCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 190, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IcinCreateStudent.png"))); // NOI18N
        lateralPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 110, -1));

        pnlDelete.setBackground(new java.awt.Color(255, 255, 255));
        pnlDelete.setLayout(new java.awt.BorderLayout());

        btnDelete.setBackground(new java.awt.Color(153, 153, 153));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(153, 153, 153));
        btnDelete.setText("ELIMINAR");
        btnDelete.setContentAreaFilled(false);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setEnabled(false);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        pnlDelete.add(btnDelete, java.awt.BorderLayout.CENTER);

        lateralPanel.add(pnlDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 190, 60));

        pnlBack.setBackground(new java.awt.Color(255, 255, 255));
        pnlBack.setLayout(new java.awt.BorderLayout());

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setForeground(new java.awt.Color(6, 35, 86));
        btnBack.setText("ATRAS");
        btnBack.setContentAreaFilled(false);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        pnlBack.add(btnBack, java.awt.BorderLayout.CENTER);

        lateralPanel.add(pnlBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 190, 60));

        pnlMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        pnlMinimizar.setLayout(new java.awt.BorderLayout());

        btnMinimizar.setBackground(new java.awt.Color(204, 204, 204));
        btnMinimizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMinimizar.setText("—");
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseExited(evt);
            }
        });
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        pnlMinimizar.add(btnMinimizar, java.awt.BorderLayout.CENTER);

        lateralPanel.add(pnlMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 50, 40));

        pnlExit.setBackground(new java.awt.Color(153, 153, 153));
        pnlExit.setLayout(new java.awt.BorderLayout());

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("X");
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        pnlExit.add(btnExit, java.awt.BorderLayout.CENTER);

        lateralPanel.add(pnlExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 50, 40));

        getContentPane().add(lateralPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 190, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseEntered

        
    }//GEN-LAST:event_btnCreateMouseEntered

    private void btnCreateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseExited

        

    }//GEN-LAST:event_btnCreateMouseExited

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

        

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered

        

    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited

        
        
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered

        pnlBack.setBackground(new Color(25,62,126));
        btnBack.setForeground(Color.white);

    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited

        pnlBack.setBackground(Color.white);
        btnBack.setForeground(new Color(6,35,86));

    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        BaseStudents students = new BaseStudents();
        students.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered

        pnlExit.setBackground(Color.red);
        
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited

        pnlExit.setBackground(Color.gray);
        
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        System.exit(0);
        
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered

        pnlMinimizar.setBackground(new Color(220,185,2));
        btnMinimizar.setForeground(Color.white);
        
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited

        pnlMinimizar.setBackground(Color.white);
        btnMinimizar.setForeground(Color.black);
        
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed

        setExtendedState(ICONIFIED);

    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        register();
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtDocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered

        pnlRegister.setBackground(new Color(220,185,2));
        btnRegistrar.setForeground(Color.white);
        
    }//GEN-LAST:event_btnRegistrarMouseEntered

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        
        pnlRegister.setBackground(Color.white);
        btnRegistrar.setForeground(new Color(6,35,86));
        
    }//GEN-LAST:event_btnRegistrarMouseExited
    
    private void txtDocumentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDocumentMousePressed
        
        if(txtDocument.getText().equals("Ingrese su documento"))
            txtDocument.setText("");
        
        if(txtNombre.getText().isEmpty())
            txtNombre.setText("Ingrese su nombre");
        
        if(txtApellido.getText().isEmpty())
            txtApellido.setText("Ingrese su apellido");
        
        if(txtCurso.getText().isEmpty())
            txtCurso.setText("Ingrese su curso");
        
        if(txtTelefono.getText().isEmpty())
            txtTelefono.setText("Ingrese su telefono");
        
        if(txtCorreo.getText().isEmpty())
            txtCorreo.setText("Ingrese su correo electronico");
        
    }//GEN-LAST:event_txtDocumentMousePressed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        
        if(txtNombre.getText().equals("Ingrese su nombre"))
            txtNombre.setText("");
        
        if(txtDocument.getText().isEmpty())
            txtDocument.setText("Ingrese su documento");
        
        if(txtApellido.getText().isEmpty())
            txtApellido.setText("Ingrese su apellido");
        
        if(txtCurso.getText().isEmpty())
            txtCurso.setText("Ingrese su curso");
        
        if(txtTelefono.getText().isEmpty())
            txtTelefono.setText("Ingrese su telefono");
        
        if(txtCorreo.getText().isEmpty())
            txtCorreo.setText("Ingrese su correo electronico");
        
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoMousePressed
        
        if(txtApellido.getText().equals("Ingrese su apellido"))
            txtApellido.setText("");
        
        if(txtDocument.getText().isEmpty())
            txtDocument.setText("Ingrese su documento");
        
        if(txtNombre.getText().isEmpty())
            txtNombre.setText("Ingrese su nombre");
        
        if(txtCurso.getText().isEmpty())
            txtCurso.setText("Ingrese su curso");
        
        if(txtTelefono.getText().isEmpty())
            txtTelefono.setText("Ingrese su telefono");
        
        if(txtCorreo.getText().isEmpty())
            txtCorreo.setText("Ingrese su correo electronico");
        
    }//GEN-LAST:event_txtApellidoMousePressed

    private void txtCursoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCursoMousePressed
        
        if(txtCurso.getText().equals("Ingrese su curso"))
            txtCurso.setText("");
        
        if(txtDocument.getText().isEmpty())
            txtDocument.setText("Ingrese su documento");
        
        if(txtNombre.getText().isEmpty())
            txtNombre.setText("Ingrese su nombre");
        
        if(txtApellido.getText().isEmpty())
            txtApellido.setText("Ingrese su apellido");
        
        if(txtTelefono.getText().isEmpty())
            txtTelefono.setText("Ingrese su telefono");
        
        if(txtCorreo.getText().isEmpty())
            txtCorreo.setText("Ingrese su correo electronico");
        
    }//GEN-LAST:event_txtCursoMousePressed

    private void txtTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMousePressed
        
        if(txtTelefono.getText().equals("Ingrese su telefono"))
            txtTelefono.setText("");
        
        if(txtDocument.getText().isEmpty())
            txtDocument.setText("Ingrese su documento");
        
        if(txtNombre.getText().isEmpty())
            txtNombre.setText("Ingrese su nombre");
        
        if(txtApellido.getText().isEmpty())
            txtApellido.setText("Ingrese su apellido");
        
        if(txtCurso.getText().isEmpty())
            txtCurso.setText("Ingrese su curso");
        
        if(txtCorreo.getText().isEmpty())
            txtCorreo.setText("Ingrese su correo electronico");
        
    }//GEN-LAST:event_txtTelefonoMousePressed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        
        if(txtCorreo.getText().equals("Ingrese su correo electronico"))
            txtCorreo.setText("");
        
        if(txtDocument.getText().isEmpty())
            txtDocument.setText("Ingrese su documento");
        
        if(txtNombre.getText().isEmpty())
            txtNombre.setText("Ingrese su nombre");
        
        if(txtApellido.getText().isEmpty())
            txtApellido.setText("Ingrese su apellido");
         
        if(txtCurso.getText().isEmpty())
            txtCurso.setText("Ingrese su curso");
        
        if(txtTelefono.getText().isEmpty())
            txtTelefono.setText("Ingrese su telefono");
        
    }//GEN-LAST:event_txtCorreoMousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        
        if(txtDocument.getText().equals("Ingrese su documento"))
            txtDocument.setText("");
        if(txtDocument.getText().isEmpty())
            txtDocument.setText("Ingrese su documento");
        
        if(txtNombre.getText().equals("Ingrese su nombre"))
            txtNombre.setText("");
        if(txtNombre.getText().isEmpty())
            txtNombre.setText("Ingrese su nombre");
        
        if(txtApellido.getText().equals("Ingrese su apellido"))
            txtApellido.setText("");
        if(txtApellido.getText().isEmpty())
            txtApellido.setText("Ingrese su apellido");
        
        if(txtCurso.getText().equals("Ingrese su curso"))
            txtCurso.setText("");
        if(txtCurso.getText().isEmpty())
            txtCurso.setText("Ingrese su curso");
        
        if(txtTelefono.getText().equals("Ingrese su telefono"))
            txtTelefono.setText("");
        if(txtTelefono.getText().isEmpty())
            txtTelefono.setText("Ingrese su telefono");
        
        if(txtCorreo.getText().equals("Ingrese su correo electronico"))
            txtCorreo.setText("");
        if(txtCorreo.getText().isEmpty())
            txtCorreo.setText("Ingrese su correo electronico");
        
    }//GEN-LAST:event_jLabel4MousePressed

    private void jPanel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MousePressed
        
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_jPanel16MousePressed

    private void jPanel16MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseDragged
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse,y - yMouse);
        
    }//GEN-LAST:event_jPanel16MouseDragged
    
    public static void main(String args[])
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateStudentScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateStudentScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateStudentScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateStudentScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateStudentScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel lateralPanel;
    private javax.swing.JLabel lbDocument;
    private javax.swing.JLabel lbLastName;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbTellphone;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlCreate;
    private javax.swing.JPanel pnlDelete;
    private javax.swing.JPanel pnlExit;
    private javax.swing.JPanel pnlMinimizar;
    private javax.swing.JPanel pnlRegister;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtDocument;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
