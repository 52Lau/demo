package com.example.transfer.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table(name = "user_sys")
public class User {
    @Id
    private Integer id;

    private String name;

    @Column(name = "address_i")
    private String addressI;
}