package com.curso.spring.springboot_web.Core.Products;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.curso.spring.springboot_web.Dto.ProductDTO;

@Service
public interface ProductsQueryService {

    /**
     * getAllProducts
     * @return List<ProductEntity>
     */
    List<ProductDTO> getAllProducts();

    /**
     * getProductById
     * @param id
     * @return productDTO
     */
    ProductDTO getProductById(Integer id);
}