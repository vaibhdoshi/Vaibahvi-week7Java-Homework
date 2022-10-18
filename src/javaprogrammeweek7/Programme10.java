package javaprogrammeweek7;

import java.util.Scanner;

/*Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)
*/
public class Programme10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int add;
        int subtract;
        int multiply;
        float divide;
        char ch;
        System.out.println("Enter First Number");
        n1 = input.nextInt();
        System.out.println("Enter Second Number");
        n2 = input.nextInt();
        System.out.println("choices Are :");
        System.out.println("1. +");
        System.out.println("2. - ");
        System.out.println("3. * ");
        System.out.println("4. % ");
        System.out.println("Enter your choice of symbol");
        ch = input.next().charAt(0);
        add = n1 + n2;
        subtract = n2 - n1;
        multiply = n1 * n2;
        divide = (float) n1 / n2;

        if (ch == '+') {
            System.out.println("Addition : " + add);
        } else if (ch == '-') {
            System.out.println("Subtraction : " + subtract);
        } else if (ch == '*') {
            System.out.println("Multiplication : " + multiply);
        } else{
            System.out.println("Division :" + divide);
        }

    }
}
