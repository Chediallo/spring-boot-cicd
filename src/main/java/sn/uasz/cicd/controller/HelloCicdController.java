/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.uasz.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.uasz.cicd.records.User;

/**
 *
 * @author dev 2
 */
@RestController
@RequestMapping("/api")
public class HelloCicdController {
    
    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring Boot CICD ";
    }
    
    @GetMapping("/users")
    public User getUsers(){
        return new User(1l, "Mohamed", "Diallo");
    }
}
