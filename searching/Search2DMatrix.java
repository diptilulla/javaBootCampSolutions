class Search2DMatrix {
    public boolean rowBinSearch(int nums[][], int rowIndex, int target, int n) {
        int s = 1, e = n - 2;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[rowIndex][mid] == target)
                return true;
            else if (nums[rowIndex][mid] > target)
                e = mid - 1;
            else
                s = mid + 1;
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int s = 0, e = m - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (matrix[mid][0] == target || matrix[mid][n - 1] == target)
                return true; // target found
            else if (matrix[mid][n - 1] > target && matrix[mid][0] < target)
                return rowBinSearch(matrix, mid, target, n); // we will find target in this row using 1d bin search
            else if (matrix[mid][n - 1] < target)
                s = mid + 1; // we will find target in lower rows
            else if (matrix[mid][0] > target)
                e = mid - 1; // target will be found in upper rows with smaller elements
        }
        return false;
    }
}