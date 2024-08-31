package com.nikhiljadav.springdatajpahibernate.entity;

import com.nikhiljadav.springdatajpahibernate.entity.base.BaseEntity;
import jakarta.persistence.*;
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
@Table(name = "section")
public class Section extends BaseEntity {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String orderNumber;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
