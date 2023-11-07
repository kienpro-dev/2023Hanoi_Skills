/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session2.dao;

import java.util.List;
import session2.entity.Itemprices;
import session2.entity.Items;

/**
 *
 * @author tienk
 */
public class ItemPriceDAO {
    public List<Itemprices> findListing() {
        return Manager.em.createNamedQuery("Itemprices.findListing", Itemprices.class).getResultList();
    }
}
