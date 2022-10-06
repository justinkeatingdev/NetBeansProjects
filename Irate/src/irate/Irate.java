package irate;

/*
# Justin Keating
#CSET 1200
#Instructor: Dr. Jared Oluoch
#Homework 4
#2-12-17
*/

/*
This program allows user to enter in loan amount and year they have t opay it off. then it promtps the user what money
due
*/

import java.util.Scanner;
        
public class Irate {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

    System.out.print("Loan Amount :");
    int loan = input.nextInt();

    System.out.print("Number of Years: " );
    int years = input.nextInt();

    double  mamount, tamount, irated; 

System.out.println( "Interest Rate \t Monthly Payment \t Total Payment");

     for(double rate =0.05; rate <=0.08; rate++ ){
         for (int i = 1; i <= (years * 12); i++){
             
        rate += 1/8;    
         
             mamount = loan* rate/(1-(Math.pow(1+rate,years*12)));
             
             tamount = mamount * years * 12;
             
             irated = rate*100;
             
             System.out.println(" " + irated +" " + mamount + " " + tamount);
         }
    
        }
    }
}