/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.uasz.cicd.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id, @RequestParam String prenom, @RequestParam String nom){
        return new User(id, prenom, nom);
    }
    
    @GetMapping("/hello-modif")
    public String get(){
        return "Hello apres modification";
    }
    
    @GetMapping("/users")
    public List<User> getUser(){
        User user1 = new User(1l, "Alpha", "Diop");
        User user2 = new User(2l, "Modou", "Fall");
        User user3 = new User(3l, "Sana", "Badji");
        return List.of(user1,user2,user3);
    }
    
    @GetMapping("/notes")
    public List<Note> getNote(){
        Note user1 = new Note(1l, 10d,"Alpha");
        Note user2 = new Note(2l,15d, "Modou");
        Note user3 = new Note(3l, 19d,"Sana");
        return List.of(user1,user2,user3);
    }
    
    public record Note(Long id, Double note, String prenom){}
}
