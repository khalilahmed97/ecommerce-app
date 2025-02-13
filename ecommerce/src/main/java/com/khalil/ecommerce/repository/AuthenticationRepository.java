package com.khalil.ecommerce.repository;

import com.khalil.ecommerce.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthenticationRepository extends JpaRepository<Customer, Integer> {
}
