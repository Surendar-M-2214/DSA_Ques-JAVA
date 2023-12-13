package Basics_DSA;

public class pow_num {
    public static void main(String[] args) {
        //***************USING LOGIG********************

        System.out.println(pownum(2,3));
        //**********************************************


        //*************USING RECURSION******************
        int res1 =power(2,3);
        System.out.println(res1);
        //**********************************************
    }
    //***************USING LOGIG************************
    static int pownum(int num, int pow){
        int cnt=1;
        if(pow==0){
            return 1;
        }
        for (int i = 1; i <=pow ; i++) {
           cnt=num*cnt;
            }
        return cnt;

    }
    //*************************************************


    //*************USING RECURSION*********************
    public static int power(int num,int pow){
        if (num==0 )
        {
            return 0;
        }
        if (pow==0){
            return  1;
        }
        return num*power( num,pow-1);
//*****************************************************
    }
}
