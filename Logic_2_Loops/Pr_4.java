package Logic_2_Loops;
import java.util.Scanner;

public class Pr_4 {
    public static void main(String[] args) {
        // Geometric Progression (GP) is a sequence where each term
        // is found by multiplying the previous term by a constant (common ratio).
        // Example: 2, 6, 18, 54,... (common ratio = 3)
        // nth term formula: a * r^(n-1)
        // Sum of first n terms: (a * (r^n - 1)) / (r - 1), when r != 1

        //Q7. Display this Geometric Progression (GP) - 1,2,4,8,16,32,64,128 / 3,12,48,192... upto 'n' terms.


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        // 1,2,4,8,16,32... upto n terms
        int a = 1, r=2;
        for (int i = 1; i <= n; i++) {
            System.out.print(a+" ");
            a *= r;
        }
    }
}
