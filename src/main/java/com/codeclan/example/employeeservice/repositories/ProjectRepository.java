package com.codeclan.example.employeeservice.repositories;

import com.codeclan.example.employeeservice.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
