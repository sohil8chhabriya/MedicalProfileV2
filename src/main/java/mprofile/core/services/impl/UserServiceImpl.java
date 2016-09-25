package mprofile.core.services.impl;

import mprofile.core.entity.UserInfo;
import mprofile.repository.UserDao;
import mprofile.core.services.UserService;
import mprofile.core.services.exception.UserExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by sohil chhabriya on 27-Apr-15.
 */

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao user;

    @Override
    public UserInfo getUserById(int id) {
        return user.getUserById(id);
    }

    @Override
    public boolean isUserAuth(int id) {
        if(getUserById(id)!=null){

        }
        return false;
    }

    @Override
    public UserInfo getUserByName(String name) {
        return user.getUserByName(name);
    }

    @Override
    public UserInfo addUser(UserInfo userData) {
        UserInfo userAccount = getUserById(userData.getId());
        if(user != null)
        {
            throw new UserExistsException("You already have an account your id with following account details" +
                    "\n" + userAccount.getId() +
                    "\n" + userAccount.getEmailId() +
                    "\n" + userAccount.getPhone());
        }

        return user.addUser(userAccount);
    }
}
