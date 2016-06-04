package services;

import models.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Master on 6/4/16.
 */
@Stateless
public class UserService {
    @PersistenceContext
    private EntityManager entityManager;

    public List<User> getAll() {
        TypedQuery<User> query = entityManager.createQuery("select u from User u", User.class);
        return query.getResultList();
    }
}