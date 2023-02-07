package com.Geekster.UserManagementSystem.controller;

import com.Geekster.UserManagementSystem.model.SystemModel;
import com.Geekster.UserManagementSystem.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-management-system")
public class SystemController {

    @Autowired
    private SystemService systemservice;

    @PostMapping("/add-user")
    public void addUser(@RequestBody SystemModel systemModel){
        systemservice.addUser(systemModel);
    }

    @GetMapping("/get-user/userId/{userId}")
    public SystemModel showById(@PathVariable int userId){
        return systemservice.showById(userId);
    }

    @GetMapping("/get-all-user")
    public List<SystemModel> showAllUser(){
        return systemservice.showAllUser();
    }

    @PutMapping("/update-user/by/userId/{userId}")
    public void updateUser(@PathVariable int userId, @RequestBody SystemModel model) {
        systemservice.updateUser(userId, model);
    }

    @DeleteMapping("/remove-user/by/userId/{userId}")
    public void deleteUser(@PathVariable int userId){
        systemservice.deleteUser(userId);
    }

}
