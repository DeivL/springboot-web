package com.curso.spring.springboot_web.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.spring.springboot_web.Core.Products.ProductDataService;
import com.curso.spring.springboot_web.Dto.ProductDTO;


@Controller
@RestController(value = "products")
public class ProductsController {
    
    @Autowired
    private ProductDataService productDataService;
    @PostMapping("/createProduct")
    public ResponseEntity<ProductDTO> create(@RequestBody ProductDTO entity) {
        
        
        
        return ResponseEntity.ok(productDataService.create(entity));
    }
    
}
