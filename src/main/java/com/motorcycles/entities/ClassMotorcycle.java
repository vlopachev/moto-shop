package com.motorcycles.entities;

import javax.persistence.*;

@Entity
@Table(name = "class_motorcycle", catalog = "moto_shop")
public class ClassMotorcycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
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
