package com.edportal.edportal.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;


@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "user_details")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long userId;
    private String name;
    private String email;
}
