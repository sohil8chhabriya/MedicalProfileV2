package mprofile.rest.controllers;

import mprofile.entity.User;
import mprofile.rest.exceptions.ConflictException;
import mprofile.rest.resources.UserResources;
import mprofile.rest.resources.asm.UserResourcesAsm;
import mprofile.services.UserService;
import mprofile.services.exception.UserExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.net.URI;

/**
 * Created by sohil chhabriya on 25-Apr-15.
 */

@Controller
@RequestMapping("/rest/user")
public class UserController {
    public UserService userService;

    @Autowired
    public UserController(UserService userService){ this.userService = userService;}

    @RequestMapping(value="/test", method = RequestMethod.GET)
    public void hello(){
       System.out.print("helloWorld");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<UserResources> getUserById(@PathVariable int id){
        System.out.println("into rest client");
        User user = userService.getUserById(id);
        if (user != null){
            UserResources userResources = new UserResourcesAsm().toResource(user);
            return new ResponseEntity<UserResources>(userResources, HttpStatus.OK);
        }
        else
            return new ResponseEntity<UserResources>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<UserResources> addUser(@RequestBody UserResources addUser){
     try{
        User user = userService.addUser(addUser.toUser());
        UserResources res = new UserResourcesAsm().toResource(user);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create(res.getLink("self").getHref()));
        return new ResponseEntity<UserResources>(res, headers, HttpStatus.CREATED);
    } catch(UserExistsException exception) {
        throw new ConflictException(exception);
    }
    }

    @RequestMapping(value = "/{phone}", method = RequestMethod.GET)
    public ResponseEntity<UserResources> getUserByPhone(@PathVariable int phone){
        User user = userService.getUserByPhone(phone);
        if (user != null){
            UserResources userResources = new UserResourcesAsm().toResource(user);
            return new ResponseEntity<UserResources>(userResources, HttpStatus.OK);
        }
        else
            return new ResponseEntity<UserResources>(HttpStatus.NOT_FOUND);
    }

}
