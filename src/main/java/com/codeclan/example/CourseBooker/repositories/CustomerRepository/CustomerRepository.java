package com.codeclan.example.CourseBooker.repositories.CustomerRepository;

import com.codeclan.example.CourseBooker.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
