package ARRAYS;

import javax.sound.sampled.SourceDataLine;

public class MoreThanNbyTwo {
    public static int more(int a[]){
        int n = a.length;
        for(int i = 0;i<n;i++){
            int cnt = 0;
            for(int j = 0;j<n;j++){
                if(a[i]==a[j]){
                    cnt++;
                }
            }
            if(cnt>(n/2)){
                return a[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {2, 2, 1, 1, 1, 2, 2};
        int result = more(a);
        System.out.println(result);
    }
    
}
