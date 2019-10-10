package com.codeclan.example.CourseBooker.repositories.BookingRepository;

import com.codeclan.example.CourseBooker.models.Booking;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class BookingRepositoryImpl implements BookingRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Booking> getBookingsByDate(String date) {
        List<Booking> bookings = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Booking.class);
            cr.add(Restrictions.eq("date", date));
            bookings = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        }

        return bookings;
    }
}
