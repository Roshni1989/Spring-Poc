package com.ecom.customer.config;

import com.ecom.customer.entity.Customer;
import com.ecom.customer.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabse {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabse.class);

    @Bean
    CommandLineRunner initDatabse(CustomerRepository repository){

        return args -> {
            log.info("Pre - loading :"+ repository.save(new Customer(1,"Roshni")));
            log.info("Pre - loading :"+ repository.save(new Customer(2,"kamal")));
        };
    }

}
