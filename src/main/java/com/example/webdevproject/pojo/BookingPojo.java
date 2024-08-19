
package com.example.webdevproject.pojo;

import com.example.webdevproject.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BookingPojo {
    private User client;
    private User counselor;
    private LocalDateTime appointmentDate;
    private String notes;
}
