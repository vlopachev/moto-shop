package com.motorcycles.services.interfaces;

import com.motorcycles.entities.Motorcycle;

public interface MotorcycleService {
    Motorcycle createMotorcycle();
    void saveMotorcycle(Motorcycle motorcycle);
}
