package com.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Tutorial")
<<<<<<< HEAD
@NoArgsConstructor

=======
>>>>>>> ad3344f919289c5a9671ac32a23eb0a7ef75f88e
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
