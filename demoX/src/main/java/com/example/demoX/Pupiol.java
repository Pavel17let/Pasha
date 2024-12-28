package com.example.demoX;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.experimental.Accessors;

import java.util.UUID;

@Entity
@Table(name = "pupiol")
@Accessors(chain = true)
public class Pupiol {

    @Id
    @Column(nullable = false, unique = true, name = "pupiol_id")
    private UUID pupiol_id;

    @Column(nullable = false, name = "pupiol_name")
    private String pupiol_name;

    @Column(nullable = false, name = "pupiol_surname")
    private String pupiol_surname;

    public UUID getPupiol_id() {
        return this.pupiol_id;
    }

    public String getPupiol_name() {
        return this.pupiol_name;
    }

    public String getPupiol_surname() {
        return this.pupiol_surname;
    }

    public Pupiol setPupiol_id(UUID pupiol_id) {
        this.pupiol_id = pupiol_id;
        return this;
    }

    public Pupiol setPupiol_name(String pupiol_name) {
        this.pupiol_name = pupiol_name;
        return this;
    }

    public Pupiol setPupiol_surname(String person_surname) {
        this.pupiol_surname = person_surname;
        return this;
    }
}