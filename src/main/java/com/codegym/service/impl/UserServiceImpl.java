package com.codegym.service.impl;

import com.codegym.model.User;
import com.codegym.repository.UserRepository;
import com.codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository customerRepository;
    @Override
    public List<User> findAll() {
        return (List<User>) customerRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void save(User customer) {
        customerRepository.save(customer);
    }
}
