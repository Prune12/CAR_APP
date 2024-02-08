package com.backend.car_app.repository;

import com.backend.car_app.models.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends JpaRepository<Vendor,Long> {
    Vendor findByEmail(String email);
}
