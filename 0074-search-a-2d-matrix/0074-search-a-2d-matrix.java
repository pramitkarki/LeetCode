class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int l = 0;
        int r = (n*m) - 1;

        while(l <= r){
            int mid = (l+r)/2;
            if(matrix[mid/m][mid%m] ==  target) return true;
            else if(target < matrix[mid/m][mid%m]) r = mid - 1;
            else l = mid + 1;
        }
        return false;
    }
}