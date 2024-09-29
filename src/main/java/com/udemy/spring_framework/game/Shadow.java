package com.udemy.spring_framework.game;

//public class hii {
//
//    public static void main(String[] args) {
//
//        String surname = "Mishra";
//        changename(surname);
//        System.out.println(surname);
//
//    }
//
//    static void changename(String name) {
//        name = "aditi";
////        System.out.println(name);
//    }
//}
public class Shadow {
    static int x  = 90;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 80;
        System.out.println(x);
        fun();
    }
static void fun (){
        int x = 98;
//    System.out.println(x);
}
}
//static boolean isPrime(int n){
//    if(n<=1){
//        return false;
//    }
//    int c = 2;
//    while (c * c <= n  ){
//        if(n % c == 0 ){
//            return false
//        }
//        c++;
//    }
//return c * c > n;
//}