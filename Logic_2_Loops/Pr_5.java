package Logic_2_Loops;
import java.util.Scanner;

public class Pr_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n' Number: ");
        int n = sc.nextInt(), i, count = 0;
        //8Q.WAP to check if a number is prime or not.

        //-> what is prime number,
        //prime numbers have exactly two factors (1 and the number itself)
        //while composite numbers have more than two factors.
        // The number 1 is unique, being neither prime nor composite.
        //Prime Numbers ->  2, 3, 5, 7, 11, 13...
        //Composite Numbers->4 (factors: 1, 2, 4),
        // 6 (factors: 1, 2, 3, 6), 8 (factors: 1, 2, 4, 8),
        // 10 (factors: 1, 2, 5, 10).

        //method-1
        for(i=2;i<=n;i++){
            if(n % i == 0){
                System.out.println("Not Prime Number");
                break;
            }
        }
        if(i == n){
            System.out.println("Prime Number");
        }

        //method-2
        for(i=2;i<=n;i++){
            if(n % i == 0){
                count ++;
            }
        }
        if(n == 1){
            System.out.println("Nether prime nor Composite");
        }
        else if(count == 1){
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }


    }
}
