package com.backend.car_app.repository;

import com.backend.car_app.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
   Optional<Client> findByNameIgnoreCase(String name);
   Client findByEmail(String email);
}
