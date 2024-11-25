public class nine {
    public static void solve(int mat[][], int R, int C) {
        int row[] = new int[R];
        int col[] = new int[C];
        int i, j;

        for (i = 0; i < R; i++)
            row[i] = 0;

        for (i = 0; i < C; i++)
            col[i] = 0;

        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                if (mat[i][j] == 1) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (i = 0; i < R; i++)
            for (j = 0; j < C; j++)
                if (row[i] == 1 || col[j] == 1)
                    mat[i][j] = 1;
    }

    public static void main(String[] args) {
        int[][] nums = { { 1, 0, 0, 1 },
                { 0, 0, 1, 0 },
                { 0, 0, 0, 0 } };
        solve(nums, 3, 4);
        for (int i=0;i<3;i++) {
            for (int j=0;j<4;j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
