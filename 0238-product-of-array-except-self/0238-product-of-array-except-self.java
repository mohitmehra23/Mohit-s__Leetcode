class Solution {
    public int[] productExceptSelf(int[] nums) {
   /*
        int product = 1; 
        int zero = 0;            // It is mentioned in the question not too use division operator
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
    */

    //KEY IDEA - // Calculate left and right products separately, then multiply them for each index to get the product of all elements except the current one.

    int n = nums.length;
    //we are creating a new empty array of same size as nums
    int[] ans = new int[n];
   
   //calculating product of all the element to the left of current element 
    ans[0] = 1;
    for(int i = 1 ; i < n ; i++){
        ans[i] = ans[i-1] * nums[i-1];
    }

   //ans[i] currently contains product of all the elements to the left
   //right contains product of all the elemennts to the right
   //so , ans[i] = left product * right product 
    int right = 1;
    for(int i = n-1; i >= 0 ;i--){
        ans[i] = ans[i] * right;
        right = right * nums[i];
    }
    return ans;
    }
}