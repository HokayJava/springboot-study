package com.blueberry.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author hekai
 * @create 2018-02-10-15:01
 */
@Configuration
public class MyConfig {

    @Bean(name = "myBean")
    @Scope("prototype")
    public MyBean createMyBean(){
        return new MyBean();
    }

    @Bean
    public RunnableFactoryBean createRunnableFactoryBean(){
        return new RunnableFactoryBean();
    }

    @Bean
    public JeepFactory createJeepFactory(){
        return new JeepFactory();
    }

    @Bean(name = "Jeep")
    public Jeep createJeep(JeepFactory jeepFactory){
        return jeepFactory.createJeep();
    }

    @Bean
    public Cat createCat(){
        return new Cat();
    }

    @Bean(initMethod = "dogInit", destroyMethod = "dogDestory")
    public Dog createDog(){
        return new Dog();
    }

    @Bean
    public Pig createPig(){
        return new Pig();
    }

    @Bean
    public Bird createBird(){
        return new Bird();
    }
}
