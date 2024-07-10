package com.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Tutorial")
@NoArgsConstructor
@AllArgsConstructor

public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name= "description")
    private String description;
    @Column(name = "date")
    private int date;
}
