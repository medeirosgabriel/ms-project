package com.ufcg.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufcg.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {}