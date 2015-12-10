package com.motorcycles.factories.impls;

import com.motorcycles.entities.*;
import com.motorcycles.factories.interfaces.PartMotorcycle;
import com.motorcycles.factories.enums.PartsMotorcycle;
import com.motorcycles.factories.interfaces.PartMotorcycleFactory;
import org.springframework.stereotype.Component;

@Component
public class PartMotorcycleFactoryImpl implements PartMotorcycleFactory {
    @Override
    public PartMotorcycle getPartMotorcycle(PartsMotorcycle part){
        switch (part){
            case CLASS_MOTORCYCLE: return new ClassMotorcycle();
            case BRAND_MOTORCYCLE: return new Brand();
            case MOTOR_TYPE: return new MotorType();
            case LOCATION_CYLINDERS_TYPE: return new LocationCylindersType();
            case DRIVE_TYPE: return new DriveType();
            case COOLING_TYPE: return new CoolingType();
            case FUEL_SUPPLY_TYPE: return new FuelSupplyType();
            case FRONT_SUSPENSION: return new FrontSuspension();
            case FRONT_SUSPENSION_TYPE: return new FrontSuspensionType();
            case BACK_SUSPENSION: return new BackSuspension();
            case BACK_SUSPENSION_TYPE: return new BackSuspensionType();
            case BRAKE_TYPE: return new BrakeType();
            case FRONT_WHEEL: return new FrontWheel();
            case BACK_WHEEL: return new BackWheel();
        }
        throw new IllegalArgumentException();
    }
}
