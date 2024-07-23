package com.example.ToDoList.repository;

import com.example.ToDoList.model.HobbyList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HobbyListRepository extends JpaRepository<HobbyList, Long>{
}
