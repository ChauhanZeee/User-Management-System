package com.Geekster.UserManagementSystem.service;

import com.Geekster.UserManagementSystem.model.SystemModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ISystemService {
    public void addUser(SystemModel systemModel);
    public SystemModel showById(int userId);
    public List<SystemModel> showAllUser();
    public void updateUser(@PathVariable int userId, @RequestBody SystemModel model);
    public void deleteUser(@PathVariable int userId);

}
