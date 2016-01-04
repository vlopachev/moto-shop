package com.motorcycles.services.impls;

import com.motorcycles.entities.*;
import com.motorcycles.repositories.*;
import com.motorcycles.services.interfaces.MotorcycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotorcycleServiceImpl implements MotorcycleService {
    @Autowired
    MotorcyclesRepository motorcyclesRepository;
    @Autowired
    ClassMotorcycleRepository classMotorcycleRepository;
    @Autowired
    BrandRepository brandRepository;
    @Autowired
    MotorTypeRepository motorTypeRepository;
    @Autowired
    LocationCylindersTypeRepository locationCylindersTypeRepository;
    @Autowired
    DriveTypeRepository driveTypeRepository;
    @Autowired
    CoolingTypeRepository coolingTypeRepository;
    @Autowired
    FuelSupplyTypeRepository fuelSupplyTypeRepository;
    @Autowired
    FrontSuspensionTypeRepository frontSuspensionTypeRepository;
    @Autowired
    BackSuspensionTypeRepository backSuspensionTypeRepository;
    @Autowired
    BrakeTypeRepository brakeTypeRepository;
    @Autowired
    FrontWheelRepository frontWheelRepository;
    @Autowired
    BackWheelRepository backWheelRepository;
    @Autowired
    EquipmentRepository equipmentRepository;
    @Autowired
    PicturesRepository picturesRepository;

    @Override
    public Iterable<Motorcycle> getAllMotorcycles() {
        return motorcyclesRepository.findAll();
    }

    @Override
    public void save(Motorcycle motorcycle) {
        motorcyclesRepository.save(motorcycle);
    }

    @Override
    public void save(ClassMotorcycle classMotorcycle) {
        classMotorcycleRepository.save(classMotorcycle);
    }

    @Override
    public void save(Brand brand) {
        brandRepository.save(brand);
    }

    @Override
    public void save(MotorType motorType) {
        motorTypeRepository.save(motorType);
    }

    @Override
    public void save(LocationCylindersType locationCylindersType) {
        locationCylindersTypeRepository.save(locationCylindersType);
    }

    @Override
    public void save(DriveType driveType) {
        driveTypeRepository.save(driveType);
    }

    @Override
    public void save(CoolingType coolingType) {
        coolingTypeRepository.save(coolingType);
    }

    @Override
    public void save(FuelSupplyType fuelSupplyType) {
        fuelSupplyTypeRepository.save(fuelSupplyType);
    }

    @Override
    public void save(FrontSuspensionType frontSuspensionType) {
        frontSuspensionTypeRepository.save(frontSuspensionType);
    }

    @Override
    public void save(BackSuspensionType backSuspensionType) {
        backSuspensionTypeRepository.save(backSuspensionType);
    }

    @Override
    public Iterable<ClassMotorcycle> getAllClassesMotorcycles(){
        return classMotorcycleRepository.findAll();
    }

    @Override
    public Iterable<Brand> getAllBrandsMotorcycles(){
        return brandRepository.findAll();
    }

    @Override
    public Iterable<MotorType> getAllMotorTypes(){
        return motorTypeRepository.findAll();
    }

    @Override
    public Iterable<LocationCylindersType> getAllLocationCylindersTypes(){
        return locationCylindersTypeRepository.findAll();
    }

    @Override
    public Iterable<DriveType> getAllDriveTypes(){
        return driveTypeRepository.findAll();
    }

    @Override
    public Iterable<CoolingType> getAllCoolingTypes(){
        return coolingTypeRepository.findAll();
    }

    @Override
    public Iterable<FuelSupplyType> getAllFuelSupplyTypes(){
        return fuelSupplyTypeRepository.findAll();
    }

    @Override
    public Iterable<FrontSuspensionType> getAllFrontSuspensionTypes(){
        return frontSuspensionTypeRepository.findAll();
    }

    @Override
    public Iterable<BackSuspensionType> getAllBackSuspensionTypes(){
        return backSuspensionTypeRepository.findAll();
    }


}
