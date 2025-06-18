package com.curso.spring.springboot_web.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersDTO {

    private Integer id;
    private String userName;
    private String password;
    private String name;
    private String lastName;
    private String role;
    private String email;
    
    

    

}
