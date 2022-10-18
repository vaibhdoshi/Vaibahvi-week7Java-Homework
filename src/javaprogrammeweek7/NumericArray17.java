package javaprogrammeweek7;
/*17. Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class NumericArray17 {

    public static void main(String[] args) {
        NumericArray17 t = new NumericArray17();
        t.myMethod4();

    }

    public void myMethod4() {
        int[] arraydata1 = {23, 45, 6, 56, 77, 89, 90, 65, 45, 78};
        String[] arraydata2 = {"Z", "D", "A", "M", "B", "L", "C", "X"};
        System.out.println("Original value :  " + Arrays.toString(arraydata1));
        Arrays.sort(arraydata1);
        System.out.println("Sorted Value : " + Arrays.toString(arraydata1));
        System.out.println("Original value : " + Arrays.toString(arraydata2));
        Arrays.sort(arraydata2);
        System.out.println("Sorted Value : " + Arrays.toString(arraydata2));

    }
}
