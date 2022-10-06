package leapy;

/*
# Justin Keating
#CSET 1200
#Instructor: Dr. Jared Oluoch
#Homework 4
#2-12-17
*/

/*
This program just lists all of the leap years untill 2100
*/

public class Leapy {

    public static void main(String[] args) {
        
        final int startYear = 2001;
        
        final int endYear = 2100;
        
        final int yearsPerLine = 10;

       
        for (int year = startYear, count = 0; year <= endYear; year++)
        {
            
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            {
                
                if (count % yearsPerLine != 0)
                    System.out.print(" ");
                
                else if (count > 0 && count % yearsPerLine == 0)
                    System.out.println();

                System.out.print(year);
                ++count;
                
            }
        }
    }
    
}
