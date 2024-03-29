package com.codeclan.example.CourseBooker.repositories.BookingRepository;

import com.codeclan.example.CourseBooker.models.Booking;
import com.codeclan.example.CourseBooker.projections.EmbedCourseAndCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedCourseAndCustomer.class)
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {

    List<Booking> findByDate(String date);
}
