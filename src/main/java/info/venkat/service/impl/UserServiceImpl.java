package info.venkat.service.impl;

import info.venkat.model.UserEntity;
import info.venkat.repository.UserRepository;
import info.venkat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public UserEntity addUser(UserEntity myUser) {
        return userRepository.save(myUser);
    }

    public Optional<UserEntity> getUser(String userId) {
        return userRepository.findById(userId);
    }

    public List<UserEntity> getAllUsers() {
        List<UserEntity> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }

    public UserEntity updateUser(UserEntity myUser) {
        return userRepository.save(myUser);
    }

    @Override
    public UserEntity createDefaultUser() {
        UserEntity newDefaultUser = new UserEntity("userId1","jdoe","John","Doe");
        return addUser(newDefaultUser);
    }
}
