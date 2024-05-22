package com.fpoly.helloworldsof302101.buoi8.config;

import com.fpoly.helloworldsof302101.buoi8.entity.AnotherCompany;
import com.fpoly.helloworldsof302101.buoi8.entity.Company;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfig {
    @Bean
    public AnotherCompany getAnotherCompany() {
        return new AnotherCompany();
    }
}
