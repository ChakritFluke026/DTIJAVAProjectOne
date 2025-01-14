package Com.sau.tech;


import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class MyClass03 {
    public static void main(String[] args) {
        String empName;
        double emSalary, tax10;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input employee name: ");
        empName = sc.next();
        System.out.println("Input employee salary: ");
        emSalary = sc.nextDouble();
        System.out.println("-----------------------------");
        tax10 = emSalary * 10 / 100;
        System.out.println("TAX pay: ");

    }
}
