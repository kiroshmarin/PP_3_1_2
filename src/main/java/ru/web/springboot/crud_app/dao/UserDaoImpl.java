package ru.web.springboot.crud_app.dao;

import org.springframework.stereotype.Repository;
import ru.web.springboot.crud_app.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> findAllUsers() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void updateUser(User updatedUser) {
        entityManager.merge(updatedUser);
    }

    @Override
    public void deleteUser(Long id) {
//        entityManager.createQuery("DELETE FROM User u WHERE u.id=:id", User.class)
//                .setParameter("id", id)
//                .executeUpdate();
        entityManager.remove(entityManager.find(User.class, id));
    }

    @Override
    public User showUser(Long id) {
        return entityManager.find(User.class, id);
    }


}
