package Lecture2D2402;

import java.util.Scanner;

//By 3 given integer:
//Day
//Month
//Year
//Try to check if the date is correct

public class L02Task3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();

        boolean isLeapYear = (year % 4 == 0);
        boolean isValid = false;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            if (day > 0 && day <= 31){
                isValid = true;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11){
            if (day > 0 && day <= 30){
                isValid = true;
            }
        } else if (month == 2){
            if (isLeapYear && (day > 0 && day <= 29)){
                isValid = true;
            } else if (!isLeapYear && (day>0 && day <=28)){
                isValid = true;
            }
        }

        if(isValid){
            System.out.println("Valid date");
        } else {
            System.out.println("Not a valid date");
        }

        scan.close();
    }
}
