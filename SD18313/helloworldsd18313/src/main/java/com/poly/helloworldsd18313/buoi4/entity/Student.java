package com.poly.helloworldsd18313.buoi4.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String id;
    private String name;
    private int age;
    private String address;
    private boolean gender;
}
