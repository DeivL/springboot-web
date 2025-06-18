package com.curso.spring.springboot_web.Mappers;

import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import com.curso.spring.springboot_web.Dto.ProductDTO;
import com.curso.spring.springboot_web.Dto.UsersDTO;
import com.curso.spring.springboot_web.Entities.ProductEntity;
import com.curso.spring.springboot_web.Entities.UsersEntity;

import java.util.List;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
@Component
public interface productMapper {
    //MAPPING OF PRODUCTS
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "type", source = "type")
    @Mapping(target = "style", source = "style")
    @Mapping(target = "time", source = "time")
    ProductDTO toProductDTO(ProductEntity productEntity);
    ProductEntity toProductEntity(ProductDTO productDTO);
    List<ProductDTO> toProductsDTOList(List<ProductEntity> productEntities);
    List<ProductEntity> toProductsEntityList(List<ProductDTO> productDTOs);

    //MAPPING OF USERS
    @Mapping(target = "id", source = "id")
    @Mapping(target = "userName", source = "userName")
    @Mapping(target = "password", source = "password")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "role", source = "role")
    @Mapping(target = "email", source = "email")
    UsersDTO toUserDTO(UsersEntity usersEntity);
    UsersEntity toUserEntity(UsersDTO usersDTO);
    List<UsersDTO> toUsersDTOList(List<UsersEntity> usersEntities);
    List<UsersEntity> toUsersEntityList(List<UsersDTO> usersDTOs);
}
