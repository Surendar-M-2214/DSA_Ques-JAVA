package Basics_DSA;

public class perfectnum {
    public static void main(String[] args) {
        System.out.println(isperfect(6));

        System.out.println();
        allperfect();
    }

    private static void allperfect() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
       if (isperfect(i)){
           System.out.println(i+" the perfect number");
       }

        }
    }

    private static boolean isperfect(int n) {
        int sum=0;
        for (int i = 1; i <n ; i++) {
            if (n%i==0){
                sum+=i;
            }
        }
        return (sum==n);
    }



}
