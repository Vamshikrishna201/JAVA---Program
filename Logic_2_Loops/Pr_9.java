package Logic_2_Loops;

public class Pr_9 {
    public static void main(String[] args) {
        //12Q. WAP to print reverse of a given number;
        int num = 54321, reminder, original, reverse = 0;
        original = num;
        while(num != 0){
            reminder = num % 10;//1
            reverse = reverse * 10 + reminder;
            // 1->10->12->120->123->1230->1234->12340->12345
            num = num / 10; // 5432
        }
        System.out.println(reverse);


    }
}
