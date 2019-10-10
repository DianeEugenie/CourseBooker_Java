package com.codeclan.example.CourseBooker;

import com.codeclan.example.CourseBooker.models.Booking;
import com.codeclan.example.CourseBooker.models.Course;
import com.codeclan.example.CourseBooker.models.Customer;
import com.codeclan.example.CourseBooker.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.CourseBooker.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.CourseBooker.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookerApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

//	@Test
//	public void canSaveCourse(){
//		Course course = new Course("How to catch a pokemon", "Palettown", 2);
//		courseRepository.save(course);
//	}

	@Test
	public void canSaveCustomer(){
		Customer customer = new Customer("Billy", "Cerulian City", 30);
		customerRepository.save(customer);

	}

//	@Test
//	public void canSaveBooking(){
//		Customer customer = new Customer("Billy", "Cerulian City", 30);
//		customerRepository.save(customer);
//
//		Course course = new Course("How to catch a pokemon", "Palettown", 2);
//		courseRepository.save(course);
//
//		Booking booking = new Booking("10-10-19", course, customer);
//		bookingRepository.save(booking);
//
//	}

	@Test
	public void canGetCourseByStarRating(){
		List<Course> foundCourses = courseRepository.getCourseByStarRating(2);
		assertEquals(2, foundCourses.size());
	}

	@Test
	public void canGetAllCustomersForAGivenCourse(){
		List<Customer> foundCustomers = customerRepository.getCustomersByCourseId(1L);
		assertEquals(2, foundCustomers.size());
	}

	@Test
	public void canGetCoursesForAGivenCustomer(){
		List<Course> foundCourses = courseRepository.getCoursesForCustomer(1L);
		assertEquals(2, foundCourses.size());

	}

	@Test
	public void canGetBookingsByDate(){
		List<Booking> foundBookings = bookingRepository.getBookingsByDate("10-10-19");
		assertEquals(2, foundBookings.size());
	}

	@Test
	public void canGetCustomersFromTownForGivenCourse(){
		List<Customer> foundCustomers = customerRepository.getCustomersByTownForCourse("Palettown", 1L);
		assertEquals(1, foundCustomers.size());
	}


}
