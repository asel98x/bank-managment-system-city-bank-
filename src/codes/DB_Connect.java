
package codes;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class DB_Connect {
    
    public static Connection connect(){
        Connection conn = null;
        
        try {
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system_asel","root","");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return conn;
    }

}


