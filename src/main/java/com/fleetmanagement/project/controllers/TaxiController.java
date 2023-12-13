package com.fleetmanagement.project.controllers;

import com.fleetmanagement.project.models.TaxiModel;
import com.fleetmanagement.project.repositories.TaxiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaxiController {
    @Autowired
    TaxiRepository taxiRepository;

    @GetMapping("/taxis")
    public ResponseEntity<List<TaxiModel>> getAllTaxis(){
        return ResponseEntity.status(HttpStatus.OK).body(taxiRepository.findAll());
    }
}
