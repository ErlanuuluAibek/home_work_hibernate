package org.example.car;

import org.example.util.HibernateUtil;
import org.hibernate.Session;

public class CarService {
    public static void saveCar(Car car){
        Session session= HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(car);
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully created car");
    }

}
