package com.motorcycles.repositories;

import com.motorcycles.entities.Equipment;
import org.springframework.data.repository.CrudRepository;

public interface EquipmentRepository extends CrudRepository<Equipment,Integer> {
}
