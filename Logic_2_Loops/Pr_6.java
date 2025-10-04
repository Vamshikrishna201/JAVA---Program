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
        //We use a while loop because:
        //We don’t know how many digits the number has.
        //The loop should keep running until the number becomes 0.
        //Each time we divide by 10, the number gets smaller,
        // and finally it reaches 0 → then the loop stops.
        //So, while is the best choice because it says:
        //-> “Do this again and again, as long as the number is not 0.”
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
            n = n / 10;
            count++;
        }
        System.out.println(m+" number of count is "+ count);
    }


}
