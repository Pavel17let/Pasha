package com.example.demoX;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PupiolRepository extends JpaRepository<Pupiol, UUID> {
}
