package com.indekos.controller;

import com.indekos.services.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rent")
public class RentController {
    @Autowired
    RentService rentService;
//    @PostMapping
//    public ResponseEntity creteRent(){
//        return new ResponseEntity<>(rentService.create(), HttpStatus.OK);
//    }
}
