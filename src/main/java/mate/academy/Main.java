package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MovieDao movieDao = new MovieDao();
//        movieDao.save(Movie
//                .builder()
//                        .title("Lord of the Rings")
//                        .description("Tolkien's story.")
//                .build());
        movieDao.get(1L).ifPresent(System.out::println);
    }
}
