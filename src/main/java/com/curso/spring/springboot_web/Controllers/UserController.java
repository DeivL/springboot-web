package com.curso.spring.springboot_web.Controllers;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.spring.springboot_web.Dto.UsersDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@Controller
@RequestMapping("/users")
public class UserController {

    /*@GetMapping("/")
    public ResponseEntity getAllUsers() {
    return ResponseEntity.ok(usersService.getAllUsers());
    
    }
    
    @GetMapping("/id")
    public ResponseEntity getUsersById(@RequestParam Integer id) {
        List<UsersDTO> users = usersService.getUsersById(id);
        if (users.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(users);
        
    }
    @GetMapping("/username")
    public ResponseEntity getUsersByUsername(@RequestBody String username) {
        List<UsersDTO> users = usersService.getUsersByUsername(username);
        if (users.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(users);
        x
    }
    
    @PostMapping("/create")
   public ResponseEntity createUser(@RequestBody UsersDTO user) {
    //  TODO: process Create request 
    return ResponseEntity.ok(usersService.createUser(user));
   }

   @PutMapping("modify/{id}")
   public String putMethodName(@PathVariable String id, @RequestBody String entity) {
       //TODO: process PUT request
       
       return entity;
   }
   @PostMapping("/delete")
   public ResponseEntity deleteUser(@RequestBody String entity) {
       //TODO: process POST request
       
       return entity;
   }
   */
   

    
}