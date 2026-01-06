package com.example.tp13_web_service_soap.repositories;

import com.example.tp13_web_service_soap.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
}