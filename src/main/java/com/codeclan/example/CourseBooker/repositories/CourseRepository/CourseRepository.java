package com.codeclan.example.CourseBooker.repositories.CourseRepository;

import com.codeclan.example.CourseBooker.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
