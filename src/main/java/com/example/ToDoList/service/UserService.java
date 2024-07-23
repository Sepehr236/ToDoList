package com.example.ToDoList.service;

import com.example.ToDoList.model.User;
import com.example.ToDoList.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User signIn(User user){
        return userRepository.save(User.builder()
                        .name(user.getName())
                        .gmail(user.getGmail())
                        .password(user.getPassword())
                        .phoneNumber(user.getPhoneNumber())
                .build());
    }
}
