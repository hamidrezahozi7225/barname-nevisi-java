package com.company;

public class Tafrigh extends Mashin {
    public Tafrigh(double i, double j) {
        super(i, j);
        if (i>=j){
            double k=i-j;
            System.out.println(k);
        }
        else {
            double k=j-i;
            System.out.println(k);
        }
    }


}
