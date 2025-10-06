package Logic_2_Loops;

import java.util.Scanner;

public class Pr_8 {
    public static void main(String[] args) {
        //11.Q WAP to print product of digit of a given number
        // Example:- n = 12345; product = 5x4x3x2x1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int rem = n;
        int product = 1;//(because multiplying by 0 would always give 0).

        while(n>0){
            int ld = n%10;// get last digit
            n = n/10; // remove last digit
            product = product * ld;
        }
        System.out.println("product of given " + rem+" is "+ product);

    }
}
