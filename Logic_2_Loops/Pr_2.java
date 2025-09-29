package Logic_2_Loops;
import java.util.Scanner;

public class Pr_2 {
    public static void main(String[] args) {
        System.out.println("===== Multiplication Table Program =====");
        //method - 1
        //Q4. print multiplication table of 17
        for(int i= 17; i <= 170; i++){
            if(i % 17 == 0){
                System.out.println(i);
            }
        } // not recommended

        //method - 2
        for(int i = 17; i <= 170; i+=17)
            System.out.print(i);//17,34,51,68,85,102,119,136,153,170.


        //Q.5 WAP to print multiplication table of a given number of n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        //method - 3 (recommended)
        int t = 0;
        for(int i= 1; i <= 10; i++){
            t = n * i;
            System.out.println(n + " x " + i +" = " + t);
        }
    }
}
