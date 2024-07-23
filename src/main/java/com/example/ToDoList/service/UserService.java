package com.example.ToDoList.service;

import com.example.ToDoList.dto.LogInRequest;
import com.example.ToDoList.dto.UpdateUserRequest;
import com.example.ToDoList.exeption.IncorrectPassword;
import com.example.ToDoList.exeption.ResourceNotFound;
import com.example.ToDoList.model.User;
import com.example.ToDoList.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {
    private Boolean logIn = false;
    private User logInUser;
    private final UserRepository userRepository;

    public User signIn(User user){
        return userRepository.save(User.builder()
                        .name(user.getName())
                        .gmail(user.getGmail())
                        .password(user.getPassword())
                        .phoneNumber(user.getPhoneNumber())
                .build());
    }

    public User logIn(LogInRequest logInRequest){
        User user = userRepository.findByName(logInRequest.getName());
        if(user == null){
            throw ResourceNotFound.instance("User notfound!!!");
        }else{
            if(Objects.equals(user.getPassword(), logInRequest.getPassword())){
                logIn = true;
                logInUser = user;
                return user;
            }else{
                throw IncorrectPassword.instance("Password is incorrect !!!");
            }
        }
    }

    public User updateUser(User user){
        if(logIn){
            logInUser.setName(user.getName());
            logInUser.setGmail(user.getGmail());
            logInUser.setPhoneNumber(user.getPhoneNumber());
            logInUser.setPassword(user.getPassword());
        }else{
            throw ResourceNotFound.instance("You have to log in first");
        }

        return userRepository.save(user);
    }
}
