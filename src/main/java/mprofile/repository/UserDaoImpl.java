package mprofile.repository;

import mprofile.core.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

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
    public User getUserByName(String name) {
        return em.find(User.class,name);
    }

    @Override
    public User addUser(User user) {
        em.persist(user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        Query query = em.createQuery("SELECT ui from userinfo ui");
        return query.getResultList();
    }
}
