//Clint Madariaga-Zittel
//The purpose is to sort 3 integers
//28 February 2017
//Bellevue University
//SortingIntegers.java

import java.util.Scanner;

public class SortingIntegers {
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Let's sort some integers, shall we?");
    System.out.print("Enter your first integer here: ");
    int value1 = input.nextInt();
    System.out.print("How about another one: ");
    int value2 = input.nextInt();
    System.out.print("Last one, I promise: ");
    int value3 = input.nextInt();
    System.out.println("Here is the order that you've given to me: ");
    System.out.println(value1 + ", " + value2 + ", " + value3);


    //Checks to see what values are greater, then sorts them accordingly    
    if(value1 <= value2 && value2 <= value3) {
      System.out.println("They're already sorted, awesome!");
      System.out.println(value1 + ", " + value2 + ", " + value3);
    }
    else if (value1 <= value2 && value2 >= value3 && value1 <= value3) {
      System.out.println("These are unsorted, lets fix that shall we?");
      System.out.println(value1 + ", " + value3 + ", " + value2);
    }
    else if (value2 <= value1 && value1 <= value3 && value3 >= value2) {
      System.out.println("These are unsorted, lets fix that shall we?");
      System.out.println(value2 + ", " + value1 + ", " + value3);
    }
    else if (value2 <= value1 && value1 >= value3 && value3 >= value2) {
      System.out.println("These are unsorted, lets fix that shall we?");
      System.out.println(value2 + ", " + value3 + ", " + value1);
    }
    else if (value3 <= value2 && value2 <= value1 && value1 >= value3) {
      System.out.println("These are unsorted, lets fix that shall we?");
      System.out.println(value3 + ", " + value2 + ", " + value1);
    }
    else if (value3 <= value2 && value2 >= value1 && value3 <= value1) {
      System.out.println("These are unsorted, lets fix that shall we?");
      System.out.println(value3 + ", " + value1 + ", " + value2); 
    }   
       
  }
}
 
