package javaprogrammeweek7;
/*Write a program that tells us input value is number or an alphabet or symbol
 */

import java.util.Scanner;

public class Programme12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);
        Programme12 t = new Programme12();
        t.myMethod9(ch);

    }

    public void myMethod9(char ch) {

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + "   is a Alphabet");
        } else if (ch >= '0' && ch < '9') {
            System.out.println(ch + "   is a Digit");
        } else {
            System.out.println(ch + "   is a SPECIAL CHARACTER");
        }


    }


}





