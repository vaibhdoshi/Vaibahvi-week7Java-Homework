package javaprogrammeweek7;

import java.util.Scanner;

/*Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 and 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 and 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
| |
| Mark Sheet |
|_______________________________|
| Name : Jay |
| Roll No: 08 |
|_______________________________|
| Subjects : Marks |
|_______________________________|
| Math : 98 |
| Science : 90 |
| English : 85 |
|_______________________________|
| Total : 273 |
|_______________________________|
| Percentage : 91.0 |
| Result : Pass |
| Grade : A+ |
|_______________________________|
*/
public class Programme3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Maths, Science, English, total;
        double percentage;
        String result;
        String grade = null;
        System.out.println("Please Enter Student Name :");
        String name = scanner.nextLine();

        System.out.println("Please Enter roll number :");
        int rollnumber = scanner.nextInt();

        System.out.println("Please enter Maths Marks :");
        Maths = scanner.nextInt();
        if (Maths > 100 || Maths < 0) {
            System.out.println("Invalid Input,Mark should be between 0 to 100");
            System.exit(0);
        }
        System.out.println("Please enter Science Marks : ");
        Science = scanner.nextInt();
        if (Science > 100 || Science < 0) {
            System.out.println("Invalid Input,Mark should be between 0 to 100");
            System.exit(0);
        }

        System.out.println("Please enter English Marks : ");
        English = scanner.nextInt();
        if (English > 100 || English < 0) {
            System.out.println("Invalid Input,Mark should be between 0 to 100");
            System.exit(0);
        }

        Programme3 t = new Programme3();
        total = t.total1(Maths, Science, English);
        Programme3 t1 = new Programme3();
        percentage = t1.percentage(total);
        result = t1.result(percentage);
        grade=t1.grade( percentage) ;
        System.out.println("-----------------------------------------");
        System.out.println("|                                        |");
        System.out.println("|       Mark Sheet                       |");
        System.out.println("|---------------------------------------  |");
        System.out.println("|   Name        :    " + name + "        |");
        System.out.println("|  Roll No     :    " + rollnumber + "    |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|  Subjects:              Marks            |");
        System.out.println("|------------------------------------------|");
        System.out.println("|      Math:                " + Maths + "   |");
        System.out.println("|      Science:              " + Science + "|");
        System.out.println("|      English:              " + English + "|");
        System.out.println("|--------------------------------------------|");
        System.out.println("|       Total:                " + total + "  |");
        System.out.println("|---------------------------------------------|");
        System.out.println("|    Percentage:               " + percentage + "|");
        System.out.println("|     Result:                   " + result + "      |");
        System.out.println("|     Grade:                    " + grade + "   |");
        System.out.println("|------------------------------------------------|");
    }

    public int total1(int Maths, int Science, int English) {
        int total = Maths + Science + English;
        System.out.println("Total Marks are:" + total);
        return total;
    }

    public int percentage(int total) {
        int percentage = (total * 100 / 300);
        System.out.println("Percentage is : + percentage");
        return percentage;
    }

    public String result(double percentage) {
        String result;
        if (percentage > 35) {
            result = "pass";
        } else {
            result = "fail";
        }
        System.out.println("Result : " + result);
        return result;
    }

    public String grade(double percentage) {
        String grade1= (null);
        if (percentage >= 80) {
            grade1 = "A+";
            System.out.println("grade: " + grade1);
        } else if (percentage >= 60 && percentage <= 79) {
            grade1 = "A";
            System.out.println("grade :" + grade1);
        } else if (percentage >= 50 && percentage <= 59) {
            grade1 = "B";
            System.out.println("grade : " + grade1);
        } else if (percentage > 35 && percentage <= 49) {
            grade1 = "C";
            System.out.println("grade :" + grade1);
        }
        return grade1;
    }

}




