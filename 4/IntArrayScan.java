import java.util.Scanner;

/** 柴田 望洋 著「新・明解Java入門」 p.186 List6-4改 */
class IntArrayScan {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数? ");
        int n = stdIn.nextInt(); // 整数の入力

        /* 入力された要素数の整数配列を作成 */
        int[] a = new int[n];

        /* 配列の各要素に入力 */
        /* for文の条件式は i < n としてもよい */
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]? ");
            a[i] = stdIn.nextInt(); // 整数の入力
        }

        /* 配列の各要素を出力 */
        System.out.println("入力順:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        /* 逆順に表示．*/
        System.out.println("逆順:");
        for (int i = a.length -1; i >= 0; i--) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
