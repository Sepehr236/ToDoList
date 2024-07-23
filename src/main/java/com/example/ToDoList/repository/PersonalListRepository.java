package com.example.ToDoList.repository;

import com.example.ToDoList.model.PersonalList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalListRepository extends JpaRepository<PersonalList, Long> {
}
