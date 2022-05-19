package com.shihe.mutilds.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "", sqlSessionFactoryRef = "")
public class Ds1Config {

    @Bean(name = "ds1")
    @ConfigurationProperties(prefix = "spring.datasource.db1")
    public DataSource getDs1(){
        return DataSourceBuilder.create().build();
    }


}
