package javaprogrammeweek7;
/*
Write a java program to print the numbers between 1 and 100 which can be divided by 3
and 5 separately.
 */
public class Programme11 {
    public static void main(String[] args) {
        myMethod8();
    }

    public static void myMethod8() {

        System.out.println("\nDivided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }

        System.out.println("\n\nDivided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) System.out.print(i + ", ");
        }

    }
}


