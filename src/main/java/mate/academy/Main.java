package mate.academy;

import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(
                Movie
                        .builder()
                        .title("Terminator 5")
                        .description("Awesome movie")
                        .build()
        );
        transaction.commit();
        session.close();
    }
}
