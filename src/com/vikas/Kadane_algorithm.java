package com.vikas;

public class Kadane_algorithm {

    public static void main(String[] args) {
        int[] nums={2,-3,3,4,-1};
        System.out.println(largestSum(nums));
    }

    static int largestSum(int[] arr){
        int curMax=0;
        int maxSum=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            curMax+=arr[i];
            if(curMax>maxSum){
                maxSum=curMax;
            }
            if(curMax<0)
                curMax=0;
        }
        return maxSum;
    }

}
