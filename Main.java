// who ami I?
// com = country, company = city
package com.company;

import java.util.Scanner;

// public = everyone can access
// class Main
public class Main
{
    // public = everyone can access
    // static = ...
    // void = no return value. Send email ... void
    // arg = 2 + 3
    public static void main(String[] args)
    {
        System.out.println("Hello world!!!");
        System.out.println("Please enter your name:");

        Scanner s = new Scanner(System.in); // create input from keyboard
        String my_name = s.nextLine(); // get input from keyboard

        System.out.print("Hello ");
        System.out.println(my_name);

    }
}
