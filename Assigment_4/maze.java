
public class maze {

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        maze(0, 0, n, m, "");

    }

    public static void maze(int i, int j, int n, int m, String ls) {
        if (i == n - 1 && j == m - 1) {
            System.out.println(ls + " ");
            return;
        }
        if (i > n) {
            return;
        }
        if (j > m) {
            return;
        }
        maze(i + 1, j, n, m, ls + "R");
        maze(i, j + 1, n, m, ls + "D");
    }