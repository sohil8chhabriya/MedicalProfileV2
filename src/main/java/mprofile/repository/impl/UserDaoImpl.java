package mprofile.repository.impl;

import mprofile.entity.User;
import mprofile.repository.UserDao;
import org.springframework.stereotype.Repository;

/**
 * Created by sohil chhabriya on 27-Apr-15.
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public User getUserByPhone(int phone) {
        return null;
    }

    @Override
    public User addUser(User user) {
        return null;
    }
}
