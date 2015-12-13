package com.motorcycles.entities;

import javax.persistence.*;

@Entity
@Table(name = "front_wheel", catalog = "moto_shop")
public class FrontWheel {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "diameter", nullable = false, insertable = true, updatable = true)
    private Integer diameter;

    @Column(name = "width_tire", nullable = false, insertable = true, updatable = true, length = 20)
    private String widthTire;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }

    public String getWidthTire() {
        return widthTire;
    }

    public void setWidthTire(String widthTire) {
        this.widthTire = widthTire;
    }
}
