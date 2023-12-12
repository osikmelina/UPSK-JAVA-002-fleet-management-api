package com.fleetmanagement.project.controllers;

import com.fleetmanagement.project.repositories.TaxiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxiController {
    @Autowired
    TaxiRepository taxiRepository;
    
}
