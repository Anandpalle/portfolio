package com.anandreddy.portfolio.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "profile")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String headline;
    private String summary;
    private String location;
}
