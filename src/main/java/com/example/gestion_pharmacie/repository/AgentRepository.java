package com.example.gestion_pharmacie.repository;

import com.example.gestion_pharmacie.model.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Integer> {
}
