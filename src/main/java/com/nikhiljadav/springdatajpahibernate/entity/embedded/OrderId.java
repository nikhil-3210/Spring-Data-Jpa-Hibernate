package com.nikhiljadav.springdatajpahibernate.entity.embedded;

import jakarta.persistence.Embeddable;

import java.time.LocalDateTime;

@Embeddable
public class OrderId {
    private String username;
    private LocalDateTime localDateTime;
}
