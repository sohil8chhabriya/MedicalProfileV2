package mprofile.rest.resources;

import mprofile.core.entity.Speciality;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by Sohil.Chhabriya on 22-Sep-16.
 */
public class SpecialityResource extends ResourceSupport {

    public Speciality getSpeciality() {
        Speciality speciality = new Speciality();
        speciality.setSpecialityInfo(specialityInfo);
        return speciality;
    }

    private String specialityInfo;

    public String getSpecialityInfo() {
        return specialityInfo;
    }

    public void setSpecialityInfo(String specialityInfo) {
        this.specialityInfo = specialityInfo;
    }
}
