package financialyearmethod;

/*
# Justin Keating
#CSET 1200
#Instructor: Dr. Jared Oluoch
#Homework 5
#3-5-17
*/

/*
This program implements a method that computes future
investment value at a given interest
rate for a specified number of years
 */

import java.util.Scanner;

public class FinancialYearMethod {


    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        

        System.out.print("Enter a investment amount: ");
        double investmentAmount = input.nextDouble();
        
        System.out.print("Enter a yearly interest rate amount: ");
        double yearlyInterestRate = input.nextDouble();
        
        double monthlyInterestRate = (yearlyInterestRate / 1200);
        
        System.out.println("The amount of invested is: " + investmentAmount);
        
        System.out.println("The amount of monthly intrest rate is: " + monthlyInterestRate);
        
        System.out.println("Years            End Value");
        
        for (int i = 1; i < 31; i++){
            
            System.out.println(i + "           " + futureInvestmentValue(investmentAmount, monthlyInterestRate, i));
            
        }
            
        
    }
    
    public static double futureInvestmentValue( double investmentAmount, double monthlyInterestRate, int i){
   
        double YearIntr = investmentAmount * (Math.pow(1+ monthlyInterestRate, i * 12));
 
        return YearIntr;
    }

    
}
