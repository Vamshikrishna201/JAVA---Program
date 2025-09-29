package Logic_1;
import java.util.Scanner;

public class Program_1 {

    public static void main(String[] args) {
        /*
        * building logic in programing we should know some,
        * basic's of programming/Basic coding exercises.
        * like how ( % - modulus ) operators work's and
        * understand other operators also,
        * especially we should solve some,
        * basic problem questions as related
        * to (if-else), (loops), and on Arrays.
        * */

        // 1Q. Find the greatest of three numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Find the greatest of 3 numbers =====");

        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter the first number");
        int n2 = sc.nextInt();
        System.out.println("Enter the first number");
        int n3 = sc.nextInt();
        if(n1 > n2 && n1> n3){
            System.out.println(n1 + " is greatest than "+ n2 + " & "+ n3);
        }
        else if(n2 > n1 && n2 > n3)
        {
            System.out.println(n2 + " is greatest than "+ n1 + " & "+ n3);
        }
        else{
            System.out.println(n3 + " is greatest than "+ n1 + " & "+ n2);
        }
        sc.close();

    }

}
