package com.example.webdevproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Therapist")
@AllArgsConstructor
@NoArgsConstructor

public class TherapistEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="therapist_id")
    private Integer userid;

    @Column(name="name")
    private String name;




}
