package org.aop.practice8.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.aop.practice8")
@EnableAspectJAutoProxy
public class Config {
}
