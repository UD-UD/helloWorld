package com.springHelloWorld.helloWorld.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import com.springHelloWorld.helloWorld.domain.HelloWorld;
import com.springHelloWorld.helloWorld.domain.HelloWorldImpl;

@Configuration
public class HelloWorldConfig {
	
	@Bean(name="helloWorldBean")
    @Description("This is a sample HelloWorld Bean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
}
