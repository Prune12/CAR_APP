package com.backend.car_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.car_app.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
}
