/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.util;

/**
 *
 * @author gosavpus
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

 public static void main(String [] args)
    {

    Configuration configuration= new Configuration().configure("hibernate.cfg.xml");
	SessionFactory sessionFactory = configuration.buildSessionFactory();
	Session session = sessionFactory.openSession();

        session.getTransaction().begin();
        System.out.print("ready to go..... cfg loaded");

       
        session.getTransaction().commit();
        session.close();
    }
	

      //  tx.commit();
}
