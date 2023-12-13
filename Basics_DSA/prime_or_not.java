package Basics_DSA;

public class prime_or_not {
  static   int i =2;
    public static void main(String[] args) {
     if (isprime(4)){
         System.out.println("true");
     }
     else {
         System.out.println("false");
     }
    }
    public static boolean isprime(int num) {

        if (num ==0 || num==1){
            return false;
        }
        if (num==i){
            return true;
        }

        if(num%i==0){
            return false;
        }
        i++;
        return isprime(num);

    }
}
