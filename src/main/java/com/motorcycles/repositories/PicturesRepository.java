package com.motorcycles.repositories;

import com.motorcycles.entities.Picture;
import org.springframework.data.repository.CrudRepository;

public interface PicturesRepository extends CrudRepository<Picture,Integer> {
}
