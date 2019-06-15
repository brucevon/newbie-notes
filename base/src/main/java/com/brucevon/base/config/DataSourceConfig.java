package com.brucevon.base.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * DataSource config.
 *
 * @author BruceVon
 */
@Slf4j
@Configuration
public class DataSourceConfig {

    /**
     * Init datasource.
     *
     * @return DataSource
     */
    @Primary
    @Bean
    @ConfigurationProperties("spring.datasource.druid")
    public DataSource dataSource() {
        log.info("DataSource Pool initializing");
        return DruidDataSourceBuilder.create().build();
    }

}
