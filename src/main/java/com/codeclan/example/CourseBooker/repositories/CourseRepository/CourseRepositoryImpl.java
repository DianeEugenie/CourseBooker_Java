package com.codeclan.example.CourseBooker.repositories.CourseRepository;

import com.codeclan.example.CourseBooker.models.Course;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Course> getCourseByStarRating(int starRating) {
        List<Course> courses = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Course.class);
            cr.add(Restrictions.eq("starRating", starRating));
            courses = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return courses;
    }
}
