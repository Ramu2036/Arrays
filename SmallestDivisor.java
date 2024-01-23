package ARRAYS;

import javax.xml.transform.Source;

public class SmallestDivisor {
    public static int divisor(int a[],int limit){
        int n = a.length;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            maxi = Math.max(maxi,a[i]);
        }

        for(int d = 1;d<=maxi;d++){
            int sum = 0;
            for(int i =0;i<n;i++){
                sum = (int)(sum+Math.ceil((double)(a[i])/(double)(d)));
            }
            if(sum<=limit){
                return d;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5};
        int limit = 8;
        int result = divisor(a, limit);
        System.out.println(result); 
    }

    
}
