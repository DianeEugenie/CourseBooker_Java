package com.codeclan.example.CourseBooker.repositories.BookingRepository;

import com.codeclan.example.CourseBooker.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {

    List<Booking> getBookingsByDate(String date);
}
