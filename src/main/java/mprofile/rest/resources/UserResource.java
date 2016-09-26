package mprofile.rest.resources;

import mprofile.core.entity.UserInfo;
import mprofile.core.entity.UserinfoId;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by sohil chhabriya on 25-Apr-15.
 */

public class UserResource extends ResourceSupport {

    public UserinfoId toUser(){
        UserinfoId user = new UserinfoId();
        user.setName(name);
        user.setPincode(pincode);
        user.setEmergencyPhone(emergencyPhone);
        user.setPhone(phone);
        user.setBloodGroup(bloodGroup);
        user.setAddress(address);
        user.setCountry(country);
        user.setEmailId(emailId);
        user.setCity(city);
        user.setDob(dateOfBirth);
        user.setDateOfRegistration(dateOfRegistration);
        return user;
    }
    private String name;
    private String dateOfBirth;
    private String bloodGroup;
    private String dateOfRegistration;

    //todo private UserContactDetails userContactDetails;

    //ContactDetails Below
    private String address;
    private int pincode;
    private String city;
    private String country;
    private String emailId;
    private int phone;
    private int emergencyPhone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(String dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getEmergencyPhone() {
        return emergencyPhone;
    }

    public void setEmergencyPhone(int emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }
}
