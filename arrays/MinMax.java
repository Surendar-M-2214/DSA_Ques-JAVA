package arrays;

public class MinMax {
    static class Pair{
        int min ;
        int max;
    }
    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        for (int i :arr){
            if(i%2==0){
                System.out.println(i);
            }
        }
        int n= arr.length;
        Pair minmax=getminmax(arr,n);
        System.out.println(minmax.max +" "+ minmax.min);
    }


    static Pair getminmax(int[] a, int n){
        Pair minmax=new Pair();


        if (a.length==1){
            minmax.max=a[0];
            minmax.min=a[0];
            return minmax;
        }
        if (a[0]>a[1]){
            minmax.max=a[0];
            minmax.min=a[1];
        }
        else {
            minmax.max=a[1];
            minmax.min=a[0];
        }
        for (int i = 2; i <n ; i++) {
            if(a[i]>minmax.max){
                minmax.max=a[i];
            }
            else if (a[i]<minmax.min){
                minmax.min=a[i];
            }

        }

        return minmax;
    }
}