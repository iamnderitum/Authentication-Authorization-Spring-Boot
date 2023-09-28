package com.app.authentication.authentication.Models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ReferenceInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String idNumber;

    @Column
    private String phoneNumber;

    @Column
    private String gender;

    @Column
    private String country;

    @Column
    private String county;

    @Column
    private String address;

    @Column
    private Date dob;




}
