/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Faiz Ahmed
 */

import java.util.*;
public class Tempconvert {

    int input(Scanner sc, String temp)
    {   
        int degree;
        System.out.println(String.format("Please enter the temperature in %s:",temp));
        return degree = sc.nextInt();
    }

    int output(String temp, int degree)
    {   
        System.out.println(String.format("The temperature in %s is %d.",temp,degree));
        return 0;
    }

    public static void main(String[] args)
    {
        Tempconvert obj = new Tempconvert();
        Scanner sc = new Scanner(System.in);
        String unit, unit1;
        int flag, degree, convert, tmp;
        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        unit = sc.nextLine();
        flag = unit.toLowerCase().equals("c") ? 1 : 0;
        //trying coding with ternary operators! 
        degree = flag == 1 ? obj.input(sc, "Fahrenheit") : obj.input(sc, "Celsius");
        convert = flag == 1 ? ((degree - 32) * 5 / 9) : ((degree * 9 / 5) + 32);
        tmp = flag == 1 ? obj.output("Celsius", convert) : obj.output("Fahrenheit", convert);
    }
}