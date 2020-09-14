package com.udacity.pricing.domain.price;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

@RepositoryRestResource(path = "price")
public interface PriceRepository extends CrudRepository<Price, Long> {

    Price findByVehicleId(@RequestParam long vehicleId);
}
