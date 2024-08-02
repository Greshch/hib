package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.OrderDao;
import mate.academy.dao.UserDao;
import mate.academy.model.Movie;
import mate.academy.model.Order;
import mate.academy.model.User;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = User.builder()
                .login("Bob")
                .password("1234")
                .build();
        userDao.save(user);
//        userDao.get(1L).ifPresent(System.out::println);

        OrderDao orderDao = new OrderDao();
        Order order = Order.builder()
                .orderDate(LocalDate.now())
                .owner(user)
                .build();
        orderDao.save(order);
        orderDao.get(1L).ifPresent(System.out::println);
    }
}
