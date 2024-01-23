package ARRAYS;

import java.util.*;
public class RemoveDuplicates {
    public static int remove(int a[]){
        int n = a.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<n;i++){
            set.add(a[i]);
        }
        int k = set.size();
        // int j =0;
        // for(int x :set){
        //     a[j++] = x;    this is optional
        // }
        return k;
    }
    public static void main(String[] args) {
        int a[] = {1,2,1,1,1,2};
        int result = remove(a);
        for(int i = 0;i<result;i++){
            System.out.println(a[i]);
        }
    }
}
