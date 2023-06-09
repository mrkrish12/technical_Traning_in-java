import java.util.ArrayList;

public class product {

    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            ls.add(i);
        }
        int prod = product(ls, 1);
        System.out.println(prod);

    }

    public static int product(ArrayList<Integer> ls, int prod) {
        if (ls.size() == 0) {
            return prod;
        }
        int cur = ls.remove(0);
        prod = prod * cur;
        return product(ls, prod);

    }
}
