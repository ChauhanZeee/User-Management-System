package com.Geekster.UserManagementSystem.controller;

import com.Geekster.UserManagementSystem.model.SystemModel;
import com.Geekster.UserManagementSystem.service.ISystemService;
import com.Geekster.UserManagementSystem.service.SystemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-management-system")
public class SystemController {

    @Autowired
    private ISystemService isystemservice;

    @PostMapping("/add-user")
    public void addUser(@Valid @RequestBody SystemModel systemModel){
        isystemservice.addUser(systemModel);
    }

    @GetMapping("/get-user/userId/{userId}")
    public SystemModel showById(@PathVariable int userId){
        return isystemservice.showById(userId);
    }

    @GetMapping("/get-all-user")
    public List<SystemModel> showAllUser(){
        return isystemservice.showAllUser();
    }

    @PutMapping("/update-user/by/userId/{userId}")
    public void updateUser(@Valid @PathVariable int userId, @RequestBody SystemModel systemModel) {
        isystemservice.updateUser(userId, systemModel);
    }

    @DeleteMapping("/remove-user/by/userId/{userId}")
    public void deleteUser(@PathVariable int userId){
        isystemservice.deleteUser(userId);
    }
}
