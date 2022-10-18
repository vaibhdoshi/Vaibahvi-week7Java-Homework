package javaprogrammeweek7;
/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
*/

import java.util.Scanner;

public class CityNameIfElse {

    public static void main(String[] args) {

        char alphabet;
        String city = "Aberdeen";
        String city1= "Bath";
        String city2= "Cardiff";
        String city3= "Dundee";
        String city4= "Edinburgh";
        String city5= "Farnham";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any alphabet from A to F");
        alphabet = scanner.next().charAt(0);
        if (alphabet=='A') {
            System.out.println("Print city name :" + city);
        } else if (alphabet == 'B') {
            System.out.println("Print city name :" + city1);
        } else if (alphabet == 'C') {
            System.out.println("Print city name :" + city2);
        } else if (alphabet == 'D') {
            System.out.println("Print city name :" + city3);
        } else if (alphabet == 'E') {
            System.out.println("Print city name :" + city4);
        } else if (alphabet == 'F') {
            System.out.println("Print city name :" + city5);
        } else {
            System.out.println("Invalid Entry");
        }


    }
}










