package com.motorcycles.entities;

import com.motorcycles.factories.interfaces.PartMotorcycle;

import javax.persistence.*;

@Entity
@Table(name = "motor_type", schema = "", catalog = "moto_shop")
public class MotorType implements PartMotorcycle{
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false, insertable = true, updatable = true, length = 45)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
