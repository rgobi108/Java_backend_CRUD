package com.usermanagement.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usermanagement.user.entity.User;
import com.usermanagement.user.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repo;
    
    public List<User> getAllUser() {
        return repo.findAll();
    }
    
    public User saveUser(User user) {
        return repo.save(user);
    }
    
    public User updateUser(Long id, User user) {
        User existing = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        
        existing.setName(user.getName());
        existing.setEmail(user.getEmail());
        
        return repo.save(existing);
    }
    
    public void deleteUser(Long id) {
        repo.deleteById(id);
    }
}