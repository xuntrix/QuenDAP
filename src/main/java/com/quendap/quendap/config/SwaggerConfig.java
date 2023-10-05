package com.quendap.quendap.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.ApiInfo;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import java.util.Collections;

import springfox.documentation.builders.PathSelectors;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.quendap.quendap.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "API para a xestión de citas do PAF",
                "Descripción da API para a xestión de citas",
                "1.0",
                "",
                new Contact("AMTEGA Ourense", "https://amtega.xunta.gal", "amtega.ourense@xunta.gal"),
                "LICENSE",
                "LICENSE URL",
                Collections.emptyList());
    }
}