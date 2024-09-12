package org.example.startup2.service.impl;

import org.example.startup2.dao.UserDao;
import org.example.startup2.model.UserDTO;
import org.example.startup2.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserDTO selectUser(String email) {
        return userDao.selectUser(email);
    }

    @Override
    public List<UserDTO> selectAllUsers() {
        return userDao.selectAllUsers();
    }

    @Override
    public UserDTO insertUser(UserDTO user) {
        return userDao.insertUser(user);
    }

    @Override
    public UserDTO insertUser(UserDTO user, String role) {
        // Primero insertamos el usuario
        UserDTO insertedUser = userDao.insertUser(user);
        // Luego insertamos el rol del usuario
        userDao.insertUserRole(insertedUser, role);
        return insertedUser;
    }

    @Override
    public UserDTO updateUser(UserDTO user) {
        return userDao.updateUser(user);
    }

    @Override
    public boolean deleteUser(int id) {
        return userDao.deleteUser(id);
    }

    @Override
    public UserDTO login(String email) {
        return userDao.login(email);
    }
}

