package Logic_2_Loops;

import java.util.Scanner;

public class pr_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        // 10. Q: Write a program to print the sum of digits of a given number.
        //
        // Hint: Use the modulo operator (%) to get the last digit of the number.
        // For example: n % 10 gives the last digit.
        // Then use division (n / 10) to remove the last digit and repeat.
        // Example n = 3, 2, 5, 6, 7;
        // ->      3 + 2 + 5 + 6 + 7 = 23
        int num = n;
        int sum = 0;

        while(n > 0){
           int lastDigit = n % 10;
           sum += lastDigit;
           n = n / 10;
        }
        System.out.println("("+num+")"+ " sum of digits is " + sum);
    }
}
