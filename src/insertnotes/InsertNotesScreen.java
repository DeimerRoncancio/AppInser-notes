package insertnotes;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertNotesScreen extends javax.swing.JFrame
{
    BaseNotes base = new BaseNotes();
    Conexion conex = new Conexion();
    Connection conect = conex.Conexion();
    int xMouse,yMouse;
    
    public InsertNotesScreen()
    {
        initComponents();
        this.setLocationRelativeTo(null);
        txtDocumento.setBackground(new Color(0,0,0,1));
        txtNota.setBackground(new Color(0,0,0,1));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel16 = new javax.swing.JPanel();
        cbMateriasEleccion = new javax.swing.JComboBox<>();
        cbPeriodosEleccion = new javax.swing.JComboBox<>();
        txtNota = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lateralPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnlMinimizar = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JButton();
        pnlExit = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        pnlInsertNotes = new javax.swing.JPanel();
        btnInsertNotes = new javax.swing.JButton();
        pnlDelete = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        pnlBack = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        pnlInsertar = new javax.swing.JPanel();
        btnInsertar = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

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

        cbMateriasEleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matematicas", "Sociales", "Español", "Ingles" }));
        cbMateriasEleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMateriasEleccionActionPerformed(evt);
            }
        });
        getContentPane().add(cbMateriasEleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 120, 30));

        cbPeriodosEleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022-1", "2022-2", "2022-3", "2022-4" }));
        cbPeriodosEleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPeriodosEleccionActionPerformed(evt);
            }
        });
        getContentPane().add(cbPeriodosEleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 120, 30));

        txtNota.setForeground(new java.awt.Color(255, 255, 255));
        txtNota.setText("Ingrese su nota");
        txtNota.setBorder(null);
        txtNota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNotaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNotaMousePressed(evt);
            }
        });
        txtNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNotaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 90, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOTA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DOCUMENTO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 175, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MATERIA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        txtDocumento.setForeground(new java.awt.Color(255, 255, 255));
        txtDocumento.setText("Ingrese su documento");
        txtDocumento.setBorder(null);
        txtDocumento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDocumentoMousePressed(evt);
            }
        });
        getContentPane().add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 220, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PERIODO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        lateralPanel.setBackground(new java.awt.Color(255, 255, 255));
        lateralPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Calificaciones.png"))); // NOI18N
        lateralPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 110, -1));

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

        pnlInsertNotes.setBackground(new java.awt.Color(25, 62, 126));
        pnlInsertNotes.setLayout(new java.awt.BorderLayout());

        btnInsertNotes.setBackground(new java.awt.Color(25, 62, 126));
        btnInsertNotes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInsertNotes.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertNotes.setText("INSERTAR NOTAS");
        btnInsertNotes.setContentAreaFilled(false);
        btnInsertNotes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInsertNotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInsertNotesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInsertNotesMouseExited(evt);
            }
        });
        btnInsertNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertNotesActionPerformed(evt);
            }
        });
        pnlInsertNotes.add(btnInsertNotes, java.awt.BorderLayout.CENTER);

        lateralPanel.add(pnlInsertNotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 190, 60));

        pnlDelete.setBackground(new java.awt.Color(255, 255, 255));
        pnlDelete.setLayout(new java.awt.BorderLayout());

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(153, 153, 153));
        btnDelete.setText("ELIMINAR");
        btnDelete.setContentAreaFilled(false);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setForeground(new java.awt.Color(25, 62, 126));
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

        getContentPane().add(lateralPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 190, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 365, 3));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("INSERTAR CALIFICACIONES");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 100, 2));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 220, 2));

        pnlInsertar.setLayout(new java.awt.BorderLayout());

        btnInsertar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(6, 35, 86));
        btnInsertar.setText("INSERTAR");
        btnInsertar.setContentAreaFilled(false);
        btnInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInsertarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInsertarMouseExited(evt);
            }
        });
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        pnlInsertar.add(btnInsertar, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 140, 30));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/awdadadagh.jpg"))); // NOI18N
        lbFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbFondoMousePressed(evt);
            }
        });
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-510, 0, 1280, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        BaseNotes h1 = new BaseNotes();
        h1.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbMateriasEleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMateriasEleccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMateriasEleccionActionPerformed

    private void cbPeriodosEleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPeriodosEleccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPeriodosEleccionActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        
        int periodo = cbPeriodosEleccion.getSelectedIndex();
        int materia = cbMateriasEleccion.getSelectedIndex();
        
        try{
            
            PreparedStatement orden = conect.prepareStatement("insert into notas values (?,?,?,?)");
            
            orden.setString(1,txtDocumento.getText().trim());
            
            switch(periodo)
            {
                case 0:
                    orden.setString(2, "2022-1");
                    break;
                case 1:
                    orden.setString(2, "2022-2");
                    break;
                case 2:
                    orden.setString(2, "2022-3");
                    break;
                case 3:
                    orden.setString(2, "2022-4");
                    break;
            }
            
            switch(materia)
            {
                case 0:
                    orden.setString(3, "26544");
                    break;
                case 1:
                    orden.setString(3, "45216");
                    break;
                case 2:
                    orden.setString(3, "45987");
                    break;
                case 3:
                    orden.setString(3, "78126");
                    break;
            }
            
            orden.setString(4,txtNota.getText());
            
            orden.executeUpdate();
            
            txtNota.setText("Ingrese su nota");
            
            JOptionPane.showMessageDialog(null,"Registro exitoso");
            
        }catch(Exception e)
        {
            System.err.println("Error: " + e);
            JOptionPane.showMessageDialog(null,"El usuario no existe");
        }
        
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void txtNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNotaActionPerformed

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

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered

        pnlExit.setBackground(Color.red);

    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited

        pnlExit.setBackground(Color.gray);

    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        System.exit(0);

    }//GEN-LAST:event_btnExitActionPerformed

    private void btnInsertNotesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertNotesMouseEntered

        

    }//GEN-LAST:event_btnInsertNotesMouseEntered

    private void btnInsertNotesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertNotesMouseExited

        

    }//GEN-LAST:event_btnInsertNotesMouseExited

    private void btnInsertNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertNotesActionPerformed

        

    }//GEN-LAST:event_btnInsertNotesActionPerformed

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
        btnBack.setForeground(new Color(25,62,126));
        
    }//GEN-LAST:event_btnBackMouseExited

    private void btnInsertarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarMouseEntered

        pnlInsertar.setBackground(new Color(220,185,2));
        btnInsertar.setForeground(Color.white);
        
    }//GEN-LAST:event_btnInsertarMouseEntered

    private void btnInsertarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarMouseExited
        
        pnlInsertar.setBackground(Color.white);
        btnInsertar.setForeground(new Color(6,35,86));
        
    }//GEN-LAST:event_btnInsertarMouseExited

    private void txtDocumentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDocumentoMousePressed

        if(txtDocumento.getText().equals("Ingrese su documento"))
            txtDocumento.setText("");

        if(txtNota.getText().isEmpty())
            txtNota.setText("Ingrese su nota");
        
    }//GEN-LAST:event_txtDocumentoMousePressed

    private void txtNotaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNotaMouseEntered

        
        
    }//GEN-LAST:event_txtNotaMouseEntered

    private void txtNotaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNotaMousePressed
        
        if(txtNota.getText().equals("Ingrese su nota"))
            txtNota.setText("");
        
        if(txtDocumento.getText().isEmpty())
            txtDocumento.setText("Ingrese su documento");
        
    }//GEN-LAST:event_txtNotaMousePressed

    private void lbFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFondoMousePressed
        
        if(txtDocumento.getText().equals("Ingrese su documento"))
            txtDocumento.setText("");
        if(txtDocumento.getText().isEmpty())
            txtDocumento.setText("Ingrese su documento");
        
        if(txtNota.getText().equals("Ingrese su nota"))
            txtNota.setText("");
        if(txtNota.getText().isEmpty())
            txtNota.setText("Ingrese su nota");
                
    }//GEN-LAST:event_lbFondoMousePressed

    private void jPanel16MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse,y - yMouse);

    }//GEN-LAST:event_jPanel16MouseDragged

    private void jPanel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_jPanel16MousePressed
    
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
            java.util.logging.Logger.getLogger(InsertNotesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertNotesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertNotesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertNotesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertNotesScreen().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsertNotes;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JComboBox<String> cbMateriasEleccion;
    private javax.swing.JComboBox<String> cbPeriodosEleccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel lateralPanel;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlDelete;
    private javax.swing.JPanel pnlExit;
    private javax.swing.JPanel pnlInsertNotes;
    private javax.swing.JPanel pnlInsertar;
    private javax.swing.JPanel pnlMinimizar;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables
}
