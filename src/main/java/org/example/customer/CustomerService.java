package org.example.customer;

import org.example.car.Car;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

public class CustomerService {
    public static void saveCustomer(Customer customer){
        Session session= HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(customer);
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully created customer");
    }
}
