package com.springHelloWorld.helloWorld;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springHelloWorld.helloWorld.configuration.HelloWorldConfig;
import com.springHelloWorld.helloWorld.domain.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
   public static void main(String args[]) {
            AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
            HelloWorld bean = (HelloWorld) context.getBean("helloWorldBean");
            bean.sayHello("Spring 4");
            context.close();
        }
    
}
