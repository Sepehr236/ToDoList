package com.example.ToDoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkListRepository extends JpaRepository<WorkListRepository, Long> {
}
