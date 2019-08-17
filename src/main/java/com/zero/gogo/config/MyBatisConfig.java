package com.zero.gogo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 *
 * @author: zero
 * @description: []
 * @time: 2019-08-17
 * @version: []
 */
@Configuration
@MapperScan({"com.zero.gogo.mapper","com.zero.gogo.dao"})
public class MyBatisConfig {
}
