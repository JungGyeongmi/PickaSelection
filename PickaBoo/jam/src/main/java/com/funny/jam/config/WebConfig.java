package com.funny.jam.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${file:///D:/DATA/video/}")
    private String resourcePath;

    @Value("${upload.dir")
    private String uploadPath;

    @Value("${/view}")
    private String viewPath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler(uploadPath)
                .addResourceLocations(viewPath);
    }
}
