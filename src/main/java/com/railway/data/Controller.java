package com.railway.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("app")
public class Controller {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ToyRepository toyRepository;

    @GetMapping("users")
    public ResponseEntity getAllUser(){
        System.out.println("Call Get All User");
        return new ResponseEntity<>(userRepository.findAll(),HttpStatus.OK);
    }

    @PostMapping("user")
    public ResponseEntity createUser(@RequestBody UserCreateRequest requestBody){
        User user = new User();
        user.setId(requestBody.getId());
        user.setAge(requestBody.getAge());
        user.setName(requestBody.getName());

        return new ResponseEntity<>(userRepository.save(user),HttpStatus.OK);
    }

    @GetMapping("toys")
    public ResponseEntity getAllToy(){
        List<Toy> toys = toyRepository.findAll();
//        System.out.println(toys.get(0));

        return new ResponseEntity<>(toys,HttpStatus.OK);
    }

    @GetMapping("/toy/{id}")
    public ResponseEntity getToy(String id){

        return new ResponseEntity<>(toyRepository.findByUser_Id(id),HttpStatus.OK);
    }

    @PostMapping("toy")
    public ResponseEntity createToy(@RequestBody ToyCreateRequest requestBody){
        Toy toy = new Toy();

        toy.setId(requestBody.getId());
        toy.setCategory(requestBody.getCategory());
        toy.setName(requestBody.getName());

        return new ResponseEntity<>(toyRepository.save(toy),HttpStatus.OK);
    }
}
