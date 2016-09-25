package mprofile.repository;

import mprofile.core.entity.UserInfo;

import java.util.List;

/**
 * Created by sohil chhabriya on 27-Apr-15.
 */
public interface UserDao {
    public UserInfo getUserById(int id);
    public UserInfo getUserByName(String name);
    public UserInfo addUser(UserInfo user);
    public List<UserInfo> getAllUsers();
    public boolean getUserAuthString(int id);
}
