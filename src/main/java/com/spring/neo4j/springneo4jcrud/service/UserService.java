package com.spring.neo4j.springneo4jcrud.service;

import com.spring.neo4j.springneo4jcrud.repository.UserRepository;
import com.spring.neo4j.springneo4jcrud.repository.node.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        Optional<User> userFromDB = userRepository.findById(user.getId());

        if(userFromDB.isPresent()) {
            User userFromDBVal = userFromDB.get();
            userFromDBVal.setPlaces(user.getPlaces());
            userFromDBVal.setName(user.getName());
            return userRepository.save(userFromDBVal);
        } else {
            return null;
        }
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
