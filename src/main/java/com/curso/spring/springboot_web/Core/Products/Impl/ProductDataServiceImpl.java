package com.curso.spring.springboot_web.Core.Products.Impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.spring.springboot_web.Dto.ProductDTO;
import com.curso.spring.springboot_web.Entities.ProductEntity;
import com.curso.spring.springboot_web.Mappers.productMapper;
import com.curso.spring.springboot_web.Repository.ProductsRepository;

@Service
public class ProductDataServiceImpl {

    @Autowired
    private ProductsRepository productsRepository;
    @Autowired
    private productMapper productMapper;

    public ProductDTO create (ProductDTO product) {
        
       ProductEntity productEntity = productMapper.toProductEntity(product);
        if(Objects.isNull(productEntity)){
            throw new IllegalArgumentException("Some attribute of the product cannot be null");
        } 
        // Save the new product
       productEntity = productsRepository.save(productEntity);
        // Convert the saved entity back to DTO
       ProductDTO newProduct = productMapper.toProductDTO(productEntity);
        return newProduct;
    }

    public ProductDTO update(ProductDTO product) {
        Optional<ProductEntity> productEntity = productsRepository.findById(product.getId());

        if(Objects.nonNull(productEntity)){
            ProductEntity updatedProduct = productEntity.get();
            updatedProduct.setName(product.getName());
            updatedProduct.setDescription(product.getDescription());
            updatedProduct.setType(product.getType());
            updatedProduct.setStyle(product.getStyle());
            updatedProduct.setTime(product.getTime());

            productsRepository.save(updatedProduct);
        }
        
        return product;
             
    }

    public ProductDTO delete(ProductDTO product) {
        Optional<ProductEntity> productEntity = productsRepository.findById(product.getId());
        if(Objects.nonNull(productEntity)) {
            productsRepository.delete(productEntity.get());
        } else {
            throw new IllegalArgumentException("Product not found");
        }
        return productMapper.toProductDTO(productEntity.get());
    }
}