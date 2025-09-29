package Logic_1;

public class Program_3 {
    public static void main(String[] args) {
        //5Q. Take a positive number input and tell if it is divisible by 5 or 3 but not divisible by 15.
        //Like-> 3, 5, 6, 9, 10, 12, (15) , 18, 20, 21, 24, 25...
        // method-1
        int num=18;
        if(num % 3 == 0 || num % 5==0)
        {
            if(num % 15 != 0){
                System.out.println("Yes " + num + " is devisible by 3 and 5 but not fifteen");
            }
            else{
                System.out.println("Not matching the required condition");
            }
        } else {
            System.out.println("Not matching the required condition");
        }
        // method-2
        if((num % 3 == 0 || num % 5==0) && num % 15 != 0) // && have higher pareority then ||
        {
            System.out.println("Yes " + num + " is devisible by 3 and 5 but not fifteen");
        }
        else {
            System.out.println("Not matching the required condition");
        }

        //Nested if-else
        //6Q. Check if a year is a leap year or not
        //-> A leap year has 366 days (February gets 29 days).
        //  Divisible by 4 = leap year✅.
        //  Divisible by 100 = not leap year❌.
        //  Divisible by 400 = leap year✅.
        //Example: 2024 ✅, 2100 ❌, 2000 ✅.
        int year = 2024;
        if(year % 4 == 0) { // this likely leap year
            // if it div.. by 4, have to check cleanly devisible by 100
            if(year % 100 == 0) {// if 100 is NO devisible then its difinetly leap year
                if(year % 400 == 0)//if Yes we have to check it again, is it cleanly divisible by 400 ? if No so its is not Leap year
                    System.out.println(year+" Leap Year");
                else System.out.println(year+" not Lear Year");
            }
            else{
                System.out.println(year + " is Leap Year!");
            }
        }   else {
            System.out.println(year+ " is not Leap Year!");
        }
    }
}
