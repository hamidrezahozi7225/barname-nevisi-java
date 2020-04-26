package com.company;

public class Taghsim extends Mashin {
    public Taghsim(double i, double j) {
        super(i, j);
        if (j != 0) {
            double k = i / j;
            System.out.println(k);
        } else {
            System.out.println("!!!!");
        }
    }
}
