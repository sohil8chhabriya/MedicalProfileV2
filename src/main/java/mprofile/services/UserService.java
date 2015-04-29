package mprofile.services;

import mprofile.entity.User;

/**
 * Created by sohil chhabriya on 25-Apr-15.
 */
public interface UserService {
    public User getUserById(int id);
    public User getUserByName(String name);
    public User addUser(User user);
}
