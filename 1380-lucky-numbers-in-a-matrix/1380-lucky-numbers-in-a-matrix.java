class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
         
       int[] rowmin = new int[matrix.length];
       int[] colmax = new int[matrix[0].length];
    
        //this loop find the minimum element of  each rows and store it in rowmin array
       for(int i = 0 ; i < matrix.length ; i++){
            rowmin[i] = matrix[i][0];
        for(int j  = 1 ; j< matrix[i].length ; j++){
           rowmin[i] = Math.min(rowmin[i], matrix [i][j]);
        }
       }  
        //this loop find the maximum element of each column and store it in rowmax array
        for(int i = 0; i < matrix[0].length ;i++){
            colmax[i] = matrix[0][i];
         for(int j = 0 ; j < matrix.length ; j++){
            colmax[i] = Math.max(colmax[i] , matrix[j][i]);
            }
        }
        //this loop finds the lucky number by checking the minimum element in its row and maximum in its column and add it to the list
        for(int i = 0 ; i<rowmin.length ; i++){
            for( int j =0 ; j<colmax.length ; j++){
                if(matrix[i][j] == rowmin[i] && matrix[i][j] == colmax[j])
                //If this cell is the minimum of its row AND the maximum of its column, add it to the list because it is a lucky number.
                list.add(matrix[i][j]);
            }
        }
        return list;
    }
}