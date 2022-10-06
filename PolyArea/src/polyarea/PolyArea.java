package polyarea;

/*
# Justin Keating
#CSET 1200
#Instructor: Dr. Jared Oluoch
#Homework 5
#3-5-17
*/

/*
THis program simply calculates the area of a pentagon. It asks user to enter legnth of side and boom!
there you go. 
 */

import java.util.Scanner;

public class PolyArea {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter side length: ");
        double lside = input.nextDouble();

        double area = area(5,lside); 
        System.out.print("The area of the polygon is: " + area); 

    } 


    public static double area(int n, double side){
    
        double result = (n*Math.pow(side,2))/(4*Math.tan(Math.PI/n));
        
        return result;

    }
    }
    

