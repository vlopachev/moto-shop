package com.motorcycles.services.impls;

import com.motorcycles.entities.*;
import com.motorcycles.repositories.*;
import com.motorcycles.services.interfaces.MotorcycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public List<Motorcycle> getAllMotorcycles() {
        List<Motorcycle> result = new ArrayList<>();
        for (Motorcycle motorcycle : motorcyclesRepository.findAll()) {
            result.add(motorcycle);
        }
        return result;
    }

    @Override
    public Map<Integer, String> getAllClassesMotorcycles(){
        Map<Integer, String> resultMap = new HashMap<>();
        for (ClassMotorcycle pair : classMotorcycleRepository.findAll()) {
            resultMap.put(pair.getId(), pair.getName());
        }
        return resultMap;
    }

    @Override
    public Map<Integer, String> getAllBrandsMotorcycles(){
        Map<Integer, String> resultMap = new HashMap<>();
        for (Brand pair : brandRepository.findAll()) {
            resultMap.put(pair.getId(), pair.getName());
        }
        return resultMap;
    }

    @Override
    public Map<Integer, String> getAllMotorTypes(){
        Map<Integer, String> resultMap = new HashMap<>();
        for (MotorType pair : motorTypeRepository.findAll()) {
            resultMap.put(pair.getId(), pair.getName());
        }
        return resultMap;
    }

    @Override
    public Map<Integer, String> getAllLocationCylindersTypes(){
        Map<Integer, String> resultMap = new HashMap<>();
        for (LocationCylindersType pair : locationCylindersTypeRepository.findAll()) {
            resultMap.put(pair.getId(), pair.getName());
        }
        return resultMap;
    }

    @Override
    public Map<Integer, String> getAllDriveTypes(){
        Map<Integer, String> resultMap = new HashMap<>();
        for (DriveType pair : driveTypeRepository.findAll()) {
            resultMap.put(pair.getId(), pair.getName());
        }
        return resultMap;
    }

    @Override
    public Map<Integer, String> getAllCoolingTypes(){
        Map<Integer, String> resultMap = new HashMap<>();
        for (CoolingType pair : coolingTypeRepository.findAll()) {
            resultMap.put(pair.getId(), pair.getName());
        }
        return resultMap;
    }

    @Override
    public Map<Integer, String> getAllFuelSupplyTypes(){
        Map<Integer, String> resultMap = new HashMap<>();
        for (FuelSupplyType pair : fuelSupplyTypeRepository.findAll()) {
            resultMap.put(pair.getId(), pair.getName());
        }
        return resultMap;
    }

    @Override
    public Map<Integer, String> getAllFrontSuspensionTypes(){
        Map<Integer, String> resultMap = new HashMap<>();
        for (FrontSuspensionType pair : frontSuspensionTypeRepository.findAll()) {
            resultMap.put(pair.getId(), pair.getName());
        }
        return resultMap;
    }

    @Override
    public Map<Integer, String> getAllBackSuspensionTypes(){
        Map<Integer, String> resultMap = new HashMap<>();
        for (BackSuspensionType pair : backSuspensionTypeRepository.findAll()) {
            resultMap.put(pair.getId(), pair.getName());
        }
        return resultMap;
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
}
