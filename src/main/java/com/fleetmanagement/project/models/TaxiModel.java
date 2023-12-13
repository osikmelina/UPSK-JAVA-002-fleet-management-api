package com.fleetmanagement.project.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "taxis")
public class TaxiModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String plate;

    public UUID getId() {
        return id;
    }

    public String getPlate() {
        return plate;
    }

    public void setIdTaxi(UUID id) {
        this.id = id;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
