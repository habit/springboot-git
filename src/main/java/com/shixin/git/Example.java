package com.shixin.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @author shixin.zhang
 * Created on：2019-12-10 19:10
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home(){
        return "Hello Git";
    }

     public static void main(String[] args) {
         SpringApplication.run(Example.class,args);
      }
}
