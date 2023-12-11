package Basics_DSA;
import java.util.*;

public class cntdigi {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        long num=in.nextLong();//Get Input
//*******USING STRING CONVERSION *********************
        String str=Long.toString(num);//Convert It into  toString
        long res=str.length();//find the length of the String using .length()
     System.out.println(res);//Print the output
//******************************************************

// **************USING LOGICS***********************

int count =0;
while(num>0){
    num/=10;//   ex: 123/10 = 12 ...12/10 = 1...  1/10 = 0 ..END
    count++;//        1              2            3
}
        System.out.println(count);
    }
}
