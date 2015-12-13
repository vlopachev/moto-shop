package com.motorcycles.repositories;

import com.motorcycles.entities.MotorType;
import org.springframework.data.repository.CrudRepository;

public interface MotorTypeRepository extends CrudRepository<MotorType,Integer> {
}
