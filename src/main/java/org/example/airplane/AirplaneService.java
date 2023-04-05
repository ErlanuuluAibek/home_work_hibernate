package org.example.airplane;

import org.example.car.Car;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

public class AirplaneService {
    public static void saveAirplane(Airplane airplane){
        Session session= HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(airplane);
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully created airplane");
    }
}
