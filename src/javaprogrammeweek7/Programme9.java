package javaprogrammeweek7;
/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry using switch statement
*/

import java.util.Scanner;

public class Programme9 {

    public static void main(String[] args) {

        String cityname;
        char alphabet;
        Scanner scanner = new Scanner(System.in);
        System.out.println("city name");
        System.out.println("1. Aberdeen");
        System.out.println("2.  Bath");
        System.out.println("3.  Cardiff");
        System.out.println("4.  Dundee");
        System.out.println("5.  Edinburgh");
        System.out.println("6.  Falmouth");

        System.out.println("Enter any alphabet(A to F):");
        alphabet = scanner.next().charAt(0);
        scanner.close();
        switch (alphabet) {
            case 'A':
                System.out.println("Aberdeen");
                break;
            case 'B':
                System.out.println("Bath");
                break;
            case 'C':
                System.out.println("Cardiff");
                break;
            case 'D':
                System.out.println("Dundee");
                break;
            case 'E':
                System.out.println("Edinburgh");
                break;
            case 'F':
                System.out.println("Falmouth");
                break;
            default:
                System.out.println("Invalid message");
        }
        //output
        System.out.println("cityname");
    }


}




