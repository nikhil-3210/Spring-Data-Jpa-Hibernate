package com.nikhiljadav.springdatajpahibernate.entity;

import com.nikhiljadav.springdatajpahibernate.entity.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "author")
public class Author extends BaseEntity {

    private String firstname;
    private String lastname;
    private String email;
}
