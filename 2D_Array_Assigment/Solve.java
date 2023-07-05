public class Solve {
    public int[] kWeakestRows(int[][] mat, int k) {
        int ans[] = new int[k];
        int nos;
        int numofsol[] = new int[mat.length];
        ArrayList<Integer> output = new ArrayList();

        for (int i = 0; i < mat.length; i++) {
            nos = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    nos++;
                }
            }
            numofsol[i] = nos;
            output.add(nos);
        }

        Arrays.sort(numofsol);

        for (int i = 0; i < k; i++) {
            ans[i] = output.indexOf(numofsol[i]);
            output.set(ans[i], Integer.MAX_VALUE);
        }

        return ans;
    }

}