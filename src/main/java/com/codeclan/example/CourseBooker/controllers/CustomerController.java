package com.codeclan.example.CourseBooker.controllers;

import com.codeclan.example.CourseBooker.models.Customer;
import com.codeclan.example.CourseBooker.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "course/{courseId}")
    public List<Customer> getCustomersByCourse(@PathVariable Long courseId){
        return customerRepository.getCustomersByCourseId(courseId);
    }


}
