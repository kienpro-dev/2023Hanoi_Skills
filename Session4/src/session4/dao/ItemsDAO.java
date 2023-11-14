/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session4.dao;

import java.util.List;
import session4.entity.Items;

/**
 *
 * @author tienk
 */
public class ItemsDAO {
    public List<Items> findItemsCustom(int capacity, int night, String keyword) {
        return Manager.em.createNamedQuery("Items.findCustom", Items.class).setParameter("capacity", capacity).setParameter("night", night).setParameter("keyword", "%" + keyword + "%").getResultList();
    }
    
    public List<Items> findItemsCustom2(int capacity, int night, String title, String areaName, String itemType, String attractionName, String amenity) {
        return Manager.em.createNamedQuery("Items.findCustom2", Items.class).setParameter("capacity", capacity).setParameter("night", night).setParameter("title", title).setParameter("areaName", areaName).setParameter("itemType", itemType).setParameter("attractionName", attractionName).setParameter("amenity", "%" + amenity + "%").getResultList();
    }
    
    public List<Items> findAll() {
        return Manager.em.createNamedQuery("Items.findAll", Items.class).getResultList();
    }
}
