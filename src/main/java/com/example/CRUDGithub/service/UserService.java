package com.example.CRUDGithub.service;

import com.example.CRUDGithub.entities.User;

import java.util.List;

public interface UserService {

    public List<User> findAllUsers();

    public User findById(Long id);
    public User postUser(User user);

    public void deleteUser(Long id);

    public User updateUser(User user);
}
