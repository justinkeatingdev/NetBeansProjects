package tennumbers;

/*
# Justin Keating
#CSET 1200
#Instructor: Dr. Jared Oluoch
#Homework 4
#2-12-17
*/

/* 
This program prompts 10 radome numbers and add also square roots total
*/

public class Tennumbers {

   
   
    public static void main(String[] args) {
       
           
            int  number1 = (int)(1 + Math.random()* 10);
            int  number2 = (int)(1 +Math.random() * 10);
            int  number3 = (int)(1 +Math.random() * 10);
            int  number4 = (int)(1 +Math.random() * 10);
            int  number5 = (int)(1 + Math.random() * 10);
            int  number6 = (int)(1 +Math.random() * 10);
            int  number7 = (int)(1 +Math.random() * 10);
            int  number8 = (int)(1 +Math.random() * 10);
            int  number9 = (int)(1 + Math.random() * 10);
            int  number10 = (int)(1 + Math.random() * 10);
            
         
            
            System.out.println("The 10 numbers that were generated were: ");
            System.out.println(number1);
            System.out.println(number2);
            System.out.println(number3);
            System.out.println(number4);
            System.out.println(number5);
            System.out.println(number6);
            System.out.println(number7);
            System.out.println(number8);
            System.out.println(number9);
            System.out.println(number10);
            
            double addd = (number1 + number2 + number3 + number4 + number5 + number6
            + number7 + number8 + number9 + number10);
            
            System.out.println("The total number when they are all added together is: "+addd);
            
            
            System.out.println("The total for the square root of them added together is: " +Math.sqrt(addd));
            
            
            
        
    }
    
}
