package com.company;
public class smallest {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        int num3 = 2;
        int num4 = 3;

            if(num1 < num2 && num1 < num3 && num1 < num4){
                System.out.println(num1 + "is the smallest number") ;}

        if(num2 < num1 && num2 < num3 && num2 < num4)
            System.out.println(num2 + "is the smallest number") ;

        if(num3 < num1 && num3 < num2 && num3 < num4)
            System.out.println(num3 + "is the smallest number") ;
        else
            System.out.println(num4 + "is the smallest number") ;

    }
}
