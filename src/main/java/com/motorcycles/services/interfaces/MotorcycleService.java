package com.motorcycles.services.interfaces;

import com.motorcycles.entities.*;

public interface MotorcycleService {
    Iterable<Motorcycle> getAllMotorcycles();
    Iterable<ClassMotorcycle> getAllClassesMotorcycles();
    Iterable<Brand> getAllBrandsMotorcycles();
    Iterable<MotorType> getAllMotorTypes();
    Iterable<LocationCylindersType> getAllLocationCylindersTypes();
    Iterable<DriveType> getAllDriveTypes();
    Iterable<CoolingType> getAllCoolingTypes();
    Iterable<FuelSupplyType> getAllFuelSupplyTypes();
    Iterable<FrontSuspensionType> getAllFrontSuspensionTypes();
    Iterable<BackSuspensionType> getAllBackSuspensionTypes();


    void save(Motorcycle motorcycle);
    void save(ClassMotorcycle classMotorcycle);
    void save(Brand brand);
    void save(MotorType motorType);
    void save(LocationCylindersType locationCylindersType);
    void save(DriveType driveType);
    void save(CoolingType coolingType);
    void save(FuelSupplyType fuelSupplyType);
    void save(FrontSuspensionType frontSuspensionType);
    void save(BackSuspensionType backSuspensionType);
}