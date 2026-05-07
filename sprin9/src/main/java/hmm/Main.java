package hmm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.old.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        session.beginTransaction();

        User user = new User();
        user.setName("Ivan");
        user.setAge(25);

        session.persist(user);

        session.getTransaction().commit();

        session.close();
        factory.close();
    }
}