package javaprogrammeweek7;

import java.util.Scanner;

/*Write a Java program to calculate the average value of array elements.
 */
public class AverageOfArray19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many elements you want?");
        int n = scanner.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        System.out.println("Enter" + n + "elements in an array");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
            sum += arr[i];
            AverageOfArray19 t = new AverageOfArray19();

        }
        System.out.println("Average is: " + sum / n);
    }


}



