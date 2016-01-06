package com.motorcycles.entities;

import javax.persistence.*;

@Entity
@Table(name = "pictures", catalog = "moto_shop")
public class Picture {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "link", nullable = true, insertable = true, updatable = true, length = 255)
    private String link;

    @Column(name = "description", nullable = true, insertable = true, updatable = true, length = 255)
    private String description;

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

        Picture picture = (Picture) o;

        return id.equals(picture.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
