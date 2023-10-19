/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session1.dao;

import java.util.List;
import session1.Entity.Areas;

/**
 *
 * @author tienk
 */
public class AreasDao {
    public Areas getArea(String name) {
        return Manager.em.createNamedQuery("Areas.findByName", Areas.class).setParameter("name", name).getSingleResult();
    }
    
    public List<Areas> getAreas() {
        return Manager.em.createNamedQuery("Areas.findAll", Areas.class).getResultList();
    }
}
