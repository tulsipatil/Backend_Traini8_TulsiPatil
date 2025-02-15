package com.example.trainingcentersregistry.payloads;

import jakarta.validation.constraints.*;

import java.time.Instant;
import java.util.List;

//Lombok can be used as well to reduce boilerplate code
//Validators are used wherever required, and constraints are set
public class CenterDto
{
    @NotEmpty
    @Size(max = 40, message = "Center name must be less than 40 characters")
    private String centerName;

    @NotEmpty
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Center code must be exactly 12 alphanumeric characters")
    private String centerCode;

    private AddressDto address;

    @NotNull
    private int studentCapacity;

    @NotEmpty
    private List<String> coursesOffered;
    private Instant createdOn;
    @Email(message = "Email is invalid")
    private String contactEmail;
    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid phone number. Must be a 10-digit Indian mobile number starting with 6-9")
    private String contactPhone;

    public CenterDto()
    {
    }

    public String getCenterName()
    {
        return centerName;
    }

    public void setCenterName(String centerName)
    {
        this.centerName = centerName;
    }

    public String getCenterCode()
    {
        return centerCode;
    }

    public void setCenterCode(String centerCode)
    {
        this.centerCode = centerCode;
    }

    public int getStudentCapacity()
    {
        return studentCapacity;
    }

    public void setStudentCapacity(int studentCapacity)
    {
        this.studentCapacity = studentCapacity;
    }

    public List<String> getCoursesOffered()
    {
        return coursesOffered;
    }

    public void setCoursesOffered(List<String> coursesOffered)
    {
        this.coursesOffered = coursesOffered;
    }

    public String getContactEmail()
    {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail)
    {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone()
    {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone)
    {
        this.contactPhone = contactPhone;
    }

    public AddressDto getAddress()
    {
        return address;
    }

    public void setAddress(AddressDto address)
    {
        this.address = address;
    }

}

