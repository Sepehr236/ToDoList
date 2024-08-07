package com.example.ToDoList.model;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class WorkList extends ToDoList{
    private final String category = "Work";

    @Setter
    private String marginDate;
}
