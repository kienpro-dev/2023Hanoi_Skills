/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session4.dao;

import java.util.List;
import session4.entity.Attractions;

/**
 *
 * @author tienk
 */
public class AttractionDAO {

    public List<Attractions> findAll() {
        return Manager.em.createNamedQuery("Attractions.findAll", Attractions.class).getResultList();
    }
}
