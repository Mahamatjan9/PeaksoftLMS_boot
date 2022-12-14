package com.example.peaksoftlms_boot.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.FetchType.LAZY;


@Entity
@Table(name = "companies")
@Getter
@Setter
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "company_gen")
    @SequenceGenerator(name = "company_gen",sequenceName = "company_gen",allocationSize = 1)
    private Long id;
    @Column(length = 100000,name = "company_name")
    private String companyName;
    @Column(length = 100000,name = "located_country")
    private String locatedCountry;

    private int numberOfStudents;

    public void Students(){
        numberOfStudents++;
    }
    public void Student(){
        numberOfStudents--;
    }

    @OneToMany(cascade = {ALL}, fetch = LAZY, mappedBy = "company")
    private List<Course> courses;
    public void addCourse(Course course1){
        if (courses==null){
            courses=new ArrayList<>();
        }
        courses.add(course1);
    }
}
