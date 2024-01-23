package ARRAYS;

import javax.xml.transform.Source;

public class RemoveDuplicates2 {
    public static int remove(int a[]){
        int n = a.length;
        int i = 0;
        for(int j = 1;j<n;j++){
            if(a[i]!=a[j]){
                i++;
                a[i] = a[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int a[] ={1,1,1,2,2,3,3};
        int k = remove(a);
        for(int i = 0;i<k;i++){
            System.out.print(a[i]+" ");
        }

    }
    
}
