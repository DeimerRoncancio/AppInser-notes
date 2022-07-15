package insertnotes;

import java.awt.event.KeyEvent;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class BaseNotes extends javax.swing.JFrame
{
    Conexion conex = new Conexion();
    Connection conect = conex.Conexion();
    int xMouse,yMouse;
    float notes;
    DefaultTableModel tabla;
    String document,period,nrc;
    
    public BaseNotes()
    {
        initComponents();
        txtBuscar.setBackground(new Color(0,0,0,1));
        //cbMateria.setUI(PropertiesComboBox.createUI(rootPane));
    }
    
    public void search()
    {
        tabla = new DefaultTableModel();
        
        int opcion = cbMateria.getSelectedIndex();
        String materia = "";
        
        switch(opcion)
        {
            case 0:
            materia = "26544";
            break;
            case 1:
            materia = "45216";
            break;
            case 2:
            materia = "45987";
            break;
            case 3:
            materia = "78126";
            break;
        }
        
        try{
            
            PreparedStatement orden = conect.prepareStatement("select*from notas where docEstudiante = ? and codMateriaNotas = ?");
            orden.setString(1,txtBuscar.getText().trim());
            orden.setString(2,materia);
            ResultSet result = orden.executeQuery();
            Object[] notas = new Object[4];
            tabla = (DefaultTableModel) tbTable.getModel();
            boolean valid = false;
            
            tabla.getDataVector().removeAllElements();
            tbTable.updateUI();
            
            while(result.next())
            {
                notas[0] = result.getString("docEstudiante");
                notas[1] = result.getString("codPeriodoNotas");
                notas[2] = result.getString("codMateriaNotas");
                notas[3] = result.getString("nota");
                
                tabla.addRow(notas);
                
                valid = true;
            }
            
            if(valid != true)
            {
                tabla.getDataVector().removeAllElements();
                tbTable.updateUI();
                JOptionPane.showMessageDialog(null,"Registros no encontrados");
                
            }
            
            result.close();
            tbTable.setModel(tabla);
            
        }catch(Exception e)
        {
            System.err.println("Error: " + e);
            JOptionPane.showMessageDialog(null,"El estudiante no esta registrado");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTable = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        pnlBuscar = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        lateralPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
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
        cbMateria = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pnlActualizar = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setOpaque(false);
        jPanel17.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel17MouseDragged(evt);
            }
        });
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel17MousePressed(evt);
            }
        });
        getContentPane().add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        jScrollPane1.setBorder(null);

        tbTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Periodo", "NRC", "Notas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTable.setFillsViewportHeight(true);
        tbTable.setFocusable(false);
        tbTable.setGridColor(new java.awt.Color(255, 255, 255));
        tbTable.setRowHeight(24);
        tbTable.setSelectionBackground(new java.awt.Color(25, 62, 126));
        tbTable.setShowHorizontalLines(false);
        tbTable.setShowVerticalLines(false);
        tbTable.setSurrendersFocusOnKeystroke(true);
        tbTable.getTableHeader().setReorderingAllowed(false);
        tbTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbTableMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbTableMouseReleased(evt);
            }
        });
        tbTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbTableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbTable);
        if (tbTable.getColumnModel().getColumnCount() > 0) {
            tbTable.getColumnModel().getColumn(0).setResizable(false);
            tbTable.getColumnModel().getColumn(1).setResizable(false);
            tbTable.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 520, 230));

        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscar.setText("Ingrese su documento");
        txtBuscar.setBorder(null);
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtBuscarMouseReleased(evt);
            }
        });
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 140, 20));

        pnlBuscar.setBackground(new java.awt.Color(255, 255, 255));
        pnlBuscar.setLayout(new java.awt.BorderLayout());

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(6, 35, 86));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setToolTipText("");
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlBuscar.add(btnBuscar, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 140, 30));

        lateralPanel.setBackground(new java.awt.Color(255, 255, 255));
        lateralPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boleta-de-calificaciones.png"))); // NOI18N
        lateralPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 110, -1));

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

        pnlInsertNotes.setBackground(new java.awt.Color(255, 255, 255));
        pnlInsertNotes.setLayout(new java.awt.BorderLayout());

        btnInsertNotes.setBackground(new java.awt.Color(255, 255, 255));
        btnInsertNotes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInsertNotes.setForeground(new java.awt.Color(6, 35, 86));
        btnInsertNotes.setText("INSERTAR NOTAS");
        btnInsertNotes.setContentAreaFilled(false);
        btnInsertNotes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnDelete.setForeground(new java.awt.Color(6, 35, 86));
        btnDelete.setText("ELIMINAR");
        btnDelete.setContentAreaFilled(false);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        getContentPane().add(lateralPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 190, 600));

        cbMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matematicas", "Sociales", "Español", "Ingles" }));
        cbMateria.setToolTipText("");
        cbMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbMateria.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        cbMateria.setDoubleBuffered(true);
        cbMateria.setOpaque(false);
        cbMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbMateriaMousePressed(evt);
            }
        });
        cbMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMateriaActionPerformed(evt);
            }
        });
        getContentPane().add(cbMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 110, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CALIFICACIONES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 140, 2));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 235, 3));

        pnlActualizar.setBackground(new java.awt.Color(255, 255, 255));
        pnlActualizar.setLayout(new java.awt.BorderLayout());

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(6, 35, 86));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setToolTipText("");
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarMouseExited(evt);
            }
        });
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        pnlActualizar.add(btnActualizar, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 140, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fftrhdt.jpg"))); // NOI18N
        jLabel2.setDoubleBuffered(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-510, 0, 1270, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed

    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed

    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped

    }//GEN-LAST:event_txtBuscarKeyTyped
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        search();
        
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    private void btnInsertNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertNotesActionPerformed
        
        InsertNotesScreen insert = new InsertNotesScreen();
        insert.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnInsertNotesActionPerformed
            
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        int row = tbTable.getSelectedRow();
        document = tbTable.getValueAt(row,0).toString();
        period = tbTable.getValueAt(row,1).toString();
        nrc = tbTable.getValueAt(row,2).toString();
        
        try{
            
            PreparedStatement orden = conect.prepareStatement("delete from notas where "
                                                            + "docEstudiante = '" + document + "'" 
                                                            + "and codPeriodoNotas = '" + period + "'"
                                                            + "and codMateriaNotas = '" + nrc + "'");
            orden.executeUpdate();
            
            //JOptionPane.showMessageDialog(null,"Eliminacion exitosa");
            
        }catch(Exception e)
        {
            System.err.print("Error: " + e);
            JOptionPane.showMessageDialog(null,"Error desconocido.");
        }
        
        tabla.removeRow(tbTable.getSelectedRow());
        tbTable.updateUI();
        
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    private void tbTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTableMousePressed
        
        
        
    }//GEN-LAST:event_tbTableMousePressed

    private void tbTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbTableKeyPressed
        
        
        
    }//GEN-LAST:event_tbTableKeyPressed

    private void tbTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbTableKeyReleased
        
        
        
    }//GEN-LAST:event_tbTableKeyReleased

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

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered

        pnlBack.setBackground(new Color(25,62,126));
        btnBack.setForeground(Color.white);

    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited

        pnlBack.setBackground(Color.white);
        btnBack.setForeground(new Color(6,35,86));

    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        HomeScreen home = new HomeScreen();
        home.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnInsertNotesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertNotesMouseEntered
        
        pnlInsertNotes.setBackground(new Color(25,62,126));
        btnInsertNotes.setForeground(Color.white);
        
    }//GEN-LAST:event_btnInsertNotesMouseEntered

    private void btnInsertNotesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertNotesMouseExited
        
        pnlInsertNotes.setBackground(Color.white);
        btnInsertNotes.setForeground(new Color(6,35,86));
        
    }//GEN-LAST:event_btnInsertNotesMouseExited

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        
        pnlDelete.setBackground(new Color(25,62,126));
        btnDelete.setForeground(Color.white);
        
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        
        pnlDelete.setBackground(Color.white);
        btnDelete.setForeground(new Color(6,35,86));
        
    }//GEN-LAST:event_btnDeleteMouseExited

    private void cbMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMateriaActionPerformed

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        
        pnlBuscar.setBackground(new Color(220,185,2));
        btnBuscar.setForeground(Color.white);
        
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        
        pnlBuscar.setBackground(Color.white);
        btnBuscar.setForeground(new Color(6,35,86));
        
    }//GEN-LAST:event_btnBuscarMouseExited

    private void txtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMousePressed
        
        if(txtBuscar.getText().equals("Ingrese su documento"))
        {
            txtBuscar.setText("");
        }
        
    }//GEN-LAST:event_txtBuscarMousePressed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarKeyReleased
    
    private void txtBuscarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseReleased
        
        
        
    }//GEN-LAST:event_txtBuscarMouseReleased

    private void cbMateriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbMateriaMousePressed
        
        if(txtBuscar.getText().isEmpty())
        {
            txtBuscar.setText("Ingrese su documento");
        }
        
    }//GEN-LAST:event_cbMateriaMousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed

        if(txtBuscar.getText().isEmpty())
        {
            txtBuscar.setText("Ingrese su documento");
        }

    }//GEN-LAST:event_jLabel2MousePressed

    private void jPanel16MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse,y - yMouse);

    }//GEN-LAST:event_jPanel16MouseDragged

    private void jPanel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_jPanel16MousePressed

    private void jPanel17MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse,y - yMouse);

    }//GEN-LAST:event_jPanel17MouseDragged

    private void jPanel17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_jPanel17MousePressed

    private void tbTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTableMouseReleased
        
        
        
    }//GEN-LAST:event_tbTableMouseReleased

    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered

        pnlActualizar.setBackground(new Color(220,185,2));
        btnActualizar.setForeground(Color.white);
    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited

        pnlActualizar.setBackground(Color.white);
        btnActualizar.setForeground(new Color(6,35,86));
    }//GEN-LAST:event_btnActualizarMouseExited

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        int row = tbTable.getSelectedRow();
        document = tbTable.getValueAt(row,0).toString().trim();
        period = tbTable.getValueAt(row,1).toString().trim();
        nrc = tbTable.getValueAt(row,2).toString().trim();
        notes = Float.parseFloat(tbTable.getValueAt(row, 3).toString());
        
        try{
             
            PreparedStatement orden = conect.prepareStatement("update notas set nota = " + notes
                                                            + "where docEstudiante = '" + document + "'"
                                                            + "and codPeriodoNotas = '" + period + "'"
                                                            + "and codMateriaNotas = '" + nrc + "'");
            orden.executeUpdate();
            JOptionPane.showMessageDialog(null,"Notas actualizadas exitosamente");
            tbTable.updateUI();
            
        }catch(Exception e)
        {
            System.err.println("Error: " + e);
            JOptionPane.showMessageDialog(null,"Error al actualizar");
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed
    
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
            java.util.logging.Logger.getLogger(BaseNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaseNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaseNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaseNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaseNotes().setVisible(true);
            }
        });
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsertNotes;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JComboBox<String> cbMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel lateralPanel;
    private javax.swing.JPanel pnlActualizar;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlBuscar;
    private javax.swing.JPanel pnlDelete;
    private javax.swing.JPanel pnlExit;
    private javax.swing.JPanel pnlInsertNotes;
    private javax.swing.JPanel pnlMinimizar;
    private javax.swing.JTable tbTable;
    public javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}