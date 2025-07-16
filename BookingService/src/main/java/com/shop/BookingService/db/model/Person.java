package com.shop.BookingService.db.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;


import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String first_name;

    private String last_name;

    private String email;

    private String phone_number;

    private String gender;

    @Enumerated(value = EnumType.STRING)
    private Country country;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDateTime birthdate;

    private String password;

    @CreatedDate
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private String created_date;
}
