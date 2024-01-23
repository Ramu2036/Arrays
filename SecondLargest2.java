package ARRAYS;

public class SecondLargest2 {
    public static int second(int a[]){
        int n = a.length;
        int largest = Integer.MIN_VALUE+1;
        for(int i = 0;i<n;i++){
            if(a[i]>largest){
                largest = a[i];
            }
        }
        int sl = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(a[i]>sl && a[i]!=largest){
                sl = a[i];
            }
        }
        return sl;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int result = second(a);
        System.out.println(result);
    }
}

