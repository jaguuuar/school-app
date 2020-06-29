package com.kamil.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "school_class")
public class SchoolClass
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Name is mandatory")
    @Column(name = "Name")
    private String name;

    @NotBlank(message = "Profile is mandatory")
    @Column(name = "Profile")
    private String profile;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "schoolClass")
    private List<Student> students = new ArrayList<>();

    public SchoolClass()
    {
    }

    public SchoolClass(String name, String profile)
    {
        this.name = name;
        this.profile = profile;
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

    public String getProfile()
    {
        return profile;
    }

    public void setProfile(String profile)
    {
        this.profile = profile;
    }

    public List<Student> getStudents()
    {
        return students;
    }

    public void setStudents(List<Student> students)
    {
        this.students = students;
    }
}
