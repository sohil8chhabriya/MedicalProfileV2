package mprofile.repository;

import mprofile.entity.User;

import java.util.List;

/**
 * Created by sohil chhabriya on 27-Apr-15.
 */
public interface UserDao {
    public User getUserById(int id);
    public User getUserByName(String name);
    public User addUser(User user);
    public List<User> getAllUsers();
}
