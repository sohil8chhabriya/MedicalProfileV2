package mprofile.rest.resources.asm;

import mprofile.core.entity.UserInfo;
import mprofile.rest.controllers.UserController;
import mprofile.rest.resources.UserResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Created by sohil chhabriya on 25-Apr-15.
 */
    public class UserResourceAsm extends ResourceAssemblerSupport<UserInfo, UserResource> {
    public UserResourceAsm() {
        super(UserController.class, UserResource.class);
    }

    @Override
    public UserResource toResource(UserInfo user) {
        UserResource userResource = new UserResource();
        userResource.setName(user.getName());
        userResource.setDateOfBirth(user.getDateOfBirth());
        userResource.setAddress(user.getAddress());
        userResource.setBloodGroup(user.getBloodGroup());
        userResource.setCity(user.getCity());
        userResource.setCountry(user.getCountry());
        userResource.setEmergencyPhone(user.getEmergencyPhone());
        userResource.setPhone(user.getPhone());
        userResource.setPincode(user.getPincode());
        userResource.setEmailId(user.getEmailId());
        userResource.setDateOfRegistration(user.getDateOfRegistration());
        userResource.add(linkTo(methodOn(UserController.class).getUserById(user.getId())).withSelfRel());
        //userResource.add(linkTo(methodOn(UserController.class).getUserByName(user.getName())).withSelfRel());
        return userResource;
    }
}
