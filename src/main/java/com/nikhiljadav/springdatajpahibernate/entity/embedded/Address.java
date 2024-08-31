package com.nikhiljadav.springdatajpahibernate.entity.embedded;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    private String street;
    private String city;
    private String country;
    private Long pincode;

}
