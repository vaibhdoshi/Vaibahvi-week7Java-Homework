package javaprogrammeweek7;

import java.util.Scanner;

/*16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”*/
public class PositiveNegative16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = scanner.nextInt();
        PositiveNegative16 t = new PositiveNegative16();
        t.myMethod5(num);

    }

    public void myMethod5(int num) {
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("zero");
        }

    }


}
