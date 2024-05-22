package com.fpoly.helloworldsd18301.buoi8.config;

import com.fpoly.helloworldsd18301.buoi8.entity.AnotherCompany;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfig {
    @Bean
    public AnotherCompany getAnotherCompany() {
        return new AnotherCompany("Vinaphone1");
    }

    @Bean
    @Primary
    public AnotherCompany getAnotherCompany2() {
        return new AnotherCompany("Vinaphone2");
    }
}
