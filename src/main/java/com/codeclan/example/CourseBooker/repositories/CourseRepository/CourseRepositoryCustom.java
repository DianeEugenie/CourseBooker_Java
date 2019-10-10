package com.codeclan.example.CourseBooker.repositories.CourseRepository;

import com.codeclan.example.CourseBooker.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> getCourseByStarRating(int starRating);

    List<Course> getCoursesForCustomer(long customerId);
}
