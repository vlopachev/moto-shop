package com.motorcycles.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;


@Entity
@Table(name = "motorcycle", catalog = "moto_shop")
public class Motorcycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    private Integer id;

    @Column(name = "model_name", insertable = true, updatable = true, length = 255)
    @Size(min = 1, message = "введите название модели")
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

    @OneToOne
    @JoinColumn(name = "picture_id")
    private Picture picture;

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

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Motorcycle that = (Motorcycle) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (modelName != null ? !modelName.equals(that.modelName) : that.modelName != null)
            return false;
        if (classMotorcycle != null ? !classMotorcycle.equals(that.classMotorcycle) : that.classMotorcycle != null)
            return false;
        if (brand != null ? !brand.equals(that.brand) : that.brand != null) return false;
        if (motorType != null ? !motorType.equals(that.motorType) : that.motorType != null)
            return false;
        if (locationCylindersType != null ? !locationCylindersType.equals(that.locationCylindersType) : that.locationCylindersType != null)
            return false;
        if (motorCapacity != null ? !motorCapacity.equals(that.motorCapacity) : that.motorCapacity != null)
            return false;
        if (power != null ? !power.equals(that.power) : that.power != null) return false;
        if (maxSpeed != null ? !maxSpeed.equals(that.maxSpeed) : that.maxSpeed != null)
            return false;
        if (numberCylinders != null ? !numberCylinders.equals(that.numberCylinders) : that.numberCylinders != null)
            return false;
        if (driveType != null ? !driveType.equals(that.driveType) : that.driveType != null)
            return false;
        if (electricStarter != null ? !electricStarter.equals(that.electricStarter) : that.electricStarter != null)
            return false;
        if (coolingType != null ? !coolingType.equals(that.coolingType) : that.coolingType != null)
            return false;
        if (fuelSupplyType != null ? !fuelSupplyType.equals(that.fuelSupplyType) : that.fuelSupplyType != null)
            return false;
        if (fuelTankCapacity != null ? !fuelTankCapacity.equals(that.fuelTankCapacity) : that.fuelTankCapacity != null)
            return false;
        if (frontSuspensionType != null ? !frontSuspensionType.equals(that.frontSuspensionType) : that.frontSuspensionType != null)
            return false;
        if (controlFrontSuspension != null ? !controlFrontSuspension.equals(that.controlFrontSuspension) : that.controlFrontSuspension != null)
            return false;
        if (backSuspensionType != null ? !backSuspensionType.equals(that.backSuspensionType) : that.backSuspensionType != null)
            return false;
        if (controlBackSuspension != null ? !controlBackSuspension.equals(that.controlBackSuspension) : that.controlBackSuspension != null)
            return false;
        if (frontBrakeType != null ? !frontBrakeType.equals(that.frontBrakeType) : that.frontBrakeType != null)
            return false;
        if (backBrakeType != null ? !backBrakeType.equals(that.backBrakeType) : that.backBrakeType != null)
            return false;
        if (frontWheel != null ? !frontWheel.equals(that.frontWheel) : that.frontWheel != null)
            return false;
        if (backWheel != null ? !backWheel.equals(that.backWheel) : that.backWheel != null)
            return false;
        if (wheelbase != null ? !wheelbase.equals(that.wheelbase) : that.wheelbase != null)
            return false;
        if (groundClearance != null ? !groundClearance.equals(that.groundClearance) : that.groundClearance != null)
            return false;
        if (length != null ? !length.equals(that.length) : that.length != null) return false;
        if (width != null ? !width.equals(that.width) : that.width != null) return false;
        if (height != null ? !height.equals(that.height) : that.height != null) return false;
        if (dryWeight != null ? !dryWeight.equals(that.dryWeight) : that.dryWeight != null)
            return false;
        if (equipments != null ? !equipments.equals(that.equipments) : that.equipments != null)
            return false;
        return !(picture != null ? !picture.equals(that.picture) : that.picture != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (modelName != null ? modelName.hashCode() : 0);
        result = 31 * result + (classMotorcycle != null ? classMotorcycle.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (motorType != null ? motorType.hashCode() : 0);
        result = 31 * result + (locationCylindersType != null ? locationCylindersType.hashCode() : 0);
        result = 31 * result + (motorCapacity != null ? motorCapacity.hashCode() : 0);
        result = 31 * result + (power != null ? power.hashCode() : 0);
        result = 31 * result + (maxSpeed != null ? maxSpeed.hashCode() : 0);
        result = 31 * result + (numberCylinders != null ? numberCylinders.hashCode() : 0);
        result = 31 * result + (driveType != null ? driveType.hashCode() : 0);
        result = 31 * result + (electricStarter != null ? electricStarter.hashCode() : 0);
        result = 31 * result + (coolingType != null ? coolingType.hashCode() : 0);
        result = 31 * result + (fuelSupplyType != null ? fuelSupplyType.hashCode() : 0);
        result = 31 * result + (fuelTankCapacity != null ? fuelTankCapacity.hashCode() : 0);
        result = 31 * result + (frontSuspensionType != null ? frontSuspensionType.hashCode() : 0);
        result = 31 * result + (controlFrontSuspension != null ? controlFrontSuspension.hashCode() : 0);
        result = 31 * result + (backSuspensionType != null ? backSuspensionType.hashCode() : 0);
        result = 31 * result + (controlBackSuspension != null ? controlBackSuspension.hashCode() : 0);
        result = 31 * result + (frontBrakeType != null ? frontBrakeType.hashCode() : 0);
        result = 31 * result + (backBrakeType != null ? backBrakeType.hashCode() : 0);
        result = 31 * result + (frontWheel != null ? frontWheel.hashCode() : 0);
        result = 31 * result + (backWheel != null ? backWheel.hashCode() : 0);
        result = 31 * result + (wheelbase != null ? wheelbase.hashCode() : 0);
        result = 31 * result + (groundClearance != null ? groundClearance.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (dryWeight != null ? dryWeight.hashCode() : 0);
        result = 31 * result + (equipments != null ? equipments.hashCode() : 0);
        result = 31 * result + (picture != null ? picture.hashCode() : 0);
        return result;
    }
}
