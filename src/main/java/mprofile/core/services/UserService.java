package mprofile.core.services;

import mprofile.core.entity.UserinfoId;

/**
 * Created by sohil chhabriya on 25-Apr-15.
 */

public interface UserService {
    public UserinfoId getUserById(int id);
    public UserinfoId getUserByName(String name);
    public UserinfoId addUser(UserinfoId user);
    public Boolean isUserAuth(int id, String password);
}
