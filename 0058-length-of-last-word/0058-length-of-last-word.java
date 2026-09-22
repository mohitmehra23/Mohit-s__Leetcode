class Solution {
    public int lengthOfLastWord(String s) { 
        
        //divide the original string into multiple small strings using the split method
        //split method always return a strig array
        String[] words = s.split(" ");
        String lastelement = words[words.length-1];

        return lastelement.length();
    }
}