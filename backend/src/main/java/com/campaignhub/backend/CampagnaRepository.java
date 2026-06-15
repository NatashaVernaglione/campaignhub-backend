package com.campaignhub.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampagnaRepository extends JpaRepository<Campagna, Long> {
}