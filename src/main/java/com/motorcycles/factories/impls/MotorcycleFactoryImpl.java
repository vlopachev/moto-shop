package com.motorcycles.factories.impls;

import com.motorcycles.entities.Motorcycle;
import com.motorcycles.factories.interfaces.MotorcycleFactory;
import org.springframework.stereotype.Component;

@Component
public class MotorcycleFactoryImpl implements MotorcycleFactory {

    @Override
    public Motorcycle getMotorcycle() {
        return new Motorcycle();
    }
}
