package info.venkat.service;

import info.venkat.model.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    UserEntity addUser(UserEntity myUserEntity);
    Optional<UserEntity> getUser(String UserEntityId);
    List<UserEntity> getAllUsers();
    void deleteUser(String UserEntityId);
    UserEntity updateUser(UserEntity myUserEntity);
    UserEntity createDefaultUser();
}
