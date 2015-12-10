package com.motorcycles.services.impls;

import com.motorcycles.entities.Motorcycle;
import com.motorcycles.factories.interfaces.MotorcycleFactory;
import com.motorcycles.services.interfaces.MotorcycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotorcycleServiceImpl implements MotorcycleService {
    @Autowired
    MotorcycleFactory factory;

    public Motorcycle getMotorcycle(){
        return factory.getMotorcycle();
    }
}
