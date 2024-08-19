package com.example.webdevproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="username")
    private String username;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;// Ideally, this should be encrypted

    @Column(name="contact")
    private String contact;

    @Column(name="role")
    private String role; // e.g., "COUNSELOR" or "CLIENT"

    // Getters and Setters
}

