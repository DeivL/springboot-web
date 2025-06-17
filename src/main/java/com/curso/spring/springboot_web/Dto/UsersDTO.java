package com.curso.spring.springboot_web.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersDTO {

    private Integer id;
    private String Username;
    private String Password;
    private String Name;
    private String Last_name;
    private String Role;
    private String Email;
    
    

    

}
