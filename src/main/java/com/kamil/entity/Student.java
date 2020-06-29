package com.kamil.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "student")
public class Student
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name is mandatory")
    @Column(name = "Name")
    private String name;

    @NotBlank(message = "Name is mandatory")
    @Column(name = "Surname")
    private String surname;

    @NotBlank(message = "Email is mandatory")
    @Column(name = "Email")
    private String email;

    @Column(name = "PhoneNumber")
    private long phoneNumber;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="class_id")
    private SchoolClass schoolClass;    

    public Student()
    {
    }

    public Student(String name, String surname, String email, long phoneNumber, SchoolClass schoolClass)
    {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.schoolClass = schoolClass;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public long getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public SchoolClass getSchoolClass()
    {
        return schoolClass;
    }

    public void setSchoolClass(SchoolClass schoolClass)
    {
        this.schoolClass = schoolClass;
    }
    
}