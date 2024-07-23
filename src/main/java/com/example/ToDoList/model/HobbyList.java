package com.example.ToDoList.model;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class HobbyList extends ToDoList{
    private final String category = "Hobby";

    @Setter
    private String marginDate;
}
