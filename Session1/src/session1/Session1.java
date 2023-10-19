/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package session1;
import session1.Entity.Users;
import java.sql.*;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import session1.GUI.GUILogin;
import session1.dao.UserDao;
import session1.Entity.Users;
import session1.GUI.GUIAddListing;
/**
 *
 * @author tienk
 */
public class Session1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

//        UserDao userdao = new UserDao();
//        List<Users> users = userdao.getUsers();
//        for(Users u : users) {
//            System.out.println(u);
//        }
        SwingUtilities.invokeLater(() -> {
            try {
                    String className = UIManager.getSystemLookAndFeelClassName();
                    UIManager.setLookAndFeel(className);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            new GUIAddListing().setVisible(true);
        });
        
    }
    
}
