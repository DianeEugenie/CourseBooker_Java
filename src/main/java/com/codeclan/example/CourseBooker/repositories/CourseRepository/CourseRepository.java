package com.codeclan.example.CourseBooker.repositories.CourseRepository;

import com.codeclan.example.CourseBooker.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    List<Course> findByStarRating(int starRating);
    List<Course> findByBookingsCustomerId(Long customerId);
}
