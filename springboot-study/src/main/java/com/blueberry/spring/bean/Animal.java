package com.blueberry.spring.bean;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hekai
 * @create 2018-02-10-17:24
 */
@ToString
@Component
public class Animal {

    @Autowired
    private Bird bird;


}
