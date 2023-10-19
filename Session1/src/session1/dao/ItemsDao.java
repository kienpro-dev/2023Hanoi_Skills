package session1.dao;


import java.util.List;
import session1.Entity.Items;
import session1.dao.Manager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tienk
 */
public class ItemsDao {
    public List<Items> findAll() {
        return Manager.em.createNamedQuery("Items.findAll", Items.class).getResultList();
    }
    
    public List<Items> findCustom() {
        return Manager.em.createNamedQuery("Items.findCustom", Items.class).getResultList();
    }
    
    public List<Items> findByTitle(String title) {
        return Manager.em.createNamedQuery("Items.findCustom2", Items.class).setParameter("title", title).getResultList();
    }
    
    public void addItems(Items item) {
        Manager.em.getTransaction().begin();
        Manager.em.persist(item);
        Manager.em.getTransaction().commit();
    }
}
