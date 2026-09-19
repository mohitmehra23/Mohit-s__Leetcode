class Solution {
    public int[] runningSum(int[] nums) {
   /* int[] runningSum = new int[nums.length];              //Time complexity = O(n)
    int sum = 0;                                            //Space complexity = O(n) 
    for(int i = 0 ; i< nums.length ; i++) {
       sum = sum + nums[i] ;
        runningSum[i] = sum;
    }   
    return runningSum;*/

    for(int i = 1 ; i < nums.length ; i++){                 //Time complexity = O(n)
        nums[i] = nums[i] + nums[i-1];                      //Space complexity= O(1)
    }
    return nums;
    }
}