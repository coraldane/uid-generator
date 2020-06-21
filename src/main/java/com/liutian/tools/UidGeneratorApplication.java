package com.liutian.tools;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("com.baidu.fsg.uid")
@ImportResource(locations = { "classpath:uid/default-uid-spring.xml" })
public class UidGeneratorApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(UidGeneratorApplication.class, args);
	}

}
