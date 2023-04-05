package org.example.instructor;

import org.example.car.Car;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

public class InstructorService {
    public static void saveInstructor(Instructor instructor){
        Session session= HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(instructor);
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully created instructor");
    }
}
