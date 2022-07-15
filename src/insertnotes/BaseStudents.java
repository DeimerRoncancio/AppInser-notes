package insertnotes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;

public class BaseStudents extends javax.swing.JFrame
{
    Conexion conex = new Conexion();
    Connection conect = conex.Conexion();
    DefaultTableModel table = new DefaultTableModel();
    String document,name,lastName,telphone,gmail;
    int curse,xMouse,yMouse;
    KeyEvent evt;
    
    public BaseStudents()
    {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrar();
    }
    
    public void mostrar()
    {
        try{
            
            PreparedStatement orden = conect.prepareStatement("select*from alumnos");
            ResultSet result = orden.executeQuery();
            Object[] Alumno = new Object[6];
            table = (DefaultTableModel) tbTable.getModel();
            
            while(result.next())
            {
                Alumno [0] = result.getString("documento");
                Alumno [1] = result.getString("nombre");
                Alumno [2] = result.getString("apellido");
                Alumno [3] = result.getInt("curso");
                Alumno [4] = result.getString("telefono");
                Alumno [5] = result.getString("correo");
                
                table.addRow(Alumno);
            }
            
            tbTable.setModel(table);
            
        }catch(Exception e)
        {
            System.err.print("Error: " + e);
        }
    }
    
    public void update()
    {
        int row = tbTable.getSelectedRow();
        document = tbTable.getValueAt(row,0).toString();
        name = tbTable.getValueAt(row,1).toString();
        lastName = tbTable.getValueAt(row,2).toString();
        curse = Integer.parseInt(tbTable.getValueAt(row,3).toString());
        telphone = tbTable.getValueAt(row,4).toString();
        gmail = tbTable.getValueAt(row,5).toString();
        
        try{

            PreparedStatement orden = conect.prepareStatement("update alumnos set nombre = '" + name + "'"
                                                            + ", apellido = '" + lastName + "'"
                                                            + ", curso = '" + curse + "'"
                                                            + ", telefono = '" + telphone + "'"
                                                            + ", correo = '" + gmail + "'"
                                                            + "where documento = '" + document + "'");
            orden.executeUpdate();
            tbTable.updateUI();
            JOptionPane.showMessageDialog(null,"Datos actualizados exitosamente");
            
        }catch(Exception e)
        {
            System.err.println(e);
            JOptionPane.showMessageDialog(null,"Error al modidicar");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        superiorPanel = new javax.swing.JPanel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnlActualizar = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        superiorPanel.setOpaque(false);
        superiorPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                superiorPanelMouseDragged(evt);
            }
        });
        superiorPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                superiorPanelMousePressed(evt);
            }
        });
        getContentPane().add(superiorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        lateralPanel.setBackground(new java.awt.Color(255, 255, 255));
        lateralPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCreate.setBackground(new java.awt.Color(255, 255, 255));
        pnlCreate.setLayout(new java.awt.BorderLayout());

        btnCreate.setBackground(new java.awt.Color(166, 201, 239));
        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(6, 35, 86));
        btnCreate.setText("AÑADIR");
        btnCreate.setContentAreaFilled(false);
        btnCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconStudentEdit#1.png"))); // NOI18N
        lateralPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 110, -1));

        pnlDelete.setBackground(new java.awt.Color(255, 255, 255));
        pnlDelete.setLayout(new java.awt.BorderLayout());

        btnDelete.setBackground(new java.awt.Color(6, 35, 86));
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

        jScrollPane1.setBackground(Color.white);
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tbTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombre", "Apellido", "Curso", "Telefono", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTable.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tbTable.setFillsViewportHeight(true);
        tbTable.setFocusable(false);
        tbTable.setGridColor(new java.awt.Color(255, 255, 255));
        tbTable.setRequestFocusEnabled(false);
        tbTable.setRowHeight(24);
        tbTable.setSelectionBackground(new java.awt.Color(25, 62, 126));
        tbTable.setShowHorizontalLines(false);
        tbTable.setShowVerticalLines(false);
        tbTable.getTableHeader().setReorderingAllowed(false);
        tbTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbTableMousePressed(evt);
            }
        });
        tbTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbTableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbTableKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbTableKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tbTable);
        if (tbTable.getColumnModel().getColumnCount() > 0) {
            tbTable.getColumnModel().getColumn(0).setResizable(false);
            tbTable.getColumnModel().getColumn(1).setResizable(false);
            tbTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbTable.getColumnModel().getColumn(2).setResizable(false);
            tbTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            tbTable.getColumnModel().getColumn(3).setResizable(false);
            tbTable.getColumnModel().getColumn(3).setPreferredWidth(35);
            tbTable.getColumnModel().getColumn(4).setResizable(false);
            tbTable.getColumnModel().getColumn(5).setResizable(false);
            tbTable.getColumnModel().getColumn(5).setPreferredWidth(180);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 590, 250));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ESTUDIANTES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 197, 3));

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

        getContentPane().add(pnlActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 140, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/StudentsEdit#2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 0, 950, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
       
        CreateStudentScreen create = new CreateStudentScreen();
        create.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        HomeScreen home = new HomeScreen();
        home.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnBackActionPerformed
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        int row = tbTable.getSelectedRow();
        String document = tbTable.getValueAt(row,0).toString();
        
        try{
            
            PreparedStatement orden = conect.prepareStatement("delete from alumnos where documento = '" + document + "'");
            orden.executeUpdate();
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"SELECCIONE UN ESTUDIANTE");
            System.err.println("Error: " + e);
        }
        
        table.removeRow(tbTable.getSelectedRow());
        tbTable.updateUI();
        
    }//GEN-LAST:event_btnDeleteActionPerformed

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

    private void btnCreateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseEntered
        
        pnlCreate.setBackground(new Color(25,62,126));
        btnCreate.setForeground(Color.white);
        
    }//GEN-LAST:event_btnCreateMouseEntered

    private void btnCreateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseExited
        
        pnlCreate.setBackground(Color.white);
        btnCreate.setForeground(new Color(6,35,86));
        
    }//GEN-LAST:event_btnCreateMouseExited

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        
        pnlDelete.setBackground(new Color(25,62,126));
        btnDelete.setForeground(Color.white);
        
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        
        pnlDelete.setBackground(Color.white);
        btnDelete.setForeground(new Color(6,35,86));
        
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        
        pnlBack.setBackground(new Color(25,62,126));
        btnBack.setForeground(Color.white);
        
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        
        pnlBack.setBackground(Color.white);
        btnBack.setForeground(new Color(6,35,86));
        
    }//GEN-LAST:event_btnBackMouseExited

    private void superiorPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superiorPanelMouseDragged
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse,y - yMouse);
        
    }//GEN-LAST:event_superiorPanelMouseDragged

    private void superiorPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superiorPanelMousePressed
        
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_superiorPanelMousePressed

    private void tbTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbTableKeyReleased

        

    }//GEN-LAST:event_tbTableKeyReleased

    private void tbTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTableMousePressed

    }//GEN-LAST:event_tbTableMousePressed
    
    private void tbTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbTableKeyPressed
        
        
        
    }//GEN-LAST:event_tbTableKeyPressed

    private void tbTableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbTableKeyTyped
        
        
        
    }//GEN-LAST:event_tbTableKeyTyped

    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered

        pnlActualizar.setBackground(new Color(220,185,2));
        btnActualizar.setForeground(Color.white);

    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited

        pnlActualizar.setBackground(Color.white);
        btnActualizar.setForeground(new Color(6,35,86));

    }//GEN-LAST:event_btnActualizarMouseExited
    
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        update();

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
            java.util.logging.Logger.getLogger(BaseStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaseStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaseStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaseStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaseStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel lateralPanel;
    private javax.swing.JPanel pnlActualizar;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlCreate;
    private javax.swing.JPanel pnlDelete;
    private javax.swing.JPanel pnlExit;
    private javax.swing.JPanel pnlMinimizar;
    private javax.swing.JPanel superiorPanel;
    public javax.swing.JTable tbTable;
    // End of variables declaration//GEN-END:variables
}
