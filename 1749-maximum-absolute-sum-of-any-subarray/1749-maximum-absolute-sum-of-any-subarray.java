class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxsum = nums[0];
        int maxcurrent = nums[0];

        int minsum = nums[0];
        int mincurrent = nums[0];

        for(int i = 1 ; i<nums.length ; i++){
            //finds the maximum subarray using kadanes algorithm
            maxcurrent = Math.max(nums[i],maxcurrent + nums[i]);
            maxsum = Math.max(maxcurrent , maxsum);

            //finds the minimum subarray using kadanes algorithm
            mincurrent = Math.min(nums[i] , mincurrent + nums[i]);
            minsum =Math.min(minsum , mincurrent);
         }
        //if we have to return the maximum absolute subarray than there are only two conditions : either the maximum positive subarray will be bigger or the minimum negative subarray will be bigger because have to find the absolute value 
        //absolute value is the distance of an element from zero so absolute value always remain positive
        int answer = Math.max( maxsum , Math.abs(minsum));
        return answer;
    }
}