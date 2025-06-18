package com.curso.spring.springboot_web.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.spring.springboot_web.Entities.ProductEntity;

@Repository
public interface ProductsRepository extends JpaRepository<ProductEntity, Integer> {
 
  List<ProductEntity> findByName(String name);
  List<ProductEntity> findByType(String type);
  List<ProductEntity> findByStyle(String style);
  List<ProductEntity> findByTime(Integer time);
  List<ProductEntity> findByNameContainingIgnoreCase(String name);
  List<ProductEntity> findByDescriptionContainingIgnoreCase(String description);
}
