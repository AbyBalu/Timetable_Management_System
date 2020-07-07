/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guest.Interface;

import Classes.MyConnection;
import Faculty.Interface.HOME;
import Student.Interface.Shome;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Aby Balu
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Mode = new javax.swing.JComboBox<>();
        jButton_login_ = new javax.swing.JButton();
        ID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jBack_Button_3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        Mode.setBackground(new java.awt.Color(242, 38, 19));
        Mode.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        Mode.setForeground(new java.awt.Color(236, 240, 241));
        Mode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Faculty", "Student" }));
        Mode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModeActionPerformed(evt);
            }
        });
        jPanel1.add(Mode);
        Mode.setBounds(530, 330, 110, 30);

        jButton_login_.setBackground(new java.awt.Color(34, 167, 240));
        jButton_login_.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jButton_login_.setForeground(new java.awt.Color(236, 240, 241));
        jButton_login_.setText("Login");
        jButton_login_.setToolTipText("Login");
        jButton_login_.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton_login_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_login_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_login_MouseEntered(evt);
            }
        });
        jButton_login_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_login_ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_login_);
        jButton_login_.setBounds(670, 330, 90, 30);

        ID.setBackground(new java.awt.Color(108, 122, 137));
        ID.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        ID.setForeground(new java.awt.Color(228, 241, 254));
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        jPanel1.add(ID);
        ID.setBounds(530, 200, 230, 30);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(236, 240, 241));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Faculty ID / Student Reg. No.");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(530, 160, 230, 30);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 240, 241));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(580, 100, 130, 60);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Faculty Name / Student Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(530, 240, 230, 30);

        Name.setBackground(new java.awt.Color(108, 122, 137));
        Name.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        Name.setForeground(new java.awt.Color(228, 241, 254));
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        jPanel1.add(Name);
        Name.setBounds(530, 280, 230, 30);

        jBack_Button_3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aby Balu\\Documents\\NetBeansProjects\\Timetable_Management_System\\src\\main\\java\\Resources\\back1.png")); // NOI18N
        jBack_Button_3.setToolTipText("Back");
        jBack_Button_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBack_Button_3MouseClicked(evt);
            }
        });
        jPanel1.add(jBack_Button_3);
        jBack_Button_3.setBounds(540, 120, 20, 20);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/login1.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1070, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_login_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_login_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_login_MouseClicked

    private void jButton_login_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_login_MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_login_MouseEntered

    private void jButton_login_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_login_ActionPerformed
        PreparedStatement ps;
        ResultSet rs;
        
        String id = ID.getText().toUpperCase();
        String name = Name.getText().toUpperCase();
        int i = Mode.getSelectedIndex();
        
        if(i==0){
        
            if (id.equals("")) {
            JOptionPane.showMessageDialog(null, "Faculty ID Field is empty","Login Failed",2);
            }else if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Faculty Name Field is empty","Login Failed",2);
            }
            else {
            String query = "SELECT * FROM `teacher_details` WHERE `ID`=? AND `First Name`=?";
            try{

                ps = MyConnection.getConnection().prepareStatement(query);

                ps.setString(1, id);
                ps.setString(2, name);

                rs = ps.executeQuery();

                if(rs.next())
                {

                HOME home = new HOME();
                home.setVisible(true);
                home.pack();
                home.setLocationRelativeTo(null);
                home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();

                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Faculty ID Or First Name          Hint: use only first name.", "Login Failed",2);
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }      
        } 
        }
        else if(i==1)
        {
            if (id.equals("")) {
            JOptionPane.showMessageDialog(null, "Student Reg. No. Field is empty","Login Failed",2);
            }else if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Student Name Field is empty","Login Failed",2);
            }
            else {
            String query = "SELECT * FROM `student_details` WHERE `Reg. No.`=? AND `First Name`=?";
            try{

                ps = MyConnection.getConnection().prepareStatement(query);

                ps.setString(1, id);
                ps.setString(2, name);

                rs = ps.executeQuery();

                if(rs.next())
                {

                Shome home = new Shome();
                home.setVisible(true);
                home.pack();
                home.setLocationRelativeTo(null);
                home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();

                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect student Reg. No. Or First Name          Hint: use only first name.", "Login Failed",2);
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }      
        } 
        }
    }//GEN-LAST:event_jButton_login_ActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        
    }//GEN-LAST:event_IDActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void ModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModeActionPerformed

    private void jBack_Button_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBack_Button_3MouseClicked
        home home = new home();
        home.setVisible(true);
        home.pack();
        home.setLocationRelativeTo(null);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jBack_Button_3MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JComboBox<String> Mode;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel jBack_Button_3;
    private javax.swing.JButton jButton_login_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}