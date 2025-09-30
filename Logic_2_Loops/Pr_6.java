package Logic_2_Loops;

import java.util.Scanner;

public class Pr_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int m = n;
        //9Q WAP to count the number of digits in a given number
        //Hint- with the help of '/' delete the last number from 13524 -> 1352
        // Example-
        // -> if n = 13524, and count is = 5 RIGHT!
        // 13524 / 10 = 1352
        // 1352 / 10 = 135
        // 135 / 10 = 13
        // 13 / 10 = 1
        // 1 / 10 = 0
        int count = 0;
        //using for loop
        if(n==0) count++;
        for(int i = 1; i<=n; i++){
            n/=10;
            if(n != 0){
                System.out.println(n);
                count++;
            }
        }
        System.out.println(n+" number of count is "+ count);

        // using while loop
        while(n!=0)
        {
            n/=10;
            count++;
        }
        System.out.println(m+" number of count is "+ count);
    }


}
