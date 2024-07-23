package com.example.ToDoList.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String password;
    private String gmail;
    private String phoneNumber;

    @Version
    private Long version;
}
