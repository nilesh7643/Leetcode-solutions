class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int totalrow = matrix.length;
       int totalcol = matrix[0].length;

       int n = totalrow*totalcol;

       int s= 0;
       int e = n-1;
       while (s<=e){
        int mid  = s+(e-s)/2;
        int rowIndex = mid/totalcol;
        int colIndex = mid%totalcol;

        if (matrix[rowIndex][colIndex] == target){
            return true;
        }
        else if (matrix[rowIndex][colIndex]> target){
            e = mid-1;
        }
        else {
            s= mid+1;
        }
       }
       return false;
    }
}