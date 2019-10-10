package com.codeclan.example.CourseBooker;

import com.codeclan.example.CourseBooker.models.Course;
import com.codeclan.example.CourseBooker.repositories.CourseRepository.CourseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookerApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired


	@Test
	public void contextLoads() {
	}

	@Test
	public void canSaveCourse(){
		Course course = new Course("How to catch a pokemon", "Palettown", 2);
		courseRepository.save(course);
	}

	@Test
	public void canSaveCustomer(){
		Customer customer = new Customer("Billy", "Cerulian City", 30);
		customerRepository.save(customers);

	}

	@Test
	public void canSaveBooking(){

	}

}
