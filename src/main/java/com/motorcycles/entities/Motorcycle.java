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

    @Column(name = "model_name", insertable = true, updatable = true, length = 255)
    private String modelName;

    @ManyToOne
    @JoinColumn(name = "class_motorcycle_id")
    private ClassMotorcycle classMotorcycle;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "motor_type_id")
    private MotorType motorType;

    @ManyToOne
    @JoinColumn(name = "location_cylinders_type_id")
    private LocationCylindersType locationCylindersType;

    @Column(name = "motor_capacity", insertable = true, updatable = true)
    private Integer motorCapacity;

    @Column(name = "power", insertable = true, updatable = true, precision = 0)
    private Double power;

    @Column(name = "max_speed", insertable = true, updatable = true)
    private Integer maxSpeed;

    @Column(name = "number_cylinders", insertable = true, updatable = true)
    private Integer numberCylinders;

    @ManyToOne
    @JoinColumn(name = "drive_type_id")
    private DriveType driveType;

    @Column(name = "electric_starter", insertable = true, updatable = true)
    private Boolean electricStarter;

    @ManyToOne
    @JoinColumn(name = "cooling_type_id")
    private CoolingType coolingType;

    @ManyToOne
    @JoinColumn(name = "fuel_supply_type_id")
    private FuelSupplyType fuelSupplyType;

    @Column(name = "fuel_tank_capacity", insertable = true, updatable = true, precision = 0)
    private Double fuelTankCapacity;

    @ManyToOne
    @JoinColumn(name = "front_suspension_type_id")
    private FrontSuspensionType frontSuspensionType;

    @Column(name = "control_front_suspension", insertable = true, updatable = true)
    private Boolean controlFrontSuspension;

    @ManyToOne
    @JoinColumn(name = "back_suspension_type_id")
    private BackSuspensionType backSuspensionType;

    @Column(name = "control_back_suspension", insertable = true, updatable = true)
    private Boolean controlBackSuspension;

    @ManyToOne
    @JoinColumn(name = "front_brake_type_id")
    private BrakeType frontBrakeType;

    @ManyToOne
    @JoinColumn(name = "back_brake_type_id")
    private BrakeType backBrakeType;

    @ManyToOne
    @JoinColumn(name = "front_wheel_id")
    private FrontWheel frontWheel;

    @ManyToOne
    @JoinColumn(name = "back_wheel_id")
    private BackWheel backWheel;

    @Column(name = "wheelbase", insertable = true, updatable = true, precision = 0)
    private Double wheelbase;

    @Column(name = "ground_clearance", insertable = true, updatable = true, precision = 0)
    private Double groundClearance;

    @Column(name = "length", insertable = true, updatable = true, precision = 0)
    private Double length;

    @Column(name = "width", insertable = true, updatable = true, precision = 0)
    private Double width;

    @Column(name = "height", insertable = true, updatable = true, precision = 0)
    private Double height;

    @Column(name = "dry_weight", insertable = true, updatable = true, precision = 0)
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

    public FrontSuspensionType getFrontSuspensionType() {
        return frontSuspensionType;
    }

    public void setFrontSuspensionType(FrontSuspensionType frontSuspensionType) {
        this.frontSuspensionType = frontSuspensionType;
    }

    public Boolean getControlFrontSuspension() {
        return controlFrontSuspension;
    }

    public void setControlFrontSuspension(Boolean controlFrontSuspension) {
        this.controlFrontSuspension = controlFrontSuspension;
    }

    public BackSuspensionType getBackSuspensionType() {
        return backSuspensionType;
    }

    public void setBackSuspensionType(BackSuspensionType backSuspensionType) {
        this.backSuspensionType = backSuspensionType;
    }

    public Boolean getControlBackSuspension() {
        return controlBackSuspension;
    }

    public void setControlBackSuspension(Boolean controlBackSuspension) {
        this.controlBackSuspension = controlBackSuspension;
    }

    public BrakeType getFrontBrakeType() {
        return frontBrakeType;
    }

    public void setFrontBrakeType(BrakeType frontBrakeType) {
        this.frontBrakeType = frontBrakeType;
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
