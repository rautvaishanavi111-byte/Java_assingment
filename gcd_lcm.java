import java.util.Scanner;

public class gcd_lcm {
    int gcd(int a, int b){
         while (b!= 0){
            int temp= b;
            b=a%b;
            a=temp;
         }
          return a;  
    }
    long lcm(int a, int b){
       return ((long) a/gcd(a,b))*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first number:");
        int a = sc.nextInt();
        System.out.println("second number:");
        int b = sc.nextInt();
        if (a<=0 || b<=0){
             System.out.println("Please enter positive numbers.");
        } else {
            gcd_lcm obj = new gcd_lcm();

            System.out.println("GCD = " + obj.gcd(a, b));
            System.out.println("LCM = " + obj.lcm(a, b));
        

        }
    }
}
