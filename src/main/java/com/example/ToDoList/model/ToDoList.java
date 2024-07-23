package com.example.ToDoList.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class ToDoList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String startingDate;

    @OneToMany
    private List<ActionToDo> actionsToDo;

    @Version
    private Long version;
}
