package com.example.webdevproject.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FeedbackPojo {
    private String userid;
    private String userEmailAddress;
    private String contactNumber;
    private String feedbackText;
}
