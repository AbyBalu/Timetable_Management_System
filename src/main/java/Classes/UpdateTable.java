/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aby Balu
 */
public class UpdateTable {
    
    public static void tableUpdate(String sql, String col1, String col2, String col3, String col4, String col5, String col6, String col7, String col8, String col9, String col10) {
        PreparedStatement ps;
        String query ="UPDATE ? SET `9.00 am-9.55 am`=?,`9.55 am-10.50 am`=?,`10.50 am-11.00 am`=?,`11.00 am-11.55 am`=?,`11.55 am-12.50 pm`=?,`12.50 pm-1.45 pm`=?,`1.45 pm-2.30 pm`=?,`2.30 pm-3.25 pm`=?,`3.25 pm-3.35 pm`=?,`3.35 pm-4.30 pm`=? WHERE `ID` =1";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
        
                                ps.setString(1, sql);
                                ps.setString(2, col1);
                                ps.setString(3, col2);
                                ps.setString(4, col3);
                                ps.setString(5, col4);
                                ps.setString(6, col5);
                                ps.setString(7, col6);
                                ps.setString(8, col7);
                                ps.setString(9, col8);
                                ps.setString(10, col9);
                                ps.setString(11, col10);
                                
                                
                                if(ps.executeUpdate()>0)
                                {
                                    
                                    JOptionPane.showMessageDialog(null, "Details Updated","Updation Successfull",JOptionPane.INFORMATION_MESSAGE);
                                    
                                }
            } catch (SQLException ex) {
            Logger.getLogger(UpdateTable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
