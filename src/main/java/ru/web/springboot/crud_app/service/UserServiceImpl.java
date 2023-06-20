package ru.web.springboot.crud_app.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.web.springboot.crud_app.dao.UserDao;
import ru.web.springboot.crud_app.model.User;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public List<User> index() {
        return userDao.findAllUsers();
    }

    @Override
    @Transactional
    public void add(User user) {
        userDao.addUser(user);
    }

    @Override
    @Transactional
    public void update(Long id, User user) {
        userDao.updateUser(id, user);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userDao.deleteUser(id);
    }

    @Override
    public User show(Long id) {
        return userDao.showUser(id);
    }

}
