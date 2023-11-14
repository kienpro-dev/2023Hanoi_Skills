/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session4.dao;

import java.util.List;
import session4.entity.Itemtypes;

/**
 *
 * @author tienk
 */
public class ItemTypeDAO {
    public List<Itemtypes> findAll() {
        return Manager.em.createNamedQuery("Itemtypes.findAll", Itemtypes.class).getResultList();
    }
}
