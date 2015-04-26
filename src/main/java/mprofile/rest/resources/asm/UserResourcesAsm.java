package mprofile.rest.resources.asm;

import mprofile.entity.User;
import mprofile.rest.controllers.UserController;
import mprofile.rest.resources.UserResources;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Created by sohil chhabriya on 25-Apr-15.
 */
public class UserResourcesAsm extends ResourceAssemblerSupport<User, UserResources> {
    public UserResourcesAsm() {
        super(UserController.class, UserResources.class);
    }

    @Override
    public UserResources toResource(User user) {
        UserResources userResources = new UserResources();
        userResources.setName(user.getName());
        userResources.setDateOfBirth(user.getDateOfBirth());
        userResources.setAddress(user.getAddress());
        userResources.setBloodGroup(user.getBloodGroup());
        userResources.setCity(user.getCity());
        userResources.setCountry(user.getCountry());
        userResources.setEmergencyPhone(user.getEmergencyPhone());
        userResources.setPhone(user.getPhone());
        userResources.setPincode(user.getPincode());
        userResources.setEmailId(user.getEmailId());
        userResources.add(linkTo(methodOn(UserController.class).getUserById(user.getId())).withSelfRel());
        return userResources;
    }
}
