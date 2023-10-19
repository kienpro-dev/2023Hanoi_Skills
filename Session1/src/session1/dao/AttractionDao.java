/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session1.dao;

import java.util.List;
import session1.Entity.Attractions;

/**
 *
 * @author tienk
 */
public class AttractionDao {
    public List<Attractions> getAttractions() {
        return Manager.em.createNamedQuery("Attractions.findAll", Attractions.class).getResultList();
    }
    
    public Attractions getAttraction(String name) {
        return Manager.em.createNamedQuery("Attractions.findByName", Attractions.class).setParameter("name", name).getSingleResult();
    }
}
