package com.motorcycles.repositories.catalogs;

import com.motorcycles.entities.Motorcycle;
import org.springframework.data.repository.CrudRepository;

public interface MotorcyclesRepository extends CrudRepository<Motorcycle, Integer> {
}
