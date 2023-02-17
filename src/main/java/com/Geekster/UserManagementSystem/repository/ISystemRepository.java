package com.Geekster.UserManagementSystem.repository;

import com.Geekster.UserManagementSystem.model.SystemModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISystemRepository extends JpaRepository<SystemModel, Integer> {
}
