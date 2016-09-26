package mprofile.repository.impl;

import mprofile.core.entity.UserInfo;
import mprofile.core.entity.UserinfoId;
import mprofile.repository.UserInfoDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by sohil chhabriya on 27-Apr-15.
 */
@Repository
public class UserInfoDaoImpl implements UserInfoDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public UserinfoId getUserById(int id) {
        return em.find(UserInfo.class,id).getId();
    }

    @Override
    public UserinfoId getUserByName(String name) {
        return em.find(UserInfo.class,name).getId();
    }

    @Override
    public UserinfoId addUser(UserinfoId user) {
        em.persist(user);
        return user;
    }

    @SuppressWarnings("unchecked")
	@Override
    public List<UserinfoId> getAllUsers() {
        Query query = em.createQuery("SELECT ui from userinfo ui");
        return query.getResultList();
    }
}
