package com.backend.car_app.repository;

import com.backend.car_app.models.VehiculeDocuments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeDocumentRepository extends JpaRepository<VehiculeDocuments,Long> {
}
