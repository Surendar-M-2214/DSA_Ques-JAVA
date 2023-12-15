package Basics_DSA;



public class Armstrong_num {
    static int cnt = 0;
    public static void main(String[] args) {
        System.out.println(isarmstrong(153));
    }
    public static int pownum(int num, int pow){
        int cnt=1;
        if(pow==0){
            return 1;
        }
        for (int i = 1; i <=pow ; i++) {
            cnt=num*cnt;
        }
        return cnt;

    }
    public static int count(int num){
        int  count =0;
        while(num>0){
            count++;//        1              2            3
            num/=10;
        }
        return count;
    }
    private static boolean isarmstrong(int i) {

        int n=count(i);
        int temp=i,sum=0;
        while(temp>0){
            int r =temp%10;
            sum+=pownum(r,n);
            temp/=10;

        }
        return (sum==i);

    }


}
