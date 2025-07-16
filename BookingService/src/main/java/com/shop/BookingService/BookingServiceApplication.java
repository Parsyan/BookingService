package com.shop.BookingService;

import com.shop.BookingService.db.model.Person;
import com.shop.BookingService.db.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;


@SpringBootApplication
public class BookingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingServiceApplication.class, args);
	}

	@Autowired
	public BookingServiceApplication(PersonRepository personRepository) {
		personRepository.save(Person.builder()
						.id(1L)
						.email("gor")
						.birthdate(LocalDate.of(2000, 12, 20).atStartOfDay())
				.build());
	}
}
