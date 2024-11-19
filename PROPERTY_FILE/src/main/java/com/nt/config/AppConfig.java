package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "com.nt")
@Configuration
@PropertySource("com/nt/common/info.properties")
public class AppConfig {

}
