package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("1.barname nevisi");
        System.out.println("2.moadelat");
        System.out.println("3.amar");
        Scanner scanner=new Scanner(System.in);
        System.out.print("whitch one:");
        int i=scanner.nextInt();
        if(i==1){
            Dars dars=new BarnameNevisi();
            dars.vaheddars();
            dars.pisniaz();
            dars.hamniaz();
        }
        if (i==2){
            Dars dars=new Moadelat();
            dars.vaheddars();
            dars.pisniaz();
            dars.hamniaz();
        }
        if (i==3){
            Dars dars=new Amar();
            dars.vaheddars();
            dars.pisniaz();
            dars.hamniaz();
        }
    }
}
