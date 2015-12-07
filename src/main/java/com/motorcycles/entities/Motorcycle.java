package com.motorcycles.entities;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "motorcycle", catalog = "moto_shop")
public class Motorcycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    private Integer id;

    @Column(name = "model_name", nullable = false, insertable = true, updatable = true, length = 255)
    private String modelName;

    @ManyToOne
    @JoinColumn(name = "class_motorcycle_id", nullable = false)
    private ClassMotorcycle classMotorcycle;

    @ManyToOne
    @JoinColumn(name = "brand_id", nullable = false)
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "motor_type_id", nullable = false)
    private MotorType motorType;

    @ManyToOne
    @JoinColumn(name = "location_cylinders_type_id", nullable = false)
    private LocationCylindersType locationCylindersType;

    @Column(name = "motor_capacity", nullable = false, insertable = true, updatable = true)
    private Integer motorCapacity;

    @Column(name = "power", nullable = false, insertable = true, updatable = true, precision = 0)
    private Double power;

    @Column(name = "max_speed", nullable = false, insertable = true, updatable = true)
    private Integer maxSpeed;

    @Column(name = "number_cylinders", nullable = false, insertable = true, updatable = true)
    private Integer numberCylinders;

    @ManyToOne
    @JoinColumn(name = "drive_type_id", nullable = false)
    private DriveType driveType;

    @Column(name = "electric_starter", nullable = false, insertable = true, updatable = true)
    private Boolean electricStarter;

    @ManyToOne
    @JoinColumn(name = "cooling_type_id", nullable = false)
    private CoolingType coolingType;

    @ManyToOne
    @JoinColumn(name = "fuel_supply_type_id", nullable = false)
    private FuelSupplyType fuelSupplyType;

    @Column(name = "fuel_tank_capacity", nullable = false, insertable = true, updatable = true, precision = 0)
    private Double fuelTankCapacity;

    @ManyToOne
    @JoinColumn(name = "front_suspension_id", nullable = false)
    private FrontSuspension frontSuspension;

    @ManyToOne
    @JoinColumn(name = "back_suspension_id", nullable = false)
    private BackSuspension backSuspension;

    @ManyToOne
    @JoinColumn(name = "front_brake_type_id", nullable = false)
    private BrakeType fronBrakeType;

    @ManyToOne
    @JoinColumn(name = "back_brake_type_id", nullable = false)
    private BrakeType backBrakeType;

    @ManyToOne
    @JoinColumn(name = "front_wheel_id", nullable = false)
    private FrontWheel frontWheel;

    @ManyToOne
    @JoinColumn(name = "back_wheel_id", nullable = false)
    private BackWheel backWheel;

    @Column(name = "wheelbase", nullable = false, insertable = true, updatable = true, precision = 0)
    private Double wheelbase;

    @Column(name = "ground_clearance", nullable = false, insertable = true, updatable = true, precision = 0)
    private Double groundClearance;

    @Column(name = "length", nullable = false, insertable = true, updatable = true, precision = 0)
    private Double length;

    @Column(name = "width", nullable = false, insertable = true, updatable = true, precision = 0)
    private Double width;

    @Column(name = "height", nullable = false, insertable = true, updatable = true, precision = 0)
    private Double height;

    @Column(name = "dry_weight", nullable = false, insertable = true, updatable = true, precision = 0)
    private Double dryWeight;

    @ManyToMany
    @JoinTable(name = "equipment_items",
            joinColumns = {@JoinColumn(name = "motorcycle_id", referencedColumnName = "id")}
            , inverseJoinColumns = {@JoinColumn(name = "equipment_id", referencedColumnName = "id")})
    private Set<Equipment> equipments;

    @ManyToMany
    @JoinTable(name = "pictures_items"
        , joinColumns = {@JoinColumn(name = "motorcycle_id", referencedColumnName = "id")}
        , inverseJoinColumns = {@JoinColumn(name = "pictures_id", referencedColumnName = "id")})
    private Set<Pictures> pictures;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public ClassMotorcycle getClassMotorcycle() {
        return classMotorcycle;
    }

    public void setClassMotorcycle(ClassMotorcycle classMotorcycle) {
        this.classMotorcycle = classMotorcycle;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public MotorType getMotorType() {
        return motorType;
    }

    public void setMotorType(MotorType motorType) {
        this.motorType = motorType;
    }

    public LocationCylindersType getLocationCylindersType() {
        return locationCylindersType;
    }

    public void setLocationCylindersType(LocationCylindersType locationCylindersType) {
        this.locationCylindersType = locationCylindersType;
    }

    public Integer getMotorCapacity() {
        return motorCapacity;
    }

    public void setMotorCapacity(Integer motorCapacity) {
        this.motorCapacity = motorCapacity;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Integer getNumberCylinders() {
        return numberCylinders;
    }

    public void setNumberCylinders(Integer numberCylinders) {
        this.numberCylinders = numberCylinders;
    }

    public DriveType getDriveType() {
        return driveType;
    }

    public void setDriveType(DriveType driveType) {
        this.driveType = driveType;
    }

    public Boolean getElectricStarter() {
        return electricStarter;
    }

    public void setElectricStarter(Boolean electricStarter) {
        this.electricStarter = electricStarter;
    }

    public CoolingType getCoolingType() {
        return coolingType;
    }

    public void setCoolingType(CoolingType coolingType) {
        this.coolingType = coolingType;
    }

    public FuelSupplyType getFuelSupplyType() {
        return fuelSupplyType;
    }

    public void setFuelSupplyType(FuelSupplyType fuelSupplyType) {
        this.fuelSupplyType = fuelSupplyType;
    }

    public Double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(Double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public FrontSuspension getFrontSuspension() {
        return frontSuspension;
    }

    public void setFrontSuspension(FrontSuspension frontSuspension) {
        this.frontSuspension = frontSuspension;
    }

    public BackSuspension getBackSuspension() {
        return backSuspension;
    }

    public void setBackSuspension(BackSuspension backSuspension) {
        this.backSuspension = backSuspension;
    }

    public BrakeType getFronBrakeType() {
        return fronBrakeType;
    }

    public void setFronBrakeType(BrakeType fronBrakeType) {
        this.fronBrakeType = fronBrakeType;
    }

    public BrakeType getBackBrakeType() {
        return backBrakeType;
    }

    public void setBackBrakeType(BrakeType backBrakeType) {
        this.backBrakeType = backBrakeType;
    }

    public FrontWheel getFrontWheel() {
        return frontWheel;
    }

    public void setFrontWheel(FrontWheel frontWheel) {
        this.frontWheel = frontWheel;
    }

    public BackWheel getBackWheel() {
        return backWheel;
    }

    public void setBackWheel(BackWheel backWheel) {
        this.backWheel = backWheel;
    }

    public Double getWheelbase() {
        return wheelbase;
    }

    public void setWheelbase(Double wheelbase) {
        this.wheelbase = wheelbase;
    }

    public Double getGroundClearance() {
        return groundClearance;
    }

    public void setGroundClearance(Double groundClearance) {
        this.groundClearance = groundClearance;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getDryWeight() {
        return dryWeight;
    }

    public void setDryWeight(Double dryWeight) {
        this.dryWeight = dryWeight;
    }

    public Set<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(Set<Equipment> equipments) {
        this.equipments = equipments;
    }

    public Set<Pictures> getPictures() {
        return pictures;
    }

    public void setPictures(Set<Pictures> pictures) {
        this.pictures = pictures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Motorcycle that = (Motorcycle) o;

        return id.equals(that.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
