package javatutorial;

import java.util.Arrays;
import java.util.Scanner;

public class JavaTutorial {

    public static void main(String[] args) {
       
       // Data Type -  variable - value
       
       byte z = 8;
       
       int a = 10;
       
       long b = 1000000000;
       
       float c = 3.5f ;
       
       double d = 3.423;
        
       char e = 'A';
       
       String f = "My name is Anik";
       
       boolean bool = true;
       
       // How to print
       
        System.out.println(z);
         System.out.println(a);
          System.out.println(b);
         System.out.println(c);
         System.out.println(d);
         System.out.println(e);
          System.out.println(f);
         System.out.println(bool);
         
        // simple operator
        
        System.out.println(z+a);
        System.out.println(a-z);
        System.out.println(2*5);
        System.out.println(8/2);
        System.out.println(11%3);
        System.out.println(20>>2);
        System.out.println(20<<2);
        
        // User input
        
        Scanner input = new Scanner(System.in);
        
//        String s = input.nextLine();
//        
//        System.out.println(s);
        
        // Simple program
        
//        System.out.print("Enter a number ");
//        
//        int number1 = input.nextInt();
//        
//        System.out.print("Enter another number ");
//        
//        int number2 = input.nextInt();
//        
//        System.out.println("Total sum is "+(number1+number2)+" Thank you ");
//    
       // If - Else
       
//       int x = 9;
//       
//       if(x>10){
//       
//           System.out.println("Greater than 10");
//       }
//       else if (x==10){
//       
//           System.out.println("Equal to 10");
//       }
//       else{
//       
//           System.out.println("Less tha 10");
//       
//       }
       
         // Even Odd program

//         int num = input.nextInt();
//    
//         if(num%2==0){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Odd");
//         }
         
//int x = input.nextInt();
//
//if(x>0){
//    System.out.println("This number is positive");
//}
//else if(x<0){
//
//    System.out.println("This number is negative");
//}
//else{
//    System.out.println("This number is 0");
//}

// For Loop

for(int i = 1; i<=10 ; i++){

    System.out.println(i);
}

// table of 5


        for (int i = 1; i <= 10; i++) {
        
            System.out.println("5 x "+i+" = "+(i*5));
            
            
        }
        
    }
    
}
