package Basics_DSA;

import java.util.ArrayList;

public class All_divisor {
    public static void main(String[] args) {
        divi(10);
    }

    public static void divi(int num) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                l.add(i);
            }

        }
        System.out.println(l);

    }
}