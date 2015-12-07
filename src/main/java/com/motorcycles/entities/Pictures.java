package com.motorcycles.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pictures", catalog = "moto_shop")
public class Pictures {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "link", nullable = true, insertable = true, updatable = true, length = 255)
    private String link;

    @Column(name = "description", nullable = true, insertable = true, updatable = true, length = 255)
    private String description;

    @ManyToMany(mappedBy = "pictures")
    private Set<Motorcycle> motorcycles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pictures pictures = (Pictures) o;

        return id.equals(pictures.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
