package com.model;

import jakarta.persistence.*;

@Entity
@Table(name="tutorial")
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name= "description")
    private String description;
    @Column(name = "done")
    private boolean done;
}
