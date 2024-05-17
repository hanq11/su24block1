package com.fpoly.helloworldsof302101.buoi56.entity;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
    @NotBlank(message = "Không được để trống tên")
    private String name;

    @NotNull(message= "Tuổi không thể trống")
    @Min(value = 17, message = "Tuổi tối thiểu là 17")
    private Integer age;

    @NotBlank(message = "Không được để trống địa chỉ")
    private String address;

    @NotBlank(message = "Vui lòng chọn vị trí")
    private String position;

    @NotEmpty(message = "Vui lòng chọn sở thích")
    private String[] hobbies;

    @NotNull(message = "Vui long chon quoc gia")
    private Country country;
}
