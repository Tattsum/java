public class Comb {
    public static int comb(int n, int k)
        throws NegativeNumberException, BadCombinationException {

        if (n < 0 || k < 0) {
            throw new NegativeNumberException(n + " C " + k
                                              + " can't be calculated.");
        }
        if (n < k) {
            throw new BadCombinationException(n + " C " + k
                                              + " can't be calculated.");
        }

        /* nCk = {n*(n-1)*(n-2)*...*(n-k+1)} / {k * (k-1) * ... * 1} */
        int bunshi, bunbo;

        bunshi = 1;
        for (int i = n; i >= n-k+1; i--) {
            bunshi = bunshi * i;
        }

        bunbo = 1;
        for (int i = k; i >= 1; i--) {
            bunbo = bunbo * i;
        }

        return bunshi/bunbo;
    }

    /** テスト用mainメソッド */
    public static void main(String args[]) {
        try {
            int result;

            result = Comb.comb(5, 0);
            System.out.println("comb(5, 0) = " + result);

            result = Comb.comb(5, 3);
            System.out.println("comb(5, 3) = " + result);

            result = Comb.comb(5, 6);
            System.out.println("comb(5, 6) = " + result);

            result = Comb.comb(5, 2);
            System.out.println("comb(5, 2) = " + result);

            result = Comb.comb(5, -1);
            System.out.println("comb(5, -1) = " + result);

        }
        catch (NegativeNumberException e) {
            System.err.println("NegativeNumberException was thrown: "
                               +  e.getMessage());
        }
        catch (BadCombinationException e) {
            System.err.println("BadCombinationException was thrown: "
                               +  e.getMessage());
        }
    }
}
