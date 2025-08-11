package com.shop.BookingService.db.model;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private int price;

    private boolean reserved;

    private String work_time;

    @CreatedDate
    private LocalDateTime created_date;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
}
