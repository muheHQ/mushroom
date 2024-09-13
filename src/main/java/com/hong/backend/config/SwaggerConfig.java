package com.hong.backend.config;

/**
 * @Author HQ
 * @Date: 2024/7/6
 */

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info().title("SpringBoot Vue Test")
                        .description("SpringBoot+Vue Test Swagger debugging")
                        .version("v1"));
    }
}