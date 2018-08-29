package com.callertuneapp.tune.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.any;


@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket orderEntryApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.callertuneapp.controller"))
                .paths(any())
                .build()
                .groupName("tune")
                .useDefaultResponseMessages(false)
                .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        return new ApiInfoBuilder()
                .title("TuneRepository Setting REST API")
                .description("TuneRepository Setting")
                .version("1.0")
                .build();
    }
}
