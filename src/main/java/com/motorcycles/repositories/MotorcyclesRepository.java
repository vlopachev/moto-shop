package com.motorcycles.repositories;

import com.motorcycles.entities.Motorcycle;
import org.springframework.data.repository.CrudRepository;

public interface MotorcyclesRepository extends CrudRepository<Motorcycle, Integer> {
}
