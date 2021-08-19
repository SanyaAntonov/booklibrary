package ru.antonov.booklibrary.entity;

import javax.persistence.*;

@Entity
@Table(name = "genres")
public class Genre {
    @Id
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
