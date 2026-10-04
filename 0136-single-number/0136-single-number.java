class Solution {
    public int singleNumber(int[] nums) {
  /*    Arrays.sort(nums);
        for(int i = 0; i<nums.length-1; i+=2)
{
        if(nums[i]!=nums[i+1])
          return nums[i];        Time complexity - O(n logn) 
}                              
 return nums[nums.length-1];
 }
}  */ 

    int ans = 0 ;
     for(int num: nums){
        ans ^= num;          // we will do this using XOR operator
     }                       // XOR RULE - x ^ x = 0 , x ^ 0 = x
     return ans; 
    }
}