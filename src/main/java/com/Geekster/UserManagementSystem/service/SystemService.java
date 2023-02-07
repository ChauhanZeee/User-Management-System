package com.Geekster.UserManagementSystem.service;

import com.Geekster.UserManagementSystem.model.SystemModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class SystemService {

    private static List<SystemModel> models= new ArrayList<>();

    public void addUser(SystemModel systemModel){
        models.add(systemModel);
    }
    public List<SystemModel> showAllUser(){
        return models;
    }
    public SystemModel showById(int userId){
        Predicate<? super SystemModel> predicate = model -> model.getUserId() == userId;
        SystemModel model = models.stream().filter(predicate).findFirst().get();
        return model;
    }
    public void updateUser(int userId, SystemModel newSystemModel){
        SystemModel model = showById(userId);

        model.setUserId(newSystemModel.getUserId());
        model.setName(newSystemModel.getName());
        model.setUserName(newSystemModel.getUserName());
        model.setAddress(newSystemModel.getAddress());
        model.setPhoneNo(newSystemModel.getPhoneNo());
    }
    public void deleteUser(int userId){
        Predicate<? super SystemModel> predicate = model -> model.getUserId() == userId;
         models.removeIf(predicate);
    }
}
