package com.nosoft.eut.learnlession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import sun.misc.Request;

import javax.xml.ws.Response;

@RestController
@EnableAutoConfiguration
public class HelloWord {

    @RequestMapping("/")
    public String home() {
        System.out.println("哈哈哈哈哈哈哈哈111122222333");
        return "hello  ni ya gaga !";
    }
        public static void main(String[] args){
            SpringApplication.run(HelloWord.class,args);
        }

    @RequestMapping("/test")
    public void ModelAndView(Request request, Response response){
        ModelAndView view  = new ModelAndView();

    }
}
