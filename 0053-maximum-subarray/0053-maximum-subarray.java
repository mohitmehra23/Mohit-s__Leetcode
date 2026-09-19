class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];             
        int currentsum = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            //Maximum sum of a subarrayending at current index
            currentsum = Math.max(nums[i] , currentsum + nums[i]); 
          // maximum sum among all subarrays considered so far
            maxsum = Math.max(maxsum , currentsum);        
        }                                                
        return maxsum;
    }
}