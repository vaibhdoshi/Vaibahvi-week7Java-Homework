package javaprogrammeweek7;
/*Write a java program that tells us that Input number is odd or even?
 HINT: use ternary operator (? :)
  */

import java.util.Scanner;

public class EvenOdd1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scanner.nextInt();
        EvenOdd1 t = new EvenOdd1();
        t.myMethod(num);
    }

    public void myMethod(int num) {
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is : " + result);
    }


}
