package com.fernandez.operatingsystem.q.repository;

import com.fernandez.operatingsystem.q.dao.OperatingSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatingSystemRepository extends JpaRepository<OperatingSystem, Long>,
  JpaSpecificationExecutor<OperatingSystem> {
}
