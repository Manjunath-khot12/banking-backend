package com.excelR.banking_system;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    public WebConfig(){
        System.out.println("🚀 WebConfig loaded");
    }

    @Value("${frontend.url}")
    private String frontendUrl;

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {

                registry.addMapping("/**")
                        .allowedOrigins(frontendUrl)
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD", "OPTIONS")  // ✅ FIXED HERE
                        .allowedHeaders("*")  // ✅ Add this for good measure
                        .allowCredentials(true);
            }
        };
    }
}
