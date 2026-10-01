class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
     
       //its not the most optimal because it takes extra O(n) space
    /*    HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(set.contains(num))
              list.add(num);

              else
                 set.add(num);
        }

        return list;*/
        

        //MAIN KEY IDEA - Hum number ka corresponding index nikalte hain, phir us index par jo value stored hai usko negative mark kar dete hain. Agar wahi number dobara aata hai, toh uska corresponding index already negative milega → matlab number duplicate hai.
        
        for(int num : nums){
        //we are creating a variable index aur usme har element ke correspondig index ko store kre hai ... Math.abs isliye use kiya hai kuki hum age code mei values ko negative kre hai ... agr esa nahi krenge toh index negative mei aa jaega aur fr error show hogi
           int index = Math.abs(num)-1;
        
        //isme hum check kr rahe hai ki jo index humne abhi nikala usme value negative toh nahia .... agr negative toh iska mtlv voh value aa chuki hai mtlv hum usse phle he negative kr chuke hai means DUPLICATE  
           if(nums[index] < 0)
           list.add(Math.abs(num));  // duplicate values ko list mei add kr rahe


        // index pe jo value hai usko negative kr rahe hai .. kind off mark kr rahe hai ki value ek baar aa chuki hai taki age track krne mei asani rahe
           else
           nums[index] = -nums[index];
        }

        return list;
    }
}        