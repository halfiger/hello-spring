package org.entity.practice1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        User user = new User("Ira", "ira@mail", 39);

        try {
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } finally {
            //session.close();
            factory.close();
        }
    }
}
