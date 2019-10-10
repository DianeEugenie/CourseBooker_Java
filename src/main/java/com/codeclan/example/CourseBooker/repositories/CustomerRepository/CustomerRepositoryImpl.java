package com.codeclan.example.CourseBooker.repositories.CustomerRepository;

import com.codeclan.example.CourseBooker.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> getCustomersByCourseId(Long courseId) {
        List<Customer> customers = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias ("bookings", "booking");
            cr.createAlias("booking.course", "courseAlias");
            cr.add(Restrictions.eq("courseAlias.id", courseId));
            customers = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return customers;
    }

    @Transactional
    public List<Customer> getCustomersByTownForCourse(String town, Long courseId) {
        List<Customer> customers = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "booking");
            cr.createAlias("booking.course", "courseAlias");
            cr.add(Restrictions.eq("town", town));
            cr.add(Restrictions.eq("courseAlias.id", courseId));

            customers = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        }

        return customers;

    }
}
