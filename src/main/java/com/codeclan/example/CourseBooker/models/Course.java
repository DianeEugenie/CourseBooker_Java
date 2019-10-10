package com.codeclan.example.CourseBooker.models;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "town")
    private String town;

    @Column(name = "star_rating")
    private int starRating;

//    @JsonIgnoreProperties("course")
//    @ManyToOne
//    @JoinColumn(name = "course_id", nullable = false)
//    private List<Booking> bookings;


    public Course() {
    }

    public Course(String name, String town, int starRating) {
        this.name = name;
        this.town = town;
        this.starRating = starRating;
        //this.bookings = new ArrayList<Booking>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

//    public List<Booking> getBookings() {
//        return bookings;
//    }
//
//    public void setBookings(List<Booking> bookings) {
//        this.bookings = bookings;
//    }
}