package com.fpoly.helloworldsd18301.buoi56.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
    @NotBlank(message = "Ten khong duoc de trong")
    private String name;

    @NotNull(message = "Khong duoc de trong tuoi")
    @Min(value = 17, message = "It nhat 18 tuoi")
    private Integer age;

    @NotBlank(message = "Khong de trong dia chi")
    private String address;

    @NotBlank(message = "Vui long chon vi tri")
    private String position;

    @NotEmpty(message = "Vui long chon so thich")
    private String[] hobbies;

    @NotNull(message = "Vui long chon quoc gia")
    private Country country;
}
