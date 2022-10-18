package javaprogrammeweek7;

import java.util.Scanner;

public class Programme4 {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter Year :");
        int a = sc.nextInt();
        isLeapYear(a);
        System.out.println("Enter month:");
        int c = sc.nextInt();
        getDaysInMonth(c, a);

    }

    public static void isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println("Entered year is a Leap Year");
            } else {
                System.out.println("Entered year is not a Leap Year");
            }

        } else {
            System.out.println("False");
        }

    }

    public static void getDaysInMonth(int month, int year) {
        int days;
        if (year < 1 || year > 9999) {
            System.out.println("-1");
        } else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            switch (month) {
                case 2:
                    System.out.println("29 days");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 Days.");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31 Days.");
                    break;
                default:
                    System.out.println("-1");
                    break;
            }
        } else {
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 Days.");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31 Days.");
                    break;


                case 2:
                    System.out.println("28 Days.");
                    break;

                default:
                    System.out.println("-1");
                    break;
            }
        }
    }
}