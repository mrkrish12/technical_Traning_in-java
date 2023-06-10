public class capitalized {
    public static void main(String[] args) {
        String[] arr = { "foo", "bar", "world", "krishna", "ans" };
        String[] res = new String[arr.length];
        convertit(arr, res, 0);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static void convertit(String[] s, String[] news, int n) {
        if (n == s.length) {
            return;
        }
        String ans = (s[n]);
        ans = ans.toUpperCase();

        news[n] = ans;
        convertit(s, news, n + 1);
    }
}
