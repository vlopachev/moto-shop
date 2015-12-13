package com.motorcycles.services.impls;

import com.motorcycles.entities.Motorcycle;
import com.motorcycles.repositories.MotorcyclesRepository;
import com.motorcycles.services.interfaces.MotorcycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotorcycleServiceImpl implements MotorcycleService {
    @Autowired
    MotorcyclesRepository motorcyclesRepository;

    @Override
    public Motorcycle createMotorcycle() {
        return null;
    }

    @Override
    public void saveMotorcycle(Motorcycle motorcycle) {
        motorcyclesRepository.save(motorcycle);
    }
}
