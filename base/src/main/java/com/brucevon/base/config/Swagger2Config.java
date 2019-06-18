package com.brucevon.base.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2 config.
 *
 * @author BruceVon
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    /**
     * Swagger2 enable.
     */
    @Value("${swagger2.enable}")
    private boolean enable;

    /**
     * API info.
     *
     * @return ApiInfo
     */
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Base APIs")
                .description("Swagger2 Test")
                .contact(new Contact("Bruce Von", "https://github.com/brucevon/newbie-notes/tree/dev/base", "brucevon@qq.com"))
                .license("GNU GENERAL PUBLIC LICENSE")
                .licenseUrl("https://github.com/brucevon/newbie-notes/blob/dev/LICENSE")
                .version("1.0")
                .build();
    }

    /**
     * User Module.
     *
     * @return Docket
     */
    @Bean("用户模块")
    public Docket userModule() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("用户模块")
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.brucevon.base.controller"))
                .paths(PathSelectors.regex("/user.*"))
                .build()
                .apiInfo(apiInfo())
                .enable(enable);
    }
}
