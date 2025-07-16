package com.shop.BookingService.db.repository;

import com.shop.BookingService.db.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface PersonRepository extends CrudRepository<Person, Long> {
}
