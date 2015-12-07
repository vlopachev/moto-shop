package com.motorcycles.controllers;

import com.motorcycles.repositories.MotorcyclesDao;
import com.motorcycles.entities.*;
import com.motorcycles.services.InsertMotorcycle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InsertController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    @Qualifier("jdbcMotorcycleDao")
    private MotorcyclesDao dao;


    @Autowired
    private InsertMotorcycle service;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    private ModelAndView main(){
        ModelAndView mav = new ModelAndView("motorcycle");



        mav.addObject("classesMotorcycles", service.getAllClassesMotorcycles());
        mav.addObject("brands", service.getAllBrandsMotorcycles());
        mav.addObject("motorTypes", service.getAllMotorTypes());
        mav.addObject("locationCylindersTypes", service.getAllLocationCylindersTypes());
        mav.addObject("driveTypes", service.getAllDriveTypes());
        mav.addObject("coolingTypes", service.getAllCoolingTypes());
        mav.addObject("fuelSupplyTypes", service.getAllFuelSupplyTypes());
        mav.addObject("frontSuspensionTypes", service.getAllFrontSuspensionTypes());
        mav.addObject("backSuspensionTypes", service.getAllBackSuspensionTypes());

        return mav;
    }

    @ModelAttribute
    private void populateModel(Model model){
        model.addAttribute(new Motorcycle());
        model.addAttribute(new ClassMotorcycle());
        model.addAttribute(new Brand());
        model.addAttribute(new MotorType());
        model.addAttribute(new LocationCylindersType());
        model.addAttribute(new DriveType());
        model.addAttribute(new CoolingType());
        model.addAttribute(new FuelSupplyType());
        model.addAttribute(new FrontSuspensionType());
        model.addAttribute(new BackSuspensionType());
    }

    @RequestMapping(value = "/newClassMoto", method = RequestMethod.GET)
    private String newClassMoto() {
        return "class_motorcycle";
    }

    @RequestMapping(value = "/saveClassMoto", method = RequestMethod.POST)
    public String saveClassMoto(ClassMotorcycle classMotorcycle) {
        dao.addClassMotorcycle(classMotorcycle);
        return "redirect:/";
    }


    @RequestMapping(value = "/newBrand", method = RequestMethod.GET)
    private String newBrand() {
        return "brand";
    }

    @RequestMapping(value = "/saveBrand", method = RequestMethod.POST)
    private String saveBrand(Brand brand) {
        dao.addBrand(brand);
        return "redirect:/";
    }

    @RequestMapping(value = "/newMotorType", method = RequestMethod.GET)
    private String newMotorType(){
        return "motor_type";
    }

    @RequestMapping(value = "/saveMotorType", method = RequestMethod.POST)
    private String saveMotorType(MotorType motorType){
        dao.addMotorType(motorType);
        return "redirect:/";
    }

    @RequestMapping(value = "/newLocationCylindersType", method = RequestMethod.GET)
    private String newLocationCylindersType(){
        return "location_cylinders_type";
    }

    @RequestMapping(value = "/saveLocationCylindersType", method = RequestMethod.POST)
    private String saveLocationCylindersType(LocationCylindersType locationCylindersType){
        dao.addLocationCylindersType(locationCylindersType);
        return "redirect:/";
    }

    @RequestMapping(value = "/newDriveType", method = RequestMethod.GET)
    private String newDriveType(){
        return "drive_type";
    }

    @RequestMapping(value = "/saveDriveType", method = RequestMethod.POST)
    private String saveDriveType(DriveType driveType){
        dao.addDriveType(driveType);
        return "redirect:/";
    }

    @RequestMapping(value = "/newCoolingType", method = RequestMethod.GET)
    private String newCoolingType(){
        return "cooling_type";
    }

    @RequestMapping(value = "/saveCoolingType", method = RequestMethod.POST)
    private String saveCoolingType(CoolingType coolingType){
        dao.addCoolingType(coolingType);
        return "redirect:/";
    }

    @RequestMapping(value = "/newFuelSupplyType", method = RequestMethod.GET)
    private String newFuelSupplyType(ModelAndView model){
        return "fuel_supply_type";
    }

    @RequestMapping(value = "/saveFuelSupplyType", method = RequestMethod.POST)
    private String saveFuelSupplyType(FuelSupplyType fuelSupplyType){
        dao.addFuelSupplyType(fuelSupplyType);
        return "redirect:/";
    }

    @RequestMapping(value = "/newFrontSuspensionType", method = RequestMethod.GET)
    private String newFrontSuspensionType(){
        return "front_suspension_type";
    }

    @RequestMapping(value = "/saveFrontSuspensionType", method = RequestMethod.POST)
    private String saveFrontSuspensionType(FrontSuspensionType frontSuspensionType){
        dao.addFrontSuspensionType(frontSuspensionType);
        return "redirect:/";
    }

    @RequestMapping(value = "/newBackSuspensionType", method = RequestMethod.GET)
    private String newBackSuspensionType(){
        return "back_suspension_type";
    }

    @RequestMapping(value = "/saveBackSuspensionType", method = RequestMethod.POST)
    private String saveBackSuspensionType(BackSuspensionType backSuspensionType){
        dao.addBackSuspensionType(backSuspensionType);
        return "redirect:/";
    }

}
