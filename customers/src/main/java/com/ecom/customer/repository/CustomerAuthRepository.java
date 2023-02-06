package com.ecom.customer.repository;

import com.ecom.customer.entity.CustomerAuth;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerAuthRepository extends JpaRepository<CustomerAuth,Integer> {

    Optional<CustomerAuth> findByCustName(String custName);
}
