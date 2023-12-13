package Basics_DSA;



public class Armstrong_num {
    static int cnt = 0;
    public static void main(String[] args) {
        System.out.println(isarmstrong(153));
    }
static boolean isarmstrong(int num){
        int temp=num,sum=0;
        while(temp>0){
            temp%=10;
            sum+=power(temp,count(num));

        }
       if(sum==num){
           return true;
       }
       return false;
}

    private static int power(int temp, int count) {
        if(count==0){
            return 1;
        }
        int cnt=1;
        if(count==0){
            return 1;
        }
        for (int i = 1; i <=count ; i++) {
            cnt=temp*cnt;
        }
        return cnt;
    }

    static int count(int num) {
        while (num > 0) {
            num /= 10;
            cnt++;
        }
   return cnt;
    }


}
