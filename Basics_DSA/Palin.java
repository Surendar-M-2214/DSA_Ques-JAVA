package Basics_DSA;

public class Palin {
    public static void main(String[] args) {
        System.out.println(ispalin(313));
    }

    private static boolean ispalin(int i) {
        int temp=i,res=0;
        while(temp>0){
            int rem=temp%10;
            res=res*10+rem;
            temp/=10;
        }
        return(res==i);
    }
}
