package com.motorcycles.repositories;

import com.motorcycles.entities.Brand;
import org.springframework.data.repository.CrudRepository;

public interface BrandRepository extends CrudRepository<Brand,Integer> {
}
