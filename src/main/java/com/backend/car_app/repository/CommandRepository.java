package com.backend.car_app.repository;

import com.backend.car_app.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface CommandRepository extends JpaRepository<Commande,Long> {
}
