package mprofile.repository;

import mprofile.entity.User;

/**
 * Created by sohil chhabriya on 27-Apr-15.
 */
public interface UserDao {
    public User getUserById(int id);
    public User getUserByPhone(int phone);
    public User addUser(User user);
}
