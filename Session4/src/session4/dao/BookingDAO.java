/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session4.dao;

import java.util.List;
import session4.entity.Bookings;

/**
 *
 * @author tienk
 */
public class BookingDAO {
    public List<Bookings> findBookingsCustom(Long itemId) {
        return Manager.em.createNamedQuery("Bookings.findCustom", Bookings.class).setParameter("itemId", itemId).getResultList();
    }
}
