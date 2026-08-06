import java.util.*;

class GFG {

    static int findSum(int n) {
        // Base condition
        if (n == 1||n==0)
            return n;

        return n + findSum(n - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(findSum(n));
    }
}