//Write a Java program to find the second-largest distinct digit in a positive integer without using arrays, sorting, or built-in maximum functions.

import java.util.Scanner;
public class second_largest_distinct_digit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int largest=0;
        int second_largest=0;
        System.out.println("enter the number:");
        int number = sc.nextInt();
        while (number>0){
            int digit = number % 10;
        if(digit>largest){
            second_largest = largest;
            largest = digit;
        }else if(digit < largest && digit > second_largest){
               second_largest = digit;
        }
        number = number / 10;
        }
            
System.out.println("largest:"+largest);
System.out.println("second_largest:"+second_largest);
    }

    
}
