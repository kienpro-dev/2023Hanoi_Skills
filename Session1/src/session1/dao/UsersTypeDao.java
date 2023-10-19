/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session1.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import session1.JDBCConnection;
import session1.Entity.Users;
import session1.Entity.Usertypes;

/**
 *
 * @author tienk
 */
public class UsersTypeDao {
    public Usertypes getUsertypes(String type) throws SQLException {
        
        return Manager.em.createNamedQuery("Usertypes.findByName", Usertypes.class).setParameter("name", type).getSingleResult();
    }
}
