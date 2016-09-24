package mprofile.rest.controllers;

import mprofile.core.entity.Speciality;
import mprofile.core.services.SpecialityService;
import mprofile.rest.resources.SpecialityResource;
import mprofile.rest.resources.asm.SpecialityResourceAsm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * Created by Sohil.Chhabriya on 22-Sep-16.
 */
@Controller
@RequestMapping("/rest/speciality")
public class SpecialityController {
    public SpecialityService specialityService;

    @Autowired
    public SpecialityController(SpecialityService specialityService){ this.specialityService = specialityService;}

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<SpecialityResource> getSpecialityById(@PathVariable int id){
        System.out.println("into rest client");
        Speciality speciality = specialityService.getSpecialityById(id);
        if (specialityService != null){
            SpecialityResource specialityResource = new SpecialityResourceAsm().toResource(speciality);
            System.out.println("==>  " + specialityResource.getId());
            return new ResponseEntity<SpecialityResource>(specialityResource, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<SpecialityResource>(HttpStatus.NOT_FOUND);
        }
    }

}

