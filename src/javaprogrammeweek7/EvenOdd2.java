package javaprogrammeweek7;
/*Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class EvenOdd2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = scanner.nextInt();
        EvenOdd2 t = new EvenOdd2();
        t.myMethod1(num);

    }

    public void myMethod1(int num) {
        if (num % 2 == 0) {
            System.out.println("Number is even :" + num);
        } else {
            System.out.println("Number is odd :" + num);
        }


    }


}
