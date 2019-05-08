package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigB.class);

        A a = context.getBean(A.class);
        B b = context.getBean(B.class);

        System.out.println(a.getMessage());
        System.out.println(b.getMessage());
    }
}
