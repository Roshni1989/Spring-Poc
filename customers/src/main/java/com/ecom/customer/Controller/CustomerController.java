package com.ecom.customer.Controller;


import com.ecom.customer.entity.Customer;
import com.ecom.customer.entity.CustomerAuth;
import com.ecom.customer.repository.CustomerAuthRepository;
import com.ecom.customer.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    private final CustomerRepository customerRepository;

    private final CustomerAuthRepository customerAuthRepository;

    public CustomerController(CustomerRepository customerRepository, CustomerAuthRepository customerAuthRepository) {
        this.customerRepository = customerRepository;
        this.customerAuthRepository = customerAuthRepository;
    }

    @GetMapping("/customers")
    public List<Customer> all() {
        return customerRepository.findAll();
    }

    @PostMapping("Customers")
    Customer newCustomer(@RequestBody Customer newCustomer) {
        return customerRepository.save(newCustomer);
    }

    @GetMapping("/customers/{custId}")
    Optional<Customer> one(@PathVariable int cid) {
        return customerRepository.findById(cid);
    }

    @PutMapping("/customers/{custId}")
    Object repalceCustomer(@RequestBody Customer newCustomer, @PathVariable int custId) {
        return customerRepository.findById(custId)
                .map(customer ->
                        {
                            customer.setCustName(customer.getCustName());
                            customer.setAddress(customer.getAddress());
                            return customerRepository.save(customer);
                        }
                );
    }

    @DeleteMapping("/customers/{custId}")
    void deleteCustomer(@PathVariable int custId) {
        customerRepository.deleteById(custId);

    }

    @GetMapping("/authenticate")
    Optional<CustomerAuth> getCustomer(@PathVariable String custName) {
        return customerAuthRepository.findByCustName(custName);
    }


    }

