class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
         int m= mat.length,n=mat[0].length;
        int dir=0, top =0, down = m-1,left=0,right=n-1, k=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(top<=down && left<=right)
        {
            if (dir==0)
            {
                for (int i = left; i <=right ; i++) {
                    list.add(mat[top][i]);
                } top++;

            } else if (dir==1) {
                for (int i = top ; i <=down; i++) {
                  list.add(mat[i][right]);
                 } right--;

            } else if (dir==2) {
                for (int i = right; i >=left ; i--) {
                    list.add(mat[down][i]);

                } down--;

            } else if (dir==3) {
                for (int i = down; i >=top ; i--) {
                    list.add(mat[i][left]);

                }left++;
            } dir=(dir+1)%4;
        } return list;
    }
}