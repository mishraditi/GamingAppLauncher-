package com.udemy.spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
public class GameRunner{

    GameConsole game;
    public GameRunner(@Qualifier("SuperContraQualifier") GameConsole game) { 
        this.game = game;
    }  
    public void run() {
        System.out.println("running game : " + game);
      game.up();
        game.down();
        game.left();
        game.right();
    }
}


//class Airthmetic {
//    int a; //2
//    int b;//4
//
//    public Airthmetic(int a, int b) {
//        a = 5;
//        System.out.println("From Constructor: a= "+a);
//    }
//
//    public int add() {
//        return a + b;
//    }
//
//    public int subtract() {
//        return a - b;
//    }
//}


//pass by reference

//class Airthmetic {
//    int a;
//    int b;
//
//    public Airthmetic(int[] nums) {
////        a = nums[0];
////        b = nums[2];
//        nums[0] = 5;
//        System.out.println("From Constructor: a= "+nums[0]);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        Airthmetic airthmetic = new Airthmetic();
//        airthmetic.a = 2;
//        airthmetic.b = 4;
//        int a = 2;
//        int b = 4;
//        Airthmetic at = new Airthmetic(a,b);
//        System.out.println("Value from main a= "+a);

//        int[] data = {1, 2};
////        int[] nums = new int[]{1,2};
//        Airthmetic at = new Airthmetic(data);
//        System.out.println("From Constructor: a= "+data[0]);
//    }
//}








