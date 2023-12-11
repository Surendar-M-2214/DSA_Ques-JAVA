package Basics_DSA;

import java.util.Scanner;

public class revnum {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        int rev=0,rem;
        while(num>0){// 123;  12;   1; 0 !
            rem =num%10;//      ex: 123%10 = 3;  12%10 = 2;  1%10 = 1;
            rev= rev*10+rem;//   0*10+3 = 3;   3*10+2 = 32;  32*10+1 = 321;
            num=num/10;//    123/10 = 12;     12/10 = 1;   1/10 = 0

        }
        System.out.println(rev);
    }
}
