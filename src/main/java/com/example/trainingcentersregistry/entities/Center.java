package com.example.trainingcentersregistry.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.util.List;

//Lombok can be used as well to reduce boilerplate code
@Entity
@Table(name = "centers")
public class Center
{
    //Primary Key as ID, that is generated automatically in incremental order
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String centerName;
    private String centerCode;
    //Address is embedded in the center table, to find associated address of center easily
    @Embedded
    private Address address;
    private int studentCapacity;
    @ElementCollection
    @CollectionTable(name = "courses_offered", joinColumns = @JoinColumn(name = "center_id"))
    private List<String> coursesOffered;

    //System Time is UTC
    //Only Getters assigned, so manually field can't be changed
    @CreationTimestamp
    @Column(updatable = false, nullable = false)
    private Instant createdOn;
    private String contactEmail;
    private String contactPhone;

    public Center()
    {
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
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

    public List<String> getCoursesOffered()
    {
        return coursesOffered;
    }

    public void setCoursesOffered(List<String> coursesOffered)
    {
        this.coursesOffered = coursesOffered;
    }

    public int getStudentCapacity()
    {
        return studentCapacity;
    }

    public void setStudentCapacity(int studentCapacity)
    {
        this.studentCapacity = studentCapacity;
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

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }
}
