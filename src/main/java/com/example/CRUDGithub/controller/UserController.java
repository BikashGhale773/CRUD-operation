package com.example.CRUDGithub.controller;

import com.example.CRUDGithub.entities.User;
import com.example.CRUDGithub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //handler method to get all list of users
    @GetMapping("/users")
    public List<User> findUsers(){
        return userService.findAllUsers();
    }

    //handler method to find by Id
    @GetMapping("/users/{id}")
    public User findUserById(@PathVariable("id") Long id){
        return userService.findById(id);
    }


    //handler method to post data in database
    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        User u = userService.postUser(user);
        System.out.println(u);
        return u;
    }

    //handler method to delete user by id
    @GetMapping("/user/{id}")
    public String deleteById(@PathVariable("id") Long id){
        userService.deleteUser(id);
        return "Deleted successfully";
    }

    //handler method to update
    @PostMapping("/users/{id}")
        public User updateUserById(@PathVariable("id") Long id, @RequestBody User user){
        //get student from database
        System.out.println(user);
            User updateUser = userService.findById(id);
            updateUser.setId(id);
            updateUser.setName(user.getName());
            updateUser.setAddress(user.getAddress());
            user.setUniversity(user.getUniversity());

           return userService.updateUser(updateUser);
    }
}
