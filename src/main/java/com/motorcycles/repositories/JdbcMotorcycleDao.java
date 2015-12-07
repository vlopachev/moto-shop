package com.motorcycles.repositories;

import com.motorcycles.entities.*;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;


public class JdbcMotorcycleDao extends JdbcDaoSupport implements MotorcyclesDao {


    @Resource(name = "sqlProp")
    private Properties sqlProp;


    @Override
    public void addMotorcycle(Motorcycle motorcycle) {
    }

    @Override
    public void addClassMotorcycle(ClassMotorcycle classMotorcycle) {
        getJdbcTemplate().update(sqlProp.getProperty("SQL_INSERT_CLASS_MOTORCYCLE"),
                classMotorcycle.getName());

    }

    @Override
    public List<ClassMotorcycle> getAllClassesOfMotorcycles() {
        return getJdbcTemplate().query(sqlProp.getProperty("SQL_SELECT_ALL_CLASS_MOTORCYCLE"),
                new RowMapper<ClassMotorcycle>() {
            @Override
            public ClassMotorcycle mapRow(ResultSet resultSet, int i) throws SQLException {
                ClassMotorcycle classMotorcycle = new ClassMotorcycle();
                classMotorcycle.setId(resultSet.getInt("id"));
                classMotorcycle.setName(resultSet.getString("name"));
                return classMotorcycle;
            }
        });
    }

    @Override
    public List<Brand> getAllBrandsMotorcycles() {
        return getJdbcTemplate().query(sqlProp.getProperty("SQL_SELECT_ALL_BRAND_MOTORCYCLE"),
                new RowMapper<Brand>() {
            @Override
            public Brand mapRow(ResultSet resultSet, int i) throws SQLException {
                Brand brand = new Brand();
                brand.setId(resultSet.getInt("id"));
                brand.setName(resultSet.getString("name"));
                return brand;
            }
        });
    }

    @Override
    public void addBrand(Brand brand) {
        getJdbcTemplate().update(sqlProp.getProperty("SQL_INSERT_BRAND_MOTORCYCLE"), brand.getName());
    }

    @Override
    public List<MotorType> getAllMotorTypes() {
        return getJdbcTemplate().query(sqlProp.getProperty("SQL_SELECT_ALL_MOTOR_TYPE"),
                new RowMapper<MotorType>() {
            @Override
            public MotorType mapRow(ResultSet resultSet, int i) throws SQLException {
                MotorType motorType = new MotorType();
                motorType.setId(resultSet.getInt("id"));
                motorType.setName(resultSet.getString("name"));
                return motorType;
            }
        });
    }

    @Override
    public void addMotorType(MotorType motorType) {
        getJdbcTemplate().update(sqlProp.getProperty("SQL_INSERT_MOTOR_TYPE"), motorType.getName());
    }

    @Override
    public List<LocationCylindersType> getAllLocationCylindersTypes() {
        return getJdbcTemplate().query(sqlProp.getProperty("SQL_SELECT_ALL_LOCATION_CYLINDERS_TYPE"),
                new RowMapper<LocationCylindersType>() {
            @Override
            public LocationCylindersType mapRow(ResultSet resultSet, int i) throws SQLException {
                LocationCylindersType locationCylindersType = new LocationCylindersType();
                locationCylindersType.setId(resultSet.getInt("id"));
                locationCylindersType.setName(resultSet.getString("name"));
                return locationCylindersType;
            }
        });

    }

    @Override
    public void addLocationCylindersType(LocationCylindersType locationCylindersType) {
        getJdbcTemplate().update(sqlProp.getProperty("SQL_INSERT_LOCATION_CYLINDERS_TYPE"),
                locationCylindersType.getName());
    }

    @Override
    public List<DriveType> getAllDriveTypes() {

        return getJdbcTemplate().query(sqlProp.getProperty("SQL_SELECT_ALL_DRIVE_TYPE"),
                new RowMapper<DriveType>() {
            @Override
            public DriveType mapRow(ResultSet resultSet, int i) throws SQLException {
                DriveType driveType = new DriveType();
                driveType.setId(resultSet.getInt("id"));
                driveType.setName(resultSet.getString("name"));
                return driveType;
            }
        });
    }

    @Override
    public void addDriveType(DriveType driveType) {
        getJdbcTemplate().update(sqlProp.getProperty("SQL_INSERT_DRIVE_TYPE"), driveType.getName());
    }

    @Override
    public List<CoolingType> getAllCoolingTypes() {
        return getJdbcTemplate().query(sqlProp.getProperty("SQL_SELECT_ALL_COOLING_TYPE"),
                new RowMapper<CoolingType>() {
            @Override
            public CoolingType mapRow(ResultSet resultSet, int i) throws SQLException {
                CoolingType coolingType = new CoolingType();
                coolingType.setId(resultSet.getInt("id"));
                coolingType.setName(resultSet.getString("name"));
                return coolingType;
            }
        });
    }

    @Override
    public void addCoolingType(CoolingType coolingType) {
        getJdbcTemplate().update(sqlProp.getProperty("SQL_INSERT_COOLING_TYPE"), coolingType.getName());
    }

    @Override
    public List<FuelSupplyType> getAllFuelSupplyTypes() {
        return getJdbcTemplate().query(sqlProp.getProperty("SQL_SELECT_ALL_FUEL_SUPPLY_TYPE"),
                new RowMapper<FuelSupplyType>() {
            @Override
            public FuelSupplyType mapRow(ResultSet resultSet, int i) throws SQLException {
                FuelSupplyType fuelSupplyType = new FuelSupplyType();
                fuelSupplyType.setId(resultSet.getInt("id"));
                fuelSupplyType.setName(resultSet.getString("name"));
                return fuelSupplyType;
            }
        });
    }

    @Override
    public void addFuelSupplyType(FuelSupplyType fuelSupplyType) {
        getJdbcTemplate().update(sqlProp.getProperty("SQL_INSERT_FUEL_SUPPLY_TYPE"),
                fuelSupplyType.getName());
    }

    @Override
    public List<FrontSuspensionType> getAllFrontSuspensionTypes() {
        return getJdbcTemplate().query(sqlProp.getProperty("SQL_SELECT_ALL_FRONT_SUSPENSION_TYPE"),
                new RowMapper<FrontSuspensionType>() {
                    @Override
                    public FrontSuspensionType mapRow(ResultSet resultSet, int i) throws SQLException {
                        FrontSuspensionType frontSuspensionType = new FrontSuspensionType();
                        frontSuspensionType.setId(resultSet.getInt("id"));
                        frontSuspensionType.setName(resultSet.getString("name"));
                        return frontSuspensionType;
                    }
                });
    }

    @Override
    public void addFrontSuspensionType(FrontSuspensionType frontSuspensionType) {
        getJdbcTemplate().update(sqlProp.getProperty("SQL_INSERT_FRONT_SUSPENSION_TYPE"),
                frontSuspensionType.getName());
    }

    @Override
    public List<BackSuspensionType> getAllBackSuspensionTypes() {
        return getJdbcTemplate().query(sqlProp.getProperty("SQL_SELECT_ALL_BACK_SUSPENSION_TYPE"),
                new RowMapper<BackSuspensionType>() {
                    @Override
                    public BackSuspensionType mapRow(ResultSet resultSet, int i) throws SQLException {
                        BackSuspensionType backSuspensionType = new BackSuspensionType();
                        backSuspensionType.setId(resultSet.getInt("id"));
                        backSuspensionType.setName(resultSet.getString("name"));
                        return backSuspensionType;
                    }
                });
    }

    @Override
    public void addBackSuspensionType(BackSuspensionType backSuspensionType) {
        getJdbcTemplate().update(sqlProp.getProperty("SQL_INSERT_BACK_SUSPENSION_TYPE"),
                backSuspensionType.getName());
    }
}
