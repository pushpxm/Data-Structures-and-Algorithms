import java.lang.reflect.Array;
import java.util.Arrays;

public class maxValue {

    public static void main (String[] args){

        int[] arr = {1,5,62,51,6};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
    return maxValue;
    }
}
