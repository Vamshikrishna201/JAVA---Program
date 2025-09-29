package Logic_2_Loops;

public class pr_1 {
    public static void main(String[] args) {
        //Problem-1 Beginner level!
        //Q-1. Print all the even number from 1 to 100
        for(int i = 1; i<=100; i++){
            if(i % 2 == 0)
                System.out.print(i);
            else System.out.print(" ");
        }

        //Q-2. Print all the number from 1 to 100, which are divisible by 3
        for(int i = 1; i<=100; i++){
            if(i % 3 == 0)
                System.out.print(i);
            System.out.print(" ");
        }

        //Q3. WAP to print number from 10 to 1
        for(int i=10; i>=1; i--)
            System.out.println(i);
    }
}
