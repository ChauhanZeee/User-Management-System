package com.Geekster.UserManagementSystem.service;

import com.Geekster.UserManagementSystem.model.SystemModel;
import com.Geekster.UserManagementSystem.repository.ISystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SystemService implements ISystemService {
    @Autowired
    private ISystemRepository systemRepository;

    private static List<SystemModel> models= new ArrayList<>();
    @Override
    public void addUser(SystemModel systemModel){
        systemRepository.save(systemModel);
    }
    @Override
    public List<SystemModel> showAllUser(){
        return systemRepository.findAll();
    }
    @Override
    public SystemModel showById(int userId){
        return systemRepository.findById(userId).get();
    }
    @Override
    public void updateUser(int userId, SystemModel systemModel){
        systemRepository.findById(userId).get();
        systemRepository.save(systemModel);
    }
    @Override
    public void deleteUser(int userId){
        systemRepository.deleteById(userId);
    }
}
