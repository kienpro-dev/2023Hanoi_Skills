/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session4.dao;

import java.util.List;
import session4.entity.Itemscores;

/**
 *
 * @author tienk
 */
public class ScoreDAO {
    public List<Itemscores> findById(Long id) {
        return Manager.em.createNamedQuery("Itemscores.findCustom", Itemscores.class).setParameter("id", id).getResultList();
    }
}
