package com.fleetmanagement.project.repositories;

import com.fleetmanagement.project.models.TaxiModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TaxiRepository extends JpaRepository<TaxiModel, UUID> {
}
