package com.motorcycles.repositories;

import com.motorcycles.entities.ClassMotorcycle;
import org.springframework.data.repository.CrudRepository;

public interface CMRepository extends CrudRepository<ClassMotorcycle, Integer> {
}
