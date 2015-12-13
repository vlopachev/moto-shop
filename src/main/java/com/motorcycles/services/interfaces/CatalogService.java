package com.motorcycles.services.interfaces;

import java.util.Map;

public interface CatalogService {
    Map<Integer, String> getAllClassesMotorcycles();
    Map<Integer, String> getAllBrandsMotorcycles();
    Map<Integer, String> getAllMotorTypes();
    Map<Integer, String> getAllLocationCylindersTypes();
    Map<Integer, String> getAllDriveTypes();
    Map<Integer, String> getAllCoolingTypes();
    Map<Integer, String> getAllFuelSupplyTypes();
    Map<Integer, String> getAllFrontSuspensionTypes();
    Map<Integer, String> getAllBackSuspensionTypes();
    Map<String, Map<Integer,String>> getAllCatalogs();
}