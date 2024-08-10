package Day_10;

public class Regions_Cut {
    public static void main(String[] args) {
        String grid[] = {" /","/ "};
        System.out.println(new Regions_Cut().regionsBySlashes(grid));

    }
    public int regionsBySlashes(String grid []) {
        int[][][] meme = new int[grid.length][grid.length][4];
        char[][] grids = new char[grid.length][];
        for (int i = 0; i < grid.length; i++) {
            grids[i] = grid[i].toCharArray();
        }
        int res = 1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                for (int k = 0; k <= 3; k++) {
                    if (meme[i][j][k] == 0) {
                        dfs(grids, meme, i, j, k, res);
                        res++;
                    }
                }
            }
        }
        return res - 1;
    }

    public void dfs(char[][] grids, int[][][] meme, int i, int j, int k, int res) {
        meme[i][j][k] = res;
        if (k == 0) {
            if (i > 0 && meme[i - 1][j][2] == 0)
                dfs(grids, meme, i - 1, j, 2, res);
            if (grids[i][j] == ' ' && meme[i][j][2] == 0)
                dfs(grids, meme, i, j, 2, res);
            if (grids[i][j] != '\\' && meme[i][j][3] == 0)
                dfs(grids, meme, i, j, 3, res);
            if (grids[i][j] != '/' && meme[i][j][1] == 0)
                dfs(grids, meme, i, j, 1, res);
        } else if (k == 1) {
            if (j < grids.length - 1 && meme[i][j + 1][3] == 0)
                dfs(grids, meme, i, j + 1, 3, res);
            if (grids[i][j] == ' ' && meme[i][j][3] == 0)
                dfs(grids, meme, i, j, 3, res);
            if (grids[i][j] != '\\' && meme[i][j][2] == 0)
                dfs(grids, meme, i, j, 2, res);
            if (grids[i][j] != '/' && meme[i][j][0] == 0)
                dfs(grids, meme, i, j, 0, res);
        } else if (k == 2) {
            if (i < grids.length - 1 && meme[i + 1][j][0] == 0)
                dfs(grids, meme, i + 1, j, 0, res);
            if (grids[i][j] == ' ' && meme[i][j][0] == 0)
                dfs(grids, meme, i, j, 0, res);
            if (grids[i][j] != '\\' && meme[i][j][1] == 0)
                dfs(grids, meme, i, j, 1, res);
            if (grids[i][j] != '/' && meme[i][j][3] == 0)
                dfs(grids, meme, i, j, 3, res);
        } else {
            if (j > 0 && meme[i][j - 1][1] == 0)
                dfs(grids, meme, i, j - 1, 1, res);
            if (grids[i][j] == ' ' && meme[i][j][1] == 0)
                dfs(grids, meme, i, j, 1, res);
            if (grids[i][j] != '\\' && meme[i][j][0] == 0)
                dfs(grids, meme, i, j, 0, res);
            if (grids[i][j] != '/' && meme[i][j][2] == 0)
                dfs(grids, meme, i, j, 2, res);
        }
    }
}
