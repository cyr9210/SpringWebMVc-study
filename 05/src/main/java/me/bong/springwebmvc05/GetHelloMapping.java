package me.bong.springwebmvc05;


import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@RequestMapping("/hello")
@Retention(RetentionPolicy.RUNTIME)
public @interface GetHelloMapping {

}
