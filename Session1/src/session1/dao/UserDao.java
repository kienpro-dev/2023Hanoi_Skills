/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session1.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import session1.JDBCConnection;
import session1.Entity.Users;
import session1.Entity.Usertypes;

/**
 *
 * @author tienk
 */
public class UserDao {
    public List<Users> getUsers() throws Exception {
        return Manager.em.createNamedQuery("Users.findAll", Users.class).getResultList();
    }
    
    public void addUsers(Users user) {
        Manager.em.getTransaction().begin();
        Manager.em.persist(user);
        Manager.em.getTransaction().commit();
    }
}
