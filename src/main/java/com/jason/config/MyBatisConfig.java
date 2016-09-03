package com.jason.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Jason on 2016-09-03.
 */
@Configuration
@MapperScan(value = "com.jason.mapper")
public class MyBatisConfig {
}
