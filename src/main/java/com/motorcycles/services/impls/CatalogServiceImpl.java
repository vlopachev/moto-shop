package com.motorcycles.services.impls;

import com.motorcycles.entities.*;
import com.motorcycles.repositories.*;
import com.motorcycles.services.interfaces.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CatalogServiceImpl implements CatalogService {
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
    FrontSuspensionRepository frontSuspensionRepository;
    @Autowired
    FrontSuspensionTypeRepository frontSuspensionTypeRepository;
    @Autowired
    BackSuspensionRepository backSuspensionRepository;
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
    public Map<String, Map<Integer,String>> getAllCatalogs(){
        Map<String, Map<Integer,String>> result = new HashMap<>();
        result.put("classesMotorcycles", getAllClassesMotorcycles());
        result.put("brandsMotorcycles", getAllBrandsMotorcycles());
        result.put("motorTypes", getAllMotorTypes());
        result.put("locationCylindersTypes", getAllLocationCylindersTypes());
        result.put("driveTypes", getAllDriveTypes());
        result.put("coolingTypes", getAllCoolingTypes());
        result.put("fuelSupplyTypes", getAllFuelSupplyTypes());
        result.put("frontSuspensionTypes", getAllFrontSuspensionTypes());
        result.put("backSuspensionTypes", getAllBackSuspensionTypes());
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

    public ClassMotorcycleRepository getClassMotorcycleRepository() {
        return classMotorcycleRepository;
    }

    public BrandRepository getBrandRepository() {
        return brandRepository;
    }

    public MotorTypeRepository getMotorTypeRepository() {
        return motorTypeRepository;
    }

    public LocationCylindersTypeRepository getLocationCylindersTypeRepository() {
        return locationCylindersTypeRepository;
    }

    public DriveTypeRepository getDriveTypeRepository() {
        return driveTypeRepository;
    }

    public CoolingTypeRepository getCoolingTypeRepository() {
        return coolingTypeRepository;
    }

    public FuelSupplyTypeRepository getFuelSupplyTypeRepository() {
        return fuelSupplyTypeRepository;
    }

    public FrontSuspensionRepository getFrontSuspensionRepository() {
        return frontSuspensionRepository;
    }

    public FrontSuspensionTypeRepository getFrontSuspensionTypeRepository() {
        return frontSuspensionTypeRepository;
    }

    public BackSuspensionRepository getBackSuspensionRepository() {
        return backSuspensionRepository;
    }

    public BackSuspensionTypeRepository getBackSuspensionTypeRepository() {
        return backSuspensionTypeRepository;
    }

    public BrakeTypeRepository getBrakeTypeRepository() {
        return brakeTypeRepository;
    }

    public FrontWheelRepository getFrontWheelRepository() {
        return frontWheelRepository;
    }

    public BackWheelRepository getBackWheelRepository() {
        return backWheelRepository;
    }

    public EquipmentRepository getEquipmentRepository() {
        return equipmentRepository;
    }

    public PicturesRepository getPicturesRepository() {
        return picturesRepository;
    }
}
