package com.khalil.ecommerce.controller;

import com.khalil.ecommerce.model.Customer;
import com.khalil.ecommerce.service.CustomerService;
import com.khalil.ecommerce.dto.AuthenticationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class AuthenticationController {

    @Autowired
    private CustomerService service;

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/auth/register")
    public String register(@RequestBody Customer customer){
        bCryptPasswordEncoder = new BCryptPasswordEncoder(10);
        String hashedPassword = bCryptPasswordEncoder.encode(customer.getPassword());
        customer.setPassword(hashedPassword);
        this.service.addUser(customer);
        return "The User has been registered Successfully";
    }

    public String login(@RequestBody AuthenticationDTO customer){

        if(!(customer.getEmail().isBlank() || password.isBlank()))
            this.service.findUser(email, password);
            return "";

        else{
            return "";
        }
    }
}
