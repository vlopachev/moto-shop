package com.motorcycles.factories.interfaces;

import com.motorcycles.factories.enums.PartsMotorcycle;

public interface PartMotorcycleFactory {
    PartMotorcycle getPartMotorcycle(PartsMotorcycle part);
}
