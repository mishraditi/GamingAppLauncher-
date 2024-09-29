package com.udemy.spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraQualifier")
public class SuperContra implements GameConsole{
    public void up() {
        System.out.println("up");
    }
    public void down() {
        System.out.println("Sit down ");
    }
    public void right() {
        System.out.println("Go ahead ");
    }
    public void left() {
        System.out.println("Go back");
    }
}
