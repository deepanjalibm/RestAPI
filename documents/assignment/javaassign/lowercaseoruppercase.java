package com.company;

import java.sql.SQLOutput;

public class lowercaseoruppercase {
    public static void main(String[] args) {


        char ch = 'z';

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + "is an Upper case letter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "is an lower case letter");
        }else{
            System.out.println("Not a character");
        }

    }
}

