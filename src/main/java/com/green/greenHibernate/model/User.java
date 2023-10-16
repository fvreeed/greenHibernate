package com.green.greenHibernate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.sql.Date;

@Data
@Entity
@Table(name = "green")
public class User {

    @Id
    @Column(name = "user_id")
    private int id;

    @Column(name = "distance")
    private double distance;

    @Column(name = "run_date")
    private Date date;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_comment")
    private String text;
}