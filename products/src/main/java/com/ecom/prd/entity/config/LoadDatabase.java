package com.ecom.prd.entity.config;

import com.ecom.prd.entity.entity.Dealer;
import com.ecom.prd.entity.entity.Product;
import com.ecom.prd.entity.repository.DealerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.ecom.prd.entity.repository.ProductRepository;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ProductRepository repository, DealerRepository dealerRepository){
        return args -> {
            log.info("pre - Loading dealer: "+dealerRepository.save(new Dealer(1,"Kamal")));
            log.info("pre - Loading dealer: "+dealerRepository.save(new Dealer(2,"Roshni")));
            log.info("Pre - loading :"+ repository.save(new Product(1,"Soap","bathing",45.00,dealerRepository.findById(1).get())));
            log.info("Pre - loading :"+ repository.save(new Product(2,"dress","clothing",890.00,dealerRepository.findById(2).get())));

        };
    }


}
