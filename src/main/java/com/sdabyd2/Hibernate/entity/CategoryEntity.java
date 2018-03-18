package com.sdabyd2.Hibernate.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "category")
public class CategoryEntity {

    @Column(name = "name", nullable = false, length = 128) // parametr odnosi sie tylko do kolejnej lini
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
