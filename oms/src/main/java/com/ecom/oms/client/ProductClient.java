package com.ecom.oms.client;

import com.ecom.oms.model.ProductResource;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(name="Product",url = "http://localhost:8083/products")
public interface ProductClient {

    @RequestMapping(value = "/{id}", method = GET)
    Optional<ProductResource> getProductById(@PathVariable("id") Integer id);

    @RequestMapping(value = "/name/{productName}", method = GET)
    Optional<ProductResource> getProductByName(@PathVariable("productName") String productName);

}
