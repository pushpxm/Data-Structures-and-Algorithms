package leet1;

import java.util.Arrays;

public class Twosum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 13;
        System.out.println(Arrays.toString(answer(nums,target)));
    }


    static int[] answer(int[] nums, int target){
    for(int i=0;i<nums.length;i++){

        for (int j=i+1;j<nums.length;j++){
            int sum = nums[i]+nums[j];
            if(sum==target){
                return new int[]{i,j};
            }

        }
    }
    return nums;
    }
}
