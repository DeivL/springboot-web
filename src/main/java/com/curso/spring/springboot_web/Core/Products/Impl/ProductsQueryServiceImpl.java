package com.curso.spring.springboot_web.Core.Products.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.spring.springboot_web.Core.Products.ProductsQueryService;
import com.curso.spring.springboot_web.Dto.ProductDTO;
import com.curso.spring.springboot_web.Repository.ProductsRepository;

@Service
public class ProductsQueryServiceImpl implements ProductsQueryService {

    @Autowired
    private ProductsRepository productsRepository; 


    @Override
    public List<ProductDTO> getAllProducts() {
       List<ProductDTO> products = new ArrayList<>();
       
        return products;
    }


    @Override
    public ProductDTO getProductById(Integer id) {
        ProductDTO product = new ProductDTO();
        return product;
    }
}