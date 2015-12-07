package com.motorcycles.services;

import com.motorcycles.repositories.MotorcyclesDao;
import com.motorcycles.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InsertMotorcycle {
   @Autowired
   @Qualifier("JPAMotorcycleDao")
    private MotorcyclesDao dao;


    public Map<Integer, String> getAllClassesMotorcycles(){
        Map<Integer, String> resultMap = new HashMap<>();
        for (ClassMotorcycle pair : dao.getAllClassesOfMotorcycles()) {
            resultMap.put(pair.getId(), pair.getName());
        }
        return resultMap;
    }

    public Map<Integer, String> getAllBrandsMotorcycles(){
        Map<Integer, String> resultMap = new HashMap<>();
        for (Brand pair : dao.getAllBrandsMotorcycles()) {
            resultMap.put(pair.getId(), pair.getName());
        }
        return resultMap;
    }

    public Map<Integer, String> getAllMotorTypes(){
        Map<Integer, String> resultMap = new HashMap<>();
        for (MotorType pair : dao.getAllMotorTypes()) {
            resultMap.put(pair.getId(), pair.getName());
        }
        return resultMap;
    }

    public Map<Integer, String> getAllLocationCylindersTypes(){
        Map<Integer, String> resultMap = new HashMap<>();
        for (LocationCylindersType pair : dao.getAllLocationCylindersTypes()) {
            resultMap.put(pair.getId(), pair.getName());
        }
        return resultMap;
    }

    public Map<Integer, String> getAllDriveTypes(){
        Map<Integer, String> resultMap = new HashMap<>();
        for (DriveType pair : dao.getAllDriveTypes()) {
            resultMap.put(pair.getId(), pair.getName());
        }
        return resultMap;
    }

    public Map<Integer, String> getAllCoolingTypes(){
        Map<Integer, String> resultMap = new HashMap<>();
        for (CoolingType pair : dao.getAllCoolingTypes()) {
            resultMap.put(pair.getId(), pair.getName());
        }
        return resultMap;
    }

    public Map<Integer, String> getAllFuelSupplyTypes(){
        Map<Integer, String> resultMap = new HashMap<>();
        for (FuelSupplyType pair : dao.getAllFuelSupplyTypes()) {
            resultMap.put(pair.getId(), pair.getName());
        }
        return resultMap;
    }

    public Map<Integer, String> getAllFrontSuspensionTypes(){
        Map<Integer, String> resultMap = new HashMap<>();
        for (FrontSuspensionType pair : dao.getAllFrontSuspensionTypes()) {
            resultMap.put(pair.getId(), pair.getName());
        }
        return resultMap;
    }

    public Map<Integer, String> getAllBackSuspensionTypes(){
        Map<Integer, String> resultMap = new HashMap<>();
        for (BackSuspensionType pair : dao.getAllBackSuspensionTypes()) {
            resultMap.put(pair.getId(), pair.getName());
        }
        return resultMap;
    }
    





}
