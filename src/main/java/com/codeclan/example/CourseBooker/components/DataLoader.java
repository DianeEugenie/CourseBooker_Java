package com.codeclan.example.CourseBooker.components;

import com.codeclan.example.CourseBooker.models.Booking;
import com.codeclan.example.CourseBooker.models.Course;
import com.codeclan.example.CourseBooker.models.Customer;
import com.codeclan.example.CourseBooker.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.CourseBooker.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.CourseBooker.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Customer billy = new Customer("Billy", "Cerulian City", 30);
        customerRepository.save(billy);

        Customer gillian = new Customer("Gillian", "Cerulian City", 30);
        customerRepository.save(gillian);


        Course course = new Course("How to catch a pokemon", "Palettown", 2);
        courseRepository.save(course);

        Course course2 = new Course("How to feed a pokemon", "Palettown", 3);
        courseRepository.save(course2);

        Course course3 = new Course("How to train a pokemon", "Palettown", 2);
        courseRepository.save(course3);



        Booking bookingBilly = new Booking("10-10-19", course, billy);
        bookingRepository.save(bookingBilly);

        Booking bookingBilly2 = new Booking("08-10-19", course3, billy);
        bookingRepository.save(bookingBilly2);

        Booking bookingGillian = new Booking("10-10-19", course, gillian);
        bookingRepository.save(bookingGillian);

        Booking bookingGillian2 = new Booking("09-10-19", course2, gillian);
        bookingRepository.save(bookingGillian2);


    }
}
