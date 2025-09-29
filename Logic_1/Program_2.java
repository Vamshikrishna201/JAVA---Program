package Logic_1;

import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        //2Q. Check whether a number is positive, negative, or zero.
        int n = 1;
        if(n > 0){
            System.out.println(n + " is Positive");
        }
        else if(n < 0){
            System.out.println(n + " is Negative");
        }
        else{
            System.out.println(n + " is Zero");
        }

        //3Q. Write a program to assign grades based on marks (if-else if ladder)
        Scanner sc = new Scanner(System.in);
        System.out.println("===== -- Check marks based on grade -- =====");
        System.out.println();
        System.out.print("Enter Marks to check grades: ");
        int marks = sc.nextInt();

        if(marks <= 100 && marks >= 93)
            System.out.println("Marks: " + marks + "\nA+ Grade \nkon bola tumse na ho payga");
        else if(marks <= 92 && marks >= 85 )
            System.out.println("Marks: " + marks + "\nA Grade \nPicture abhi baaki hai mere dost!");
        else if(marks <=84 && marks >= 75)
            System.out.println("Marks: " + marks + "\nB+ Grade \nThoda risky hai par masti bhi hai!");
        else if(marks<=74 && marks >=66 )
            System.out.println("Marks: " + marks + "\nB Grade \nYeh dil maange B!");
        else if (marks<=65 && marks >=55)
            System.out.println("Marks: " + marks + "\nC Grade \nNahi kuch toh gadbad hai Dayaa!");
        else
            System.out.println("Marks: " + marks + "\nF Grade \nBeta tumse na ho paayega...");

        //4Q Check if a number divisible by 3 or 5
        System.out.println("===== --Check if a number divisible by 3 or 5-- =====");
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        if(num % 3 == 0 || num % 5 == 0){
            System.out.println(num+" is devisible by both 3 and 5.");
        }
        else{
            System.out.println(num+" is not devisible by both 3 and 5.");
        }





    }
}
