package com.shop.BookingService;

import com.shop.BookingService.db.model.*;
import com.shop.BookingService.db.repository.CompanyRepository;
import com.shop.BookingService.db.repository.PersonRepository;
import com.shop.BookingService.db.repository.ReservationRepository;
import com.shop.BookingService.db.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;



@SpringBootApplication
public class BookingServiceApplication {

	private final PersonRepository personRepository;
	private final CompanyRepository companyRepository;
	private final ServiceRepository serviceRepository;
	private final ReservationRepository reservationRepository;


	public static void main(String[] args) {
		SpringApplication.run(BookingServiceApplication.class, args);
	}

	@Autowired
	public BookingServiceApplication(PersonRepository personRepository, CompanyRepository companyRepository, ServiceRepository serviceRepository, ReservationRepository reservationRepository) {
		this.personRepository = personRepository;
        this.companyRepository = companyRepository;
        this.serviceRepository = serviceRepository;
        this.reservationRepository = reservationRepository;

        this.personRepository.save(
				Person.builder()
						.email("gor")
						.birthdate(Date.valueOf("2024-12-10"))
						.country(Country.Armenia)
//						.created_date(LocalDate.now())
						.first_name("Gor")
						.last_name("Parsyan")
						.gender("male")
						.phone_number("")
						.password("12345678")
				.build()
		);

		this.companyRepository.save(
				Company.builder()
						.name("Shop")
						.about(" Shop for shopping. ")
						.workTime("09:00--22:00")
						.build()
		);

		this.serviceRepository.save(
				Service.builder()
						.name("Room")
						.price(1000)
						.reserved(false)
						.work_time("09:00--22:00")
						.company(companyRepository.findByName("Shop"))
						.build()
		);

		this.reservationRepository.save(
				Reservation.builder()
						.person(personRepository.findByEmail("gor"))
						.service(serviceRepository.findByName("Room"))
						.build()
		);
	}
}
