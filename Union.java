package ARRAYS;

import java.util.HashSet;

public class Union {
    public static HashSet<Integer>union(int a1[],int a2[]){
        int n = a1.length;
        int m = a2.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<n;i++){
            set.add(a1[i]);
        }
        for(int i = 0;i<m;i++){
            set.add(a2[i]);
        }
        return set;
    }
    public static void main(String[] args) {
        int a1[] = {1,1,1,2};
        int a2[] = {1,1,1,3};
        HashSet<Integer> set = union(a1, a2);
        System.out.println(set);
    }
    
}
