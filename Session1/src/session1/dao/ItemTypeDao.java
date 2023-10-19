/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session1.dao;

import java.util.List;
import session1.Entity.Itemtypes;

/**
 *
 * @author tienk
 */
public class ItemTypeDao {
    public Itemtypes getItemtypes(String name) {
        return Manager.em.createNamedQuery("Itemtypes.findByName", Itemtypes.class).setParameter("name", name).getSingleResult();
    }
    
    public List<Itemtypes> getAll() {
        return Manager.em.createNamedQuery("Itemtypes.findAll", Itemtypes.class).getResultList();
    }
}
