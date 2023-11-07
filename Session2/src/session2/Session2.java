/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package session2;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import session2.gui.ListingGUI;

/**
 *
 * @author tienk
 */
public class Session2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                    String className = UIManager.getSystemLookAndFeelClassName();
                    UIManager.setLookAndFeel(className);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            new ListingGUI().setVisible(true);
        });
    }
    
}
