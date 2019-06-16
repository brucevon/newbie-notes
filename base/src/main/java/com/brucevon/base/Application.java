package com.brucevon.base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类.
 *
 * @author BruceVon
 */
@MapperScan("com.brucevon.base.dao")
@SpringBootApplication
public class Application {

    /**
     * Main.
     * @param args args
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
