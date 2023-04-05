package org.example.manager;

import org.example.car.Car;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

public class ManagerService {
    public static void saveManager(Manager manager){
        Session session= HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(manager);
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully created manager");
    }
}
