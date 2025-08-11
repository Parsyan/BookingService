package com.shop.BookingService.db.repository;

import com.shop.BookingService.db.model.Service;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface ServiceRepository extends CrudRepository<Service, Long> {
    Service findByName(String name);
}
