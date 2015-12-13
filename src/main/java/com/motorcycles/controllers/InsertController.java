package com.motorcycles.controllers;

import com.motorcycles.entities.*;
import com.motorcycles.services.impls.CatalogServiceImpl;
import com.motorcycles.services.interfaces.MotorcycleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InsertController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private CatalogServiceImpl catalogService;

    @Autowired
    private MotorcycleService motorcycleService;


    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    private String main(@ModelAttribute Motorcycle motorcycle){
        return "motorcycle";
    }

    @ModelAttribute
    private void populateModel(Model model){
        model.addAllAttributes(catalogService.getAllCatalogs());
    }

    @RequestMapping(value = "/newClassMoto", method = RequestMethod.GET)
    private String newClassMoto(@ModelAttribute ClassMotorcycle classMotorcycle) {
        return "classes_motorcycles";
    }

    @RequestMapping(value = "/saveClassMoto", method = RequestMethod.POST)
    public String saveClassMoto(ClassMotorcycle classMotorcycle) {
        catalogService.getClassMotorcycleRepository().save(classMotorcycle);
        return "redirect:/admin";
    }


    @RequestMapping(value = "/newBrand", method = RequestMethod.GET)
    private String newBrand(@ModelAttribute Brand brand) {
        return "brands_motorcycles";
    }

    @RequestMapping(value = "/saveBrand", method = RequestMethod.POST)
    private String saveBrand(Brand brand) {
        catalogService.getBrandRepository().save(brand);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/newMotorType", method = RequestMethod.GET)
    private String newMotorType(@ModelAttribute MotorType motorType){
        return "motor_types";
    }

    @RequestMapping(value = "/saveMotorType", method = RequestMethod.POST)
    private String saveMotorType(MotorType motorType){
        catalogService.getMotorTypeRepository().save(motorType);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/newLocationCylindersType", method = RequestMethod.GET)
    private String newLocationCylindersType(@ModelAttribute LocationCylindersType locationCylindersType){
        return "location_cylinders_types";
    }

    @RequestMapping(value = "/saveLocationCylindersType", method = RequestMethod.POST)
    private String saveLocationCylindersType(LocationCylindersType locationCylindersType){
        catalogService.getLocationCylindersTypeRepository().save(locationCylindersType);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/newDriveType", method = RequestMethod.GET)
    private String newDriveType(@ModelAttribute DriveType driveType){
        return "drive_types";
    }

    @RequestMapping(value = "/saveDriveType", method = RequestMethod.POST)
    private String saveDriveType(DriveType driveType){
        catalogService.getDriveTypeRepository().save(driveType);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/newCoolingType", method = RequestMethod.GET)
    private String newCoolingType(@ModelAttribute CoolingType coolingType){
        return "cooling_types";
    }

    @RequestMapping(value = "/saveCoolingType", method = RequestMethod.POST)
    private String saveCoolingType(CoolingType coolingType){
        catalogService.getCoolingTypeRepository().save(coolingType);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/newFuelSupplyType", method = RequestMethod.GET)
    private String newFuelSupplyType(@ModelAttribute FuelSupplyType fuelSupplyType){
        return "fuel_supply_types";
    }

    @RequestMapping(value = "/saveFuelSupplyType", method = RequestMethod.POST)
    private String saveFuelSupplyType(FuelSupplyType fuelSupplyType){
        catalogService.getFuelSupplyTypeRepository().save(fuelSupplyType);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/newFrontSuspensionType", method = RequestMethod.GET)
    private String newFrontSuspensionType(@ModelAttribute FrontSuspensionType frontSuspensionType){
        return "front_suspension_types";
    }

    @RequestMapping(value = "/saveFrontSuspensionType", method = RequestMethod.POST)
    private String saveFrontSuspensionType(FrontSuspensionType frontSuspensionType){
        catalogService.getFrontSuspensionTypeRepository().save(frontSuspensionType);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/newBackSuspensionType", method = RequestMethod.GET)
    private String newBackSuspensionType(@ModelAttribute BackSuspensionType backSuspensionType){
        return "back_suspension_types";
    }

    @RequestMapping(value = "/saveBackSuspensionType", method = RequestMethod.POST)
    private String saveBackSuspensionType(BackSuspensionType backSuspensionType){
        catalogService.getBackSuspensionTypeRepository().save(backSuspensionType);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/saveMotorcycle", method = RequestMethod.POST)
    private String saveMotorcycle(Motorcycle motorcycle) {
          motorcycleService.saveMotorcycle(motorcycle);
        return "redirect:/admin";
    }

}
