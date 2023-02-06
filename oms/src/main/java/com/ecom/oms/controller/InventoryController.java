package com.ecom.oms.controller;


import com.ecom.oms.client.ProductClient;
import com.ecom.oms.entity.Inventory;
import com.ecom.oms.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Autowired
    private ProductClient productClient;

    @GetMapping("/")
    List<Inventory> getInventoryDetails(){
        return inventoryRepository.findAll();
    }

    @GetMapping("/productName/{productName}")
    Inventory getInventoryDetailsById(@PathVariable String productName){
        if(productClient.getProductByName(productName).isPresent()) {
            return inventoryRepository.findByProductName(productName).get();
        }else{
            return new Inventory();
        }
    }

    @PostMapping("/")
    Inventory createInventory(@RequestBody Inventory inventory){
        return inventoryRepository.save(inventory);
    }

    @PutMapping("/{id}")
    Object updateInventory(@RequestBody Inventory inventory, @PathVariable Integer id){
        return inventoryRepository.findById(id).map(inventory1 -> {
            inventory.setAvailbleQuantitiy(inventory.getAvailbleQuantitiy());
            return inventoryRepository.save(inventory);
        });
    }

}
