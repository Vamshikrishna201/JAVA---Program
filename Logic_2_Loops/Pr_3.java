package Logic_2_Loops;
import java.util.Scanner;

public class Pr_3 {
    public static void main(String[] args) {
        //Q.6 Display this Arithmetic Progression (AP) - 1,3,5,7,9,11,13,15... upto 'n' terms.
        //example if (n=6) the terms will be ->1,3,5,7,9,11
        //example
        // 1,3,5,7,9,11
        // 1 is a first term = (a), and the common difference is 2...
        // 2nd term  = a + d
        // 3rd term =  a + 2d
        // nth term =  a +(n-1)d
        System.out.println("Arithmetic Progression (AP)");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        //example-1
        //2nd term  = a + d
        for(int i = 1; i<=2*n-1; i+=2){
                System.out.print(i+" ");//1 3 5 7 9 11 13 15 17 19
        }

        //example-2
        for(int i = 1; i<=3*n-1; i+=3)
            System.out.print(i+", ");//1, 4, 7, 10, 13, 16, 19, 22, 25, 28

        //example-3
        //AP-> 4,7,10,13,16,19...
        int a=4, d=3;
        for(int i = 1; i<=n ;i++){
            System.out.print(a+ " ");
            a += d;
        }

        //example-4
        //AP-> 2,6,10,14,18,22,26,30....
        int a1=2, d1=4;
        for(int i = 1; i<=n ;i++){
            System.out.print(a1+ " ");
            a1 += d1;
        }
        //so now we can print any arithmetic progression
    }
}
