package Tasks_24_25_May;

import java.util.Scanner;

public class Task4_Grade_May24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Grade obtained");
        String grade = sc.next();
        grade = grade.toLowerCase();
        switch (grade) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Very good");
                break;
            case "C":
                System.out.println("Good");
                break;
            case "D":
                System.out.println("Need Improvement");
                break;
            case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }

    }
}
