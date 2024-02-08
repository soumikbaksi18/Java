package com.edportal.edportal.entity;


import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "courses")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long courseId;
    private String course_name;
    private String course_details;

}
