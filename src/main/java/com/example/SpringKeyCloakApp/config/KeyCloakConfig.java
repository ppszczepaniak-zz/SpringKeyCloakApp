package com.example.SpringKeyCloakApp.config;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//we add this cause SpringBoot needs it to run, info here:
//https://stackoverflow.com/questions/57787768/issues-running-example-keycloak-spring-boot-app
public class KeyCloakConfig {

    @Bean
    public KeycloakSpringBootConfigResolver keycloakConfigResolver() {
        return new KeycloakSpringBootConfigResolver();
    }
}


