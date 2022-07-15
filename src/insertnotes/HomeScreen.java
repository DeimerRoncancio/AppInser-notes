package insertnotes;

import java.awt.Color;
import javax.swing.JOptionPane;

public class HomeScreen extends javax.swing.JFrame
{
    int xMouse,yMouse;
    
    public HomeScreen()
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        superiortPanel = new javax.swing.JPanel();
        firstPanel = new javax.swing.JPanel();
        pnlNotes = new javax.swing.JPanel();
        btnNotes = new javax.swing.JButton();
        pnlStudent = new javax.swing.JPanel();
        btnStudent = new javax.swing.JButton();
        lbUniminuto = new javax.swing.JLabel();
        lbEstudiantes = new javax.swing.JLabel();
        logoUniminuto = new javax.swing.JLabel();
        pnlMinimizar = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JButton();
        pnlExit = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        fondStudents = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        superiortPanel.setBackground(new java.awt.Color(255, 255, 255));
        superiortPanel.setOpaque(false);
        superiortPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                superiortPanelMouseDragged(evt);
            }
        });
        superiortPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                superiortPanelMousePressed(evt);
            }
        });
        getContentPane().add(superiortPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        firstPanel.setBackground(new java.awt.Color(255, 255, 255));
        firstPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                firstPanelMouseDragged(evt);
            }
        });
        firstPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                firstPanelMousePressed(evt);
            }
        });
        firstPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlNotes.setBackground(new java.awt.Color(6, 35, 86));
        pnlNotes.setForeground(new java.awt.Color(255, 255, 255));
        pnlNotes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlNotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlNotesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlNotesMouseExited(evt);
            }
        });
        pnlNotes.setLayout(new java.awt.BorderLayout());

        btnNotes.setBackground(new java.awt.Color(255, 255, 255));
        btnNotes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNotes.setForeground(new java.awt.Color(255, 255, 255));
        btnNotes.setText("NOTAS");
        btnNotes.setContentAreaFilled(false);
        btnNotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNotesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNotesMouseExited(evt);
            }
        });
        btnNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotesActionPerformed(evt);
            }
        });
        pnlNotes.add(btnNotes, java.awt.BorderLayout.CENTER);

        firstPanel.add(pnlNotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 130, 50));

        pnlStudent.setBackground(new java.awt.Color(6, 35, 86));
        pnlStudent.setForeground(new java.awt.Color(255, 255, 255));
        pnlStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlStudentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlStudentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlStudentMouseExited(evt);
            }
        });
        pnlStudent.setLayout(new java.awt.BorderLayout());

        btnStudent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnStudent.setText("ESTUDIANTES");
        btnStudent.setContentAreaFilled(false);
        btnStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStudentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStudentMouseExited(evt);
            }
        });
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });
        pnlStudent.add(btnStudent, java.awt.BorderLayout.CENTER);

        firstPanel.add(pnlStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 130, 50));

        lbUniminuto.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        lbUniminuto.setForeground(new java.awt.Color(6, 35, 86));
        lbUniminuto.setText("UNIMINUTO");
        firstPanel.add(lbUniminuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 120, 110, 20));

        lbEstudiantes.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        lbEstudiantes.setForeground(new java.awt.Color(6, 35, 86));
        lbEstudiantes.setText("ESTUDIANTES");
        firstPanel.add(lbEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, 20));

        logoUniminuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Logo Uniminuto.png"))); // NOI18N
        firstPanel.add(logoUniminuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 240, 110));

        pnlMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        pnlMinimizar.setLayout(new java.awt.BorderLayout());

        btnMinimizar.setBackground(new java.awt.Color(220, 185, 2));
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

        firstPanel.add(pnlMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 50, 40));

        pnlExit.setBackground(new java.awt.Color(153, 153, 153));
        pnlExit.setForeground(new java.awt.Color(255, 255, 255));
        pnlExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlExitMouseExited(evt);
            }
        });
        pnlExit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pnlExitKeyTyped(evt);
            }
        });
        pnlExit.setLayout(new java.awt.BorderLayout());

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("X");
        btnExit.setContentAreaFilled(false);
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

        firstPanel.add(pnlExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 50, 40));

        getContentPane().add(firstPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 260, 600));

        fondStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Students.jpg"))); // NOI18N
        getContentPane().add(fondStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 0, 920, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void superiortPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superiortPanelMousePressed
        
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_superiortPanelMousePressed

    private void superiortPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superiortPanelMouseDragged
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse,y - yMouse);
        
    }//GEN-LAST:event_superiortPanelMouseDragged

    private void pnlExitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnlExitKeyTyped
        
       
        
    }//GEN-LAST:event_pnlExitKeyTyped

    private void pnlExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExitMouseClicked
        
        System.exit(0);
        
    }//GEN-LAST:event_pnlExitMouseClicked

    private void pnlStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlStudentMouseClicked
        
        
        
    }//GEN-LAST:event_pnlStudentMouseClicked

    private void pnlExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExitMouseEntered
        
        
        
    }//GEN-LAST:event_pnlExitMouseEntered

    private void pnlExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExitMouseExited
        
        
        
    }//GEN-LAST:event_pnlExitMouseExited

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        
        BaseStudents students = new BaseStudents();
        students.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
       
        pnlExit.setBackground(Color.red);
        
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        
        pnlExit.setBackground(Color.gray);
        
    }//GEN-LAST:event_btnExitMouseExited

    private void btnNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotesActionPerformed
        
        BaseNotes notes = new BaseNotes();
        notes.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnNotesActionPerformed

    private void pnlNotesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNotesMouseEntered
        
        
        
    }//GEN-LAST:event_pnlNotesMouseEntered
    
    private void pnlStudentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlStudentMouseExited
        
        
        
    }//GEN-LAST:event_pnlStudentMouseExited

    private void pnlStudentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlStudentMouseEntered
        
        
        
    }//GEN-LAST:event_pnlStudentMouseEntered

    private void pnlNotesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNotesMouseExited
        
        
        
    }//GEN-LAST:event_pnlNotesMouseExited

    private void btnStudentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStudentMouseEntered
        
        pnlStudent.setBackground(new Color(25,62,126));
        
    }//GEN-LAST:event_btnStudentMouseEntered

    private void btnStudentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStudentMouseExited
        
        pnlStudent.setBackground(new Color(6,35,86));
        
    }//GEN-LAST:event_btnStudentMouseExited

    private void btnNotesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotesMouseEntered
        
        pnlNotes.setBackground(new Color(25,62,126));
        
    }//GEN-LAST:event_btnNotesMouseEntered

    private void btnNotesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotesMouseExited
        
        pnlNotes.setBackground(new Color(6,35,86));
        
    }//GEN-LAST:event_btnNotesMouseExited

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        
        setExtendedState(ICONIFIED);
        
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        
        pnlMinimizar.setBackground(new Color(220,185,2));
        btnMinimizar.setForeground(Color.white);
        
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        
        pnlMinimizar.setBackground(Color.white);
        btnMinimizar.setForeground(Color.black);
        
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void firstPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstPanelMousePressed
        
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_firstPanelMousePressed

    private void firstPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstPanelMouseDragged
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse,y - yMouse);
        
    }//GEN-LAST:event_firstPanelMouseDragged
    
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
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnNotes;
    private javax.swing.JButton btnStudent;
    private javax.swing.JPanel firstPanel;
    private javax.swing.JLabel fondStudents;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbEstudiantes;
    private javax.swing.JLabel lbUniminuto;
    private javax.swing.JLabel logoUniminuto;
    private javax.swing.JPanel pnlExit;
    private javax.swing.JPanel pnlMinimizar;
    private javax.swing.JPanel pnlNotes;
    private javax.swing.JPanel pnlStudent;
    private javax.swing.JPanel superiortPanel;
    // End of variables declaration//GEN-END:variables
}
