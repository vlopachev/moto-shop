package com.motorcycles.services.interfaces;

import com.motorcycles.entities.*;

import java.util.List;
import java.util.Map;

public interface MotorcycleService {
    List<Motorcycle> getAllMotorcycles();
    Map<Integer,String> getAllClassesMotorcycles();
    Map<Integer,String> getAllBrandsMotorcycles();
    Map<Integer,String> getAllMotorTypes();
    Map<Integer,String> getAllLocationCylindersTypes();
    Map<Integer,String> getAllDriveTypes();
    Map<Integer,String> getAllCoolingTypes();
    Map<Integer,String> getAllFuelSupplyTypes();
    Map<Integer,String> getAllFrontSuspensionTypes();
    Map<Integer,String> getAllBackSuspensionTypes();


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

    void deleteMotorcycle (Integer Id);
}