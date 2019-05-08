package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.getMessage();

        ByeWorld objB = (ByeWorld) context.getBean("byeWorld");
        objB.getMessage();

        GoodByeWorld objC = (GoodByeWorld) context.getBean("goodByeWorld");
        context.registerShutdownHook();
    }
}
