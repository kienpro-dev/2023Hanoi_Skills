/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session1.dao;

import java.util.List;
import session1.Entity.Itemattractions;

/**
 *
 * @author tienk
 */
public class ItemAtractDao {

    public List<Itemattractions> getItemAttractions() {
        return Manager.em.createNamedQuery("Itemattractions.findAll", Itemattractions.class).getResultList();
    }

    public void addItemAtract(Itemattractions iat) {
        Manager.em.getTransaction().begin();
        Manager.em.persist(iat);
        Manager.em.getTransaction().commit();
    }
}
