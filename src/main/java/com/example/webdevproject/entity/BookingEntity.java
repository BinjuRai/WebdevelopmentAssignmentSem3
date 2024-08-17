package com.example.webdevproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "booking")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class BookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="userid")
    private Integer userid;

    @Column(name="emailAddress")
    private String emailAddress;

    @Column(name="password")
    private String password;

    @Column(name="fullName")
    private String fullName;

    @Column(name="contactNumber")
    private String contactNumber;

    @Column(name="age")
    private String age;

    @Column(name="address")
    private String address;

    @Column(name="scheduleTime")
    private Date scheduleTime;

    @Column(name="scheduleDate")
    private Date scheduleDate;

}
