class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int m= mat.length,k=mat[0].length;
        int dir=0, top =0, down = m-1,left=0,right=k-1,p=1;
        while(top<=down && left<=right && p<=(n*n))
        {
            if (dir==0)
            {
                for (int i = left; i <=right ; i++) {
                    (mat[top][i])=p; p++;
                } top++;

            } else if (dir==1) {
                for (int i = top ; i <=down; i++) {
                    (mat[i][right])=p; p++;
                } right--;

            } else if (dir==2) {
                for (int i = right; i >=left ; i--) {
                    (mat[down][i])=p; p++;
                } down--;

            } else if (dir==3) {
                for (int i = down; i>=top ; i--) {
                    (mat[i][left])=p;p++;
                } left++;
            } dir=(dir+1)%4;
        } return mat;
    }
}