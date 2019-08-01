package com.zero.mmall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan({"com.zero.mmall.tiny.mbg.mapper","com.zero.mmall.tiny.dao"})
public class MyBatisConfig {
}
