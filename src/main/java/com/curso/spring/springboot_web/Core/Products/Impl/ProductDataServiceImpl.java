package com.curso.spring.springboot_web.Core.Products.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.curso.spring.springboot_web.Dto.ProductDTO;
import com.curso.spring.springboot_web.Entities.ProductEntity;

@Service
public class ProductDataServiceImpl {


    public ProductDTO create (ProductDTO product) {
       ProductEntity productEntity = new ProductEntity();
       
        return product;
    }
 
}