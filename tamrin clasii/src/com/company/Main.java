package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("1.student");
        System.out.println("2.techer");
        System.out.println("3.employee");
        Scanner scanner=new Scanner(System.in);
        System.out.print("please inter 1 or 2 or 3:");
        int i=scanner.nextInt();
        if(i==1){
            Uni student=new Student();
            student.shoghl();
        }
        if (i==2){
            Uni teacher=new Teacher();
            teacher.shoghl();
        }
        if (i==3){
            Uni employee=new Employee();
            employee.shoghl();
        }
    }
}
