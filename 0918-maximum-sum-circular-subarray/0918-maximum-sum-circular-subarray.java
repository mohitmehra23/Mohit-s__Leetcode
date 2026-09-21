class Solution {
    public int maxSubarraySumCircular(int[] nums) { 
       //finds the total sum of the array
       int totalsum = nums[0];

       //finds the maximum subarray using kadanes algorithm 
       int currentmax =nums[0];
       int maxsum = nums[0];

       //find the minimum subarray using kadanes algorithm  
       int currentmin = nums[0];
       int minsum = nums[0];

       for(int i = 1 ; i < nums.length ; i++ ){
        //maximum subarray
        currentmax = Math.max(nums[i] , currentmax + nums[i]);
        maxsum = Math.max(maxsum , currentmax);
       
        //minimum subarray
        currentmin = Math.min(nums[i], currentmin + nums[i]);
        minsum = Math.min(minsum , currentmin);
        
        //total sum of the whole array
        totalsum = totalsum + nums[i];
       }
       //if the whole array contains negative elements
       // otherwise maxsum will return zero as (totalsum - minsum) will be zero and maxsum will return the maximum value and zero would be greater than any negative value 
       if(maxsum < 0)
        return maxsum;

        //finds the maximum sum between  normal subarray and circular subarray
        maxsum = Math.max(maxsum , totalsum - minsum);

        return maxsum;
     }
}