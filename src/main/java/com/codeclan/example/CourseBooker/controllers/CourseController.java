package com.codeclan.example.CourseBooker.controllers;

import com.codeclan.example.CourseBooker.models.Course;
import com.codeclan.example.CourseBooker.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "starRating/{starRating}")
    public List<Course> getCourseByStarRating(@PathVariable int starRating){
        //return courseRepository.getCourseByStarRating(starRating);
        return courseRepository.findByStarRating(starRating);
    }

    @GetMapping(value = "customer/{customerId}")
    public List<Course> getCoursesForCustomer(@PathVariable Long customerId){
        //return courseRepository.getCoursesForCustomer(customerId);
        return courseRepository.findByBookingsCustomerId(customerId);
    }
}
