//Write a Java program to display all Armstrong numbers between two user-entered positive integers.
//A number is an Armstrong number if the sum of each digit raised to the power of the total number of digits equals the original number

import java.util.Scanner;

public class armstrong_numbers {
    int countdigit (int n){
      int count = 0;
      while(n>0){
        count++;
        n = n / 10;
      }
      return count;
    }
    int power(int digit, int power){
        int result=1;
        for(int i=1;i<=power;i++){
            result = result * digit;
        }
        return result;
    }
    boolean armstrongnumber(int n){
        int original = n;
        int digit = countdigit(n);
        int sum = 0;
        while(n>0){
            int digits = n % 10;
            sum = sum + power(digits, digit);
            n= n / 10;
        }
        return sum == original;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     armstrong_numbers an = new armstrong_numbers();
      System.out.println("strat:");
      int strat = sc.nextInt();
      System.out.println("end:");
      int end = sc.nextInt();
      System.out.println("Armstrong_Numbers:");
       for(int i=strat; i<=end;i++){
         if(an.armstrongnumber(i)){
          System.out.println(i);
    }
    sc.close();
    }
}
}
