/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session4.dao;

import java.util.List;
import session4.entity.Amenities;

/**
 *
 * @author tienk
 */
public class AmenityDAO {
    public List<Amenities> findAll() {
        return Manager.em.createNamedQuery("Amenities.findAll", Amenities.class).getResultList();
    }
}
