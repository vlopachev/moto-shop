package com.motorcycles.repositories.catalogs;

import com.motorcycles.entities.Equipment;
import org.springframework.data.repository.CrudRepository;

public interface EquipmentRepository extends CrudRepository<Equipment,Integer> {
}
