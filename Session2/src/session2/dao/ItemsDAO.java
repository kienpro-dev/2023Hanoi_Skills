/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session2.dao;

import java.util.List;
import session2.entity.Items;

/**
 *
 * @author tienk
 */
public class ItemsDAO {
    public Items getById(Long id) {
        return Manager.em.createNamedQuery("Items.findById", Items.class).setParameter("id", id).getSingleResult();
    }
}
