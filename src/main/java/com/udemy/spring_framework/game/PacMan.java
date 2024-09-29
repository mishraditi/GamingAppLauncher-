package com.udemy.spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class PacMan implements GameConsole{
    public void up() {System.out.println("up function ");}
    public void down() {
        System.out.println(" down function ");
    }
    public void left() {
        System.out.println(" move to left ");
    }
    public void right() {
        System.out.println(" move to right ");
    }
}
