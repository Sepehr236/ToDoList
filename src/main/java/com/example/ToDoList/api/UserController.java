package com.example.ToDoList.api;

import com.example.ToDoList.dto.LogInRequest;
import com.example.ToDoList.dto.UpdateUserRequest;
import com.example.ToDoList.model.User;
import com.example.ToDoList.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/User")
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> sigIn(User user){
        return ResponseEntity.ok(userService.signIn(user));
    }

    @GetMapping
    public ResponseEntity<User> logIn(LogInRequest logInRequest){
        return ResponseEntity.ok(userService.logIn(logInRequest));
    }

    @PutMapping("/update")
    public ResponseEntity<User> updateUser(User user){
        return ResponseEntity.ok(userService.updateUser(user));
    }
}
