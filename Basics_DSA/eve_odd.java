package Basics_DSA;

import java.util.*;

public class eve_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Number: ");
       long num=in.nextLong();
        if (iseven(num)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    public static boolean iseven(long n){
        return ((n&1)==0);
        /*ex:n =5 ->101
                   &001
                   =001
           it'll check the last bit :D
        */
    }
}
