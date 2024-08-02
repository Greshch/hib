package mate.academy.dao;

import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.Optional;

public class MovieDao implements Dao<Movie> {
    @Override
    public Movie save(Movie obj) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Long id = (Long) session.save(obj);
        obj.setId(id);
        session.save(obj);
        return obj;
    }

    @Override
    public Optional<Movie> get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Optional<Movie> movie = Optional.ofNullable(session.get(Movie.class, id));
        session.close();
        return movie;
    }
}
