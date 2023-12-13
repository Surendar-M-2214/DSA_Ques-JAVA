package Basics_DSA;

import java.util.ArrayList;

public class GCD {
    public static void main(String[] args) {
        int a = 36, b = 60;
        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
        System.out.println(24%12);
    }
//**********USING RECURSION NY EUCLEDIAN ALGO************
    static int gcd(int a, int b)
    {
          if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
