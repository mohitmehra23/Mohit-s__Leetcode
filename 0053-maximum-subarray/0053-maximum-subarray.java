class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];             
        int currentsum = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            currentsum = Math.max(nums[i] , currentsum + nums[i]); //Maximum sum of a subarray
                                                                   //ending at current index
          
            maxsum = Math.max(maxsum , currentsum);        // maximum sum among all subarrays 
        }                                                  //considered so far
        return maxsum;
    }
}