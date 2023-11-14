/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session4.dao;

import java.util.List;
import session4.entity.Areas;

/**
 *
 * @author tienk
 */
public class AreaDAO {

    public List<Areas> findAll() {
        return Manager.em.createNamedQuery("Areas.findAll", Areas.class).getResultList();
    }
}
