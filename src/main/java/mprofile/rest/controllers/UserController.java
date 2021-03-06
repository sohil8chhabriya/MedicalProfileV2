package mprofile.rest.controllers;

import mprofile.core.entity.LogincredentailsId;
import mprofile.core.entity.UserInfo;
import mprofile.core.entity.UserinfoId;
import mprofile.rest.exceptions.ConflictException;
import mprofile.rest.resources.UserResource;
import mprofile.rest.resources.asm.UserResourceAsm;
import mprofile.core.services.UserService;
import mprofile.core.services.exception.UserExistsException;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<UserResource> getUserById(@PathVariable int id){
        System.out.println("into rest client");
        UserinfoId user = userService.getUserById(id);
        if (user != null){
            UserResource userResource = new UserResourceAsm().toResource(user);
            System.out.println("==>  " + userResource.getId());
            return new ResponseEntity<UserResource>(userResource, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<UserResource>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value="/auth/{id}/{password}/", method = RequestMethod.GET)
    public ResponseEntity<Object> isUserAuth(@PathVariable int id, @PathVariable String password){
        System.out.println(">>Comment: authUser: " + password);
        JSONObject obj = new JSONObject();
        boolean isUserAuth = userService.isUserAuth(id, password);
        obj.put("auth", isUserAuth);
        return new ResponseEntity<Object>(obj, HttpStatus.OK);
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public ResponseEntity<UserResource> addUser(@RequestBody UserResource addUser){
     try{
        UserinfoId user = userService.addUser(addUser.toUser());
        UserResource res = new UserResourceAsm().toResource(user);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create(res.getLink("self").getHref()));
        return new ResponseEntity<UserResource>(res, headers, HttpStatus.CREATED);
        } catch(UserExistsException exception) {
        throw new ConflictException(exception);
    }
    }

   @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public ResponseEntity<UserResource> getUserByName(@PathVariable String name){
       UserinfoId user = userService.getUserByName(name);
        if (user != null){
            UserResource userResource = new UserResourceAsm().toResource(user);
            return new ResponseEntity<UserResource>(userResource, HttpStatus.OK);
        }
        else
            return new ResponseEntity<UserResource>(HttpStatus.NOT_FOUND);
    }
}
