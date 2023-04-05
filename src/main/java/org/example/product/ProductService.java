package org.example.product;

import org.example.car.Car;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

public class ProductService {
    public static void saveProduct(Product product){
        Session session= HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(product);
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully created car");
    }
}
