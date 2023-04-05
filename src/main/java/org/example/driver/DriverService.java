package org.example.driver;

import org.example.car.Car;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

public class DriverService {
    public static void saveDriver(Driver driver){
        Session session= HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(driver);
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully created driver");
    }
}
