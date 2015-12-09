package com.motorcycles.repositories;

import com.motorcycles.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;


@Repository
public class JPAMotorcycleDao implements MotorcyclesDao {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    ClassMotorcycleRepository cmRepository;



    @Override
    public void addMotorcycle(Motorcycle motorcycle) {

    }

    @Override
    public List<ClassMotorcycle> getAllClassesOfMotorcycles() {

        List<ClassMotorcycle> result = new ArrayList<>();
        for (ClassMotorcycle classMotorcycle : cmRepository.findAll() ) {
            result.add(classMotorcycle);
        }
        return result;
    }

    @Override
    public void addClassMotorcycle(ClassMotorcycle classMotorcycle) {

    }

    @Override
    public List<Brand> getAllBrandsMotorcycles() {
        Query query = em.createQuery("select c from Brand c");
        return query.getResultList();
    }

    @Override
    public void addBrand(Brand brand) {

    }

    @Override
    public List<MotorType> getAllMotorTypes() {
        Query query = em.createQuery("select c from MotorType c");
        return query.getResultList();
    }

    @Override
    public void addMotorType(MotorType motorType) {

    }

    @Override
    public List<LocationCylindersType> getAllLocationCylindersTypes() {
        Query query = em.createQuery("select c from LocationCylindersType c");
        return query.getResultList();
    }

    @Override
    public void addLocationCylindersType(LocationCylindersType locationCylindersType) {

    }

    @Override
    public List<DriveType> getAllDriveTypes() {
        Query query = em.createQuery("select c from DriveType c");
        return query.getResultList();
    }

    @Override
    public void addDriveType(DriveType driveType) {

    }

    @Override
    public List<CoolingType> getAllCoolingTypes() {
        Query query = em.createQuery("select c from CoolingType c");
        return query.getResultList();
    }

    @Override
    public void addCoolingType(CoolingType coolingType) {

    }

    @Override
    public List<FuelSupplyType> getAllFuelSupplyTypes() {
        Query query = em.createQuery("select c from FuelSupplyType c");
        return query.getResultList();
    }

    @Override
    public void addFuelSupplyType(FuelSupplyType fuelSupplyType) {

    }

    @Override
    public List<FrontSuspensionType> getAllFrontSuspensionTypes() {
        Query query = em.createQuery("select c from FrontSuspensionType c");
        return query.getResultList();
    }

    @Override
    public void addFrontSuspensionType(FrontSuspensionType frontSuspensionType) {

    }


    @Override
    public List<BackSuspensionType> getAllBackSuspensionTypes() {
        Query query = em.createQuery("select c from BackSuspensionType c");
        return query.getResultList();
    }

    @Override
    public void addBackSuspensionType(BackSuspensionType backSuspensionType) {

    }
}
