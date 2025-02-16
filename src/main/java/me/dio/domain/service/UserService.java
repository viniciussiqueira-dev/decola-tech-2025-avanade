package me.dio.domain.service;

import me.dio.domain.model.User;

public interface UserService {
    User create(User userToCreate);

    User findById(Long id);
}