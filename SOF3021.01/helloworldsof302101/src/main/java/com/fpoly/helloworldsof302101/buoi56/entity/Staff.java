package com.fpoly.helloworldsof302101.buoi56.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
    private String name;
    private int age;
    private String address;
    private String position;
    private String[] hobbies;
    private Country country;
}
