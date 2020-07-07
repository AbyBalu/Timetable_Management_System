/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.Interface;

import Classes.MyConnection;
import New.Entries.AddTeachers;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Aby Balu
 */
public class Teachers extends javax.swing.JFrame {

    /**
     * Creates new form Teachers
     */
    public Teachers() {
        initComponents();
        jTable1.getTableHeader().setFont(new Font("Tw Cen MT", Font.BOLD, 12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(32, 136, 203));
        jTable1.getTableHeader().setForeground(new Color(0, 0, 102));
        TableCellRenderer rendererFromHeader = jTable1.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        DisplayTable();
    }

    private void DisplayTable()
    {   
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            
        String query = "SELECT * FROM `teacher_details`";
        ps = MyConnection.getConnection().prepareStatement(query);
        rs = ps.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
	renderer.setHorizontalAlignment(SwingConstants.CENTER);
        
        for (int i=0; i<jTable1.getColumnCount();i++){
        jTable1.setDefaultRenderer(jTable1.getColumnClass(i),renderer);
        }
        
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDelete_Button_ = new javax.swing.JLabel();
        jAdd_Button_ = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton_Logout_ = new javax.swing.JLabel();
        jButton_admin_ = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton_Home_ = new javax.swing.JLabel();
        jButton_Teachers_ = new javax.swing.JLabel();
        jButton_Students_ = new javax.swing.JLabel();
        jButton_Parents_ = new javax.swing.JLabel();
        jButton_TimeTable_ = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jTable1.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        jTable1.setForeground(new java.awt.Color(66, 164, 245));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(66, 164, 245));
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(180, 130, 810, 280);

        jDelete_Button_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icondelete.png"))); // NOI18N
        jDelete_Button_.setToolTipText("Delete");
        jDelete_Button_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDelete_Button_MouseClicked(evt);
            }
        });
        jPanel2.add(jDelete_Button_);
        jDelete_Button_.setBounds(220, 90, 30, 30);

        jAdd_Button_.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        jAdd_Button_.setForeground(new java.awt.Color(66, 164, 245));
        jAdd_Button_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Iconadd.png"))); // NOI18N
        jAdd_Button_.setToolTipText("Add");
        jAdd_Button_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAdd_Button_MouseClicked(evt);
            }
        });
        jPanel2.add(jAdd_Button_);
        jAdd_Button_.setBounds(180, 90, 30, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aby Balu\\Documents\\NetBeansProjects\\Timetable_Management_System\\src\\main\\java\\Resources\\in.png")); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(110, 120, 20, 20);

        jButton_Logout_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logout.png"))); // NOI18N
        jButton_Logout_.setToolTipText("Logout");
        jButton_Logout_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Logout_MouseClicked(evt);
            }
        });
        jPanel2.add(jButton_Logout_);
        jButton_Logout_.setBounds(970, 10, 30, 40);

        jButton_admin_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/admin.png"))); // NOI18N
        jButton_admin_.setToolTipText("Admin Manager");
        jButton_admin_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_admin_MouseClicked(evt);
            }
        });
        jPanel2.add(jButton_admin_);
        jButton_admin_.setBounds(20, 10, 100, 40);

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("ADMIN");
        jLabel14.setToolTipText("");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(20, 10, 130, 40);

        jButton_Home_.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jButton_Home_.setForeground(new java.awt.Color(204, 204, 204));
        jButton_Home_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jButton_Home_.setText("   Home");
        jButton_Home_.setToolTipText("Home");
        jButton_Home_.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Home_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Home_MouseClicked(evt);
            }
        });
        jPanel2.add(jButton_Home_);
        jButton_Home_.setBounds(-10, 70, 150, 40);

        jButton_Teachers_.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jButton_Teachers_.setForeground(new java.awt.Color(204, 204, 204));
        jButton_Teachers_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jButton_Teachers_.setText("  Teachers");
        jButton_Teachers_.setToolTipText("Teacher Manager");
        jButton_Teachers_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Teachers_MouseClicked(evt);
            }
        });
        jPanel2.add(jButton_Teachers_);
        jButton_Teachers_.setBounds(10, 110, 120, 40);

        jButton_Students_.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jButton_Students_.setForeground(new java.awt.Color(204, 204, 204));
        jButton_Students_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jButton_Students_.setText("  Students");
        jButton_Students_.setToolTipText("Student Manager");
        jButton_Students_.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Students_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Students_MouseClicked(evt);
            }
        });
        jPanel2.add(jButton_Students_);
        jButton_Students_.setBounds(-10, 150, 150, 40);

        jButton_Parents_.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jButton_Parents_.setForeground(new java.awt.Color(204, 204, 204));
        jButton_Parents_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jButton_Parents_.setText("Parents");
        jButton_Parents_.setToolTipText("Parent Manager");
        jButton_Parents_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Parents_MouseClicked(evt);
            }
        });
        jPanel2.add(jButton_Parents_);
        jButton_Parents_.setBounds(10, 190, 120, 40);

        jButton_TimeTable_.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jButton_TimeTable_.setForeground(new java.awt.Color(204, 204, 204));
        jButton_TimeTable_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jButton_TimeTable_.setText("  Timetable");
        jButton_TimeTable_.setToolTipText("Timetable Manager");
        jButton_TimeTable_.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_TimeTable_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_TimeTable_MouseClicked(evt);
            }
        });
        jPanel2.add(jButton_TimeTable_);
        jButton_TimeTable_.setBounds(-10, 230, 150, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/home3.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1020, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Logout_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Logout_MouseClicked
        login out = new login();
        out.setVisible(true);
        out.pack();
        out.setLocationRelativeTo(null);
        out.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton_Logout_MouseClicked

    private void jButton_admin_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_admin_MouseClicked
        Admin admin = new Admin();
        admin.setVisible(true);
        admin.pack();
        admin.setLocationRelativeTo(null);
        admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton_admin_MouseClicked

    private void jButton_Home_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Home_MouseClicked
        Home home = new Home();
        home.setVisible(true);
        home.pack();
        home.setLocationRelativeTo(null);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton_Home_MouseClicked

    private void jButton_Teachers_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Teachers_MouseClicked
        Teachers teacher = new Teachers();
        teacher.setVisible(true);
        teacher.pack();
        teacher.setLocationRelativeTo(null);
        teacher.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton_Teachers_MouseClicked

    private void jButton_Students_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Students_MouseClicked
        Students students = new Students();
        students.setVisible(true);
        students.pack();
        students.setLocationRelativeTo(null);
        students.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton_Students_MouseClicked

    private void jButton_Parents_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Parents_MouseClicked
        Parents parents = new Parents();
        parents.setVisible(true);
        parents.pack();
        parents.setLocationRelativeTo(null);
        parents.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton_Parents_MouseClicked

    private void jButton_TimeTable_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_TimeTable_MouseClicked
        TimeTable timetable = new TimeTable();
        timetable.setVisible(true);
        timetable.pack();
        timetable.setLocationRelativeTo(null);
        timetable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton_TimeTable_MouseClicked

    private void jDelete_Button_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDelete_Button_MouseClicked
        PreparedStatement ps;
        int row = jTable1.getSelectedRow();
        String id = jTable1.getModel().getValueAt(row, 0).toString();
        int i = Integer.parseInt(id);

        String query = "DELETE FROM `teacher_details` WHERE ID = '"+id+"'";

        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Data successfully deleted", "Deletion successfull", JOptionPane.INFORMATION_MESSAGE);
            DisplayTable();

        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jDelete_Button_MouseClicked

    private void jAdd_Button_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAdd_Button_MouseClicked
        AddTeachers addteachers = new AddTeachers();
        addteachers.setVisible(true);
        addteachers.pack();
        addteachers.setLocationRelativeTo(null);
        addteachers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jAdd_Button_MouseClicked

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
            java.util.logging.Logger.getLogger(Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teachers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAdd_Button_;
    private javax.swing.JLabel jButton_Home_;
    private javax.swing.JLabel jButton_Logout_;
    private javax.swing.JLabel jButton_Parents_;
    private javax.swing.JLabel jButton_Students_;
    private javax.swing.JLabel jButton_Teachers_;
    private javax.swing.JLabel jButton_TimeTable_;
    private javax.swing.JLabel jButton_admin_;
    private javax.swing.JLabel jDelete_Button_;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}