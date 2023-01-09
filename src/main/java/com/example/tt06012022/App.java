package com.example.tt06012022;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.List;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);


        HashMap<Integer,String> x = new HashMap<>();
        x.put(1,"dinh minh truoc");
        x.put(2,"dinh minh truoc");
        x.put(null,"dinh minh hieuu");
        System.out.println(x);
        
    }

}
