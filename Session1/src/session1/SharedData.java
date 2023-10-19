/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session1;

/**
 *
 * @author tienk
 */
public class SharedData {
    private String username;
    private static SharedData instance;

    private SharedData() {}

    public static SharedData getInstance() {
        if (instance == null) {
            instance = new SharedData();
        }
        return instance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
