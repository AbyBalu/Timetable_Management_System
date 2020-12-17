/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faculty;

import Guest.Glogin;
import Classes.MyConnection;
import NewEntries.EditTimeTable;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Aby Balu
 */
public class Ftimetable extends javax.swing.JFrame {

    /**
     * Creates new form TimeTable
     */
    public Ftimetable() {
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
            
        String query = "SELECT `9.00 am-9.55 am`, `9.55 am-10.50 am`, `10.50 am-11.00 am`, `11.00 am-11.55 am`, `11.55 am-12.50 pm`, `12.50 pm-1.45 pm`, `1.45 pm-2.30 pm`, `2.30 pm-3.25 pm`, `3.25 pm-3.35 pm`, `3.35 pm-4.30 pm` FROM `cse_s1`";
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
        sem = new javax.swing.JComboBox<>();
        department = new javax.swing.JComboBox<>();
        editTable = new javax.swing.JLabel();
        jSearch = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
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

        sem.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        sem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8" }));
        sem.setToolTipText("Select Semester");
        jPanel2.add(sem);
        sem.setBounds(270, 90, 50, 30);

        department.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "EEE", "EC", "CE", "MECH" }));
        department.setToolTipText("Select Department");
        department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentActionPerformed(evt);
            }
        });
        jPanel2.add(department);
        department.setBounds(200, 90, 54, 30);

        editTable.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        editTable.setForeground(new java.awt.Color(66, 164, 245));
        editTable.setIcon(new javax.swing.ImageIcon("E:\\Timetable_Management_System\\src\\main\\java\\Resources\\edit1.png")); // NOI18N
        editTable.setToolTipText("Edit Selected Row");
        editTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editTableMouseClicked(evt);
            }
        });
        jPanel2.add(editTable);
        editTable.setBounds(370, 90, 30, 30);

        jSearch.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        jSearch.setForeground(new java.awt.Color(66, 164, 245));
        jSearch.setIcon(new javax.swing.ImageIcon("E:\\Timetable_Management_System\\src\\main\\java\\Resources\\search.png")); // NOI18N
        jSearch.setToolTipText("Search");
        jSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSearchMouseClicked(evt);
            }
        });
        jPanel2.add(jSearch);
        jSearch.setBounds(330, 90, 30, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon("E:\\Timetable_Management_System\\src\\main\\java\\Resources\\nn.png")); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(160, 400, 860, 80);

        jTable1.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        jTable1.setForeground(new java.awt.Color(66, 164, 245));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "9.00 am-9.55 am", "9.55 am-10.50 am", "10.50 am-11.00 am", "11.00 am-11.55 am", "11.55 am-12.50 pm", "12.50 pm-1.45 pm", "1.45 pm-2.30 pm", "2.30 pm-3.25 pm", "3.25 pm-3.35 pm", "3.35 pm-4.30 pm"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(66, 164, 245));
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(35);
        jTable1.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(290, 130, 680, 290);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(66, 164, 245));

        jSeparator1.setForeground(new java.awt.Color(66, 164, 245));

        jSeparator2.setForeground(new java.awt.Color(66, 164, 245));

        jSeparator3.setForeground(new java.awt.Color(66, 164, 245));

        jSeparator4.setForeground(new java.awt.Color(66, 164, 245));

        jSeparator5.setForeground(new java.awt.Color(66, 164, 245));

        jSeparator6.setForeground(new java.awt.Color(66, 164, 245));

        jSeparator7.setForeground(new java.awt.Color(66, 164, 245));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MONDAY");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("THURSDAY");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FRIDAY");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SATURDAY");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("WEDNESDAY");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TUESDAY");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("SUNDAY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator6)
            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(7, 7, 7)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(7, 7, 7)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(7, 7, 7)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(27, 27, 27))
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(200, 132, 100, 273);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\Timetable_Management_System\\src\\main\\java\\Resources\\in.png")); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(110, 240, 20, 20);

        jButton_Logout_.setIcon(new javax.swing.ImageIcon("E:\\Timetable_Management_System\\src\\main\\java\\Resources\\logout.png")); // NOI18N
        jButton_Logout_.setToolTipText("Logout");
        jButton_Logout_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Logout_MouseClicked(evt);
            }
        });
        jPanel2.add(jButton_Logout_);
        jButton_Logout_.setBounds(970, 10, 30, 40);

        jButton_admin_.setIcon(new javax.swing.ImageIcon("E:\\Timetable_Management_System\\src\\main\\java\\Resources\\admin.png")); // NOI18N
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
        jButton_Teachers_.setText("Teachers");
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
        jButton_Students_.setText("Students");
        jButton_Students_.setToolTipText("Student Manager");
        jButton_Students_.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Students_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Students_MouseClicked(evt);
            }
        });
        jPanel2.add(jButton_Students_);
        jButton_Students_.setBounds(-10, 150, 150, 40);

        jButton_Parents_.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
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

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\Timetable_Management_System\\src\\main\\java\\Resources\\home3.jpg")); // NOI18N
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
        Glogin out = new Glogin();
        out.setVisible(true);
        out.pack();
        out.setLocationRelativeTo(null);
        out.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton_Logout_MouseClicked

    private void jButton_admin_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_admin_MouseClicked
        JOptionPane.showMessageDialog(null, "Acces Restricted","Request Denied",2);
    }//GEN-LAST:event_jButton_admin_MouseClicked

    private void jButton_Home_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Home_MouseClicked
        Fhome home = new Fhome();
        home.setVisible(true);
        home.pack();
        home.setLocationRelativeTo(null);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton_Home_MouseClicked

    private void jButton_Teachers_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Teachers_MouseClicked
        Fteachers teacher = new Fteachers();
        teacher.setVisible(true);
        teacher.pack();
        teacher.setLocationRelativeTo(null);
        teacher.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton_Teachers_MouseClicked

    private void jButton_Students_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Students_MouseClicked
        Fstudents students = new Fstudents();
        students.setVisible(true);
        students.pack();
        students.setLocationRelativeTo(null);
        students.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton_Students_MouseClicked

    private void jButton_Parents_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Parents_MouseClicked
        Fparents parents = new Fparents();
        parents.setVisible(true);
        parents.pack();
        parents.setLocationRelativeTo(null);
        parents.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton_Parents_MouseClicked

    private void jButton_TimeTable_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_TimeTable_MouseClicked
        Ftimetable timetable = new Ftimetable();
        timetable.setVisible(true);
        timetable.pack();
        timetable.setLocationRelativeTo(null);
        timetable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton_TimeTable_MouseClicked

    
    private void jSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchMouseClicked
        int i = department.getSelectedIndex();
        int j = sem.getSelectedIndex();
        PreparedStatement ps;
        ResultSet rs;
        
        if(i==0)
        {
            switch(j)
            {
                case 0:
                    try{

                    String query = "SELECT `9.00 am-9.55 am`, `9.55 am-10.50 am`, `10.50 am-11.00 am`, `11.00 am-11.55 am`, `11.55 am-12.50 pm`, `12.50 pm-1.45 pm`, `1.45 pm-2.30 pm`, `2.30 pm-3.25 pm`, `3.25 pm-3.35 pm`, `3.35 pm-4.30 pm` FROM `cse_s1`";
                    ps = MyConnection.getConnection().prepareStatement(query);
                    rs = ps.executeQuery();
                    jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                    renderer.setHorizontalAlignment(SwingConstants.CENTER);

                    for (int k=0; k<jTable1.getColumnCount();k++){
                    jTable1.setDefaultRenderer(jTable1.getColumnClass(k),renderer);
                    }

                    }
                    catch(SQLException e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                    break;
                case 1:
                    try{

                    String query = "SELECT `9.00 am-9.55 am`, `9.55 am-10.50 am`, `10.50 am-11.00 am`, `11.00 am-11.55 am`, `11.55 am-12.50 pm`, `12.50 pm-1.45 pm`, `1.45 pm-2.30 pm`, `2.30 pm-3.25 pm`, `3.25 pm-3.35 pm`, `3.35 pm-4.30 pm` FROM `cse_s2`";
                    ps = MyConnection.getConnection().prepareStatement(query);
                    rs = ps.executeQuery();
                    jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                    renderer.setHorizontalAlignment(SwingConstants.CENTER);

                    for (int k=0; k<jTable1.getColumnCount();k++){
                    jTable1.setDefaultRenderer(jTable1.getColumnClass(k),renderer);
                    }

                    }
                    catch(SQLException e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                    break;
                case 2:
                    try{

                    String query = "SELECT `9.00 am-9.55 am`, `9.55 am-10.50 am`, `10.50 am-11.00 am`, `11.00 am-11.55 am`, `11.55 am-12.50 pm`, `12.50 pm-1.45 pm`, `1.45 pm-2.30 pm`, `2.30 pm-3.25 pm`, `3.25 pm-3.35 pm`, `3.35 pm-4.30 pm` FROM `cse_s3`";
                    ps = MyConnection.getConnection().prepareStatement(query);
                    rs = ps.executeQuery();
                    jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                    renderer.setHorizontalAlignment(SwingConstants.CENTER);

                    for (int k=0; k<jTable1.getColumnCount();k++){
                    jTable1.setDefaultRenderer(jTable1.getColumnClass(k),renderer);
                    }

                    }
                    catch(SQLException e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                    break;
                case 3:
                    try{

                    String query = "SELECT `9.00 am-9.55 am`, `9.55 am-10.50 am`, `10.50 am-11.00 am`, `11.00 am-11.55 am`, `11.55 am-12.50 pm`, `12.50 pm-1.45 pm`, `1.45 pm-2.30 pm`, `2.30 pm-3.25 pm`, `3.25 pm-3.35 pm`, `3.35 pm-4.30 pm` FROM `cse_s4`";
                    ps = MyConnection.getConnection().prepareStatement(query);
                    rs = ps.executeQuery();
                    jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                    renderer.setHorizontalAlignment(SwingConstants.CENTER);

                    for (int k=0; k<jTable1.getColumnCount();k++){
                    jTable1.setDefaultRenderer(jTable1.getColumnClass(k),renderer);
                    }

                    }
                    catch(SQLException e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                    break;
                case 4:
                    try{

                    String query = "SELECT `9.00 am-9.55 am`, `9.55 am-10.50 am`, `10.50 am-11.00 am`, `11.00 am-11.55 am`, `11.55 am-12.50 pm`, `12.50 pm-1.45 pm`, `1.45 pm-2.30 pm`, `2.30 pm-3.25 pm`, `3.25 pm-3.35 pm`, `3.35 pm-4.30 pm` FROM `cse_s5`";
                    ps = MyConnection.getConnection().prepareStatement(query);
                    rs = ps.executeQuery();
                    jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                    renderer.setHorizontalAlignment(SwingConstants.CENTER);

                    for (int k=0; k<jTable1.getColumnCount();k++){
                    jTable1.setDefaultRenderer(jTable1.getColumnClass(k),renderer);
                    }

                    }
                    catch(SQLException e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                    break;
                case 5:
                    try{

                    String query = "SELECT `9.00 am-9.55 am`, `9.55 am-10.50 am`, `10.50 am-11.00 am`, `11.00 am-11.55 am`, `11.55 am-12.50 pm`, `12.50 pm-1.45 pm`, `1.45 pm-2.30 pm`, `2.30 pm-3.25 pm`, `3.25 pm-3.35 pm`, `3.35 pm-4.30 pm` FROM `cse_s6`";
                    ps = MyConnection.getConnection().prepareStatement(query);
                    rs = ps.executeQuery();
                    jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                    renderer.setHorizontalAlignment(SwingConstants.CENTER);

                    for (int k=0; k<jTable1.getColumnCount();k++){
                    jTable1.setDefaultRenderer(jTable1.getColumnClass(k),renderer);
                    }

                    }
                    catch(SQLException e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                    break;
                case 6:
                    try{

                    String query = "SELECT `9.00 am-9.55 am`, `9.55 am-10.50 am`, `10.50 am-11.00 am`, `11.00 am-11.55 am`, `11.55 am-12.50 pm`, `12.50 pm-1.45 pm`, `1.45 pm-2.30 pm`, `2.30 pm-3.25 pm`, `3.25 pm-3.35 pm`, `3.35 pm-4.30 pm` FROM `cse_s7`";
                    ps = MyConnection.getConnection().prepareStatement(query);
                    rs = ps.executeQuery();
                    jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                    renderer.setHorizontalAlignment(SwingConstants.CENTER);

                    for (int k=0; k<jTable1.getColumnCount();k++){
                    jTable1.setDefaultRenderer(jTable1.getColumnClass(k),renderer);
                    }

                    }
                    catch(SQLException e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                    break;
                case 7:
                    try{

                    String query = "SELECT `9.00 am-9.55 am`, `9.55 am-10.50 am`, `10.50 am-11.00 am`, `11.00 am-11.55 am`, `11.55 am-12.50 pm`, `12.50 pm-1.45 pm`, `1.45 pm-2.30 pm`, `2.30 pm-3.25 pm`, `3.25 pm-3.35 pm`, `3.35 pm-4.30 pm` FROM `cse_s8`";
                    ps = MyConnection.getConnection().prepareStatement(query);
                    rs = ps.executeQuery();
                    jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                    renderer.setHorizontalAlignment(SwingConstants.CENTER);

                    for (int k=0; k<jTable1.getColumnCount();k++){
                    jTable1.setDefaultRenderer(jTable1.getColumnClass(k),renderer);
                    }

                    }
                    catch(SQLException e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                    break;
            }
        }
        else
            JOptionPane.showMessageDialog(null, "Work on progress","Alert",2);
    }//GEN-LAST:event_jSearchMouseClicked
    
    private void editTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editTableMouseClicked
        
        EditTimeTable edit = new EditTimeTable();
        int index = jTable1.getSelectedRow();
        
        TableModel model = jTable1.getModel();
        
        String C1 = model.getValueAt(index, 0).toString();
        String C2 = model.getValueAt(index, 1).toString();
        String C3 = model.getValueAt(index, 2).toString();
        String C4 = model.getValueAt(index, 3).toString();
        String C5 = model.getValueAt(index, 4).toString();
        String C6 = model.getValueAt(index, 5).toString();
        String C7 = model.getValueAt(index, 6).toString();
        String C8 = model.getValueAt(index, 7).toString();
        String C9 = model.getValueAt(index, 8).toString();
        String C10 = model.getValueAt(index, 9).toString();
        
        int x = department.getSelectedIndex();
        int y = sem.getSelectedIndex();
        int row = jTable1.getSelectedRow();
        edit.dep.setSelectedIndex(x);
        edit.se.setSelectedIndex(y);
        edit.day.setSelectedIndex(row);
        
       
        edit.setVisible(true);
        edit.pack();
        edit.setLocationRelativeTo(null);
        edit.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        edit.c1.setText(C1);
        edit.c2.setText(C2);
        edit.c3.setText(C3);
        edit.c4.setText(C4);
        edit.c5.setText(C5);
        edit.c6.setText(C6);
        edit.c7.setText(C7);
        edit.c8.setText(C8);
        edit.c9.setText(C9);
        edit.c10.setText(C10);
        this.dispose();
        
    }//GEN-LAST:event_editTableMouseClicked

    private void departmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentActionPerformed

   
    
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
            java.util.logging.Logger.getLogger(Ftimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ftimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ftimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ftimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ftimetable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> department;
    public javax.swing.JLabel editTable;
    private javax.swing.JLabel jButton_Home_;
    private javax.swing.JLabel jButton_Logout_;
    private javax.swing.JLabel jButton_Parents_;
    private javax.swing.JLabel jButton_Students_;
    private javax.swing.JLabel jButton_Teachers_;
    private javax.swing.JLabel jButton_TimeTable_;
    private javax.swing.JLabel jButton_admin_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jSearch;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> sem;
    // End of variables declaration//GEN-END:variables
}
