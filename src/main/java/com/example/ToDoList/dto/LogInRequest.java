package com.example.ToDoList.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LogInRequest {
    private String name;
    private String password;
}
