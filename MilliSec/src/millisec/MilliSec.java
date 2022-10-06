package millisec;

/*
# Justin Keating
#CSET 1200
#Instructor: Dr. Jared Oluoch
#Homework 5
#3-5-17
*/

/*
Tis program prompts use to enter an amount of milliseconds, it then gives the user how manty hours, minutes, and seconds that is

I was confused because my answers arent coming out how example shows but my eqation is right.
I thought it wants me to find out how many hours, minutes, and seconds are in the amount of milliseconds that is entereed. 
 */

import java.util.Scanner;

public class MilliSec {


    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter an amount of MilliSeconds: ");
        int ms = input.nextInt();
        
        int hours = ms/3600000;
        int minutes = ms/60000;
        int seconds = ms/1000;
        
        System.out.println("The conversion of " + ms + " to hours:minutes:seconds is: " +
                MilliSeconds(hours, minutes, seconds) );
        
       
        
    }
    
        public static String MilliSeconds( int hours, int minutes, int seconds){
            
            String complete = (hours + ":" + minutes + ":" + seconds);
        
            return complete;
            
            
        }
        
        public static void prntStr(String complete){
            
            System.out.print(complete);
        }

    
}
