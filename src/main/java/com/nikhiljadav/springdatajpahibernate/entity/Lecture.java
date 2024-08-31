package com.nikhiljadav.springdatajpahibernate.entity;

import com.nikhiljadav.springdatajpahibernate.entity.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "lecture")
public class Lecture extends BaseEntity {
    
    private String name;
}
