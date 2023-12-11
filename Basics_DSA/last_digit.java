package Basics_DSA;
import java.util.*;
public class last_digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long num = in.nextLong();
        in.close();
//*******USING STRING CONVERSION *********************
//       String str=Long.toString(num);
//       int first_digit=str.charAt(0)-'0';   //char '0' = int value 48;
//
//        int last_digit=str.charAt((str.length()-1) )-48;//here we used 48 , char value of '0'
//        System.out.println("The First Digit is: "+first_digit);
//        System.out.println("The Last Digit is: "+last_digit);
        //************************************************
//        char ch ='0';
//        System.out.println((int)(ch)); //48
        //******************************************

// **************USING LOGICS***********************
         long fd=first_digit(num);
        System.out.println("The First Digit : "+fd);
        long ld=last_digits(num);
        System.out.println("The Last Digit : "+ld);


    }
    public static long first_digit(long n){
        while(n>=10){
            n/=10;
        }
        return n;
    }
    public static long last_digits(long n){
        return n%10;
    }
}
