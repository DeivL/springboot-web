package com.curso.spring.springboot_web.Core.Products;

import org.springframework.stereotype.Service;

import com.curso.spring.springboot_web.Dto.ProductDTO;

@Service
public interface ProductDataService {

    ProductDTO create(ProductDTO entity);
    ProductDTO update(ProductDTO entity);
    ProductDTO delete(ProductDTO entity);
 
}