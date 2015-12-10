package com.motorcycles.entities;

import com.motorcycles.factories.interfaces.PartMotorcycle;

import javax.persistence.*;

@Entity
@Table(name = "front_suspension", catalog = "moto_shop")
public class FrontSuspension implements PartMotorcycle{
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "front_suspension_type_id", nullable = false)
    private FrontSuspensionType frontSuspensionType;

    @Column(name = "control", nullable = true, insertable = true, updatable = true)
    private Boolean control;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FrontSuspensionType getFrontSuspensionType() {
        return frontSuspensionType;
    }

    public void setFrontSuspensionType(FrontSuspensionType frontSuspensionType) {
        this.frontSuspensionType = frontSuspensionType;
    }

    public Boolean getControl() {
        return control;
    }

    public void setControl(Boolean control) {
        this.control = control;
    }
}
