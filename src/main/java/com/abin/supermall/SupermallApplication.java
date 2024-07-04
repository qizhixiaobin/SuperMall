/*
 * @Author: abin abin_fu@foxmail.com
 * @Date: 2024-07-04 10:30:35
 * @LastEditors: abin abin_fu@foxmail.com
 * @LastEditTime: 2024-07-04 18:04:29
 */
package com.abin.supermall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@MapperScan("com.abin.mapper")
@ComponentScan("com.abin.*")
@Slf4j
public class SupermallApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SupermallApplication.class, args);
		String serverPort = context.getEnvironment().getProperty("server.port");
		log.info("abin started at http://localhost:" + serverPort);
	}

}
