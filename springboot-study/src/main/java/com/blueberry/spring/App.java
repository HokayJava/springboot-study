package com.blueberry.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author hekai
 * @create 2018-02-10-14:52
 */
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println(context.getBean(MyBean.class));
        System.out.println(context.getBean("myBean"));
        System.out.println(context.getBean(Runnable.class));
        System.out.println(context.getBean("createRunnableFactoryBean"));
        System.out.println(context.getBean(RunnableFactoryBean.class));
        System.out.println(context.getBean("&createRunnableFactoryBean"));
        System.out.println(context.getBean(Jeep.class));
        System.out.println(context.getBean("Jeep"));

    }
}
