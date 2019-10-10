package com.codeclan.example.CourseBooker.projections;

import com.codeclan.example.CourseBooker.models.Booking;
import com.codeclan.example.CourseBooker.models.Course;
import com.codeclan.example.CourseBooker.models.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedCourseAndCustomer", types = Booking.class)
public interface EmbedCourseAndCustomer {

    Long getId();
    String getDate();
    Course getCourse();
    Customer getCustomer();

}
