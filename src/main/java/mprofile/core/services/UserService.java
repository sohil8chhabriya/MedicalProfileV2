package mprofile.core.services;

import mprofile.core.entity.UserInfo;

/**
 * Created by sohil chhabriya on 25-Apr-15.
 */

public interface UserService {
    public UserInfo getUserById(int id);
    public UserInfo getUserByName(String name);
    public UserInfo addUser(UserInfo user);
}
