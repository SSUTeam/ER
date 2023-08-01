package com.izi.er.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain config(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeRequests(authorize -> authorize
                .antMatchers("/**").permitAll()
            );
        return http.build();
    }
}

