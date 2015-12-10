package com.motorcycles.entities;

import com.motorcycles.factories.interfaces.PartMotorcycle;

import javax.persistence.*;

@Entity
@Table(name = "back_suspension", schema = "", catalog = "moto_shop")
public class BackSuspension implements PartMotorcycle{
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "back_suspension_type_id", nullable = false)
    private BackSuspensionType backSuspensionType;

    @Column(name = "control", nullable = false, insertable = true, updatable = true)
    private Boolean control;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BackSuspensionType getBackSuspensionType() {
        return backSuspensionType;
    }

    public void setBackSuspensionType(BackSuspensionType backSuspensionType) {
        this.backSuspensionType = backSuspensionType;
    }

    public Boolean getControl() {
        return control;
    }

    public void setControl(Boolean control) {
        this.control = control;
    }
}
