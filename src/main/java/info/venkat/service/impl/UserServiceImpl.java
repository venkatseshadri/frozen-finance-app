package info.venkat.service.impl;

import info.venkat.model.User;
import info.venkat.repository.UserRepository;
import info.venkat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User myUser) {
        return userRepository.save(myUser);
    }

    public Optional<User> getUser(String userId) {
        return userRepository.findById(userId);
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }

    public User updateUser(User myUser) {
        return userRepository.save(myUser);
    }

    @Override
    public User createDefaultUser() {
        User newDefaultUser = new User("userId1","jdoe","John","Doe");
        return addUser(newDefaultUser);
    }
}
