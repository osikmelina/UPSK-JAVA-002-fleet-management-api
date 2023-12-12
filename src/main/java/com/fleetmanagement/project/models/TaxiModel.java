package com.fleetmanagement.project.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_TAXIS")
public class TaxiModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idTaxi;
    private String plate;

    public UUID getIdTaxi() {
        return idTaxi;
    }

    public String getPlate() {
        return plate;
    }

    public void setIdTaxi(UUID idTaxi) {
        this.idTaxi = idTaxi;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
