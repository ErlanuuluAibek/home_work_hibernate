package org.example.util;

import org.example.car.Car;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sess() {
        SessionFactory sessionFactory = null;
        try {
            sessionFactory = (SessionFactory) new Configuration().
                    configure("hibernate.cfg.xml").buildSessionFactory();
            return sessionFactory;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }
    public static SessionFactory getSessionFactory(){
        return sess();
    }
}
