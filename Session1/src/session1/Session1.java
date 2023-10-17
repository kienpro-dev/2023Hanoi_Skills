/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package session1;
import java.sql.*;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import session1.GUI.GUILogin;
/**
 *
 * @author tienk
 */
public class Session1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        JDBCConnection jdbc = new JDBCConnection();
        Connection conn = jdbc.getConnection("Kien");
        
        SwingUtilities.invokeLater(() -> {
            try {
                    String className = UIManager.getSystemLookAndFeelClassName();
                    UIManager.setLookAndFeel(className);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            GUILogin gui = new GUILogin();
            gui.setVisible(true);
        });
        
    }
    
}
