package com.poly.helloworldsd18313.buoi56.entity;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
    @NotBlank(message = "Khong duoc de trong ten")
    private String name;
    @Min(value = 9, message = "Tuoi khong duoc be hon 9")
    @NotNull(message = "Vui long nhap tuoi")
    private Integer age;
    @NotBlank(message = "Vui long nhap dia chi")
    private String address;
    @NotBlank(message = "Vui long chon vi tri")
    private String position;
    @NotEmpty(message = "Vui long chon so thich")
    private String[] hobbies;
    @NotNull(message = "Vui long chon quoc gia")
    private Country country;
}
