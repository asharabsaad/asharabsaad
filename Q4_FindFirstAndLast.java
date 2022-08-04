package com.asharab;

import java.util.Arrays;

public class Q4_FindFirstAndLast {
    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,10};
        int target = 7;
        int[] ans = searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target) {

        // check for first occurrence of target first
        int[] ans = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0] = start;
        ans [1] = end;
        return ans;

    }
    // this function  just returned the index of target
    static int search(int[] nums, int target,boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        // check for first occurrence of target first

        while (start <= end) {
            int mid = start + (end - start)/2;




            if (findStartIndex) {
                end  = mid - 1;
            }
            else {
                start = mid + 1;
            }
            if(target == nums[mid]){
                ans = mid;
            }
        }
        return ans;
    }
}
