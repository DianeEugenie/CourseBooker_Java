package com.codeclan.example.CourseBooker.repositories.CustomerRepository;

import com.codeclan.example.CourseBooker.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {

    List<Customer> findByBookingsCourseId(Long courseId);
    List<Customer> findByTownIgnoreCaseAndBookingsCourseId(String town, Long courseId);
    List<Customer> findByAgeGreaterThanAndTownIgnoreCaseAndBookingsCourseId(int age, String town, Long courseId);
}
