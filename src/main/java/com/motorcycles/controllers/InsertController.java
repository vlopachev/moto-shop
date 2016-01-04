package com.motorcycles.controllers;

import com.motorcycles.entities.*;
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
    private static final Logger logger = LoggerFactory.getLogger(InsertController.class);

    @Autowired
    private MotorcycleService service;


    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    private String main(@ModelAttribute Motorcycle motorcycle){
        return "motorcycle";
    }

    @ModelAttribute
    private void populateModel(Model model){
        model.addAttribute("classesMotorcycles", service.getAllClassesMotorcycles());
        model.addAttribute("brandsMotorcycles", service.getAllBrandsMotorcycles());
        model.addAttribute("motorTypes", service.getAllMotorTypes());
        model.addAttribute("locationCylindersTypes", service.getAllLocationCylindersTypes());
        model.addAttribute("driveTypes", service.getAllDriveTypes());
        model.addAttribute("coolingTypes", service.getAllCoolingTypes());
        model.addAttribute("fuelSupplyTypes", service.getAllFuelSupplyTypes());
        model.addAttribute("frontSuspensionTypes", service.getAllFrontSuspensionTypes());
        model.addAttribute("backSuspensionTypes", service.getAllBackSuspensionTypes());
        model.addAttribute("motorcycles", service.getAllMotorcycles());
    }

    @RequestMapping(value = "/newClassMoto", method = RequestMethod.GET)
    private String newClassMoto(@ModelAttribute ClassMotorcycle classMotorcycle) {
        return "classes_motorcycles";
    }

    @RequestMapping(value = "/saveClassMoto", method = RequestMethod.POST)
    public String saveClassMoto(ClassMotorcycle classMotorcycle) {
        service.save(classMotorcycle);
        return "redirect:/admin";
    }


    @RequestMapping(value = "/newBrand", method = RequestMethod.GET)
    private String newBrand(@ModelAttribute Brand brand) {
        return "brands_motorcycles";
    }

    @RequestMapping(value = "/saveBrand", method = RequestMethod.POST)
    private String saveBrand(Brand brand) {
        service.save(brand);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/newMotorType", method = RequestMethod.GET)
    private String newMotorType(@ModelAttribute MotorType motorType){
        return "motor_types";
    }

    @RequestMapping(value = "/saveMotorType", method = RequestMethod.POST)
    private String saveMotorType(MotorType motorType){
        service.save(motorType);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/newLocationCylindersType", method = RequestMethod.GET)
    private String newLocationCylindersType(@ModelAttribute LocationCylindersType locationCylindersType){
        return "location_cylinders_types";
    }

    @RequestMapping(value = "/saveLocationCylindersType", method = RequestMethod.POST)
    private String saveLocationCylindersType(LocationCylindersType locationCylindersType){
        service.save(locationCylindersType);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/newDriveType", method = RequestMethod.GET)
    private String newDriveType(@ModelAttribute DriveType driveType){
        return "drive_types";
    }

    @RequestMapping(value = "/saveDriveType", method = RequestMethod.POST)
    private String saveDriveType(DriveType driveType){
        service.save(driveType);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/newCoolingType", method = RequestMethod.GET)
    private String newCoolingType(@ModelAttribute CoolingType coolingType){
        return "cooling_types";
    }

    @RequestMapping(value = "/saveCoolingType", method = RequestMethod.POST)
    private String saveCoolingType(CoolingType coolingType){
        service.save(coolingType);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/newFuelSupplyType", method = RequestMethod.GET)
    private String newFuelSupplyType(@ModelAttribute FuelSupplyType fuelSupplyType){
        return "fuel_supply_types";
    }

    @RequestMapping(value = "/saveFuelSupplyType", method = RequestMethod.POST)
    private String saveFuelSupplyType(FuelSupplyType fuelSupplyType){
        service.save(fuelSupplyType);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/newFrontSuspensionType", method = RequestMethod.GET)
    private String newFrontSuspensionType(@ModelAttribute FrontSuspensionType frontSuspensionType){
        return "front_suspension_types";
    }

    @RequestMapping(value = "/saveFrontSuspensionType", method = RequestMethod.POST)
    private String saveFrontSuspensionType(FrontSuspensionType frontSuspensionType){
        service.save(frontSuspensionType);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/newBackSuspensionType", method = RequestMethod.GET)
    private String newBackSuspensionType(@ModelAttribute BackSuspensionType backSuspensionType){
        return "back_suspension_types";
    }

    @RequestMapping(value = "/saveBackSuspensionType", method = RequestMethod.POST)
    private String saveBackSuspensionType(BackSuspensionType backSuspensionType){
        service.save(backSuspensionType);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/saveMotorcycle", method = RequestMethod.POST)
    private String saveMotorcycle(Motorcycle motorcycle) {
          service.save(motorcycle);
        return "redirect:/admin";
    }

}
