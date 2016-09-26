package mprofile.repository;

import mprofile.core.entity.UserInfo;
import mprofile.core.entity.UserinfoId;

import java.util.List;

/**
 * Created by sohil chhabriya on 27-Apr-15.
 */
public interface UserInfoDao {
    public UserinfoId getUserById(int id);
    public UserinfoId getUserByName(String name);
    public UserinfoId addUser(UserinfoId user);
    public List<UserinfoId> getAllUsers();
}
