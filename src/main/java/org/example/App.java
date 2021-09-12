/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package org.example;
import java.util.*;

public class App {
    public static void main(String[] args) {
        int width, length, res, gallons = 1;
        final int con = 350;

        Scanner s = new Scanner(System.in);
        System.out.print("What is the length of the ceiling? ");
        if (!s.hasNextInt()){
            System.out.print("Please enter a valid integer.");
            length = s.nextInt();
        }
        length = s.nextInt();

        System.out.print("What os the width of the ceiling? ");
        if (!s.hasNextInt()){
            System.out.print("Please enter a valid integer.");
            width = s.nextInt());
        }
        width = s.nextInt();
        res = length * width;

        if (res > con) {
            gallons += (res / con);
        }
        if (gallons > 1){
            System.out.print("You will need to purchase " + gallons + " gallons of paint to cover " + res + " square feet.");
        }
        else if (gallons == 1) {
            System.out.print("You will need to purchase " + gallons + " gallon of paint to cover " + res + " square feet.");
        }
    }
}