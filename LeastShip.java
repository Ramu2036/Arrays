package ARRAYS;

public class LeastShip {
    public static int d(int w[],int cap){
        int load = 0;
        int days = 1;
        int n = w.length;
        for(int i = 0;i<n;i++){
            if(load+w[i]>cap){
                days = days+1;
                load = w[i];
            }
            else{
                load =load + w[i];
            }
        }
        return days;
    }
    public static int daysre(int w[],int days){
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i =0;i<w.length;i++){
            sum+=w[i];
            maxi = Math.max(maxi,w[i]);
        }
        for(int i = maxi;i<sum;i++){
            int daysrequired = d(w, i);
            if(daysrequired<=days){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {5, 4, 5, 2, 3, 4, 5, 6};
        int days = 5;
        int result = daysre(a, days);
        System.out.println(result);
    }
    
}
