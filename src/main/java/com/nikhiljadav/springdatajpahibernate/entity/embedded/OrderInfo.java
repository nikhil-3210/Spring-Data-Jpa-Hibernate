package com.nikhiljadav.springdatajpahibernate.entity.embedded;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "order_info")
public class OrderInfo {

    @Id
    @GeneratedValue
    private Integer id;

    private String product;
    private int price;

    @Embedded
    private Address address;
}
