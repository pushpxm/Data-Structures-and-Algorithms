package leet1;

import java.util.Arrays;

public class leet66_plusone {
    public static void main(String[] args){
    int[] digits = {1,2,3};
        System.out.println(Arrays.toString(plusprob(digits)));


    }
    public static int[] plusprob(int[] digits){

        int n = digits.length;

        for(int i=n-1;i>=0;i--){
            if (digits[i] < 9) {
            digits[i]=digits[i]+1;
            return digits;
            }
            digits[i]=0;}
            int[] new_digit = new int[n+1];
            new_digit[0]=1;

    return new_digit;    }
    }
