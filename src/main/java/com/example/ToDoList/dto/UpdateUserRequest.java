package com.example.ToDoList.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateUserRequest {
    private String name;
    private String gmail;
    private String password;
    private String phoneNumber;
    private String updatedName;
    private String updatedPassword;
}
