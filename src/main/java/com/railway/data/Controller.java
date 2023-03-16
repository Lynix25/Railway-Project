package com.railway.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class Controller {
    @GetMapping
    public ResponseEntity getAllUser(){
        return new ResponseEntity<>("Application is running",HttpStatus.OK);
    }

}
