package Logic_1;

import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        //Wap check whether the given number is Armstrong number or not.
        //
        //-> A number that is equal to the sum of the cubes of it own digits.
        //Example:- 153 = 1 = 1x1x1 = 1
        //              = 5 = 5x5x5 = 125
        //              = 3 = 3x3x3 = 27
        //                1 + 125 + 27 = 153
        //So this number is equal to the sum of the cubes.
        //that calle's Armstrong Number
        //----------------------------
        //This are Amstrong numbers:-
        //153, 370, 371, 407, <- 3 digits amstrong number
        //1634, 8208, 9474, <- 4 digits amstrong number
        // 54748, 92727, 93084 <- 5 digits amstrong number
        // and etc....
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        // Think in -> n=153
        int original = n;
        // Step 1: Count number of digits
        int digits = 0;
        int temp = n;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        // Step 2: Calculate sum of each digit raised to 'digits'
        int sum = 0;
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;

            // calculate digit^digits without Math.pow
            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power *= digit;
            }

            sum += power;
            temp /= 10;
        }
        // Step 3: Compare
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }
        sc.close();
    }
}
