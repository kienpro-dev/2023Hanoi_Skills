/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session1.dao;

import java.util.List;
import session1.Entity.Itemamenities;

/**
 *
 * @author tienk
 */
public class ItemAmeDao {
    public List<Itemamenities> getItemamenitieses() {
        return Manager.em.createNamedQuery("Itemamenities.findAll", Itemamenities.class).getResultList();
    }
    public void add(Itemamenities ia) {
        Manager.em.getTransaction().begin();
        Manager.em.persist(ia);
        Manager.em.getTransaction().commit();
    }
}
