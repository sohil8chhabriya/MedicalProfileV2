package mprofile.rest.resources.asm;

import mprofile.core.entity.Speciality;
import mprofile.rest.controllers.SpecialityController;
import mprofile.rest.resources.SpecialityResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Created by Sohil.Chhabriya on 22-Sep-16.
 */
public class SpecialityResourceAsm extends ResourceAssemblerSupport<Speciality, SpecialityResource>{
    public SpecialityResourceAsm() {
        super(SpecialityController.class, SpecialityResource.class);
    }

    @Override
    public SpecialityResource toResource(Speciality speciality) {
        SpecialityResource specialityResource = new SpecialityResource();
        specialityResource.setSpecialityInfo(speciality.getSpecialityInfo());
        specialityResource.add(linkTo(methodOn(SpecialityController.class).getSpecialityById(speciality.getSpecialityId())).withSelfRel());
        return specialityResource;
    }

}
