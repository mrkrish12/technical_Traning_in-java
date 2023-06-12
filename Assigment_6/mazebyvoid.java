public class mazebyvoid {
    public static void main(String[] args) {
        mazeform(0, 0, 3, 3, "");
    }

    public static void mazeform(int r, int c, int n, int m, String s) {
        if (r == n - 1 && c == m - 1) {
            System.out.println(s);
            return;
        }
        if (r > n || c > m) {
            return;
        }
        mazeform(r + 1, c, n, m, s + "R");
        mazeform(r, c + 1, n, m, s + "D");
    }
}
