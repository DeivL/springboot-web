package com.curso.spring.springboot_web.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Products")
public class UsersEntity {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "Username")
    private String userName;
   
    @Column(name = "Password")
    private String password;
   
    @Column(name = "Name")
    private String name;
   
    @Column(name = "Last_Name")
    private String lastName;
   
    @Column(name = "Role")
    private String role;
   
    @Column(name = "Email")
    private String email;
   
    @Column(name = "EntryDate")
    private String entryDate;
   
    @Column(name = "LeavingDate")
    private String leavingDate;
   
    
 
}
