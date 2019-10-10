package com.codeclan.example.CourseBooker.repositories.BookingRepository;

import com.codeclan.example.CourseBooker.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
