package com.example.webdevproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@Table(name="user")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user")
    @SequenceGenerator(name = "user_seq_gen",sequenceName = "user_seq",allocationSize = 1,initialValue = 100)

    @Column(name="user_id")
    private Integer userid;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="email", nullable = false)
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="contactNumber", nullable = false)
    private String contactNumber;

}


