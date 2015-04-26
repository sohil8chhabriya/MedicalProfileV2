package mprofile.repository;

import mprofile.entity.User;
import mprofile.repository.UserDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by sohil chhabriya on 27-Apr-15.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public User getUserById(int id) {
        return em.find(User.class,id);
    }

    @Override
    public User getUserByPhone(int phone) {
        return em.find(User.class,phone);
    }

    @Override
    public User addUser(User user) {
        em.persist(user);
        return user;
    }
}
