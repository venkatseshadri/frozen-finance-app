package info.venkat.service;

import info.venkat.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User addUser(User myUser);
    Optional<User> getUser(String userId);
    List<User> getAllUsers();
    void deleteUser(String userId);
    User updateUser(User myUser);
    User createDefaultUser();
}
