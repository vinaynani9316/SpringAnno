package com.springAnnotation.SpringAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springAnnotation.SpringAnno")            // instead of bean annotation
public class Appconfig 
{
//	@Bean
//	public Samsung getPhone()
//	{
//		return new Samsung();
//	}
//	@Bean
//	public MobileProcessor getMobile()
//	{
//		return new Snapdragon();
//	}

}
