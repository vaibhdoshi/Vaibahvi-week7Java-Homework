package javaprogrammeweek7;
/*Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?
1.century (100%=0 and 400%=0) 2000 2400  1700 1800 1900
2.yearly (100%!=0 and 4%=0) 2020  2024   2021 2022 2023
if a year is multiple of 400,then it is leap year
Else if a year is multiple of 100,then it is not a leap year
Else if a year is multiple of 4,then it is a leap year
*/

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any year : ");
        int year = scanner.nextInt();
        LeapYear t = new LeapYear();
        t.myMethod3(year);

    }
    public void myMethod3(int year) {
        if ((year % 4 == 0) && !(year % 100 == 0) | (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap year");

        }

    }


}