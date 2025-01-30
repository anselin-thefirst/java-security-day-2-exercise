package com.booleanuk.api.library.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    public Item(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Item (int id) {
        this.id = id;
    }
}
