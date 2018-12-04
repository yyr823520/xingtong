package com.xt.xingtong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@MapperScan("com.xt.xingtong.interf")//扫描dao接口
@EnableSwagger2
@EnableTransactionManagement
@EnableScheduling
public class App 
{
    public static void main( String[] args )
    {
    SpringApplication.run(App.class, args);
    }
}
