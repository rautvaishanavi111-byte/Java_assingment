//Write a Java program to print the prime factorization of a given integer without using arrays, collections, or external libraries.
import java.util.Scanner;
public class prime_factorization {
    void primefactorization(int n){
        if(n==1){
            System.out.print("prime factorization");
            return;
        }
            for (int i=2;i<=n;i++){
                int count=0;
                while(n%i==0){
                    count++;
                    n=n/i;
                }
                if (count>0){
                    System.out.print(i+"^"+count);
                    if(n>1){
                        System.out.print("x");
                    
                }
            }
        }  
    }     
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       prime_factorization pf = new prime_factorization();
       System.out.println("enter number");
       int number= sc.nextInt();
       if(number<1){
        System.out.println("Invalid input");
       }else{
        pf.primefactorization(number);
        }sc.close();
    }

}
