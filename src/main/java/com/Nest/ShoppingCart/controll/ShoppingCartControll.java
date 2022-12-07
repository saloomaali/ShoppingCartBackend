package com.Nest.ShoppingCart.controll;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCartControll {


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/signUp", consumes = "application/json", produces = "application/json")
    public String signUp(){
        return "signUp";
    }
}
