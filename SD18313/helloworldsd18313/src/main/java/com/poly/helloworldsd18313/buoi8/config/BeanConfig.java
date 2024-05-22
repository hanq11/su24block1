package com.poly.helloworldsd18313.buoi8.config;

import com.poly.helloworldsd18313.buoi8.entity.AnotherCompany;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfig {
    @Bean
    public AnotherCompany getAnotherCompany() {
        return new AnotherCompany("Viettel");
    }

    @Bean
    @Primary
    public AnotherCompany getAnotherCompany2() {
        return new AnotherCompany("MobilePhone");
    }
}
