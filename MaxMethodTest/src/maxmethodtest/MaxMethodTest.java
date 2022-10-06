package maxmethodtest;

/*
# Justin Keating
#CSET 1200
#Instructor: Dr. Jared Oluoch
#Homework 5
#3-5-17
*/

/*
This prgram s a method that tests the min between 3 integers numbers
 */

import java.util.Scanner;

public class MaxMethodTest {
    
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter an integer :");
        int i = input.nextInt();
        
        System.out.println("Enter an integer :");
        int j = input.nextInt();
        
        System.out.println("Enter an integer :");
        int p = input.nextInt();
                
        
        int k = min(i, j, p);
        
        
        System.out.println("The min of " + i + " and " + j + " and " + p + " is " + k);
        
    }
    //the max method to return to the maximum of 2 nmbers
    
    public static int min(int num1, int num2, int num3) {
        
        int result;
        
        if (num1 < num2 && num1 < num3)
            result = num1;
        else if (num2 < num1 && num2 < num3) 
            result = num2;
        else
            result = num3;
             
        return result;
    }
}
