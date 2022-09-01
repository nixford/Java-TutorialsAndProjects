package com.spring.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.main, com.spring.beans, com.spring.services")
public class SportConfig {

}
