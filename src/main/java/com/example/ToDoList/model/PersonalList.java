package com.example.ToDoList.model;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PersonalList extends ToDoList{
    private final String category = "Personal";

    @Setter
    private String marginDate;
}
