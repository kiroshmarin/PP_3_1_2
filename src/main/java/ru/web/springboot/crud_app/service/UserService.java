package ru.web.springboot.crud_app.service;


import ru.web.springboot.crud_app.model.User;

import java.util.List;

public interface UserService {

    List<User> index();

    void add(User user);

    void update(User user);

    void delete(Long id);

    User show(Long id);
}
