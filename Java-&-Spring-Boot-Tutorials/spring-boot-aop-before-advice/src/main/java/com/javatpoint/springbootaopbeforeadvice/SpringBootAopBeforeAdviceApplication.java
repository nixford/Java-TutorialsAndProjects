package com.javatpoint.springbootaopbeforeadvice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class SpringBootAopBeforeAdviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAopBeforeAdviceApplication.class, args);
	}

}
