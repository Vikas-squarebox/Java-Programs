package com.vikas;

public class Binary_search {
    public static void main(String[] args) {
        int[] nums={5,3,4,7,8,9,2};
        System.out.println(binSearch(nums,8));
    }

    static int binSearch(int[] arr, int target){
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=start-(start-end)/2;
            if (target>arr[mid]) {
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
