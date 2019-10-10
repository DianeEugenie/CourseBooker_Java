package com.codeclan.example.CourseBooker.repositories.CustomerRepository;

import com.codeclan.example.CourseBooker.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> getCustomersByCourseId(Long courseId);

    List<Customer> getCustomersByTownForCourse(String town, Long courseId);

    List<Customer> getCustomersOverAgeByTownForCourse(int age, String town, Long courseId);
}
