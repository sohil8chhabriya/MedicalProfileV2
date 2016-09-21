package mprofile.core.entity;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Sohil.Chhabriya on 22-Sep-16.
 */
@Entity
@Table(name = "Speciality" )
public class Speciality {
    @Id
    @GeneratedValue
    private int specialityId;
    private String specialityInfo;

    public int getSpecialityId() {
        return specialityId;
    }

    public void setId(int id) {
        this.specialityId = id;
    }

    public String getSpecialityInfo() {
        return specialityInfo;
    }

    public void setSpecialityInfo(String specialityInfo) {
        this.specialityInfo = specialityInfo;
    }
}
