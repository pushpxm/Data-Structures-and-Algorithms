package leet1;

public class Highest_Altitude {
    public static void main(String[] args) {
    int[] gain= {-9,6,4,1,-1};
        System.out.println(largestAltitude(gain));
    }



    static int largestAltitude(int[] gain){
        int current = 0;
        int max = 0;
        int n = gain.length;
        for(int i=0;i<n;i++) {
             current+=gain[i];
            if(current>max){
                max = current;
            }
        }
        return max;
    }
}


