package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter number 1:");
        double i=scanner.nextDouble();
        System.out.print("enter number2:");
        double j=scanner.nextDouble();
        Mashin maashin=new Mashin(i,j);


        System.out.println("1.jam");
        System.out.println("2.zarb");
        System.out.println("3.tafrigh");
        System.out.println("4.taghsim");
        System.out.print("whitch one:");
        int a=scanner.nextInt();
        if (a==1){
            Mashin mashin=new Jaam(i,j);
        }
        else if(a==2){
            Mashin mashin=new Zarb(i,j);
        }
        else if (a==3){
            Mashin mashin=new Tafrigh(i,j);
        }
        else if (a==4){
            Mashin mashin=new Taghsim(i,j);
        }
    }
}
