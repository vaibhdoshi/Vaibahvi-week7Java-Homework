package javaprogrammeweek7;/*
WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
| Salary Slip |
|______________________________|
| Employee Id : 2564 |
| Employee Name : Jay |
|______________________________|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|______________________________|
| Gross Salary : 26750.0 |
|===========================|
*/

import java.util.Scanner;

public class Programme5 {
    static String name;
    static int empID, x, y, z, a;
    static int basic;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Name : ");
        name=scanner.nextLine();
        System.out.println("Enter Employee ID : ");
        empID = scanner.nextInt();
        System.out.println("Enter Basic Salary : ");
        basic = scanner.nextInt();
        scanner.close();
        int gross = basic + HRA() + TA() + DA() - PF();
        System.out.println("-------------------------------------");
        System.out.println("|       Salary Slip                  |");
        System.out.println("|------------------------------------|");
        System.out.println("|EmployeeID:"          + empID  +  " |");
        System.out.println("|Employee Name :"      + name +     "|");
        System.out.println("|------------------------------------|");
        System.out.println("|Basic Salary: "        + basic +   "|");
        System.out.println("|HRA 10% : "            + x +       "|");
        System.out.println("|TA 20% : "             + y  +     "|");
        System.out.println("|DA 9%  : "             + z  +     "|");
        System.out.println("|PF 20%  : "            + a  +     "|");
        System.out.println("|----------------------------------|");
        System.out.println("|Gross Salary : " + gross +       "|");
        System.out.println("|----------------------------------|");
        System.out.println("|----------------------------------|");
    }

    public static int HRA() {//with return type no parameter method
        x = (basic * 10) / 100;
        return x;
    }

    public static int TA() {
        y = (basic * 8) / 100;
        return y;
    }

    public static int DA() {
        z = (basic * 9) / 100;
        return z;
    }

    public static int PF() {
        a = (basic * 20) / 100;
        return a;
    }

}



