package com.udemy.spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GameConsole{
    public void up(){
        System.out.println("jump");
    }
    public void down(){
        System.out.println("go down");
    }
    public void left(){
        System.out.println("GO to back");
    }
    public void right(){
        System.out.println("Go to right");
    }
}
