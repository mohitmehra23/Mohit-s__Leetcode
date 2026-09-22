class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length;
       // Rotating by n returns to the original array, so only k % n rotations matter.
       k = k % n;    

       reverse(nums,0,n-1); //this will reverse the whole array
       reverse(nums,0,k-1); //this will reverse the starting k elements
       reverse(nums,k,n-1); // this will reverse the remaining elements from k to end

    }
       //we are creating a reverse functon 
       //we will provide a array , start index and end index to the array where start and end are included
       //The reverse() function means:Reverse the elements between the start and end indexes

      public static void reverse(int[] arr , int start , int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
       }
}    