package com.motorcycles.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "equipment", catalog = "moto_shop")
public class Equipment {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false, insertable = true, updatable = true, length = 255)
    private String name;

    @ManyToMany(mappedBy = "equipments")
    private Set<Motorcycle> motorcycles;

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

    public Set<Motorcycle> getMotorcycles() {
        return motorcycles;
    }

    public void setMotorcycles(Set<Motorcycle> motorcycles) {
        this.motorcycles = motorcycles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Equipment equipment = (Equipment) o;

        return id.equals(equipment.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
