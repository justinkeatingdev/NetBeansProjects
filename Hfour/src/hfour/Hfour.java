package hfour ;

/*
# Justin Keating
#CSET 1200
#Instructor: Dr. Jared Oluoch
#Homework 4
#2-12-17
*/

/*
This origram basically lists the fib numbers up too 144
*/

public class Hfour {

  
    public static void main(String[] args) {
        
        int number1 = 0, number2 = 1, number3, i, count = 13;    
            
        System.out.print(number1 + " " + number2);    
    
        for(i = 2; i < count; ++i)
            
         
     
        {    
        number3 = number1 + number2;    
  
        System.out.print(" " + number3);  
  
        number1 = number2;    
  
        number2 = number3; 
        }     
        
       
	}
    }
   
