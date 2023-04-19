package com.example.http.controller;

import com.example.http.dto.UserDTO;
import com.example.http.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v/user")
public class userController {
    @Autowired
    private UserService userService;
    @GetMapping("/getUsers")
    public List<UserDTO> getUser(){
        return userService.getAllUsers();
    }
    @PostMapping("/postUser")
    public UserDTO postUser(@RequestBody UserDTO userDTO){
    return userService.saveUser(userDTO);
    }
}
