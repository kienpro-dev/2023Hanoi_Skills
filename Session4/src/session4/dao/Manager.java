/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session4.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tienk
 */
public class Manager {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Session4PU");
    public static EntityManager em = emf.createEntityManager();
}
