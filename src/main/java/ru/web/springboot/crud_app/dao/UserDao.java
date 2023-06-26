package ru.web.springboot.crud_app.dao;


import ru.web.springboot.crud_app.model.User;

import java.util.List;

public interface UserDao {

    List<User> findAllUsers();

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    User showUser(Long id);


}
