package javaprogrammeweek7;
/*Write a java program input sales id, seller's name, sales amount, and salary basic and
then find this sales Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
*/

import java.util.Scanner;

public class Programme7 {

    public static void main(String[] args) {
        int SalesID;
        int Salesamount;
        int basicsalary;
        String name;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter SalesID");
        SalesID = scanner.nextInt();
        System.out.println("Enter Seller's name");
        name = scanner.next();
        System.out.println("Enter Sales amount");
        Salesamount = scanner.nextInt();
        System.out.println("Enter basic salary");
        basicsalary = scanner.nextInt();
        scanner.close();
        myMethod10(Salesamount);
    }


    public static void myMethod10(int Salesamount) {
        int commission;
        if (Salesamount >= 50000) {
            commission = (Salesamount * 35) / 100;
            System.out.println("Sales commission is : " + commission);
        } else if (Salesamount >= 30000 && Salesamount <= 49999) {
            commission = (Salesamount * 20) / 100;
            System.out.println("Sales commission is  : " + commission);
        } else if (Salesamount >= 20000 && Salesamount <= 29999) {
            commission = (Salesamount * 10) / 100;
            System.out.println("Sales commission is  : " + commission);
        } else if (Salesamount >= 10000 && Salesamount <= 19999) {
            commission = (Salesamount * 5) / 100;
            System.out.println("Sales commission is  : " + commission);
        } else if (Salesamount < 10000) {
            commission = (Salesamount * 2) / 100;
            System.out.println("Sales commission is  : " + commission);
        }

    }


}


