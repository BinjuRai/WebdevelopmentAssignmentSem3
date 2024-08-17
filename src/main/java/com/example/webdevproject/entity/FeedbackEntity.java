package com.example.webdevproject.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name= "feedback")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class FeedbackEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="userid")
    private Integer userId;

    @Column(name="email")
    private String email;

    @Column(name="feedbackText")
    private String feedbackText;

    @Column(name="contactNUmber")
    private Integer contactNumber;

}
