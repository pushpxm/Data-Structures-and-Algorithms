package leet1.Leet1832;

import java.util.Arrays;

public class maxpop {
    public static void main(String[] args) {
        int[][] logs = {{1993,2001},{2000,2010}};
        System.out.println((maximumPopulation(logs)));
    }

    public static int maximumPopulation(int[][] logs){
        int[] arr = new int[101];

        for (int[] log:logs) {

        int by = log[0];
        int dy = log[1];

        arr[by-1950]++;
        arr[dy-1950]--;}

        int max = arr[0];
        int MaxYear = 1950;
        for (int i=1;i<101;i++) {
            arr[i]+=arr[i-1];
            if (max<arr[i]){
                max = arr[i];
                MaxYear = i+1950;
            }
        }

        return MaxYear;

    }
}


