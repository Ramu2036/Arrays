package ARRAYS;

public class MovingAllZeros {
    public static int[] one(int a[]){
        int n = a.length;
        int temp[] = new int[n];
        for(int i = 0;i<n;i++){
            temp[i] = 0;  
        }
        int j = 0;
        for(int i = 0;i<n;i++){
            if(a[i]!=0){
                temp[j] = a[i];
                j = j+1;
            }
        }
        return temp;
        
    }
    public static void main(String[] args) {
        int a[] = {1,0,1,0,2,0};
        int r[] = one(a);
        for(int i = 0;i<r.length;i++){
            System.out.print(r[i]+" ");
        } 
    }
    
}
