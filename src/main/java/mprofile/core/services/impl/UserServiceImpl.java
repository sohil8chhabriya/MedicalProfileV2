package mprofile.core.services.impl;

import mprofile.core.entity.Logincredentails;
import mprofile.core.entity.UserinfoId;
import mprofile.repository.AuthDao;
import mprofile.repository.UserInfoDao;
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
    private UserInfoDao user;
    @Autowired
    private AuthDao userAuth;

    @Override
    public UserinfoId getUserById(int id) {
        return user.getUserById(id);
    }

    @Override
    public Boolean isUserAuth(int id, String password) {
        boolean isUserAuth = false;
        Logincredentails cred = userAuth.getUserAuth(id);
        //todo: fire not found exception
        if (cred != null) {
            if (cred.getPassword().equals(password)){
                isUserAuth = true;
            }
        }
        System.out.println("return: " + isUserAuth);
        return isUserAuth;
    }

    @Override
    public UserinfoId getUserByName(String name) {
        return user.getUserByName(name);
    }

    @Override
    public UserinfoId addUser(UserinfoId userData) {
        UserinfoId userAccount = getUserById(userData.getId());
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
