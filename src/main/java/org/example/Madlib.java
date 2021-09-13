package org.example;
import java.util.Scanner;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jorge Quiros
 */

public class Madlib
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);
        System.out.println( "Enter a noun." );
        String noun= input.nextLine();
        Scanner vinput=new Scanner(System.in);
        System.out.println( "Enter a verb." );
        String verb= vinput.nextLine();
        Scanner ainput=new Scanner(System.in);
        System.out.println( "Enter a adjective." );
        String adjective= ainput.nextLine();
        Scanner adinput=new Scanner(System.in);
        System.out.println( "Enter a adverb." );
        String adverb= adinput.nextLine();
        System.out.printf("Did you really %s with a %s %s %s? That is hilarious.", verb, adjective, noun, adverb);
    }
}
