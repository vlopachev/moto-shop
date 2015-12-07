package com.motorcycles.repositories;

import com.motorcycles.entities.*;

import java.util.List;


public interface MotorcyclesDao {

    void addMotorcycle(Motorcycle motorcycle);

    List<ClassMotorcycle> getAllClassesOfMotorcycles();
    void addClassMotorcycle(ClassMotorcycle classMotorcycle);

    List<Brand> getAllBrandsMotorcycles();
    void addBrand(Brand brand);

    List<MotorType> getAllMotorTypes();
    void addMotorType(MotorType motorType);

    List<LocationCylindersType> getAllLocationCylindersTypes();
    void addLocationCylindersType(LocationCylindersType locationCylindersType);

    List<DriveType> getAllDriveTypes();
    void addDriveType(DriveType driveType);

    List<CoolingType> getAllCoolingTypes();
    void addCoolingType(CoolingType coolingType);

    List<FuelSupplyType> getAllFuelSupplyTypes();
    void addFuelSupplyType(FuelSupplyType fuelSupplyType);

    List<FrontSuspensionType> getAllFrontSuspensionTypes();
    void addFrontSuspensionType(FrontSuspensionType frontSuspensionType);

    List<BackSuspensionType> getAllBackSuspensionTypes();
    void addBackSuspensionType(BackSuspensionType backSuspensionType);
}
