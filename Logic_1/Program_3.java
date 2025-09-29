package Logic_1;

public class Program_3 {
    public static void main(String[] args) {
        //4Q. Check if a year is a leap year or not
        //-> A leap year has 366 days (February gets 29 days).
        //  Divisible by 4 = leap year✅.
        //  Divisible by 100 = not leap year❌.
        //  Divisible by 400 = leap year✅.
        //Example: 2024 ✅, 2100 ❌, 2000 ✅.
        int year = 2024;
        if(year % 4 == 0) {

            if(year % 100 == 0) {
                if(year % 400 == 0)
                    System.out.println(year+" Leap Year");
                else System.out.println(year+" not Lear Year");
            }
            else{
                System.out.println(year + " is Leap Year!");
            }
        }
        else
            System.out.println(year+ " is not Leap Year!");
        }
    }
