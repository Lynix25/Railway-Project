package com.railway.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class Controller {
    @Autowired
    UserRepository userRepository;

    @GetMapping
    public ResponseEntity getAllUser(){

        return new ResponseEntity<>(userRepository.findAll(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createUser(@RequestBody UserCreateRequest requestBody){
        UserModel user = new UserModel();
        user.setId(requestBody.getId());
        user.setAge(requestBody.getAge());
        user.setName(requestBody.getName());

        return new ResponseEntity<>(userRepository.save(user),HttpStatus.OK);
    }
}
