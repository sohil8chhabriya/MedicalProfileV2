package mprofile.core.services;

import mprofile.core.entity.User;
import org.springframework.context.annotation.Bean;

/**
 * Created by sohil chhabriya on 25-Apr-15.
 */

public interface UserService {
    public User getUserById(int id);
    public User getUserByName(String name);
    public User addUser(User user);
}
