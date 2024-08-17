package com.example.webdevproject.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BookingPojo {
    private String userid;
    private String userEmailAddress;
    private String password;
    private String contactNumber;
    private String age;
    private String address;
    private Date scheduleDate;
    private Date scheduleTime;

}
