package com.khalil.ecommerce.service;


import com.khalil.ecommerce.model.Customer;
import com.khalil.ecommerce.repository.AuthenticationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CustomerService {

    @Autowired
    private AuthenticationRepository repo;


    public void addUser(Customer customer){
        customer.setCreatedAt(LocalDateTime.now());
        System.out.println("Create At Debug: " + customer);
        this.repo.save(customer);
    }


    public AuthenticationDTO findUser(String email, String password){

        repo.findOne(email);
    }
}
