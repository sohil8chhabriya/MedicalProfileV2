package mprofile.repository;

import mprofile.core.entity.Logincredentails;
import mprofile.core.entity.LogincredentailsId;
import mprofile.core.entity.UserInfo;
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
    public UserInfo getUserById(int id) {
        return em.find(UserInfo.class,id);
    }

    @Override
    public boolean getUserAuthString(int id){
        LogincredentailsId logincredentailsId = new LogincredentailsId(id, 7);
        logincredentailsId.getPassword()
        Logincredentails logincredentails = new Logincredentails(logincredentailsId);

        return false;
    }

    @Override
    public UserInfo getUserByName(String name) {
        return em.find(UserInfo.class,name);
    }

    @Override
    public UserInfo addUser(UserInfo user) {
        em.persist(user);
        return user;
    }

    @SuppressWarnings("unchecked")
	@Override
    public List<UserInfo> getAllUsers() {
        Query query = em.createQuery("SELECT ui from userinfo ui");
        return query.getResultList();
    }
}
