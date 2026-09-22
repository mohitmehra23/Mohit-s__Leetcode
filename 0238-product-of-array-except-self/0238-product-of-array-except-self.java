class Solution {
    public int[] productExceptSelf(int[] nums) {

        int product = 1; 
        int zero = 0;
        int index = 0;
        int[] arr = new int[nums.length];
        
        for(int i = 0; i< arr.length ; i++){
          if(nums[i]== 0){
            zero++;
            index = i; 
            continue;
          }
          product *= nums[i];
        }
        if(zero == 1)
        arr[index] = product;
    
        else if(zero >= 2){
       return arr;
        }
        
        else{
        for(int i = 0; i<nums.length; i++){
            arr[i]= product/nums[i];
        }
        }
        return arr;
    }
}