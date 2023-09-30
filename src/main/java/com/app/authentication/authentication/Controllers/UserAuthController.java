package com.app.authentication.authentication.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.authentication.authentication.Models.User;
import com.app.authentication.authentication.Repository.UserRepo;


@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserAuthController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping
    public List<User> getUsers(){
        return userRepo.findAll();
    }


}
