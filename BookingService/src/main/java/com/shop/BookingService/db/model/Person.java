package com.shop.BookingService.db.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

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

    @DateTimeFormat(pattern = "yyyy:mm:dd")
    private Date birthdate;

    private String password;

    @CreatedDate
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate created_date;

    @OneToMany(mappedBy = "person")
    private List<Reservation> reservations;
}
