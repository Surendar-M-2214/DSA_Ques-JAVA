package Basics_DSA;

public class sqrt {
    public static void main(String[] args) {
       double x = 11;
        System.out.println(square(x));
    }
    public static double square(double x){
        if(x==0||x==1){
            return x;
        }
        //BINARY SEARCH****0
   double start=1,end=x/2,ans=0;
        while(start<=end){
            double mid =(start+end)/2;
            if(mid*mid==x){
                return (int)mid;
            }
            if (mid*mid<x){
                start=mid+1;
                ans=mid;
            }
            else
                end=mid-1;
        }
        return ans;
    }
}
