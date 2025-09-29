package Logic_1;

import java.util.Scanner;

public class program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //7Q. Take 3 sides of a triangle and check if it's valid or not.

        //->You have to check whether these sides can actually form a valid triangle or not.
        // If all 3 conditions are true → it’s a valid triangle. Otherwise, it’s not.
        float a, b, c ;
        System.out.println("=========Check the 3 Side of trangle is valid or not=========");
        System.out.print("Enter angle-1 Value : ");
        a = sc.nextInt();
        System.out.print("Enter angle-2 Value : ");
        b = sc.nextInt();
        System.out.print("Enter angle-3 Value : ");
        c = sc.nextInt();
        // T && F = F
        if(a + b > c && b + c > a && c + a > b) {
            System.out.println("Valid Triangle");
        } else{
            System.out.println("Not Valid Triangle");
        }
    }
}
