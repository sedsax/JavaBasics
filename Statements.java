package com.sedsax.javalearning;

public class Statements {
    public static void main(String[] args){
        int x=5;
        System.out.println(x);
        x=x+1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x=x*5;
        System.out.println(x);

        int y=4;
        System.out.println(x>y);
        System.out.println(x<y);
        y=30;
        System.out.println(x==y);
        System.out.println(x!=y);
        x=3;
        y=4;
        int z=5;
        System.out.println(x<y && x<z);
        System.out.println(x<y || x<z);
        System.out.println(x<y && y>z);
        System.out.println(x<y || y>z);
    }
}
