package com.liutian.tools;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan(basePackages = { "com.baidu.fsg.uid", "com.sankuai.inf.leaf" })
@ImportResource(locations = { "classpath:uid/default-uid-spring.xml" })
@ComponentScan(basePackages= { "com.sankuai.inf.leaf", "com.liutian.tools" })
public class UidGeneratorApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(UidGeneratorApplication.class, args);
	}

}
