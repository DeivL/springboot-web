package com.curso.spring.springboot_web.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {

    @GetMapping("/details")
    public String detailString() {
        return "details";
    }
    
    @GetMapping("users")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
}