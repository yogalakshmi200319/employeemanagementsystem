package net.java.springboot.service;


import java.util.List;

import net.java.springboot.dto.UserDto;
import net.java.springboot.model.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
