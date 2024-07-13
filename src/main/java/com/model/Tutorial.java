package com.model;

import jakarta.persistence.*;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor


@Table(name="Tutorial")


public class Tutorial {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @Column (name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name= "description")
    private String description;


    @Temporal(TemporalType.DATE)
    private Date date;
}

    @Column(name = "date")
    private int date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}