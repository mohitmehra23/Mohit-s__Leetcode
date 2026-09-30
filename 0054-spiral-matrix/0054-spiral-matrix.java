class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        
        //top aur botton rows ko denote krte hai 
        //left aur right columns ko denote krte hai 
        int top =0 ;
        int bottom = matrix.length -1;
        int left = 0 ;
        int right = matrix[0].length - 1;

        while(left <= right && top <= bottom){
            //we are updating the top, bottom, left and right values so that we dont add an element twice in the list
             
            //adding the first row and than updating the top value  
            //traversing through the  row from left to right
            for(int i = left ; i <= right ; i++ ){
                list.add(matrix[top][i]);
            }
            top++;
            
            //adding the last column and than updating the right value
            //traversing through the  column from top to bottom
            for(int i = top ; i<= bottom ; i++){
                list.add(matrix[i][right]);
            }
            right--;
            
            if(top <= bottom){
            //adding the last row and than updating the bottom value   
            //traversing through the  row from right to left 
            for(int i = right ; i >= left ; i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
            }
            
            if(left <= right){
            //adding the first column and thann updating the left value
            //traversing through the  column from bottom to top 
            for(int i = bottom ; i >=top ; i--){
                list.add(matrix[i][left]);
            }
            left++;
            }    
        }

        return list;
    }
}