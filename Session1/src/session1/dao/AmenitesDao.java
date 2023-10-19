/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session1.dao;

import java.util.List;
import session1.Entity.Amenities;

/**
 *
 * @author tienk
 */
public class AmenitesDao {
    public List<Amenities> getAmenities() { 
        return Manager.em.createNamedQuery("Amenities.findAll", Amenities.class).getResultList();
    }
    
    public Amenities getAmenity(String name) { 
        return Manager.em.createNamedQuery("Amenities.findByName", Amenities.class).setParameter("name", name).getSingleResult();
    }
}
